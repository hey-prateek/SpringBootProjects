package com.example.UnsatisfiedDependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class UnsatisfiedDependenciesApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext=SpringApplication.run(UnsatisfiedDependenciesApplication.class, args);
		baseClass baseClass=applicationContext.getBean(baseClass.class);
		baseClass.prints();

	}

}
