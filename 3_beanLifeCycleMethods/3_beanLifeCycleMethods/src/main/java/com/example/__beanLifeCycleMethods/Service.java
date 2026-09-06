package com.example.__beanLifeCycleMethods;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Service implements InitializingBean, DisposableBean {
    public Service()
    {
        System.out.println("inside service constructor...");
    }

    @Override
    public void afterPropertiesSet()
    {
        System.out.println("after properties set method...");
    }

    @Override
    public void destroy()
    {
        System.out.println("destroy method...");
    }

    @PostConstruct
    public void init()
    {
        System.out.println("post construct method...");
    }

    @PreDestroy
    public void preDestroy()
    {
        System.out.println("pre destroy method...");
    }
}
