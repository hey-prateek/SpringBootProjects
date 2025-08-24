package com.example.TypesOfDependencyInjections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class serviceA {
    //type of DI -> constructor, setter and field
    private serviceB serviceB;
    private serviceC serviceC;

    //constructor DI
    @Autowired
    public serviceA(serviceB serviceB)
    {
        this.serviceB=serviceB;
        System.out.println("serviceB injected");
    }

    //setter injection
    @Autowired
    public void setServiceC(serviceC serviceC)
    {
        this.serviceC=serviceC;
        System.out.println("serviceC injected");
    }

    //field injection
    @Autowired
    private serviceD serviceD;

}
