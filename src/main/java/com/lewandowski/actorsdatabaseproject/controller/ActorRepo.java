package com.lewandowski.actorsdatabaseproject.controller;

import com.lewandowski.actorsdatabaseproject.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface ActorRepo extends JpaRepository<Actor, Long> {

    @Modifying
    @Query("UPDATE Actor a SET a.birthYear = :birthYear WHERE a.id= :id")
    int updateBirthYear(@Param("birthYear") int birthYear, @Param("id") long id);
}
