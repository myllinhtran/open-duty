package com.openduty.spring.springboot.controller;

import com.openduty.spring.springboot.entities.Schedule;
import com.openduty.spring.springboot.repos.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class ScheduleController {

    @Autowired
    ScheduleRepository repository;

    @GetMapping("/schedules")
    public List<Schedule> getAllSchedules() {
        return (List<Schedule>) repository.findAll();
    }

    @GetMapping("/schedules/{id}")
    public Optional<Schedule> getSchedule(@PathVariable("id") Integer id) {
        return repository.findById(id);
    }

    /*
        Time pattern: "yyyy-MM-dd HH:mm:ss+0000"
     */
    @PostMapping("/schedules")
    public Schedule setSchedule(@RequestBody Schedule schedule) {
        return repository.save(schedule);
    }

    @PutMapping("/schedules")
    public Schedule updateSchedule(@RequestBody Schedule schedule) {
        return repository.save(schedule);
    }

    @DeleteMapping("/schedules/{id}")
    public String deleteSchedule(@PathVariable("id") Integer id) {
        repository.deleteById(id);
        return MessageFormat.format("The schedule with ID {0} has been deleted.", id);
    }
}
