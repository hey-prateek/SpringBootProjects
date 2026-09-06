package com.example.__dependencyInjections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class class2 implements my_interface{

    private class1 class1;

    @Autowired
    public class2(@Lazy class1 class1)
    {
        this.class1=class1;
        System.out.println("inside class2 constructor...");
    }

    public void class2_method()
    {
        System.out.println("inside class2 method...");
    }

//    //-----setter injection-----
//    @Autowired
//    public void setClass1(@Lazy class1 class1)
//    {
//        this.class1=class1;
//        System.out.println("inside class2 setter method...");
//    }
}
