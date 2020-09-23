package com.openduty.spring.springboot.repos;

import com.openduty.spring.springboot.entities.Notification;
import org.springframework.data.repository.CrudRepository;

public interface NotificationRepository extends CrudRepository<Notification, Integer> {
}
