package com.example.waysOfBeanCreation;

public class class1 {

    private String message;

//    if used constructor based injection in application context xml
//    class1(String message)
//    {
//        this.message=message;
//    }

    //    using setter based injection, because used property value type injection in xml file
    public void setMessage(String message) {
        this.message = message;
    }

    public void welcomeMessage() {
        System.out.println("welcome..." + message);
    }
}
