package ir.doomsaj.loan_management.scoring.infrastructure;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ScoringMessageConsumer {
  @KafkaListener(topics = "scoring")
  public void listen(String message) {
    System.out.println("Received message: " + message);
  }
}
