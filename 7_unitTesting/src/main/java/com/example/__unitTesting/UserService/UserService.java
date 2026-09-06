package com.example.__unitTesting.UserService;

import com.example.__unitTesting.UserEntity.User;
import com.example.__unitTesting.UserRepository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    //constructor injection
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //creating and saving new user
    @Transactional
    public User createUser(User user) {
        if (userHasName(user.getName())) {
            // No need to manually set createdAt — @PrePersist will handle it
            return userRepository.save(user);
        } else {
            throw new IllegalArgumentException("user name cannot be empty...");
        }

    }

    private Boolean userHasName(String name) {
        return name != null && !name.isEmpty();
    }

    //find user by id
    public User getUserById(long id) {
        return userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("user with id: " + id + " not found."));
    }

    //get all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    //find user by name
    public Optional<User> findUserByName(String name) {
        return userRepository.findByName(name);
    }

    //update existing user
    @Transactional
    public User updateUser(Long id, User user) {
        User u = getUserById(id);
        u.setName(user.getName());
//        u.setUpdatedAt(LocalDateTime.now());
        return userRepository.save(u);
    }

    @Transactional
    public void deleteUserById(long id) {
        if (getUserById(id) == null) {
            throw new EntityNotFoundException("user with id: " + id + " not found.");
        }
        userRepository.deleteById(id);
    }

}
