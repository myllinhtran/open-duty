package com.openduty.spring.springboot.repos;

import com.openduty.spring.springboot.entities.Schedule;
import org.springframework.data.repository.CrudRepository;

public interface ScheduleRepository extends CrudRepository<Schedule, Integer> {
}
