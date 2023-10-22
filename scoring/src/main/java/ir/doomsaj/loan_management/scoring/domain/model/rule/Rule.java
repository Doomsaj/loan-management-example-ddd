package ir.doomsaj.loan_management.scoring.domain.model.rule;

import java.time.LocalDateTime;
import java.util.UUID;
import lombok.Getter;
import model.aggregate.AggregateRoot;

@Getter
public class Rule extends AggregateRoot<String> {
  private final RuleCriteria criteria;
  private final String title;
  private final CalculationStrategy strategy;
  private boolean isActive;

  public Rule(String title, RuleCriteria criteria, CalculationStrategy strategy) {
    super(UUID.randomUUID().toString(), LocalDateTime.now());
    this.title = title;
    this.criteria = criteria;
    this.strategy = strategy;
  }

  public Rule(
      String id,
      String title,
      RuleCriteria criteria,
      LocalDateTime created_at,
      CalculationStrategy strategy) {
    super(id, created_at);
    this.title = title;
    this.criteria = criteria;
    this.strategy = strategy;
    this.isActive = true;
  }

  public int calculatePoints(ApplicantConditions candidate) {
    if (criteria.isApplicantTo(candidate)) {
      return strategy.getValue();
    } else {
      return 0;
    }
  }

  public void deActive() {
    this.isActive = false;
  }
}
