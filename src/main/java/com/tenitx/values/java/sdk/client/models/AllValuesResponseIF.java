package com.tenitx.values.java.sdk.client.models;

import com.tenitx.values.java.sdk.client.TenitStyle;
import java.util.Map;
import org.immutables.value.Value;

@Value.Immutable
@TenitStyle
public interface AllValuesResponseIF {
  ValuesResponse getValuesMap();
}
