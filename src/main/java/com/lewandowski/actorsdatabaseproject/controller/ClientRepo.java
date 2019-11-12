package com.lewandowski.actorsdatabaseproject.controller;

import com.lewandowski.actorsdatabaseproject.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClientRepo extends JpaRepository<Client, Long> {


}
