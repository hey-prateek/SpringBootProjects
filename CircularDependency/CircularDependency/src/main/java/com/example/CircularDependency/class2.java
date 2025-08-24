package com.example.CircularDependency;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class class2 {

    @Autowired
    private class1 class1;

    @PostConstruct
    public void init()
    {
        System.out.println("class2 object created");
    }
}
