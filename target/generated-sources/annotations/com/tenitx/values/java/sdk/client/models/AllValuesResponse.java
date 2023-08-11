package com.tenitx.values.java.sdk.client.models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link AllValuesResponseIF}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code AllValuesResponse.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code AllValuesResponse.of()}.
 */
@Generated(from = "AllValuesResponseIF", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class AllValuesResponse implements AllValuesResponseIF {
  private final ValuesResponse valuesMap;

  private AllValuesResponse(ValuesResponse valuesMap) {
    this.valuesMap = Objects.requireNonNull(valuesMap, "valuesMap");
  }

  private AllValuesResponse(AllValuesResponse original, ValuesResponse valuesMap) {
    this.valuesMap = valuesMap;
  }

  /**
   * @return The value of the {@code valuesMap} attribute
   */
  @JsonProperty("valuesMap")
  @Override
  public ValuesResponse getValuesMap() {
    return valuesMap;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AllValuesResponseIF#getValuesMap() valuesMap} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for valuesMap
   * @return A modified copy of the {@code this} object
   */
  public final AllValuesResponse withValuesMap(ValuesResponse value) {
    if (this.valuesMap == value) return this;
    ValuesResponse newValue = Objects.requireNonNull(value, "valuesMap");
    return new AllValuesResponse(this, newValue);
  }

  /**
   * This instance is equal to all instances of {@code AllValuesResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof AllValuesResponse
        && equalTo(0, (AllValuesResponse) another);
  }

  private boolean equalTo(int synthetic, AllValuesResponse another) {
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
   * Prints the immutable value {@code AllValuesResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("AllValuesResponse")
        .omitNullValues()
        .add("valuesMap", valuesMap)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "AllValuesResponseIF", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AllValuesResponseIF {
    ValuesResponse valuesMap;
    @JsonProperty("valuesMap")
    public void setValuesMap(ValuesResponse valuesMap) {
      this.valuesMap = valuesMap;
    }
    @Override
    public ValuesResponse getValuesMap() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static AllValuesResponse fromJson(Json json) {
    AllValuesResponse.Builder builder = AllValuesResponse.builder();
    if (json.valuesMap != null) {
      builder.withValuesMap(json.valuesMap);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code AllValuesResponse} instance.
   * @param valuesMap The value for the {@code valuesMap} attribute
   * @return An immutable AllValuesResponse instance
   */
  public static AllValuesResponse of(ValuesResponse valuesMap) {
    return new AllValuesResponse(valuesMap);
  }

  /**
   * Creates an immutable copy of a {@link AllValuesResponseIF} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AllValuesResponse instance
   */
  public static AllValuesResponse copyOf(AllValuesResponseIF instance) {
    if (instance instanceof AllValuesResponse) {
      return (AllValuesResponse) instance;
    }
    return AllValuesResponse.builder()
        .withValuesMap(instance.getValuesMap())
        .build();
  }

  /**
   * Creates a builder for {@link AllValuesResponse AllValuesResponse}.
   * <pre>
   * AllValuesResponse.builder()
   *    .withValuesMap(com.tenitx.values.java.sdk.client.models.ValuesResponse) // required {@link AllValuesResponseIF#getValuesMap() valuesMap}
   *    .build();
   * </pre>
   * @return A new AllValuesResponse builder
   */
  public static AllValuesResponse.Builder builder() {
    return new AllValuesResponse.Builder();
  }

  /**
   * Builds instances of type {@link AllValuesResponse AllValuesResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "AllValuesResponseIF", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_VALUES_MAP = 0x1L;
    private long initBits = 0x1L;

    private ValuesResponse valuesMap;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link AllValuesResponseIF#getValuesMap() valuesMap} attribute.
     * @param valuesMap The value for valuesMap 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("valuesMap")
    public final Builder withValuesMap(ValuesResponse valuesMap) {
      checkNotIsSet(valuesMapIsSet(), "valuesMap");
      this.valuesMap = Objects.requireNonNull(valuesMap, "valuesMap");
      initBits &= ~INIT_BIT_VALUES_MAP;
      return this;
    }

    /**
     * Builds a new {@link AllValuesResponse AllValuesResponse}.
     * @return An immutable instance of AllValuesResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public AllValuesResponse build() {
      checkRequiredAttributes();
      return new AllValuesResponse(null, valuesMap);
    }

    private boolean valuesMapIsSet() {
      return (initBits & INIT_BIT_VALUES_MAP) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of AllValuesResponse is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!valuesMapIsSet()) attributes.add("valuesMap");
      return "Cannot build AllValuesResponse, some of required attributes are not set " + attributes;
    }
  }
}
