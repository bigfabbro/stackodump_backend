package com.stackodump.server.controllers;

import com.stackodump.server.models.TagsEntity;
import com.stackodump.server.services.TagsService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/v1/tags")
public class TagsController {

    private final TagsService service;

    @Autowired
    public TagsController(TagsService service) {
        this.service = service;
    }

    @GetMapping
    public List<TagsEntity> getTags(){
        return service.getTags();
    }

    @GetMapping("/{id}")
    public Optional<TagsEntity> getTag(@PathVariable Integer id) throws NotFoundException { return service.getById(id);}

}