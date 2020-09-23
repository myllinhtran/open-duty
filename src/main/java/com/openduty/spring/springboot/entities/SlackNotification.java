package com.openduty.spring.springboot.entities;

import javax.persistence.*;

@Entity
@Table(name = "slack_notification", schema = "OpenDuty")
public class SlackNotification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "team_id")
    private int teamId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    @Override
    public String toString() {
        return "SlackNotification {" +
                "id=" + id +
                ", teamId=" + teamId +
                '}';
    }
}
