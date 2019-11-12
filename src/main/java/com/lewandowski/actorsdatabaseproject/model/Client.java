package com.lewandowski.actorsdatabaseproject.model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idklient;

    @NotNull
    private String login;

    @NotNull
    private String pass;

    public long getIdklient() {
        return idklient;
    }

    public void setIdklient(long idklient) {
        this.idklient = idklient;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Client(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    public Client() {
    }


    @Override
    public String toString() {
        return "Client{" +
                "idklient=" + idklient +
                ", login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}




