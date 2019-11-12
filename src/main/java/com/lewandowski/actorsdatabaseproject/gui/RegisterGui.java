package com.lewandowski.actorsdatabaseproject.gui;

//import com.lewandowski.actors.HSQLDBConnection;
import com.lewandowski.actorsdatabaseproject.controller.ClientRepo;
import com.lewandowski.actorsdatabaseproject.model.Actor;
import com.lewandowski.actorsdatabaseproject.controller.ClientRepo;
import com.lewandowski.actorsdatabaseproject.model.Client;
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

@Route("register")
public class RegisterGui extends VerticalLayout {

    private ClientRepo clientRepo;

    @Autowired
    public RegisterGui(ClientRepo clientRepo) {

        this.clientRepo = clientRepo;

        TextField placeholderFieldLogin = new TextField();
        placeholderFieldLogin.setPlaceholder("login");

        TextField placeholderFieldPass = new TextField();
        placeholderFieldPass.setPlaceholder("password");

        Button addButton = new Button("Register", new Icon(VaadinIcon.ARROW_FORWARD));

        addButton.addClickListener(buttonClickEvent -> {
            clientRepo.save(new Client(placeholderFieldLogin.getValue(),placeholderFieldPass.getValue()));
        });
        add(placeholderFieldLogin, placeholderFieldPass, addButton);
    }
}

