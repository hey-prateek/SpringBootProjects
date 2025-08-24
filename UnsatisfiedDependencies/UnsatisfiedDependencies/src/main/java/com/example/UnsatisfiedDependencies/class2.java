package com.example.UnsatisfiedDependencies;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component("class2_comp")
public class class2 implements myInterface {

    @PostConstruct
    void init()
    {
        System.out.println("class2 created");
    }

    public void prints()
    {
        System.out.print("printing from class2");
    }
}
