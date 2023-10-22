package ir.doomsaj.loan_management.scoring.infrastructure;

import ir.doomsaj.loan_management.scoring.infrastructure.kafka.MessageProducer;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
public class ScoringMessageProducer {
  private final MessageProducer _producer;

  public ScoringMessageProducer(MessageProducer producer) {
    _producer = producer;
  }

  public CompletableFuture<SendResult<String, String>> produce(String message) {
    return this._producer.sendMessage("scoring", message);
  }
}
