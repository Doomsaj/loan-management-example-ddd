package model.event;

public abstract class IntegrationEvent extends DomainEvent {
    public IntegrationEvent(String aggregateType, String eventType) {
        super(aggregateType, eventType);
    }
}
