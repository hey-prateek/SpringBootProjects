package com.example.annotations.annotations.QualifierInterface;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("class1")
public class interfaceClassImpl1 implements qualifierInterface{
    public void interfaceMethod()
    {
        System.out.println("inside class 1 implementing interface");
    }
}
