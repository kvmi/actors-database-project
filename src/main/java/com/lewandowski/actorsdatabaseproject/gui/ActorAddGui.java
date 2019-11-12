package com.lewandowski.actorsdatabaseproject.gui;

//import com.lewandowski.actors.HSQLDBConnection;
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

@Route("add-actor")
public class ActorAddGui extends VerticalLayout {

    private ActorRepo actorRepo;

    @Autowired
    public ActorAddGui(ActorRepo actorRepo) {

        this.actorRepo = actorRepo;

        TextField placeholderFieldFirstName = new TextField();
        placeholderFieldFirstName.setPlaceholder("First Name");

        TextField placeholderFieldLastName = new TextField();
        placeholderFieldLastName.setPlaceholder("Last Name");

        TextField placeholderFieldBirthYear = new TextField();
        placeholderFieldBirthYear.setPlaceholder("Birth Year");

        Button addButton = new Button("Add Actor", new Icon(VaadinIcon.ARROW_FORWARD));

        addButton.addClickListener(buttonClickEvent -> {
            actorRepo.save(new Actor(placeholderFieldFirstName.getValue(),placeholderFieldLastName.getValue(), Integer.parseInt(placeholderFieldBirthYear.getValue())));
        });
        add(placeholderFieldFirstName, placeholderFieldLastName, placeholderFieldBirthYear, addButton);
    }
}
