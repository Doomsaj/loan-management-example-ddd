package ir.doomsaj.loan_management.scoring.helpers.directors;

import com.github.javafaker.Faker;
import ir.doomsaj.loan_management.scoring.domain.model.rule.ApplicantConditions;
import ir.doomsaj.loan_management.scoring.domain.model.rule.enums.OrganizationalPositions;
import ir.doomsaj.loan_management.scoring.helpers.builders.ApplicantConditionsBuilder;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public abstract class ApplicantConditionsDirector {
  private static final Faker faker = new Faker();
  private static final ApplicantConditionsBuilder builder = new ApplicantConditionsBuilder();

  public static ApplicantConditions withHireDate(LocalDate hireDate) {
    return builder
        .hireDate(hireDate)
        .position(OrganizationalPositions.random())
        .previousLoansCount(faker.number().randomDigit())
        .build();
  }

  public static ApplicantConditions withOrganizationalPosition(OrganizationalPositions position) {
    return builder
        .hireDate(dateToLocalDate(faker.date().birthday()))
        .position(position)
        .previousLoansCount(faker.number().randomDigit())
        .build();
  }

  public static ApplicantConditions withPreviousLoansCount(int previousLoansCount) {
    return builder
        .hireDate(dateToLocalDate(faker.date().birthday()))
        .position(OrganizationalPositions.random())
        .previousLoansCount(previousLoansCount)
        .build();
  }

  private static LocalDate dateToLocalDate(Date date) {
    return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
  }
}
