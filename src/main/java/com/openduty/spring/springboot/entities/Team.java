package com.openduty.spring.springboot.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "team", schema = "OpenDuty")
public class Team {

    @Id
    private int id;

    @Column(name = "name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Team {" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
