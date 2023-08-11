package com.tenitx.values.java.sdk.client;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.guava.GuavaModule;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.google.inject.Inject;
import com.tenitx.values.java.sdk.client.utils.TenitObjectMapper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InternalValuesManager {
  private static final Logger LOG = LoggerFactory.getLogger(InternalValuesManager.class);

  private static final Map<String, String> values = new HashMap<>();

  private final ObjectMapper objectMapper;

  @Inject
  public InternalValuesManager() {
    objectMapper = new TenitObjectMapper();
  }

  public void addValues(Map<String, String> v) {
    values.putAll(v);
  }

  public void addValue(String k, String v) {
    LOG.info("Updating value of '{}' to '{}'", k, v);
    values.put(k, v);
  }

  public void removeValue(String k, String v) {
    LOG.info("Removing value key '{}'", k);
    values.remove(k, v);
  }

  public String getValue(String key) {
    return values.get(key);
  }

  public void handleWebsocketUpdateString(String update) {
    WebsocketAction newValues;
    try {
      newValues = objectMapper.readValue(update, new TypeReference<WebsocketAction>() {});
    } catch (IOException e) {
      newValues = WebsocketAction.builder().build();
    }
    handleWebsocketAction(newValues);
  }

  private void handleWebsocketAction(WebsocketAction action) {
    action.getValuesToRemove().forEach(e -> removeValue(e.getName(), e.getValue()));
    action.getValuesToAdd().forEach(e -> addValue(e.getName(), e.getValue()));
  }
}
