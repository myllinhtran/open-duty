package com.openduty.spring.springboot.repos;

import com.openduty.spring.springboot.entities.SlackNotification;
import org.springframework.data.repository.CrudRepository;

public interface SlackNotificationRepository extends CrudRepository<SlackNotification, Integer> {
}
