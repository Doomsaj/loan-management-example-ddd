package ir.doomsaj.loan_management.scoring.infrastructure.kafka;

import java.util.concurrent.CompletableFuture;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {
  private final KafkaTemplate<String, String> _kafkaTemplate;

  public MessageProducer(KafkaTemplate<String, String> kafkaTemplate) {
    _kafkaTemplate = kafkaTemplate;
  }

  public CompletableFuture<SendResult<String, String>> sendMessage(String topic, String message) {
    return _kafkaTemplate.send(topic, message);
  }
}
