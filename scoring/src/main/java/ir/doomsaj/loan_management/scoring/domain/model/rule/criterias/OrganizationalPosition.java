package ir.doomsaj.loan_management.scoring.domain.model.rule.criterias;

import ir.doomsaj.loan_management.scoring.domain.model.rule.ApplicantConditions;
import ir.doomsaj.loan_management.scoring.domain.model.rule.RuleCriteria;
import ir.doomsaj.loan_management.scoring.domain.model.rule.enums.OrganizationalPositions;
import lombok.Getter;

@Getter
public class OrganizationalPosition extends RuleCriteria {
  private final OrganizationalPositions position;

  public OrganizationalPosition(OrganizationalPositions position) {
    this.position = position;
  }

  @Override
  public boolean isSatisfiedBy(ApplicantConditions candidate) {
    return position == candidate.position;
  }
}
