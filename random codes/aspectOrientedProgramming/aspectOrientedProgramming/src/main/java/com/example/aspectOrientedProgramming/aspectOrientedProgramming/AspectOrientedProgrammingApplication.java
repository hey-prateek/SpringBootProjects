package com.example.aspectOrientedProgramming.aspectOrientedProgramming;

import com.example.aspectOrientedProgramming.aspectOrientedProgramming.Service.Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AspectOrientedProgrammingApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(AspectOrientedProgrammingApplication.class, args);
		Service service=context.getBean(Service.class);
		service.serviceMethod();
	}

}
