package com.openduty.spring.springboot.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.openduty.spring.springboot.helper.Type;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "incident", schema = "OpenDuty")
public class Incident {

    @Id
    private int id;

    @Column(name = "type", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Type type;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ssZ")
    @Column(name = "created", columnDefinition = "TIMESTAMP")
    private OffsetDateTime created;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "team_id")
    private int teamId;


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


    public OffsetDateTime getCreated() {
        return created;
    }

    public void setCreated(OffsetDateTime created) {
        this.created = created;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    @Override
    public String toString() {
        return "Incident {" +
                "id=" + id +
                ", type=" + type +
                ", created=" + created +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", teamId=" + teamId +
                '}';
    }
}
