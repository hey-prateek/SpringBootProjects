package com.example.springbootscheduling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // ← Required to activate @Scheduled
public class SpringbootschedulingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootschedulingApplication.class, args);
	}

}
