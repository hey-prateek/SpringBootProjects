package com.example.__basicUserService.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.__basicUserService.entity.User;
import com.example.__basicUserService.service.userService;

@RestController
@RequestMapping("/users")
public class userController {

    @Autowired
    private userService service;

    // create user
    @PostMapping
    public void createUser(@RequestBody User u) {
        service.createUser(u);
    }

    // get user by id
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        Optional<User> user = service.getUserById(id);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // get all users
    @GetMapping
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }
}
