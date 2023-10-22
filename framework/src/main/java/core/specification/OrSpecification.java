package core.specification;

public class OrSpecification<T> extends CompositeSpecification<T> {
  public OrSpecification(ISpecification<T> right, ISpecification<T> left) {
    super(right, left);
  }

  @Override
  public boolean isSatisfiedBy(T candidate) {
    return right.isSatisfiedBy(candidate) || left.isSatisfiedBy(candidate);
  }
}
