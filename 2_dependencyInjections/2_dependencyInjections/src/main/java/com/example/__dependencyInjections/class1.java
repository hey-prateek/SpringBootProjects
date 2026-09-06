package com.example.__dependencyInjections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
@Primary
public class class1 implements my_interface {

    private class2 class2;

    @Autowired
    public class1(class2 class2)
    {
        this.class2=class2;
        System.out.println("inside class1 constructor...");

        //calling class2 method
        class2.class2_method();
    }

    public void class1_method()
    {
        System.out.println("inside class1 method...");
    }
}
