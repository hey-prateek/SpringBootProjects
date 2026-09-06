package com.example.beanLifecycleMethods.beanLifecycleMethods.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class service {

    public service()
    {
        System.out.println("inside service constructor...");
    }

    @PostConstruct
    public void postconstruct()
    {
        System.out.println("inside service post-construct method...");
    }

    @PreDestroy
    public void predestroy()
    {
        System.out.println("inside service pre-destroy method...");
    }

    public void prints()
    {
        System.out.println("inside service prints method...");
    }

    public void init()
    {
        System.out.println("inside init method through config impl...");
    }

    public void destroy()
    {
        System.out.println("inside destroy method through config impl...");
    }


}
