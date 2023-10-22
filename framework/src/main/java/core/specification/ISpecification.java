package core.specification;

public interface ISpecification<T> {
  boolean isSatisfiedBy(T candidate);
}
