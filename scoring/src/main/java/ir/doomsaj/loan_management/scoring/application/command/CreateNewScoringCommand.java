package ir.doomsaj.loan_management.scoring.application.command;


import core.application.ICommand;

public record CreateNewScoringCommand(String message) implements ICommand {}
