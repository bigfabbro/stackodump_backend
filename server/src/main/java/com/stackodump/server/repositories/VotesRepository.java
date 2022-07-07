package com.stackodump.server.repositories;

import com.stackodump.server.models.VotesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VotesRepository extends JpaRepository<VotesEntity, Integer> {

    @Query("SELECT v from VotesEntity as v WHERE v.id = ?1")
    public Optional<VotesEntity> getVoteById(Integer id);

}