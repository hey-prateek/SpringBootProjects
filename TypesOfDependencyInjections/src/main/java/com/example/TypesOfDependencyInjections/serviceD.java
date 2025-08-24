package com.example.TypesOfDependencyInjections;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class serviceD {

    @PostConstruct
    public void init()
    {
        System.out.println("serviceD injected");
    }
}
