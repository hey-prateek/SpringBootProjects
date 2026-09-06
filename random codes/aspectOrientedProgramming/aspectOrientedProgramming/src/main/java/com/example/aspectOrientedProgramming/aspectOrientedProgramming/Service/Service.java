package com.example.aspectOrientedProgramming.aspectOrientedProgramming.Service;

@org.springframework.stereotype.Service
public class Service {
    public Service()
    {
        System.out.println("inside service constructor...");
    }

    public void serviceMethod()
    {
        System.out.println("inside service method...");
    }
}
