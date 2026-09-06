package com.example.waysOfBeanCreation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class WaysOfBeanCreationApplication {

    //    using annotation based bean creation, so getting that component class through setter injection
    private final class3 class3;

    public WaysOfBeanCreationApplication(class3 class3) {
        this.class3 = class3;
//        calling that annotation based bean creation class method using contructor, as main method is static
        class3.helloMessage();
    }

    public static void main(String[] args) {

        SpringApplication.run(WaysOfBeanCreationApplication.class, args);

//		creating an application context of classpath xml type-based retrieving all beans from xml file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//		getting the bean object
        class1 c1 = (class1) context.getBean("class1");
        c1.welcomeMessage();

        //using java based config bean creation method so using this
        ApplicationContext context1 = new AnnotationConfigApplicationContext(configClass.class);
        class2 c2 = (class2) context1.getBean(class2.class);
        c2.helloMessage();
    }

}
