package ir.doomsaj.loan_management.scoring.application.handler;

import java.util.concurrent.CompletableFuture;

import core.application.ICommandHandler;
import ir.doomsaj.loan_management.scoring.application.command.CreateNewScoringCommand;
import ir.doomsaj.loan_management.scoring.infrastructure.ScoringMessageProducer;
import org.springframework.stereotype.Component;

@Component
public class CreateNewScoringHandler implements ICommandHandler<CreateNewScoringCommand> {
  private final ScoringMessageProducer _producer;

  public CreateNewScoringHandler(ScoringMessageProducer producer) {
    _producer = producer;
  }

  @Override
  public CompletableFuture<Object> handle(CreateNewScoringCommand newScoringCommand) {
    return CompletableFuture.supplyAsync(() -> _producer.produce(newScoringCommand.message()));
  }
}
