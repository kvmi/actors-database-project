package com.lewandowski.actorsdatabaseproject.gui;


import com.lewandowski.actorsdatabaseproject.controller.ActorRepo;
import com.lewandowski.actorsdatabaseproject.model.Actor;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route("show-actors")
public class ActorShowGui extends VerticalLayout {

    private ActorRepo actorRepo;

    @Autowired
   public ActorShowGui(ActorRepo actorRepo) {

        this.actorRepo = actorRepo;

        Grid<Actor> grid = new Grid<>(Actor.class);
        grid.setItems(actorRepo.findAll());
        grid.setColumns("id", "firstName", "lastName", "birthYear");

        add(grid);
    }
}