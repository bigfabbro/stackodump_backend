package com.stackodump.server.controllers;

import com.stackodump.server.models.CommentsEntity;
import com.stackodump.server.services.CommentsService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/v1/comments")
public class CommentsController {

    private final CommentsService service;

    @Autowired
    public CommentsController(CommentsService service) {
        this.service = service;
    }

    @GetMapping
    public List<CommentsEntity> getComments(){
        return service.getComments();
    }

    @GetMapping("/{id}")
    public Optional<CommentsEntity> getComment(@PathVariable Integer id) throws NotFoundException { return service.getById(id);}

}