package ir.doomsaj.loan_management.scoring.domain.model.rule.criterias;

import java.time.Period;

import ir.doomsaj.loan_management.scoring.domain.model.rule.ApplicantConditions;
import ir.doomsaj.loan_management.scoring.domain.model.rule.RuleCriteria;
import lombok.Getter;

@Getter
public class WorkingExperience extends RuleCriteria {
  private final Period period;

  public WorkingExperience(Period period) {
    this.period = period;
  }

  @Override
  public boolean isSatisfiedBy(ApplicantConditions candidate) {
    return candidate.hireDate.isBefore(period.getChronology().dateNow());
  }
}
