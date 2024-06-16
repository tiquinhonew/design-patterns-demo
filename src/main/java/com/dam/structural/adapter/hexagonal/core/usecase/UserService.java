package com.dam.structural.adapter.hexagonal.core.usecase;

import com.dam.structural.adapter.hexagonal.core.model.User;
import com.dam.structural.adapter.hexagonal.core.ports.UserRepository;

import java.util.List;

public class UserService {
    private final UserRepository userRepo;

    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public void saveUser(User user) {
        boolean alreadyUsedEmail = userRepo.getAll().stream()
            .anyMatch(userDb -> userDb.getEmail().equalsIgnoreCase(user.getEmail()));
        if(alreadyUsedEmail) throw new RuntimeException("Email address already exists!");
        userRepo.save(user);
    }

    public List<User> getUsers() {
        return userRepo.getAll();
    }

}
