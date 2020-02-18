package com.sazails.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = ("user_role"))
public class UserRole {
    private Long id;
    private String name;
    private Set users;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Fix this
    @ManyToMany(mappedBy = ("user_roles"))
    public Set getUsers() {
        return users;
    }

    public void setUsers(Set users) {
        this.users = users;
    }
}
