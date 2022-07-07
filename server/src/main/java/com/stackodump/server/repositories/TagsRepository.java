package com.stackodump.server.repositories;

import com.stackodump.server.models.TagsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TagsRepository extends JpaRepository<TagsEntity, Integer> {

    @Query("SELECT t from TagsEntity as t WHERE t.id = ?1")
    public Optional<TagsEntity> getTagById(Integer id);

}