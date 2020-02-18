package com.sazails.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity
@Table(name = ("user_data"))
public class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = ("user_id"))
    private long id;

    @NotBlank
    @Column(name = ("user_username"))
    private String username;

    @NotBlank
    @Column(name = ("user_email"))
    private String email;

    @NotBlank
    @Column(name = ("user_password"))
    private String password;

    private Set roles;

    public UserData(){}

    public UserData(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long userId) {
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

    public void updateUser(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Fix this (ManyToMany attribute should not be null)
    @ManyToMany()
    @JoinTable(name = ("user_role"),
            joinColumns = @JoinColumn(name = ("user_id")),
            inverseJoinColumns = @JoinColumn(name = ("role_id")))
    public Set getRoles() {
        return roles;
    }

    public void setRoles(Set roles){
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "UserData[ id = " + id + ", username = " + username + ", email = " + email + "]";
    }
}