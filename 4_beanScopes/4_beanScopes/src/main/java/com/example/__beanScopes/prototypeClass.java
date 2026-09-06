package com.example.__beanScopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Scope("prototype")
public class prototypeClass {
    private final String data;

    public prototypeClass() {
        data = (LocalDateTime.now()).toString();
    }

    public String returnData() {
        //returns new time all the time, whenever called
        return data;
    }
}
