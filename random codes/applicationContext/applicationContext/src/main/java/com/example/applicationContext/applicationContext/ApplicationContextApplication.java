package com.example.applicationContext.applicationContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ApplicationContextApplication {

	public static void main(String[] args) {

//		SpringApplication.run(ApplicationContextApplication.class, args);

		ApplicationContext context=new AnnotationConfigApplicationContext(myConfig.class);
		class1 class1 = context.getBean(com.example.applicationContext.applicationContext.class1.class);
		class1.prints();
	}

}
