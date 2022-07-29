package com.stackodump.server.controllers;

import com.stackodump.server.models.CommentsEntity;
import com.stackodump.server.models.PostsEntity;
import com.stackodump.server.services.PostsService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/v1/posts")
public class PostsController {

    private final PostsService service;

    @Autowired
    public PostsController(PostsService service) {
        this.service = service;
    }

    @GetMapping
    public List<PostsEntity> getPosts(){
        return service.getPosts();
    }

    @GetMapping("/{id}")
    public Optional<PostsEntity> getPost(@PathVariable Integer id) throws NotFoundException { return service.getById(id);}

    @GetMapping("/search")
    public List<PostsEntity> searchPosts(@RequestParam("q") String queryText, @RequestParam("l") Integer maxResultNum){
        return service.searchPosts(queryText, maxResultNum);
    }
    @GetMapping("/{id}/comments")
    public List<CommentsEntity> getPostComments(@PathVariable Integer id){return service.getPostComments(id);}

}