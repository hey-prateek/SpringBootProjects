package com.example.beanLifecycleMethods.beanLifecycleMethods.Configuration;

import com.example.beanLifecycleMethods.beanLifecycleMethods.Service.service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configuration {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public service MyBean()
    {
        return new service();
    }
}
