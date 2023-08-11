package com.tenitx.values.java.sdk.client;

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
 * Immutable implementation of {@link ValueIF}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code Value.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code Value.of()}.
 */
@Generated(from = "ValueIF", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class Value implements ValueIF {
  private final String name;
  private final String value;

  private Value(String name, String value) {
    this.name = Objects.requireNonNull(name, "name");
    this.value = Objects.requireNonNull(value, "value");
  }

  private Value(Value original, String name, String value) {
    this.name = name;
    this.value = value;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public String getName() {
    return name;
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public String getValue() {
    return value;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ValueIF#getName() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final Value withName(String value) {
    String newValue = Objects.requireNonNull(value, "name");
    if (this.name.equals(newValue)) return this;
    return new Value(this, newValue, this.value);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ValueIF#getValue() value} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for value
   * @return A modified copy of the {@code this} object
   */
  public final Value withValue(String value) {
    String newValue = Objects.requireNonNull(value, "value");
    if (this.value.equals(newValue)) return this;
    return new Value(this, this.name, newValue);
  }

  /**
   * This instance is equal to all instances of {@code Value} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof Value
        && equalTo(0, (Value) another);
  }

  private boolean equalTo(int synthetic, Value another) {
    return name.equals(another.name)
        && value.equals(another.value);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code value}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + name.hashCode();
    h += (h << 5) + value.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Value} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Value")
        .omitNullValues()
        .add("name", name)
        .add("value", value)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ValueIF", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ValueIF {
    String name;
    String value;
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("value")
    public void setValue(String value) {
      this.value = value;
    }
    @Override
    public String getName() { throw new UnsupportedOperationException(); }
    @Override
    public String getValue() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static Value fromJson(Json json) {
    Value.Builder builder = Value.builder();
    if (json.name != null) {
      builder.withName(json.name);
    }
    if (json.value != null) {
      builder.withValue(json.value);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code Value} instance.
   * @param name The value for the {@code name} attribute
   * @param value The value for the {@code value} attribute
   * @return An immutable Value instance
   */
  public static Value of(String name, String value) {
    return new Value(name, value);
  }

  /**
   * Creates an immutable copy of a {@link ValueIF} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Value instance
   */
  public static Value copyOf(ValueIF instance) {
    if (instance instanceof Value) {
      return (Value) instance;
    }
    return Value.builder()
        .withName(instance.getName())
        .withValue(instance.getValue())
        .build();
  }

  /**
   * Creates a builder for {@link Value Value}.
   * <pre>
   * Value.builder()
   *    .withName(String) // required {@link ValueIF#getName() name}
   *    .withValue(String) // required {@link ValueIF#getValue() value}
   *    .build();
   * </pre>
   * @return A new Value builder
   */
  public static Value.Builder builder() {
    return new Value.Builder();
  }

  /**
   * Builds instances of type {@link Value Value}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ValueIF", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_VALUE = 0x2L;
    private long initBits = 0x3L;

    private String name;
    private String value;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link ValueIF#getName() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("name")
    public final Builder withName(String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link ValueIF#getValue() value} attribute.
     * @param value The value for value 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("value")
    public final Builder withValue(String value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = Objects.requireNonNull(value, "value");
      initBits &= ~INIT_BIT_VALUE;
      return this;
    }

    /**
     * Builds a new {@link Value Value}.
     * @return An immutable instance of Value
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Value build() {
      checkRequiredAttributes();
      return new Value(null, name, value);
    }

    private boolean nameIsSet() {
      return (initBits & INIT_BIT_NAME) == 0;
    }

    private boolean valueIsSet() {
      return (initBits & INIT_BIT_VALUE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Value is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!nameIsSet()) attributes.add("name");
      if (!valueIsSet()) attributes.add("value");
      return "Cannot build Value, some of required attributes are not set " + attributes;
    }
  }
}
