package com.lewandowski.actorsdatabaseproject.gui;

import com.lewandowski.actorsdatabaseproject.controller.ActorRepo;
import com.lewandowski.actorsdatabaseproject.model.Actor;
import com.lewandowski.actorsdatabaseproject.controller.ActorRepo;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Route("remove-actor")
public class ActorRemoveGui extends VerticalLayout {

    private ActorRepo actorRepo;

    @Autowired
    public ActorRemoveGui(ActorRepo actorRepo) {

        this.actorRepo = actorRepo;

        TextField placeholderFieldId = new TextField();
        placeholderFieldId.setPlaceholder("Id");

        Button delButton = new Button("Delete Actor", new Icon(VaadinIcon.ARROW_FORWARD));

        delButton.addClickListener(buttonClickEvent -> {
            actorRepo.deleteById(Long.parseLong(placeholderFieldId.getValue()));
        });


        add(placeholderFieldId, delButton);
    }
}
