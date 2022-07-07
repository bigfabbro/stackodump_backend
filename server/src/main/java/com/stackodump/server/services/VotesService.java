package com.stackodump.server.services;
import com.stackodump.server.models.CommentsEntity;
import com.stackodump.server.models.VotesEntity;
import com.stackodump.server.repositories.CommentsRepository;
import com.stackodump.server.repositories.VotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javassist.NotFoundException;

import java.util.List;
import java.util.Optional;

@Service
public class VotesService {

    private final VotesRepository repository;

    @Autowired
    public VotesService(VotesRepository repository) {
        this.repository = repository;
    }


    public List<VotesEntity> getVotes(){
        return repository.findAll();
    }

    public Optional<VotesEntity> getById(Integer id) throws  NotFoundException {
        Optional<VotesEntity> vote = repository.getVoteById(id);
        if (vote.isPresent()){
            return vote;
        }
        else {
            throw new NotFoundException("Vote with ID equal to " + id + " doesn't exist!");
        }
    }




}
