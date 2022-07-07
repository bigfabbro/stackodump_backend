package com.stackodump.server.repositories;

import com.stackodump.server.models.CommentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CommentsRepository extends JpaRepository<CommentsEntity, Integer> {

    @Query("SELECT s from CommentsEntity as s WHERE s.id = ?1")
    public Optional<CommentsEntity> getCommentById(Integer id);



}