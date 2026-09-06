package com.example.annotations.annotations.ComponentPackage;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class componentClass {
    public void componentMethod()
    {
        System.out.println("inside component method...");
    }
}
