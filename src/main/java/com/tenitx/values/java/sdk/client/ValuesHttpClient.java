package com.tenitx.values.java.sdk.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tenitx.values.java.sdk.client.models.ValuesResponse;
import com.tenitx.values.java.sdk.client.utils.TenitObjectMapper;
import java.io.IOException;
import java.util.Optional;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ValuesHttpClient {
  private static final Logger LOG = LoggerFactory.getLogger(ValuesHttpClient.class);

  private final ObjectMapper objectMapper = new TenitObjectMapper();
  private final String API_URL;
  private final OkHttpClient httpClient;
  private static final String LAST_UPDATED_HEADER = "x-goog-generation";
  private final InternalValuesManager internalValuesManager;
  private final ValuesClientConfig config;
  private static long getLastUpdated = -1L;

  private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

  public ValuesHttpClient(
    ValuesClientConfig config,
    InternalValuesManager internalValuesManager
  ) {
    this.httpClient = new OkHttpClient();
    this.internalValuesManager = internalValuesManager;
    this.config = config;
    this.API_URL =
      String.format(
        "https://values-gcs.tenitx.com/%d/%s",
        config.getAccountId(),
        config.getCoordinate()
      );
  }

  public void connect() {
    forceInitialSyncForCoordinates();
    getUpdatedValuesMap()
      .ifPresent(r -> internalValuesManager.addValues(r.getValuesMap()));
    final Runnable runner = new Runnable() {

      public void run() {
        try {
          if (config.getUseVerboseLogging()) {
            LOG.info("Checking for updated values...");
          }
          if (hasUpdates()) {
            if (config.getUseVerboseLogging()) {
              LOG.info("Found updated values...");
            }
            getUpdatedValuesMap()
              .ifPresent(r -> internalValuesManager.addValues(r.getValuesMap()));
          }
        } catch (Exception e) {
          // We don't care about the exception ATM, we just want to help keep the thread alive
        }
      }
    };
    final ScheduledFuture<?> runnerHandle = scheduler.scheduleAtFixedRate(
      runner,
      0,
      config.getRefreshTime().toSeconds(),
      TimeUnit.SECONDS
    );
  }

  private boolean hasUpdates() {
    Request request = new Request.Builder()
      .url(API_URL)
      .addHeader("x-tenit-api-token", config.getApiToken())
      .head()
      .build();

    try (Response response = httpClient.newCall(request).execute()) {
      Optional<String> maybeUpdatedAtTimestamp = Optional.ofNullable(
        response.header(LAST_UPDATED_HEADER)
      );
      boolean isUpdated =
        maybeUpdatedAtTimestamp.isPresent() &&
        Long.parseLong(maybeUpdatedAtTimestamp.get()) > getLastUpdated;
      maybeUpdatedAtTimestamp
        .map(Long::parseLong)
        .ifPresent(timestamp -> getLastUpdated = timestamp);
      return isUpdated;
    } catch (IOException e) {
      return false;
    }
  }

  private boolean forceInitialSyncForCoordinates() {
    Request request = new Request.Builder()
      .url(
        String.format(
          "https://api.tenitx.com/values/v1/values/fetch/%s",
          config.getCoordinate()
        )
      )
      //            .addHeader("x-tenit-api-token", config.getApiToken())
      .addHeader("token", config.getApiToken())
      .build();

    try (Response response = httpClient.newCall(request).execute()) {
      String s = new String(response.body().bytes());
      Optional<ValuesResponse> valuesResponse = Optional.ofNullable(
        objectMapper.readValue(s, ValuesResponse.class)
      );
      valuesResponse.ifPresent(r -> internalValuesManager.addValues(r.getValuesMap()));
      Optional<String> maybeUpdatedAtTimestamp = Optional.ofNullable(
        response.header(LAST_UPDATED_HEADER)
      );
      boolean isUpdated =
        maybeUpdatedAtTimestamp.isPresent() &&
        Long.parseLong(maybeUpdatedAtTimestamp.get()) > getLastUpdated;
      maybeUpdatedAtTimestamp
        .map(Long::parseLong)
        .ifPresent(timestamp -> getLastUpdated = timestamp);
      return isUpdated;
    } catch (IOException e) {
      return false;
    }
  }

  private Optional<ValuesResponse> getUpdatedValuesMap() {
    Request request = new Request.Builder()
      .url(API_URL)
      .addHeader("x-tenit-api-token", config.getApiToken())
      .build();

    try (Response response = httpClient.newCall(request).execute()) {
      String r = new String(response.body().bytes());
      return Optional.ofNullable(objectMapper.readValue(r, ValuesResponse.class));
    } catch (IOException e) {
      return Optional.empty();
    }
  }
}
