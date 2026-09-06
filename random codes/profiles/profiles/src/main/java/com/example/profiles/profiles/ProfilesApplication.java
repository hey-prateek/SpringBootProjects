package com.example.profiles.profiles;

import com.example.profiles.profiles.tempPackage.temp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProfilesApplication {

	public static void main(String[] args) {

			ApplicationContext context=SpringApplication.run(ProfilesApplication.class, args);
			temp obj=context.getBean(temp.class);
			obj.method();

			// we can use this too
//			SpringApplication main=new SpringApplication(ProfilesApplication.class);
//			main.run(args);


	}

}
