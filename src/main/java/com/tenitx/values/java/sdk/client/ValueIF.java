package com.tenitx.values.java.sdk.client;

import org.immutables.value.Value;

@Value.Immutable
@TenitStyle
public interface ValueIF {
  String getName();

  String getValue();
}
