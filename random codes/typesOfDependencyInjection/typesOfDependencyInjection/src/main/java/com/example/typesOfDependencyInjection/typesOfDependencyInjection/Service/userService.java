package com.example.typesOfDependencyInjection.typesOfDependencyInjection.Service;

import com.example.typesOfDependencyInjection.typesOfDependencyInjection.Repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {

//    // FIELD INJECTION
//    @Autowired
//    private userRepo repo;

    private userRepo repo;

//    // CONSTRUCTOR INJECTION
//    @Autowired
//    public userService(userRepo repo)
//    {
//        this.repo=repo;
//    }

    // SETTER INJECTION
    public void setRepo(userRepo repo)
    {
        this.repo=repo;
    }

    public void serviceMethod()
    {
        repo.getData();
    }
}
