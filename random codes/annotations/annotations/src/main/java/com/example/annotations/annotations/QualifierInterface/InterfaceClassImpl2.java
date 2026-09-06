package com.example.annotations.annotations.QualifierInterface;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("class2")
public class InterfaceClassImpl2 implements qualifierInterface{
    public void interfaceMethod()
    {
        System.out.println("inside class 2 implementing interface");
    }
}
