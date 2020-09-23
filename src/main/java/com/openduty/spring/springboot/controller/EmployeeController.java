package com.openduty.spring.springboot.controller;

import com.openduty.spring.springboot.entities.Employee;
import com.openduty.spring.springboot.repos.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    /*
        Get a list of all employees.
        Return the list.
     */
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return (List<Employee>) repository.findAll();
    }

    /*
        Get information of an employee.
        Return the employee.
         */
    @GetMapping("/employees/{id}")
    public Optional<Employee> getEmployee(@PathVariable("id") Integer id) {
        return repository.findById(id);
    }

    /*
        Create a new employee in the database.
        Return the information of the newly added employee.
     */
    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee) {
        return repository.save(employee);
    }

    /*
        Update a current employee in the database.
        Return the information of the newly updated employee.
     */
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return repository.save(employee);
    }

    /*
        Delete an employee using its id.
     */
    @DeleteMapping("/employees/{id}")
    @ResponseBody
    public String deleteEmployee(@PathVariable("id") Integer id) throws Exception{
        repository.deleteById(id);
        return MessageFormat.format("User with ID {0} has been deleted.", id);
    }

}
