package com.example.__beanScopes;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.time.LocalDateTime;

@Component
@SessionScope
public class sessionScopeClass {
    private final String data;

    public sessionScopeClass() {
        data = (LocalDateTime.now()).toString();
    }

    public String returnData() {
        //returns new time for each session, whenever called
        return data;
    }
}
