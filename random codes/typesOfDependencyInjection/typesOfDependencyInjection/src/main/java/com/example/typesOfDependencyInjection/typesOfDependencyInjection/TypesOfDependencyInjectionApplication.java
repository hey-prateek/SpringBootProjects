package com.example.typesOfDependencyInjection.typesOfDependencyInjection;

import com.example.typesOfDependencyInjection.typesOfDependencyInjection.Repository.userRepo;
import com.example.typesOfDependencyInjection.typesOfDependencyInjection.Service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TypesOfDependencyInjectionApplication implements CommandLineRunner {

	@Autowired
	private userService service;

	@Autowired
	private userRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(TypesOfDependencyInjectionApplication.class, args);
	}

	@Override
	public void run(String... args) {
		service.setRepo(repo);
		service.serviceMethod();
	}
}
