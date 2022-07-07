package com.stackodump.server.controllers;

import com.stackodump.server.models.UsersEntity;
import com.stackodump.server.services.UsersService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/v1/users")
public class UsersController {

    private final UsersService service;

    @Autowired
    public UsersController(UsersService service) {
        this.service = service;
    }

    @GetMapping
    public List<UsersEntity> getUsers(){
        return service.getUsers();
    }

    @GetMapping("/{id}")
    public Optional<UsersEntity> getUser(@PathVariable Integer id) throws NotFoundException { return service.getById(id);}

}