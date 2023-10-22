package model.entity;

import java.time.LocalDateTime;

public abstract class Entity<TKey> {
    public final TKey id;
    public final LocalDateTime created_at;
    public LocalDateTime updated_at;

    public Entity(TKey id, LocalDateTime created_at) {
        this.id = id;
        this.created_at = created_at;
    }
}
