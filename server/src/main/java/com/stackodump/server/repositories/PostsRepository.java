package com.stackodump.server.repositories;

import com.stackodump.server.models.PostsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostsRepository extends JpaRepository<PostsEntity, Integer> {

    @Query("SELECT p from PostsEntity as p WHERE p.id = ?1")
    public Optional<PostsEntity> getPostById(Integer id);

    @Query(value =  "SELECT * " +
                    "from posts as p, plainto_tsquery ('english', ?1) as query " +
                    "WHERE p.weighted_tsv @@ query " +
                    "ORDER BY ts_rank(p.weighted_tsv, query) DESC LIMIT ?2",
            nativeQuery = true)
    public List<PostsEntity> searchPosts(String text, Integer limit);

}