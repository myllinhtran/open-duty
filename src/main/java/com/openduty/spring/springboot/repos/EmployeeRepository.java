package com.openduty.spring.springboot.repos;

import com.openduty.spring.springboot.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
