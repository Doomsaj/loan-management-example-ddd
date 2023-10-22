package core.specification;

public abstract class Specification<T> implements ISpecification<T> {
  @Override
  public abstract boolean isSatisfiedBy(T candidate);

  public Specification<T> And(ISpecification<T> candidate) {
    return new AndSpecification<T>(this, candidate);
  }

  public Specification<T> Or(ISpecification<T> candidate) {
    return new OrSpecification<>(this, candidate);
  }

  public Specification<T> Not() {
    return new NotSpecification<>(this);
  }
}
