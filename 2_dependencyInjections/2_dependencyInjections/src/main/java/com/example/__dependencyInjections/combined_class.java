package com.example.__dependencyInjections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class combined_class{

    private class1 class1;
    private class2 class2;

    @Autowired
    @Qualifier("class2")
    private my_interface myInterface;

    public combined_class(class1 class1, class2 class2)
    {
        this.class1=class1;
        this.class2=class2;
    }

    public void shared_method()
    {
        System.out.println("inside shared class method...");
    }
}
