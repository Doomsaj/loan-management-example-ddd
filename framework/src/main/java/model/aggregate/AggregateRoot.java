package model.aggregate;

import model.entity.Entity;
import model.event.DomainEvent;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class AggregateRoot<TKey extends Comparable<TKey>> extends Entity<TKey> {
    public final ArrayList<DomainEvent> uncommittedEvents;
    public AggregateRoot(TKey id, LocalDateTime created_at) {
        super(id, created_at);
        uncommittedEvents = new ArrayList<>();
    }
    public void causes(DomainEvent event) {
        uncommittedEvents.add(event);
    }
}
