package com.example.UnsatisfiedDependencies;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("class1_comp")
@Primary
public class class1 implements myInterface {

    @PostConstruct
    void init()
    {
        System.out.println("class1 created");
    }

    public void prints()
    {
        System.out.println("printing from class1");
    }
}
