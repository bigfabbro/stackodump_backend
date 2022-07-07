package com.stackodump.server.controllers;

import com.stackodump.server.models.VotesEntity;
import com.stackodump.server.services.VotesService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/v1/votes")
public class VotesController {

    private final VotesService service;

    @Autowired
    public VotesController(VotesService service) {
        this.service = service;
    }

    @GetMapping
    public List<VotesEntity> getVotes(){
        return service.getVotes();
    }

    @GetMapping("/{id}")
    public Optional<VotesEntity> getVote(@PathVariable Integer id) throws NotFoundException { return service.getById(id);}

}