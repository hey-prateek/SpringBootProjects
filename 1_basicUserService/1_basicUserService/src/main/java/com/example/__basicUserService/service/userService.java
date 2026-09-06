package com.example.__basicUserService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.__basicUserService.entity.User;
import com.example.__basicUserService.repository.userRepo;

@Service
public class userService {

    @Autowired
    private userRepo userrepo;

    // create user
    public User createUser(User u) {
        return userrepo.save(u);
    }

    // get user by id
    public Optional<User> getUserById(Long id) {
        return userrepo.findById(id);
    }

    // get all users
    public List<User> getAllUsers() {
        return userrepo.findAll();
    }
}
