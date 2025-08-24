package com.example.BasicSpringBootProject.userService;

import com.example.BasicSpringBootProject.User.User;
import com.example.BasicSpringBootProject.User.User;
import com.example.BasicSpringBootProject.userRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class userService {
    @Autowired
    private UserRepository userrep;

    //get all users
    public List<User> getAllUsers()
    {
        return userrep.findAll();
    }

    //get user by id
    public Optional<User> getUserById(Long id)
    {
        return userrep.findById(id);
    }

    //create new user
    public User createUser(User u)
    {
        return userrep.save(u);
    }
}
