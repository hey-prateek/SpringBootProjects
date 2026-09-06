package com.example.__beanScopes;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.time.LocalDateTime;

@Component
@RequestScope
public class requestScopeClass {
    private final String data;

    public requestScopeClass() {
        data = (LocalDateTime.now()).toString();
    }

    public String returnData() {
        //returns new time for each request, whenever called
        return data;
    }
}
