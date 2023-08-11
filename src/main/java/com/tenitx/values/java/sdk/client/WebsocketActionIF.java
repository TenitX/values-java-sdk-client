package com.tenitx.values.java.sdk.client;

import java.util.Set;
import org.immutables.value.Value;

@Value.Immutable
@TenitStyle
public interface WebsocketActionIF {
  Set<com.tenitx.values.java.sdk.client.Value> getValuesToAdd();

  Set<com.tenitx.values.java.sdk.client.Value> getValuesToRemove();
}
