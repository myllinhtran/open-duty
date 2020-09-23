package com.openduty.spring.springboot.controller;

import com.openduty.spring.springboot.entities.Team;
import com.openduty.spring.springboot.repos.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/v1")
public class TeamController {

    @Autowired
    TeamRepository repository;

    /*
        Get a list of all teams.
        Return the list.
     */
    @GetMapping("/teams")
    public List<Team> getAllTeam() {
        return (List<Team>) repository.findAll();
    }

    /*
        Get information of a team.
        Return the team.
         */
    @GetMapping("/teams/{id}")
    public Optional<Team> getTeam(@PathVariable("id") Integer id) {
        return repository.findById(id);
    }

    /*
        Create a new team in the database.
        Return the information of the newly added team.
     */
    @PostMapping("/teams")
    public Team createTeam(@RequestBody Team team) {
        return repository.save(team);
    }

    /*
        Update a current team in the database.
        Return the information of the newly updated team.
     */
    @PutMapping("/teams")
    public Team updateTeam(@RequestBody Team team) {
        return repository.save(team);
    }

    /*
        Delete a team using its id.
     */
    @DeleteMapping("/teams/{id}")
    @ResponseBody
    public String deleteTeam(@PathVariable("id") Integer id) {
        repository.deleteById(id);
        return MessageFormat.format("Team with ID {0} has been deleted.", id);
    }
}
