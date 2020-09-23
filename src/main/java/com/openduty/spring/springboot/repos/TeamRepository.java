package com.openduty.spring.springboot.repos;

import com.openduty.spring.springboot.entities.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Integer> {
}
