package core.specification;

public class NotSpecification<T> extends Specification<T> {
  public Specification<T> target;

  public NotSpecification(Specification<T> target) {
    this.target = target;
  }

  @Override
  public boolean isSatisfiedBy(T candidate) {
    return !target.isSatisfiedBy(candidate);
  }
}
