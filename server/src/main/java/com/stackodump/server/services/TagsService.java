package com.stackodump.server.services;

import com.stackodump.server.models.TagsEntity;
import com.stackodump.server.repositories.TagsRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TagsService {

    private final TagsRepository repository;

    @Autowired
    public TagsService(TagsRepository repository) {
        this.repository = repository;
    }


    public List<TagsEntity> getTags(){
        return repository.findAll();
    }

    public Optional<TagsEntity> getById(Integer id) throws NotFoundException {
        Optional<TagsEntity> tag = repository.getTagById(id);
        if (tag.isPresent()){
            return tag;
        }
        else {
            throw new NotFoundException("Tag with ID equal to " + id + " doesn't exist!");
        }
    }
}
