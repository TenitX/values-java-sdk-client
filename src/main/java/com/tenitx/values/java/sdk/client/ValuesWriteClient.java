package com.tenitx.values.java.sdk.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tenitx.values.java.sdk.client.models.ValueType;
import com.tenitx.values.java.sdk.client.models.ValuesResponse;
import com.tenitx.values.java.sdk.client.utils.TenitObjectMapper;
import java.io.IOException;
import java.util.Map;
import java.util.Optional;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ValuesWriteClient {
  private static final Logger LOG = LoggerFactory.getLogger(ValuesWriteClient.class);

  private final ObjectMapper objectMapper = new TenitObjectMapper();
  private final String API_URL;
  private final OkHttpClient httpClient;
  private final InternalValuesManager internalValuesManager;
  private final ValuesClientConfig config;

  public ValuesWriteClient(
    ValuesClientConfig config,
    InternalValuesManager internalValuesManager
  ) {
    this.httpClient = new OkHttpClient();
    this.internalValuesManager = internalValuesManager;
    this.config = config;
    this.API_URL = "https://api.tenitx.com/values/v1/values";
  }

  private boolean isObject(ValueType type) {
    switch (type) {
      case SET:
      case LIST:
      case OBJECT:
        return true;
      default:
        return false;
    }
  }

  public void updateDefaultValueForValue(String name, Object value, ValueType type) {
    Request request = null;
    try {
      request =
        new Request.Builder()
          .url(String.format("%s?accountId=%d", API_URL, config.getAccountId()))
          .addHeader("x-tenit-api-token", config.getApiToken())
          .patch(
            RequestBody.create(
              MediaType.parse("application/json"),
              objectMapper.writeValueAsBytes(
                Map.of(
                  "name",
                  name,
                  "type",
                  type.name(),
                  "defaultValue",
                  isObject(type) ? objectMapper.writeValueAsString(value) : value
                )
              )
            )
          )
          .build();
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }

    try (Response response = httpClient.newCall(request).execute()) {
      if (!response.isSuccessful()) {
        LOG.error("Failed to update value... {}", new String(response.body().bytes()));
      }
    } catch (IOException e) {
      LOG.error("Failed to update value...", e);
    }
    // Force an update to see if there are any changes we should have locally now
    forceInitialSyncForCoordinates();
  }

  private boolean forceInitialSyncForCoordinates() {
    Request request = new Request.Builder()
      .url(
        String.format(
          "https://api.tenitx.com/values/v1/values/fetch/%s",
          config.getCoordinate()
        )
      )
      .addHeader("token", config.getApiToken())
      .build();

    try (Response response = httpClient.newCall(request).execute()) {
      String s = new String(response.body().bytes());
      Optional<ValuesResponse> valuesResponse = Optional.ofNullable(
        objectMapper.readValue(s, ValuesResponse.class)
      );
      valuesResponse.ifPresent(r -> internalValuesManager.addValues(r.getValuesMap()));
      return true;
    } catch (IOException e) {
      return false;
    }
  }
}
