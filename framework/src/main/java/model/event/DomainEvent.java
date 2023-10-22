package model.event;

import model.value_object.ValueObject;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class DomainEvent extends ValueObject<DomainEvent> {
    public final String id;
    public final LocalDateTime occurAt;
    public final String aggregateType;
    public final String eventType;

    public DomainEvent(String aggregateType, String eventType) {
        this.id = UUID.randomUUID().toString();
        this.occurAt = LocalDateTime.now();
        this.aggregateType = aggregateType;
        this.eventType = eventType;
    }
}
