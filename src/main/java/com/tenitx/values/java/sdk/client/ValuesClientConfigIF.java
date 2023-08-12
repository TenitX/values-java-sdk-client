package com.tenitx.values.java.sdk.client;

import java.time.Duration;
import org.immutables.value.Value;

@Value.Immutable
@TenitStyle
public interface ValuesClientConfigIF {
  int getAccountId();
  String getApiToken();

  String getCoordinate();

  @Value.Default
  default Duration getCacheTime() {
    return Duration.ZERO;
  }

  @Value.Default
  default Duration getRefreshTime() {
    return Duration.ofMinutes(1L);
  }

  @Value.Default
  default Boolean getUseVerboseLogging() {
    return false;
  }

  @Value.Default
  default Boolean getUseWebsocket() {
    return false;
  }
}
