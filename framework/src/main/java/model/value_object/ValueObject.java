package model.value_object;

public abstract class ValueObject<T extends ValueObject<T>> {
  public boolean isSameAs(T that) {
    return that != null
        && that.getClass() == that.getClass()
        && (that == this || this.equals(that));
  }
  protected abstract boolean equals(T that);
}
