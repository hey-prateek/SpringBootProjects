package com.example.UnsatisfiedDependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class baseClass {

//    @Autowired(required = false)
    @Autowired
    @Qualifier("class2_comp")
    private myInterface myInterface;

    public void prints()
    {
        myInterface.prints();
    }
}
