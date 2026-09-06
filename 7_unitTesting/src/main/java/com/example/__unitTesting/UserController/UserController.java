package com.example.__unitTesting.UserController;

import com.example.__unitTesting.UserEntity.User;
import com.example.__unitTesting.UserService.UserService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }

    //creating a user
    @PostMapping
    public ResponseEntity<User> createUser(@Valid @RequestBody User user){
        User createdUser = userService.createUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    //get user by id
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserId(@PathVariable long id){
        User user = userService.getUserById(id);
        return ResponseEntity.ok(user);
    }

    //get all users
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    //get user by name
    @GetMapping("/search")
    public ResponseEntity<User> getUserByName(@RequestParam String name){
        return userService.findUserByName(name).map(ResponseEntity::ok).
                orElseThrow(() -> new EntityNotFoundException("user with name: "+name+" not found."));
    }

    //update user by id
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUserById(@PathVariable long id, @Valid @RequestBody User user){
        User resUser = userService.updateUser(id, user);
        return ResponseEntity.ok(resUser);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable long id){
        userService.deleteUserById(id);
        return ResponseEntity.noContent().build();
    }

}
