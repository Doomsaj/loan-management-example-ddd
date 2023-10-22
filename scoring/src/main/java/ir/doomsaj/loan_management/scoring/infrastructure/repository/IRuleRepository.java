package ir.doomsaj.loan_management.scoring.infrastructure.repository;

import ir.doomsaj.loan_management.scoring.domain.model.rule.Rule;

import java.util.List;

public interface IRuleRepository {
  void add(Rule rule);

  List<Rule> getActiveRules();
}
