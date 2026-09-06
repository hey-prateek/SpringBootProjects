package com.example.typesOfConfigurations.typesOfConfigurations;

import com.example.typesOfConfigurations.typesOfConfigurations.Service.Service;
import com.example.typesOfConfigurations.typesOfConfigurations.forConfig.configClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class TypesOfConfigurationsApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(TypesOfConfigurationsApplication.class, args);

		// xml based configuration
		Service service=(Service) context.getBean("service");
		service.serviceMethod();

		// java config based configurations
		System.out.println(context.getBean(configClass.class));

	}

}
