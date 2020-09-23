package com.openduty.spring.springboot.repos;

import com.openduty.spring.springboot.entities.Incident;
import org.springframework.data.repository.CrudRepository;

public interface IncidentRepository extends CrudRepository<Incident, Integer> {
}
