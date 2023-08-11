package com.tenitx.values.java.sdk.client;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.util.Set;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link WebsocketActionIF}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code WebsocketAction.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code WebsocketAction.of()}.
 */
@Generated(from = "WebsocketActionIF", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class WebsocketAction implements WebsocketActionIF {
  private final ImmutableSet<Value> valuesToAdd;
  private final ImmutableSet<Value> valuesToRemove;

  private WebsocketAction(
      Iterable<? extends Value> valuesToAdd,
      Iterable<? extends Value> valuesToRemove) {
    this.valuesToAdd = ImmutableSet.copyOf(valuesToAdd);
    this.valuesToRemove = ImmutableSet.copyOf(valuesToRemove);
  }

  private WebsocketAction(
      WebsocketAction original,
      ImmutableSet<Value> valuesToAdd,
      ImmutableSet<Value> valuesToRemove) {
    this.valuesToAdd = valuesToAdd;
    this.valuesToRemove = valuesToRemove;
  }

  /**
   * @return The value of the {@code valuesToAdd} attribute
   */
  @JsonProperty("valuesToAdd")
  @Override
  public ImmutableSet<Value> getValuesToAdd() {
    return valuesToAdd;
  }

  /**
   * @return The value of the {@code valuesToRemove} attribute
   */
  @JsonProperty("valuesToRemove")
  @Override
  public ImmutableSet<Value> getValuesToRemove() {
    return valuesToRemove;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link WebsocketActionIF#getValuesToAdd() valuesToAdd}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final WebsocketAction withValuesToAdd(Value... elements) {
    ImmutableSet<Value> newValue = ImmutableSet.copyOf(elements);
    return new WebsocketAction(this, newValue, this.valuesToRemove);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link WebsocketActionIF#getValuesToAdd() valuesToAdd}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of valuesToAdd elements to set
   * @return A modified copy of {@code this} object
   */
  public final WebsocketAction withValuesToAdd(Iterable<? extends Value> elements) {
    if (this.valuesToAdd == elements) return this;
    ImmutableSet<Value> newValue = ImmutableSet.copyOf(elements);
    return new WebsocketAction(this, newValue, this.valuesToRemove);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link WebsocketActionIF#getValuesToRemove() valuesToRemove}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final WebsocketAction withValuesToRemove(Value... elements) {
    ImmutableSet<Value> newValue = ImmutableSet.copyOf(elements);
    return new WebsocketAction(this, this.valuesToAdd, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link WebsocketActionIF#getValuesToRemove() valuesToRemove}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of valuesToRemove elements to set
   * @return A modified copy of {@code this} object
   */
  public final WebsocketAction withValuesToRemove(Iterable<? extends Value> elements) {
    if (this.valuesToRemove == elements) return this;
    ImmutableSet<Value> newValue = ImmutableSet.copyOf(elements);
    return new WebsocketAction(this, this.valuesToAdd, newValue);
  }

  /**
   * This instance is equal to all instances of {@code WebsocketAction} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof WebsocketAction
        && equalTo(0, (WebsocketAction) another);
  }

  private boolean equalTo(int synthetic, WebsocketAction another) {
    return valuesToAdd.equals(another.valuesToAdd)
        && valuesToRemove.equals(another.valuesToRemove);
  }

  /**
   * Computes a hash code from attributes: {@code valuesToAdd}, {@code valuesToRemove}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + valuesToAdd.hashCode();
    h += (h << 5) + valuesToRemove.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code WebsocketAction} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("WebsocketAction")
        .omitNullValues()
        .add("valuesToAdd", valuesToAdd)
        .add("valuesToRemove", valuesToRemove)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "WebsocketActionIF", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements WebsocketActionIF {
    Set<Value> valuesToAdd = ImmutableSet.of();
    Set<Value> valuesToRemove = ImmutableSet.of();
    @JsonProperty("valuesToAdd")
    public void setValuesToAdd(Set<Value> valuesToAdd) {
      this.valuesToAdd = valuesToAdd;
    }
    @JsonProperty("valuesToRemove")
    public void setValuesToRemove(Set<Value> valuesToRemove) {
      this.valuesToRemove = valuesToRemove;
    }
    @Override
    public Set<Value> getValuesToAdd() { throw new UnsupportedOperationException(); }
    @Override
    public Set<Value> getValuesToRemove() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static WebsocketAction fromJson(Json json) {
    WebsocketAction.Builder builder = WebsocketAction.builder();
    if (json.valuesToAdd != null) {
      builder.addAllValuesToAdd(json.valuesToAdd);
    }
    if (json.valuesToRemove != null) {
      builder.addAllValuesToRemove(json.valuesToRemove);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code WebsocketAction} instance.
   * @param valuesToAdd The value for the {@code valuesToAdd} attribute
   * @param valuesToRemove The value for the {@code valuesToRemove} attribute
   * @return An immutable WebsocketAction instance
   */
  public static WebsocketAction of(Set<Value> valuesToAdd, Set<Value> valuesToRemove) {
    return of((Iterable<? extends Value>) valuesToAdd, (Iterable<? extends Value>) valuesToRemove);
  }

  /**
   * Construct a new immutable {@code WebsocketAction} instance.
   * @param valuesToAdd The value for the {@code valuesToAdd} attribute
   * @param valuesToRemove The value for the {@code valuesToRemove} attribute
   * @return An immutable WebsocketAction instance
   */
  public static WebsocketAction of(Iterable<? extends Value> valuesToAdd, Iterable<? extends Value> valuesToRemove) {
    return new WebsocketAction(valuesToAdd, valuesToRemove);
  }

  /**
   * Creates an immutable copy of a {@link WebsocketActionIF} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable WebsocketAction instance
   */
  public static WebsocketAction copyOf(WebsocketActionIF instance) {
    if (instance instanceof WebsocketAction) {
      return (WebsocketAction) instance;
    }
    return WebsocketAction.builder()
        .addAllValuesToAdd(instance.getValuesToAdd())
        .addAllValuesToRemove(instance.getValuesToRemove())
        .build();
  }

  /**
   * Creates a builder for {@link WebsocketAction WebsocketAction}.
   * <pre>
   * WebsocketAction.builder()
   *    .addValuesToAdd|addAllValuesToAdd(com.tenitx.values.java.sdk.client.Value) // {@link WebsocketActionIF#getValuesToAdd() valuesToAdd} elements
   *    .addValuesToRemove|addAllValuesToRemove(com.tenitx.values.java.sdk.client.Value) // {@link WebsocketActionIF#getValuesToRemove() valuesToRemove} elements
   *    .build();
   * </pre>
   * @return A new WebsocketAction builder
   */
  public static WebsocketAction.Builder builder() {
    return new WebsocketAction.Builder();
  }

  /**
   * Builds instances of type {@link WebsocketAction WebsocketAction}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "WebsocketActionIF", generator = "Immutables")
  public static final class Builder {
    private final ImmutableSet.Builder<Value> valuesToAdd = ImmutableSet.builder();
    private final ImmutableSet.Builder<Value> valuesToRemove = ImmutableSet.builder();

    private Builder() {
    }

    /**
     * Adds one element to {@link WebsocketActionIF#getValuesToAdd() valuesToAdd} set.
     * @param element A valuesToAdd element
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addValuesToAdd(Value element) {
      this.valuesToAdd.add(element);
      return this;
    }

    /**
     * Adds elements to {@link WebsocketActionIF#getValuesToAdd() valuesToAdd} set.
     * @param elements An array of valuesToAdd elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addValuesToAdd(Value... elements) {
      this.valuesToAdd.add(elements);
      return this;
    }


    /**
     * Adds elements to {@link WebsocketActionIF#getValuesToAdd() valuesToAdd} set.
     * @param elements An iterable of valuesToAdd elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAllValuesToAdd(Iterable<? extends Value> elements) {
      this.valuesToAdd.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link WebsocketActionIF#getValuesToRemove() valuesToRemove} set.
     * @param element A valuesToRemove element
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addValuesToRemove(Value element) {
      this.valuesToRemove.add(element);
      return this;
    }

    /**
     * Adds elements to {@link WebsocketActionIF#getValuesToRemove() valuesToRemove} set.
     * @param elements An array of valuesToRemove elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addValuesToRemove(Value... elements) {
      this.valuesToRemove.add(elements);
      return this;
    }


    /**
     * Adds elements to {@link WebsocketActionIF#getValuesToRemove() valuesToRemove} set.
     * @param elements An iterable of valuesToRemove elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAllValuesToRemove(Iterable<? extends Value> elements) {
      this.valuesToRemove.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link WebsocketAction WebsocketAction}.
     * @return An immutable instance of WebsocketAction
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public WebsocketAction build() {
      return new WebsocketAction(null, valuesToAdd.build(), valuesToRemove.build());
    }
  }
}
