package com.openduty.spring.springboot.entities;

import com.openduty.spring.springboot.helper.Type;

import javax.persistence.*;

@Entity
@Table(name = "notification", schema = "OpenDuty")
public class Notification {

    @Id
    private int id;

    @Column(name = "type", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Type type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Notification {" +
                "id=" + id +
                ", type=" + type +
                '}';
    }
}
