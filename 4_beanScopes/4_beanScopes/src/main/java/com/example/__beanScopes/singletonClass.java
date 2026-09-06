package com.example.__beanScopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Scope("singleton")
public class singletonClass {
    private final String data;

    public singletonClass() {
        data = (LocalDateTime.now()).toString();
    }

    public String returnData() {
        //returns same time all the time, whenever called
        return data;
    }
}
