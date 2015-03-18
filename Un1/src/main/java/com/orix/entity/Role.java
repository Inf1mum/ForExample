package com.orix.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Inf1mum on 18.03.2015.
 */
@Entity
@Table(name = "role")
public class Role {

    private int id;
    private String name;
    private List<User> userList;

    @Id
    @Column(name="id")
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "role")
    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
