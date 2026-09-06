package com.example.profiles.profiles.tempPackage;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class class1 implements temp{

    @Override
    public void method()
    {
        System.out.println("inside class 1 method...");
    }
}
