package core.specification;

public abstract class CompositeSpecification<T> extends Specification<T> {
  public ISpecification<T> right;
  public ISpecification<T> left;

  public CompositeSpecification(ISpecification<T> right, ISpecification<T> left) {
    this.right = right;
    this.left = left;
  }
}
