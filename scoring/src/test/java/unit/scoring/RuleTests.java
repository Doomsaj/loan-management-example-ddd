package unit.scoring;

import ir.doomsaj.loan_management.scoring.domain.model.rule.CalculationStrategy;
import ir.doomsaj.loan_management.scoring.domain.model.rule.Rule;
import ir.doomsaj.loan_management.scoring.domain.model.rule.criterias.OrganizationalPosition;
import ir.doomsaj.loan_management.scoring.domain.model.rule.criterias.PreviousLoansCount;
import ir.doomsaj.loan_management.scoring.domain.model.rule.criterias.WorkingExperience;
import ir.doomsaj.loan_management.scoring.domain.model.rule.enums.OrganizationalPositions;
import ir.doomsaj.loan_management.scoring.helpers.directors.ApplicantConditionsDirector;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.UUID;

import static org.assertj.core.api.Assertions.*;

public class RuleTests {
  @Test
  @DisplayName("scoring should applies to work experience")
  void scoring_applies_to_work_experience() {
    var applicantConditions = ApplicantConditionsDirector.withHireDate(LocalDate.of(2018, 1, 12));
    var workingExperience = new WorkingExperience(Period.ofDays(365));
    var rule =
        new Rule(
            UUID.randomUUID().toString(),
            "working experience above 1 year",
            workingExperience,
            LocalDateTime.now(),
            CalculationStrategy.increasePointTo(1));
    var points = rule.calculatePoints(applicantConditions);
    assertThat(points).isEqualTo(1);
  }

  @Test
  @DisplayName("scoring should applies to organizational position")
  void scoring_should_applies_to_organizational_position() {
    var applicantConditions =
        ApplicantConditionsDirector.withOrganizationalPosition(OrganizationalPositions.MANAGER);
    var organizationalPosition = new OrganizationalPosition(OrganizationalPositions.MANAGER);
    var rule =
        new Rule(
            UUID.randomUUID().toString(),
            "organizational position equals to manager",
            organizationalPosition,
            LocalDateTime.now(),
            CalculationStrategy.increasePointTo(5));
    var points = rule.calculatePoints(applicantConditions);
    assertThat(points).isEqualTo(5);
  }

  @Test
  @DisplayName("scoring should applies to previous loans count")
  void scoring_should_applies_to_previous_loans_count() {
    var applicantConditions = ApplicantConditionsDirector.withPreviousLoansCount(10);
    var previousLoansCount = new PreviousLoansCount(2);
    var rule =
        new Rule(
            UUID.randomUUID().toString(),
            "previous loans count is less than or equals to 2",
            previousLoansCount,
            LocalDateTime.now(),
            CalculationStrategy.decreasePointsTo(5));
    var points = rule.calculatePoints(applicantConditions);
    assertThat(points).isEqualTo(-5);
  }
}
