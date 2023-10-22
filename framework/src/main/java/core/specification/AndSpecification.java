package core.specification;

public class AndSpecification<T> extends CompositeSpecification<T> {
  public AndSpecification(ISpecification<T> right, ISpecification<T> left) {
    super(right, left);
  }

  @Override
  public boolean isSatisfiedBy(T candidate) {
    return right.isSatisfiedBy(candidate) && left.isSatisfiedBy(candidate);
  }
}
