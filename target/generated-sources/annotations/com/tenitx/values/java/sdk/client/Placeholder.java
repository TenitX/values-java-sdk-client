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
 * Immutable implementation of {@link PlaceholderIF}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code Placeholder.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code Placeholder.of()}.
 */
@Generated(from = "PlaceholderIF", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class Placeholder implements PlaceholderIF {
  private final String value;

  private Placeholder(String value) {
    this.value = Objects.requireNonNull(value, "value");
  }

  private Placeholder(Placeholder original, String value) {
    this.value = value;
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
   * Copy the current immutable object by setting a value for the {@link PlaceholderIF#getValue() value} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for value
   * @return A modified copy of the {@code this} object
   */
  public final Placeholder withValue(String value) {
    String newValue = Objects.requireNonNull(value, "value");
    if (this.value.equals(newValue)) return this;
    return new Placeholder(this, newValue);
  }

  /**
   * This instance is equal to all instances of {@code Placeholder} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof Placeholder
        && equalTo(0, (Placeholder) another);
  }

  private boolean equalTo(int synthetic, Placeholder another) {
    return value.equals(another.value);
  }

  /**
   * Computes a hash code from attributes: {@code value}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + value.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Placeholder} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Placeholder")
        .omitNullValues()
        .add("value", value)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "PlaceholderIF", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements PlaceholderIF {
    String value;
    @JsonProperty("value")
    public void setValue(String value) {
      this.value = value;
    }
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
  static Placeholder fromJson(Json json) {
    Placeholder.Builder builder = Placeholder.builder();
    if (json.value != null) {
      builder.withValue(json.value);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code Placeholder} instance.
   * @param value The value for the {@code value} attribute
   * @return An immutable Placeholder instance
   */
  public static Placeholder of(String value) {
    return new Placeholder(value);
  }

  /**
   * Creates an immutable copy of a {@link PlaceholderIF} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Placeholder instance
   */
  public static Placeholder copyOf(PlaceholderIF instance) {
    if (instance instanceof Placeholder) {
      return (Placeholder) instance;
    }
    return Placeholder.builder()
        .withValue(instance.getValue())
        .build();
  }

  /**
   * Creates a builder for {@link Placeholder Placeholder}.
   * <pre>
   * Placeholder.builder()
   *    .withValue(String) // required {@link PlaceholderIF#getValue() value}
   *    .build();
   * </pre>
   * @return A new Placeholder builder
   */
  public static Placeholder.Builder builder() {
    return new Placeholder.Builder();
  }

  /**
   * Builds instances of type {@link Placeholder Placeholder}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "PlaceholderIF", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_VALUE = 0x1L;
    private long initBits = 0x1L;

    private String value;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link PlaceholderIF#getValue() value} attribute.
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
     * Builds a new {@link Placeholder Placeholder}.
     * @return An immutable instance of Placeholder
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Placeholder build() {
      checkRequiredAttributes();
      return new Placeholder(null, value);
    }

    private boolean valueIsSet() {
      return (initBits & INIT_BIT_VALUE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Placeholder is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!valueIsSet()) attributes.add("value");
      return "Cannot build Placeholder, some of required attributes are not set " + attributes;
    }
  }
}
