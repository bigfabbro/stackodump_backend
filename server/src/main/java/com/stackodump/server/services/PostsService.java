package com.stackodump.server.services;
import com.stackodump.server.models.CommentsEntity;
import com.stackodump.server.models.PostsEntity;
import com.stackodump.server.repositories.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javassist.NotFoundException;

import java.util.List;
import java.util.Optional;

@Service
public class PostsService {

    private final PostsRepository repository;

    @Autowired
    public PostsService(PostsRepository repository) {
        this.repository = repository;
    }


    public List<PostsEntity> getPosts(){
        return repository.findAll();
    }

    public Optional<PostsEntity> getById(Integer id) throws  NotFoundException {
        Optional<PostsEntity> post = repository.getPostById(id);
        if (post.isPresent()){
            return post;
        }
        else {
            throw new NotFoundException("Post with ID equal to " + id + " doesn't exist!");
        }
    }

    public List<PostsEntity> searchPosts(String text, Integer limit){
        return repository.searchPosts(text, limit);
    }

    public List<CommentsEntity> getPostComments(Integer id){
        return repository.getPostComments(id);
    }

    public List<PostsEntity> getPostAnswers(Integer id){
        return repository.getPostAnswers(id);
    }


}
