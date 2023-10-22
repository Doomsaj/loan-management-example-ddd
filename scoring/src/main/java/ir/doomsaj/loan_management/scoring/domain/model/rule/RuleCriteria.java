package ir.doomsaj.loan_management.scoring.domain.model.rule;


import core.specification.Specification;

public abstract class RuleCriteria extends Specification<ApplicantConditions> {
  public boolean isApplicantTo(ApplicantConditions candidate) {
    return this.isSatisfiedBy(candidate);
  }

  @Override
  public abstract boolean isSatisfiedBy(ApplicantConditions candidate);
}
