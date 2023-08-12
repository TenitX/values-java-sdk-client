package com.tenitx.values.java.sdk.client;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link ValuesClientConfigIF}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ValuesClientConfig.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ValuesClientConfig.of()}.
 */
@Generated(from = "ValuesClientConfigIF", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ValuesClientConfig implements ValuesClientConfigIF {
  private final int accountId;
  private final String apiToken;
  private final String coordinate;
  private final Duration cacheTime;
  private final Duration refreshTime;
  private final Boolean useVerboseLogging;
  private final Boolean useWebsocket;

  private ValuesClientConfig(
      int accountId,
      String apiToken,
      String coordinate,
      Duration cacheTime,
      Duration refreshTime,
      Boolean useVerboseLogging,
      Boolean useWebsocket) {
    this.accountId = accountId;
    this.apiToken = Objects.requireNonNull(apiToken, "apiToken");
    this.coordinate = Objects.requireNonNull(coordinate, "coordinate");
    this.cacheTime = Objects.requireNonNull(cacheTime, "cacheTime");
    this.refreshTime = Objects.requireNonNull(refreshTime, "refreshTime");
    this.useVerboseLogging = Objects.requireNonNull(useVerboseLogging, "useVerboseLogging");
    this.useWebsocket = Objects.requireNonNull(useWebsocket, "useWebsocket");
    this.initShim = null;
  }

  private ValuesClientConfig(ValuesClientConfig.Builder builder) {
    this.accountId = builder.accountId;
    this.apiToken = builder.apiToken;
    this.coordinate = builder.coordinate;
    if (builder.cacheTimeIsSet()) {
      initShim.withCacheTime(builder.cacheTime);
    }
    if (builder.refreshTimeIsSet()) {
      initShim.withRefreshTime(builder.refreshTime);
    }
    if (builder.useVerboseLoggingIsSet()) {
      initShim.withUseVerboseLogging(builder.useVerboseLogging);
    }
    if (builder.useWebsocketIsSet()) {
      initShim.withUseWebsocket(builder.useWebsocket);
    }
    this.cacheTime = initShim.getCacheTime();
    this.refreshTime = initShim.getRefreshTime();
    this.useVerboseLogging = initShim.getUseVerboseLogging();
    this.useWebsocket = initShim.getUseWebsocket();
    this.initShim = null;
  }

  private ValuesClientConfig(
      ValuesClientConfig original,
      int accountId,
      String apiToken,
      String coordinate,
      Duration cacheTime,
      Duration refreshTime,
      Boolean useVerboseLogging,
      Boolean useWebsocket) {
    this.accountId = accountId;
    this.apiToken = apiToken;
    this.coordinate = coordinate;
    this.cacheTime = cacheTime;
    this.refreshTime = refreshTime;
    this.useVerboseLogging = useVerboseLogging;
    this.useWebsocket = useWebsocket;
    this.initShim = null;
  }

  private static final byte STAGE_INITIALIZING = -1;
  private static final byte STAGE_UNINITIALIZED = 0;
  private static final byte STAGE_INITIALIZED = 1;
  @SuppressWarnings("Immutable")
  private transient volatile InitShim initShim = new InitShim();

  @Generated(from = "ValuesClientConfigIF", generator = "Immutables")
  private final class InitShim {
    private byte cacheTimeBuildStage = STAGE_UNINITIALIZED;
    private Duration cacheTime;

    Duration getCacheTime() {
      if (cacheTimeBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (cacheTimeBuildStage == STAGE_UNINITIALIZED) {
        cacheTimeBuildStage = STAGE_INITIALIZING;
        this.cacheTime = Objects.requireNonNull(getCacheTimeInitialize(), "cacheTime");
        cacheTimeBuildStage = STAGE_INITIALIZED;
      }
      return this.cacheTime;
    }

    void withCacheTime(Duration cacheTime) {
      this.cacheTime = cacheTime;
      cacheTimeBuildStage = STAGE_INITIALIZED;
    }

    private byte refreshTimeBuildStage = STAGE_UNINITIALIZED;
    private Duration refreshTime;

    Duration getRefreshTime() {
      if (refreshTimeBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (refreshTimeBuildStage == STAGE_UNINITIALIZED) {
        refreshTimeBuildStage = STAGE_INITIALIZING;
        this.refreshTime = Objects.requireNonNull(getRefreshTimeInitialize(), "refreshTime");
        refreshTimeBuildStage = STAGE_INITIALIZED;
      }
      return this.refreshTime;
    }

    void withRefreshTime(Duration refreshTime) {
      this.refreshTime = refreshTime;
      refreshTimeBuildStage = STAGE_INITIALIZED;
    }

    private byte useVerboseLoggingBuildStage = STAGE_UNINITIALIZED;
    private Boolean useVerboseLogging;

    Boolean getUseVerboseLogging() {
      if (useVerboseLoggingBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (useVerboseLoggingBuildStage == STAGE_UNINITIALIZED) {
        useVerboseLoggingBuildStage = STAGE_INITIALIZING;
        this.useVerboseLogging = Objects.requireNonNull(getUseVerboseLoggingInitialize(), "useVerboseLogging");
        useVerboseLoggingBuildStage = STAGE_INITIALIZED;
      }
      return this.useVerboseLogging;
    }

    void withUseVerboseLogging(Boolean useVerboseLogging) {
      this.useVerboseLogging = useVerboseLogging;
      useVerboseLoggingBuildStage = STAGE_INITIALIZED;
    }

    private byte useWebsocketBuildStage = STAGE_UNINITIALIZED;
    private Boolean useWebsocket;

    Boolean getUseWebsocket() {
      if (useWebsocketBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (useWebsocketBuildStage == STAGE_UNINITIALIZED) {
        useWebsocketBuildStage = STAGE_INITIALIZING;
        this.useWebsocket = Objects.requireNonNull(getUseWebsocketInitialize(), "useWebsocket");
        useWebsocketBuildStage = STAGE_INITIALIZED;
      }
      return this.useWebsocket;
    }

    void withUseWebsocket(Boolean useWebsocket) {
      this.useWebsocket = useWebsocket;
      useWebsocketBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      List<String> attributes = new ArrayList<>();
      if (cacheTimeBuildStage == STAGE_INITIALIZING) attributes.add("cacheTime");
      if (refreshTimeBuildStage == STAGE_INITIALIZING) attributes.add("refreshTime");
      if (useVerboseLoggingBuildStage == STAGE_INITIALIZING) attributes.add("useVerboseLogging");
      if (useWebsocketBuildStage == STAGE_INITIALIZING) attributes.add("useWebsocket");
      return "Cannot build ValuesClientConfig, attribute initializers form cycle " + attributes;
    }
  }

  private Duration getCacheTimeInitialize() {
    return ValuesClientConfigIF.super.getCacheTime();
  }

  private Duration getRefreshTimeInitialize() {
    return ValuesClientConfigIF.super.getRefreshTime();
  }

  private Boolean getUseVerboseLoggingInitialize() {
    return ValuesClientConfigIF.super.getUseVerboseLogging();
  }

  private Boolean getUseWebsocketInitialize() {
    return ValuesClientConfigIF.super.getUseWebsocket();
  }

  /**
   * @return The value of the {@code accountId} attribute
   */
  @JsonProperty("accountId")
  @Override
  public int getAccountId() {
    return accountId;
  }

  /**
   * @return The value of the {@code apiToken} attribute
   */
  @JsonProperty("apiToken")
  @Override
  public String getApiToken() {
    return apiToken;
  }

  /**
   * @return The value of the {@code coordinate} attribute
   */
  @JsonProperty("coordinate")
  @Override
  public String getCoordinate() {
    return coordinate;
  }

  /**
   * @return The value of the {@code cacheTime} attribute
   */
  @JsonProperty("cacheTime")
  @Override
  public Duration getCacheTime() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.getCacheTime()
        : this.cacheTime;
  }

  /**
   * @return The value of the {@code refreshTime} attribute
   */
  @JsonProperty("refreshTime")
  @Override
  public Duration getRefreshTime() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.getRefreshTime()
        : this.refreshTime;
  }

  /**
   * @return The value of the {@code useVerboseLogging} attribute
   */
  @JsonProperty("useVerboseLogging")
  @Override
  public Boolean getUseVerboseLogging() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.getUseVerboseLogging()
        : this.useVerboseLogging;
  }

  /**
   * @return The value of the {@code useWebsocket} attribute
   */
  @JsonProperty("useWebsocket")
  @Override
  public Boolean getUseWebsocket() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.getUseWebsocket()
        : this.useWebsocket;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ValuesClientConfigIF#getAccountId() accountId} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for accountId
   * @return A modified copy of the {@code this} object
   */
  public final ValuesClientConfig withAccountId(int value) {
    if (this.accountId == value) return this;
    return new ValuesClientConfig(
        this,
        value,
        this.apiToken,
        this.coordinate,
        this.cacheTime,
        this.refreshTime,
        this.useVerboseLogging,
        this.useWebsocket);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ValuesClientConfigIF#getApiToken() apiToken} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for apiToken
   * @return A modified copy of the {@code this} object
   */
  public final ValuesClientConfig withApiToken(String value) {
    String newValue = Objects.requireNonNull(value, "apiToken");
    if (this.apiToken.equals(newValue)) return this;
    return new ValuesClientConfig(
        this,
        this.accountId,
        newValue,
        this.coordinate,
        this.cacheTime,
        this.refreshTime,
        this.useVerboseLogging,
        this.useWebsocket);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ValuesClientConfigIF#getCoordinate() coordinate} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for coordinate
   * @return A modified copy of the {@code this} object
   */
  public final ValuesClientConfig withCoordinate(String value) {
    String newValue = Objects.requireNonNull(value, "coordinate");
    if (this.coordinate.equals(newValue)) return this;
    return new ValuesClientConfig(
        this,
        this.accountId,
        this.apiToken,
        newValue,
        this.cacheTime,
        this.refreshTime,
        this.useVerboseLogging,
        this.useWebsocket);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ValuesClientConfigIF#getCacheTime() cacheTime} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for cacheTime
   * @return A modified copy of the {@code this} object
   */
  public final ValuesClientConfig withCacheTime(Duration value) {
    if (this.cacheTime == value) return this;
    Duration newValue = Objects.requireNonNull(value, "cacheTime");
    return new ValuesClientConfig(
        this,
        this.accountId,
        this.apiToken,
        this.coordinate,
        newValue,
        this.refreshTime,
        this.useVerboseLogging,
        this.useWebsocket);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ValuesClientConfigIF#getRefreshTime() refreshTime} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for refreshTime
   * @return A modified copy of the {@code this} object
   */
  public final ValuesClientConfig withRefreshTime(Duration value) {
    if (this.refreshTime == value) return this;
    Duration newValue = Objects.requireNonNull(value, "refreshTime");
    return new ValuesClientConfig(
        this,
        this.accountId,
        this.apiToken,
        this.coordinate,
        this.cacheTime,
        newValue,
        this.useVerboseLogging,
        this.useWebsocket);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ValuesClientConfigIF#getUseVerboseLogging() useVerboseLogging} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for useVerboseLogging
   * @return A modified copy of the {@code this} object
   */
  public final ValuesClientConfig withUseVerboseLogging(Boolean value) {
    Boolean newValue = Objects.requireNonNull(value, "useVerboseLogging");
    if (this.useVerboseLogging.equals(newValue)) return this;
    return new ValuesClientConfig(
        this,
        this.accountId,
        this.apiToken,
        this.coordinate,
        this.cacheTime,
        this.refreshTime,
        newValue,
        this.useWebsocket);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ValuesClientConfigIF#getUseWebsocket() useWebsocket} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for useWebsocket
   * @return A modified copy of the {@code this} object
   */
  public final ValuesClientConfig withUseWebsocket(Boolean value) {
    Boolean newValue = Objects.requireNonNull(value, "useWebsocket");
    if (this.useWebsocket.equals(newValue)) return this;
    return new ValuesClientConfig(
        this,
        this.accountId,
        this.apiToken,
        this.coordinate,
        this.cacheTime,
        this.refreshTime,
        this.useVerboseLogging,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ValuesClientConfig} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ValuesClientConfig
        && equalTo(0, (ValuesClientConfig) another);
  }

  private boolean equalTo(int synthetic, ValuesClientConfig another) {
    return accountId == another.accountId
        && apiToken.equals(another.apiToken)
        && coordinate.equals(another.coordinate)
        && cacheTime.equals(another.cacheTime)
        && refreshTime.equals(another.refreshTime)
        && useVerboseLogging.equals(another.useVerboseLogging)
        && useWebsocket.equals(another.useWebsocket);
  }

  /**
   * Computes a hash code from attributes: {@code accountId}, {@code apiToken}, {@code coordinate}, {@code cacheTime}, {@code refreshTime}, {@code useVerboseLogging}, {@code useWebsocket}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + accountId;
    h += (h << 5) + apiToken.hashCode();
    h += (h << 5) + coordinate.hashCode();
    h += (h << 5) + cacheTime.hashCode();
    h += (h << 5) + refreshTime.hashCode();
    h += (h << 5) + useVerboseLogging.hashCode();
    h += (h << 5) + useWebsocket.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ValuesClientConfig} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ValuesClientConfig")
        .omitNullValues()
        .add("accountId", accountId)
        .add("apiToken", apiToken)
        .add("coordinate", coordinate)
        .add("cacheTime", cacheTime)
        .add("refreshTime", refreshTime)
        .add("useVerboseLogging", useVerboseLogging)
        .add("useWebsocket", useWebsocket)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ValuesClientConfigIF", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ValuesClientConfigIF {
    int accountId;
    boolean accountIdIsSet;
    String apiToken;
    String coordinate;
    Duration cacheTime;
    boolean cacheTimeIsSet;
    Duration refreshTime;
    boolean refreshTimeIsSet;
    Boolean useVerboseLogging;
    boolean useVerboseLoggingIsSet;
    Boolean useWebsocket;
    boolean useWebsocketIsSet;
    @JsonProperty("accountId")
    public void setAccountId(int accountId) {
      this.accountId = accountId;
      this.accountIdIsSet = true;
    }
    @JsonProperty("apiToken")
    public void setApiToken(String apiToken) {
      this.apiToken = apiToken;
    }
    @JsonProperty("coordinate")
    public void setCoordinate(String coordinate) {
      this.coordinate = coordinate;
    }
    @JsonProperty("cacheTime")
    public void setCacheTime(Duration cacheTime) {
      this.cacheTime = cacheTime;
      this.cacheTimeIsSet = true;
    }
    @JsonProperty("refreshTime")
    public void setRefreshTime(Duration refreshTime) {
      this.refreshTime = refreshTime;
      this.refreshTimeIsSet = true;
    }
    @JsonProperty("useVerboseLogging")
    public void setUseVerboseLogging(Boolean useVerboseLogging) {
      this.useVerboseLogging = useVerboseLogging;
      this.useVerboseLoggingIsSet = true;
    }
    @JsonProperty("useWebsocket")
    public void setUseWebsocket(Boolean useWebsocket) {
      this.useWebsocket = useWebsocket;
      this.useWebsocketIsSet = true;
    }
    @Override
    public int getAccountId() { throw new UnsupportedOperationException(); }
    @Override
    public String getApiToken() { throw new UnsupportedOperationException(); }
    @Override
    public String getCoordinate() { throw new UnsupportedOperationException(); }
    @Override
    public Duration getCacheTime() { throw new UnsupportedOperationException(); }
    @Override
    public Duration getRefreshTime() { throw new UnsupportedOperationException(); }
    @Override
    public Boolean getUseVerboseLogging() { throw new UnsupportedOperationException(); }
    @Override
    public Boolean getUseWebsocket() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ValuesClientConfig fromJson(Json json) {
    ValuesClientConfig.Builder builder = ValuesClientConfig.builder();
    if (json.accountIdIsSet) {
      builder.withAccountId(json.accountId);
    }
    if (json.apiToken != null) {
      builder.withApiToken(json.apiToken);
    }
    if (json.coordinate != null) {
      builder.withCoordinate(json.coordinate);
    }
    if (json.cacheTimeIsSet) {
      builder.withCacheTime(json.cacheTime);
    }
    if (json.refreshTimeIsSet) {
      builder.withRefreshTime(json.refreshTime);
    }
    if (json.useVerboseLoggingIsSet) {
      builder.withUseVerboseLogging(json.useVerboseLogging);
    }
    if (json.useWebsocketIsSet) {
      builder.withUseWebsocket(json.useWebsocket);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code ValuesClientConfig} instance.
   * @param accountId The value for the {@code accountId} attribute
   * @param apiToken The value for the {@code apiToken} attribute
   * @param coordinate The value for the {@code coordinate} attribute
   * @param cacheTime The value for the {@code cacheTime} attribute
   * @param refreshTime The value for the {@code refreshTime} attribute
   * @param useVerboseLogging The value for the {@code useVerboseLogging} attribute
   * @param useWebsocket The value for the {@code useWebsocket} attribute
   * @return An immutable ValuesClientConfig instance
   */
  public static ValuesClientConfig of(int accountId, String apiToken, String coordinate, Duration cacheTime, Duration refreshTime, Boolean useVerboseLogging, Boolean useWebsocket) {
    return new ValuesClientConfig(accountId, apiToken, coordinate, cacheTime, refreshTime, useVerboseLogging, useWebsocket);
  }

  /**
   * Creates an immutable copy of a {@link ValuesClientConfigIF} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ValuesClientConfig instance
   */
  public static ValuesClientConfig copyOf(ValuesClientConfigIF instance) {
    if (instance instanceof ValuesClientConfig) {
      return (ValuesClientConfig) instance;
    }
    return ValuesClientConfig.builder()
        .withAccountId(instance.getAccountId())
        .withApiToken(instance.getApiToken())
        .withCoordinate(instance.getCoordinate())
        .withCacheTime(instance.getCacheTime())
        .withRefreshTime(instance.getRefreshTime())
        .withUseVerboseLogging(instance.getUseVerboseLogging())
        .withUseWebsocket(instance.getUseWebsocket())
        .build();
  }

  /**
   * Creates a builder for {@link ValuesClientConfig ValuesClientConfig}.
   * <pre>
   * ValuesClientConfig.builder()
   *    .withAccountId(int) // required {@link ValuesClientConfigIF#getAccountId() accountId}
   *    .withApiToken(String) // required {@link ValuesClientConfigIF#getApiToken() apiToken}
   *    .withCoordinate(String) // required {@link ValuesClientConfigIF#getCoordinate() coordinate}
   *    .withCacheTime(java.time.Duration) // optional {@link ValuesClientConfigIF#getCacheTime() cacheTime}
   *    .withRefreshTime(java.time.Duration) // optional {@link ValuesClientConfigIF#getRefreshTime() refreshTime}
   *    .withUseVerboseLogging(Boolean) // optional {@link ValuesClientConfigIF#getUseVerboseLogging() useVerboseLogging}
   *    .withUseWebsocket(Boolean) // optional {@link ValuesClientConfigIF#getUseWebsocket() useWebsocket}
   *    .build();
   * </pre>
   * @return A new ValuesClientConfig builder
   */
  public static ValuesClientConfig.Builder builder() {
    return new ValuesClientConfig.Builder();
  }

  /**
   * Builds instances of type {@link ValuesClientConfig ValuesClientConfig}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ValuesClientConfigIF", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_ACCOUNT_ID = 0x1L;
    private static final long INIT_BIT_API_TOKEN = 0x2L;
    private static final long INIT_BIT_COORDINATE = 0x4L;
    private static final long OPT_BIT_CACHE_TIME = 0x1L;
    private static final long OPT_BIT_REFRESH_TIME = 0x2L;
    private static final long OPT_BIT_USE_VERBOSE_LOGGING = 0x4L;
    private static final long OPT_BIT_USE_WEBSOCKET = 0x8L;
    private long initBits = 0x7L;
    private long optBits;

    private int accountId;
    private String apiToken;
    private String coordinate;
    private Duration cacheTime;
    private Duration refreshTime;
    private Boolean useVerboseLogging;
    private Boolean useWebsocket;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link ValuesClientConfigIF#getAccountId() accountId} attribute.
     * @param accountId The value for accountId 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("accountId")
    public final Builder withAccountId(int accountId) {
      checkNotIsSet(accountIdIsSet(), "accountId");
      this.accountId = accountId;
      initBits &= ~INIT_BIT_ACCOUNT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link ValuesClientConfigIF#getApiToken() apiToken} attribute.
     * @param apiToken The value for apiToken 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("apiToken")
    public final Builder withApiToken(String apiToken) {
      checkNotIsSet(apiTokenIsSet(), "apiToken");
      this.apiToken = Objects.requireNonNull(apiToken, "apiToken");
      initBits &= ~INIT_BIT_API_TOKEN;
      return this;
    }

    /**
     * Initializes the value for the {@link ValuesClientConfigIF#getCoordinate() coordinate} attribute.
     * @param coordinate The value for coordinate 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("coordinate")
    public final Builder withCoordinate(String coordinate) {
      checkNotIsSet(coordinateIsSet(), "coordinate");
      this.coordinate = Objects.requireNonNull(coordinate, "coordinate");
      initBits &= ~INIT_BIT_COORDINATE;
      return this;
    }

    /**
     * Initializes the value for the {@link ValuesClientConfigIF#getCacheTime() cacheTime} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link ValuesClientConfigIF#getCacheTime() cacheTime}.</em>
     * @param cacheTime The value for cacheTime 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("cacheTime")
    public final Builder withCacheTime(Duration cacheTime) {
      checkNotIsSet(cacheTimeIsSet(), "cacheTime");
      this.cacheTime = Objects.requireNonNull(cacheTime, "cacheTime");
      optBits |= OPT_BIT_CACHE_TIME;
      return this;
    }

    /**
     * Initializes the value for the {@link ValuesClientConfigIF#getRefreshTime() refreshTime} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link ValuesClientConfigIF#getRefreshTime() refreshTime}.</em>
     * @param refreshTime The value for refreshTime 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("refreshTime")
    public final Builder withRefreshTime(Duration refreshTime) {
      checkNotIsSet(refreshTimeIsSet(), "refreshTime");
      this.refreshTime = Objects.requireNonNull(refreshTime, "refreshTime");
      optBits |= OPT_BIT_REFRESH_TIME;
      return this;
    }

    /**
     * Initializes the value for the {@link ValuesClientConfigIF#getUseVerboseLogging() useVerboseLogging} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link ValuesClientConfigIF#getUseVerboseLogging() useVerboseLogging}.</em>
     * @param useVerboseLogging The value for useVerboseLogging 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("useVerboseLogging")
    public final Builder withUseVerboseLogging(Boolean useVerboseLogging) {
      checkNotIsSet(useVerboseLoggingIsSet(), "useVerboseLogging");
      this.useVerboseLogging = Objects.requireNonNull(useVerboseLogging, "useVerboseLogging");
      optBits |= OPT_BIT_USE_VERBOSE_LOGGING;
      return this;
    }

    /**
     * Initializes the value for the {@link ValuesClientConfigIF#getUseWebsocket() useWebsocket} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link ValuesClientConfigIF#getUseWebsocket() useWebsocket}.</em>
     * @param useWebsocket The value for useWebsocket 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("useWebsocket")
    public final Builder withUseWebsocket(Boolean useWebsocket) {
      checkNotIsSet(useWebsocketIsSet(), "useWebsocket");
      this.useWebsocket = Objects.requireNonNull(useWebsocket, "useWebsocket");
      optBits |= OPT_BIT_USE_WEBSOCKET;
      return this;
    }

    /**
     * Builds a new {@link ValuesClientConfig ValuesClientConfig}.
     * @return An immutable instance of ValuesClientConfig
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ValuesClientConfig build() {
      checkRequiredAttributes();
      return new ValuesClientConfig(this);
    }

    private boolean cacheTimeIsSet() {
      return (optBits & OPT_BIT_CACHE_TIME) != 0;
    }

    private boolean refreshTimeIsSet() {
      return (optBits & OPT_BIT_REFRESH_TIME) != 0;
    }

    private boolean useVerboseLoggingIsSet() {
      return (optBits & OPT_BIT_USE_VERBOSE_LOGGING) != 0;
    }

    private boolean useWebsocketIsSet() {
      return (optBits & OPT_BIT_USE_WEBSOCKET) != 0;
    }

    private boolean accountIdIsSet() {
      return (initBits & INIT_BIT_ACCOUNT_ID) == 0;
    }

    private boolean apiTokenIsSet() {
      return (initBits & INIT_BIT_API_TOKEN) == 0;
    }

    private boolean coordinateIsSet() {
      return (initBits & INIT_BIT_COORDINATE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ValuesClientConfig is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!accountIdIsSet()) attributes.add("accountId");
      if (!apiTokenIsSet()) attributes.add("apiToken");
      if (!coordinateIsSet()) attributes.add("coordinate");
      return "Cannot build ValuesClientConfig, some of required attributes are not set " + attributes;
    }
  }
}
