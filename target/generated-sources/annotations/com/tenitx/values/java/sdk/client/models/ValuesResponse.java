package com.tenitx.values.java.sdk.client.models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.util.Map;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link ValuesResponseIF}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ValuesResponse.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ValuesResponse.of()}.
 */
@Generated(from = "ValuesResponseIF", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ValuesResponse implements ValuesResponseIF {
  private final ImmutableMap<String, String> valuesMap;

  private ValuesResponse(Map<String, ? extends String> valuesMap) {
    this.valuesMap = ImmutableMap.copyOf(valuesMap);
  }

  private ValuesResponse(
      ValuesResponse original,
      ImmutableMap<String, String> valuesMap) {
    this.valuesMap = valuesMap;
  }

  /**
   * @return The value of the {@code valuesMap} attribute
   */
  @JsonProperty("valuesMap")
  @Override
  public ImmutableMap<String, String> getValuesMap() {
    return valuesMap;
  }

  /**
   * Copy the current immutable object by replacing the {@link ValuesResponseIF#getValuesMap() valuesMap} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the valuesMap map
   * @return A modified copy of {@code this} object
   */
  public final ValuesResponse withValuesMap(Map<String, ? extends String> entries) {
    if (this.valuesMap == entries) return this;
    ImmutableMap<String, String> newValue = ImmutableMap.copyOf(entries);
    return new ValuesResponse(this, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ValuesResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ValuesResponse
        && equalTo(0, (ValuesResponse) another);
  }

  private boolean equalTo(int synthetic, ValuesResponse another) {
    return valuesMap.equals(another.valuesMap);
  }

  /**
   * Computes a hash code from attributes: {@code valuesMap}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + valuesMap.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ValuesResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ValuesResponse")
        .omitNullValues()
        .add("valuesMap", valuesMap)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ValuesResponseIF", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ValuesResponseIF {
    Map<String, String> valuesMap = ImmutableMap.of();
    @JsonProperty("valuesMap")
    public void setValuesMap(Map<String, String> valuesMap) {
      this.valuesMap = valuesMap;
    }
    @Override
    public Map<String, String> getValuesMap() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ValuesResponse fromJson(Json json) {
    ValuesResponse.Builder builder = ValuesResponse.builder();
    if (json.valuesMap != null) {
      builder.putAllValuesMap(json.valuesMap);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code ValuesResponse} instance.
   * @param valuesMap The value for the {@code valuesMap} attribute
   * @return An immutable ValuesResponse instance
   */
  public static ValuesResponse of(Map<String, ? extends String> valuesMap) {
    return new ValuesResponse(valuesMap);
  }

  /**
   * Creates an immutable copy of a {@link ValuesResponseIF} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ValuesResponse instance
   */
  public static ValuesResponse copyOf(ValuesResponseIF instance) {
    if (instance instanceof ValuesResponse) {
      return (ValuesResponse) instance;
    }
    return ValuesResponse.builder()
        .putAllValuesMap(instance.getValuesMap())
        .build();
  }

  /**
   * Creates a builder for {@link ValuesResponse ValuesResponse}.
   * <pre>
   * ValuesResponse.builder()
   *    .putValuesMap|putAllValuesMap(String =&gt; String) // {@link ValuesResponseIF#getValuesMap() valuesMap} mappings
   *    .build();
   * </pre>
   * @return A new ValuesResponse builder
   */
  public static ValuesResponse.Builder builder() {
    return new ValuesResponse.Builder();
  }

  /**
   * Builds instances of type {@link ValuesResponse ValuesResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ValuesResponseIF", generator = "Immutables")
  public static final class Builder {
    private final ImmutableMap.Builder<String, String> valuesMap = ImmutableMap.builder();

    private Builder() {
    }

    /**
     * Put one entry to the {@link ValuesResponseIF#getValuesMap() valuesMap} map.
     * @param key The key in the valuesMap map
     * @param value The associated value in the valuesMap map
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder putValuesMap(String key, String value) {
      this.valuesMap.put(key, value);
      return this;
    }

    /**
     * Put one entry to the {@link ValuesResponseIF#getValuesMap() valuesMap} map. Nulls are not permitted
     * @param entry The key and value entry
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder putValuesMap(Map.Entry<String, ? extends String> entry) {
      this.valuesMap.put(entry);
      return this;
    }

    /**
     * Put all mappings from the specified map as entries to {@link ValuesResponseIF#getValuesMap() valuesMap} map. Nulls are not permitted
     * @param entries The entries that will be added to the valuesMap map
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder putAllValuesMap(Map<String, ? extends String> entries) {
      this.valuesMap.putAll(entries);
      return this;
    }

    /**
     * Builds a new {@link ValuesResponse ValuesResponse}.
     * @return An immutable instance of ValuesResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ValuesResponse build() {
      return new ValuesResponse(null, valuesMap.build());
    }
  }
}
