package com.example.waysOfBeanCreation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//configuration class to create beans using configuration class and bean annotation
@Configuration
public class configClass {
    @Bean
    public class2 getClass2()
    {
        class2 c2=new class2("drake");
        return c2;
    }
}
