package ir.doomsaj.loan_management.scoring.domain.service;


import ir.doomsaj.loan_management.scoring.domain.model.rule.ApplicantConditions;

public interface IScoreCalculator {
  int calculateScoreOfApplicant(ApplicantConditions conditions);
}
