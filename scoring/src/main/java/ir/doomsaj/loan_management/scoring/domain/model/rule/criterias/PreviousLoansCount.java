package ir.doomsaj.loan_management.scoring.domain.model.rule.criterias;

import ir.doomsaj.loan_management.scoring.domain.model.rule.ApplicantConditions;
import ir.doomsaj.loan_management.scoring.domain.model.rule.RuleCriteria;
import lombok.Getter;

@Getter
public class PreviousLoansCount extends RuleCriteria {
  private final int maximumCount;

  public PreviousLoansCount(int maximumCount) {
    this.maximumCount = maximumCount;
  }

  @Override
  public boolean isSatisfiedBy(ApplicantConditions candidate) {
    return candidate.previousLoansCount > maximumCount;
  }
}
