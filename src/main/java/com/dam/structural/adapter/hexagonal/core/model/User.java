package com.dam.structural.adapter.hexagonal.core.model;

public class User {
    private final String name;
    private final String email;
    private final String password;

    public User(String name, String email, String password) {
        super();
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", email=" + email + ", password=" + password + "]";
    }
}
