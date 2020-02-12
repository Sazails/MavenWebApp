package com.sazails.model;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Length;
import org.springframework.security.core.userdetails.User;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
//@Table (name = "newUserTable")
public class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotBlank
    private String username;
    @NotBlank
    private String email;

    public UserData(){}

    public UserData(String username, String email){
        this.username = username;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int userId) {
        this.id = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void updateUser(String username, String email){
        this.username = username;
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserData[" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ']';
    }
}