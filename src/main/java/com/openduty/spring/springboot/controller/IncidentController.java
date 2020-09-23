package com.openduty.spring.springboot.controller;

import com.openduty.spring.springboot.entities.Incident;
import com.openduty.spring.springboot.repos.IncidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class IncidentController {

    @Autowired
    IncidentRepository repository;

    /*
        Get a list of all incidents.
        Return the list.
     */
    @GetMapping("/incidents")
    public List<Incident> getAllIncidents() {
        return (List<Incident>) repository.findAll();
    }

    /*
        Get information of an incident.
        Return the incident.
         */
    @GetMapping("/incidents/{id}")
    public Optional<Incident> getIncident(@PathVariable("id") Integer id) {
        return repository.findById(id);
    }

    /*
        Create a new incident in the database.
        Return the information of the newly added incident.
     */
    @PostMapping("/incidents")
    public Incident createIncident(@RequestBody Incident incident) {
        return repository.save(incident);
    }

    /*
        Update a current incident in the database.
        Return the information of the newly updated incident.
     */
    @PutMapping("/incidents")
    public Incident updateIncident(@RequestBody Incident incident) {
        return repository.save(incident);
    }

    /*
        Delete an incident using its id.
     */
    @DeleteMapping("/incidents/{id}")
    @ResponseBody
    public String deleteIncident(@PathVariable("id") Integer id) {
        repository.deleteById(id);
        return MessageFormat.format("Incident with ID {0} has been deleted.", id);
    }

}
