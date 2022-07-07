package com.stackodump.server.repositories;

import com.stackodump.server.models.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<UsersEntity, Integer> {

    @Query("SELECT s from UsersEntity as s WHERE s.id = ?1")
    public Optional<UsersEntity> getUserById(Integer id);

}