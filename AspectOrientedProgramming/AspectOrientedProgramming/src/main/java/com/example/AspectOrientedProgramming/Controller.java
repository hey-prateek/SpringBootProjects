package com.example.AspectOrientedProgramming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aspect")
public class Controller {

    private Service service;

    @Autowired
    public Controller(Service service)
    {
        this.service = service;
    }

    @GetMapping("/getName")
    public String getName()
    {
        String name = service.getName();
        return name;
    }
}
