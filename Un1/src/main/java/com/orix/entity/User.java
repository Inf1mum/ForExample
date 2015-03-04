package com.orix.entity;

import javax.persistence.*;

/**
 * Created by Inf1mum on 28.02.2015.
 */

@Entity
@Table(name = "user")
@Inheritance(strategy= InheritanceType.JOINED)
public class User {

    private int id;
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private String email;

    @Id
    @Column(name="id")
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Column(name="password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name="first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name="last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name="email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(){

    }

    public User(String login, String password, String firstName, String email, String lastName) {
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.email = email;
        this.lastName = lastName;
    }
}
