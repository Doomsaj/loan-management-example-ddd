package ir.doomsaj.loan_management.scoring.domain.model.rule;

import java.time.LocalDate;

import ir.doomsaj.loan_management.scoring.domain.model.rule.enums.OrganizationalPositions;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ApplicantConditions {
  public LocalDate hireDate;
  public OrganizationalPositions position;
  public int previousLoansCount;
}
