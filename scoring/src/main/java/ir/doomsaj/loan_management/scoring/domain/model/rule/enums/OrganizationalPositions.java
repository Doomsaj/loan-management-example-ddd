package ir.doomsaj.loan_management.scoring.domain.model.rule.enums;

import java.util.Random;

public enum OrganizationalPositions {
  MANAGER,
  EMPLOYEE;

  private static final Random PRNG = new Random();

  public static OrganizationalPositions random() {
    OrganizationalPositions[] positions = values();
    return positions[PRNG.nextInt(positions.length)];
  }
}
