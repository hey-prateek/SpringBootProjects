package com.example.annotations.annotations;

import com.example.annotations.annotations.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AnnotationsApplication implements CommandLineRunner {

	@Autowired
	private Service service;

	public static void main(String[] args) {

		SpringApplication.run(AnnotationsApplication.class, args);

	}

	@Override
	public void run(String... args)
	{
		service.serviceMethod();
	}

}
