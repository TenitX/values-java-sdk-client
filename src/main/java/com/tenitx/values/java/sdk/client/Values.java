package com.tenitx.values.java.sdk.client;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tenitx.values.java.sdk.client.utils.TenitObjectMapper;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Values {
  private static final Logger LOG = LoggerFactory.getLogger(Values.class);

  private final InternalValuesManager internalValuesManager;

  private final ValuesWebsocketClient websocketClient;
  private final ValuesHttpClient httpClient;

  private final ObjectMapper objectMapper = new TenitObjectMapper();

  public Values(ValuesClientConfig config) {
    this.internalValuesManager = new InternalValuesManager();
    if (config.getUseWebsocket()) {
      this.websocketClient =
        new ValuesWebsocketClient(config, this.internalValuesManager);
      this.websocketClient.connect();
      this.httpClient = null;
    } else {
      this.httpClient = new ValuesHttpClient(config, this.internalValuesManager);
      this.httpClient.connect();
      this.websocketClient = null;
    }
  }

  public String getAsString(String key) {
    return internalValuesManager.getValue(key);
  }

  public int getAsInt(String key) {
    return Integer.parseInt(internalValuesManager.getValue(key));
  }

  public long getAsLong(String key) {
    return Long.parseLong(internalValuesManager.getValue(key));
  }

  public double getAsDouble(String key) {
    return Double.parseDouble(internalValuesManager.getValue(key));
  }

  public <T> T getAsObject(String key) {
    try {
      return objectMapper.readValue(
        internalValuesManager.getValue(key),
        new TypeReference<T>() {}
      );
    } catch (IOException e) {
      LOG.error("Failed to deserialize object from the Values for the key {}: ", key, e);
    }
    return null;
  }

  public <T> Set<T> getAsSet(String key) {
    try {
      return objectMapper.readValue(
        internalValuesManager.getValue(key),
        new TypeReference<Set<T>>() {}
      );
    } catch (IOException e) {
      LOG.error("Failed to deserialize object from the Values for the key {}: ", key, e);
    }
    return null;
  }

  public <T> List<T> getAsList(String key) {
    try {
      return objectMapper.readValue(
        internalValuesManager.getValue(key),
        new TypeReference<List<T>>() {}
      );
    } catch (IOException e) {
      LOG.error("Failed to deserialize object from the Values for the key {}: ", key, e);
    }
    return null;
  }

  public <K, V> Map<K, V> getAsMap(String key) {
    try {
      return objectMapper.readValue(
        internalValuesManager.getValue(key),
        new TypeReference<Map<K, V>>() {}
      );
    } catch (IOException e) {
      LOG.error("Failed to deserialize object from the Values for the key {}: ", key, e);
    }
    return null;
  }
}
