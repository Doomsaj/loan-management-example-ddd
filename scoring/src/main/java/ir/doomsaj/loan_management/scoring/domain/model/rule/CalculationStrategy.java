package ir.doomsaj.loan_management.scoring.domain.model.rule;

import lombok.Getter;

@Getter
public class CalculationStrategy {
  private final int value;

  private CalculationStrategy(int value) {
    this.value = value;
  }

  public static CalculationStrategy increasePointTo(int value) {
    return new CalculationStrategy(value);
  }

  public static CalculationStrategy decreasePointsTo(int value) {
    return new CalculationStrategy(value * -1);
  }
}
