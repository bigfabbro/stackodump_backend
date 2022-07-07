package com.stackodump.server.services;
import com.stackodump.server.models.CommentsEntity;
import com.stackodump.server.repositories.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javassist.NotFoundException;

import java.util.List;
import java.util.Optional;

@Service
public class CommentsService {

    private final CommentsRepository repository;

    @Autowired
    public CommentsService(CommentsRepository repository) {
        this.repository = repository;
    }


    public List<CommentsEntity> getComments(){
        return repository.findAll();
    }

    public Optional<CommentsEntity> getById(Integer id) throws  NotFoundException {
        Optional<CommentsEntity> comment = repository.getCommentById(id);
        if (comment.isPresent()){
            return comment;
        }
        else {
            throw new NotFoundException("Comment with ID equal to " + id + " doesn't exist!");
        }
    }




}
