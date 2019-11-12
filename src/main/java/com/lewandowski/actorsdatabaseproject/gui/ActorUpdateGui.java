package com.lewandowski.actorsdatabaseproject.gui;

import com.lewandowski.actorsdatabaseproject.controller.ActorRepo;
import com.lewandowski.actorsdatabaseproject.model.Actor;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route("update-actor")
public class ActorUpdateGui extends VerticalLayout {

    private ActorRepo actorRepo;

    @Autowired
    public ActorUpdateGui(ActorRepo actorRepo) {

        this.actorRepo = actorRepo;

        TextField placeholderFieldId = new TextField();
        placeholderFieldId.setPlaceholder("ID");

        TextField placeholderFieldFirstName = new TextField();
        placeholderFieldFirstName.setPlaceholder("First Name");

        TextField placeholderFieldLastName = new TextField();
        placeholderFieldLastName.setPlaceholder("Last Name");

        TextField placeholderFieldBirthYear = new TextField();
        placeholderFieldBirthYear.setPlaceholder("Birth Year");

        Button updateButton = new Button("Update Actor", new Icon(VaadinIcon.ARROW_FORWARD));

        updateButton.addClickListener(buttonClickEvent -> {
            actorRepo.updateBirthYear(Integer.parseInt(placeholderFieldId.getValue()), Long.parseLong(placeholderFieldBirthYear.getValue()));
        });
        add(placeholderFieldId, placeholderFieldBirthYear, updateButton);
    }
}
