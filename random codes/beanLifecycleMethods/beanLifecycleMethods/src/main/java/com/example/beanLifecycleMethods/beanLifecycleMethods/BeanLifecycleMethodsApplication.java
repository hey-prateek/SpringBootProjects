package com.example.beanLifecycleMethods.beanLifecycleMethods;

import com.example.beanLifecycleMethods.beanLifecycleMethods.Service.service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BeanLifecycleMethodsApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context=SpringApplication.run(BeanLifecycleMethodsApplication.class, args);
//		service temp= context.getBean(service.class);
//		temp.prints();
	}

}
