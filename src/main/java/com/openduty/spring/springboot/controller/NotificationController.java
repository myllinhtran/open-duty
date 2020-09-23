package com.openduty.spring.springboot.controller;

import com.openduty.spring.springboot.entities.Notification;
import com.openduty.spring.springboot.repos.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class NotificationController {

    @Autowired
    NotificationRepository repository;

    @GetMapping("/notifications")
    public List<Notification> getAllNotifications() {
        return (List<Notification>) repository.findAll();
    }

    @GetMapping("/notifications/{id}")
    public Optional<Notification> getNotification(@PathVariable("id") Integer id) {
        return repository.findById(id);
    }

    @PostMapping("/notifications")
    public Notification createNotification(@RequestBody Notification notification) {
        return repository.save(notification);
    }

    @PutMapping("/notifications")
    public Notification updateNotification(@RequestBody Notification notification) {
        return repository.save(notification);
    }

    @DeleteMapping("/notifications/{id}")
    @ResponseBody
    public String deleteNotification(@PathVariable("id") Integer id) {
        repository.deleteById(id);
        return MessageFormat.format("Notification with ID {0} has been deleted.", id);
    }

}
