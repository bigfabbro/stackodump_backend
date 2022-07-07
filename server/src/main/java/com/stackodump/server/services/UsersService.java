package com.stackodump.server.services;
import com.stackodump.server.models.UsersEntity;
import com.stackodump.server.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javassist.NotFoundException;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {

    private final UsersRepository repository;

    @Autowired
    public UsersService(UsersRepository repository) {
        this.repository = repository;
    }


    public List<UsersEntity> getUsers(){
        return repository.findAll();
    }

    public Optional<UsersEntity> getById(Integer id) throws  NotFoundException {
        Optional<UsersEntity> user = repository.getUserById(id);
        if (user.isPresent()){
            return user;
        }
        else {
            throw new NotFoundException("User with ID equal to " + id + " doesn't exist!");
        }
    }




}
