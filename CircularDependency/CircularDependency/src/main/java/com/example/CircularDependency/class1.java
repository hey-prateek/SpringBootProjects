package com.example.CircularDependency;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class class1 {

//    forms circular dependency
//    @Autowired
//    private class2 class2;

    //using Lazy annotation
    private class2 class2;
    @Autowired
    public class1(@Lazy class2 class2)
    {
        this.class2=class2;
    }

    //using setter injection
//    @Autowired
//    public void inject(class2 class2)
//    {
//        this.class2=class2;
//    }

    @PostConstruct
    public void init()
    {
        System.out.println("class1 object created");
    }
}
