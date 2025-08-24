package com.example.CircularDependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CircularDependency {
    public static void main(String[] args) {
        SpringApplication.run(CircularDependency.class, args);
    }
}
