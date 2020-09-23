package com.openduty.spring.springboot.controller;

import com.openduty.spring.springboot.entities.SlackNotification;
import com.openduty.spring.springboot.repos.SlackNotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class SlackNotificationController {

    @Autowired
    SlackNotificationRepository repository;

    @GetMapping("/slackNotification")
    public List<SlackNotification> getAllSlackNotification() {
        return (List<SlackNotification>) repository.findAll();
    }

    @GetMapping("/slackNotification/{id}")
    public Optional<SlackNotification> getSlackNotification(@PathVariable("id") Integer id) {
        return repository.findById(id);
    }

    @PostMapping("/slackNotification")
    public SlackNotification setSlackNotification(@RequestBody SlackNotification slackNotification) {
        return repository.save(slackNotification);
    }

    @PutMapping("/slackNotification")
    public SlackNotification updateSlackNotification(@RequestBody SlackNotification slackNotification) {
        return repository.save(slackNotification);
    }

    @DeleteMapping("/slackNotification/{id}")
    public String deleteSlackNotification(@PathVariable("id") Integer id) {
        repository.deleteById(id);
        return MessageFormat.format("The Slack Notification with ID {0} has been deleted.", id);
    }
}
