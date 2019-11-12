//package com.lewandowski.actorsdatabaseproject.gui;
//
//
//import com.lewandowski.actorsdatabaseproject.controller.ActorRepo;
//import com.lewandowski.actorsdatabaseproject.model.Actor;
//import com.vaadin.flow.component.button.Button;
//import com.vaadin.flow.component.icon.Icon;
//import com.vaadin.flow.component.icon.VaadinIcon;
//import com.vaadin.flow.component.orderedlayout.VerticalLayout;
//import com.vaadin.flow.component.textfield.TextField;
//import com.vaadin.flow.router.Route;
//import elemental.json.impl.JsonUtil;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//@Route("load-actors")
//public class ActorLoadGui extends VerticalLayout {
//
//    private ActorRepo actorRepo;
//    @Autowired
//    public ActorLoadGui(ActorRepo actorRepo) {
//        this.actorRepo = actorRepo;
//
//        Button addButton = new Button("Load actors from database", new Icon(VaadinIcon.ARROW_CIRCLE_DOWN));
//      //  Connection con = HSQLDBConnection.getConnection();
//        addButton.addClickListener(buttonClickEvent -> {
//            actorRepo.getAll().clear();
//            try {
//                PreparedStatement ps = con.prepareStatement(
//                        "select id, firstName, lastName, birthYear from actor");
//                ResultSet rs = ps.executeQuery();
//                while (rs.next()) {
//
//                    Actor actor = new Actor(rs.getInt("id"), rs.getString("firstName"), rs.getString("lastName"), rs.getInt("birthYear"));
//                    actorRepo.addActor(actor);
//                }
//                rs.close();
//               // con.close();
//            } catch (SQLException e1) {
//                e1.printStackTrace();
//            }
//            actorRepo.getAll().forEach(System.out::println);
//        });
//
//
//        add(addButton);
//    }
//}
