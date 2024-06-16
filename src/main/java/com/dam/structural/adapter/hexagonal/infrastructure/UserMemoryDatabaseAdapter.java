package com.dam.structural.adapter.hexagonal.infrastructure;

import com.dam.structural.adapter.hexagonal.core.model.User;
import com.dam.structural.adapter.hexagonal.core.ports.UserRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMemoryDatabaseAdapter implements UserRepository {

    private final Map<String, User> memoryUsers = new HashMap<>();

    @Override
    public void save(User user) {
        memoryUsers.put(user.getEmail(), user);
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<>(memoryUsers.values());
    }

}
