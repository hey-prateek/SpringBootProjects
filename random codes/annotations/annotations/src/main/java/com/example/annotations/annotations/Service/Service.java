package com.example.annotations.annotations.Service;

import com.example.annotations.annotations.ComponentPackage.*;
import com.example.annotations.annotations.QualifierInterface.qualifierInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

@org.springframework.stereotype.Service
public class Service {

    private componentClass component;
    private qualifierInterface qinterface;

    @Value("${app.greeting}")
    private String helloMessage;

    @Autowired
    public Service(componentClass component, @Qualifier("class2") qualifierInterface qinterface)
    {
        System.out.println("inside service constructor...");
        this.component=component;
        this.qinterface=qinterface;
    }

    public void serviceMethod()
    {
        component.componentMethod();
        qinterface.interfaceMethod();
        System.out.println("greeting message: "+helloMessage);
    }


}
