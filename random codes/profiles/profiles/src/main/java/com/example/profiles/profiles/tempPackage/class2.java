package com.example.profiles.profiles.tempPackage;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class class2 implements temp{

    @Override
    public void method()
    {
        System.out.println("inside class 2 method...");
    }
}
