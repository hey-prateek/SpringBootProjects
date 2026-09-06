package com.example.__beanScopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerClass {

    private final ApplicationContext applicationContext;

    @Autowired
    public controllerClass(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @GetMapping("/singleton")
    public String getDataFromSingleton() {
        singletonClass singletonClass = applicationContext.getBean(singletonClass.class);
        return singletonClass.returnData();
    }

    @GetMapping("/prototype")
    public String getDataFromPrototype() {
        prototypeClass prototypeClass = applicationContext.getBean(prototypeClass.class);
        return prototypeClass.returnData();
    }

    @GetMapping("/request")
    public String getDataFromRequest() {
        requestScopeClass requestScopeClass = applicationContext.getBean(requestScopeClass.class);
        return requestScopeClass.returnData();
    }

    @GetMapping("/session")
    public String getDataFromSession() {
        sessionScopeClass sessionScopeClass = applicationContext.getBean(sessionScopeClass.class);
        return sessionScopeClass.returnData();
    }
}
