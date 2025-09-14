package com.example.ComponentScanExample;

import com.example.ComponentScanExample.Repository.repoClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.ComponentScanExample", "package1", "package2"}
,excludeFilters=@ComponentScan.Filter(type = FilterType.CUSTOM, classes= CustomFilter.class)) //custom filter to exclude classes
//,excludeFilters=@ComponentScan.Filter(type = FilterType.ANNOTATION, classes= Service.class)) // annotation used exclude filter
class ComponentScanExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComponentScanExampleApplication.class, args);
	}
}
