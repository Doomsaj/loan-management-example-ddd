package ir.doomsaj.loan_management.scoring.helpers.builders;


import ir.doomsaj.loan_management.scoring.domain.model.rule.ApplicantConditions;
import ir.doomsaj.loan_management.scoring.domain.model.rule.enums.OrganizationalPositions;

import java.time.LocalDate;

public class ApplicantConditionsBuilder {
  private LocalDate hireDate;
  private OrganizationalPositions position;
  private int previousLoansCount;

  public ApplicantConditionsBuilder hireDate(LocalDate hireDate) {
    this.hireDate = hireDate;
    return this;
  }

  public ApplicantConditionsBuilder position(OrganizationalPositions position) {
    this.position = position;
    return this;
  }

  public ApplicantConditionsBuilder previousLoansCount(int previousLoansCount) {
    this.previousLoansCount = previousLoansCount;
    return this;
  }

  public ApplicantConditions build() {
    return new ApplicantConditions(hireDate, position, previousLoansCount);
  }
}
