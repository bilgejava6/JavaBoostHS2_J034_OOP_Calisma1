package com.muhammet.entity;

import com.muhammet.utility.State;

import java.util.UUID;

public class BaseEntity {
    private final UUID uuid;
    private State state;
    private Long createdAt;
    private Long updatedAt;

    public BaseEntity(){
        this.uuid = UUID.randomUUID();
        this.state = State.ACTIVE;
        this.createdAt = System.currentTimeMillis();
    }

    public UUID getUuid() {
        return uuid;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }
}
