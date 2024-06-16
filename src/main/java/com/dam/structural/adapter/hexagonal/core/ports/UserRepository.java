package com.dam.structural.adapter.hexagonal.core.ports;

import com.dam.structural.adapter.hexagonal.core.model.User;

import java.util.List;

public interface UserRepository {
    void save(User user);
    List<User> getAll();
}
