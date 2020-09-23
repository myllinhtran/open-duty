package com.openduty.spring.springboot.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Objects;

@Entity
@Table(name = "schedule", schema = "OpenDuty")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ssZ")
    @Column(name = "start_time", columnDefinition = "TIMESTAMP")
    private OffsetDateTime startTime;

    @Column(name = "period")
    private int period;

    @Column(name = "team_id", columnDefinition = "int")
    private int teamId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    @Override
    public String toString() {
        return "Schedule {" +
                "id=" + id +
                ", startTime=" + startTime +
                ", period=" + period +
                ", teamId=" + teamId +
                '}';
    }
}
