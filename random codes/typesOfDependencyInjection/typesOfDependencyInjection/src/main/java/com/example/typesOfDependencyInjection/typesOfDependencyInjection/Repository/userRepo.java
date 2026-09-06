package com.example.typesOfDependencyInjection.typesOfDependencyInjection.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class userRepo {
    public void getData()
    {
        System.out.println("user repo class...");
    }
}
