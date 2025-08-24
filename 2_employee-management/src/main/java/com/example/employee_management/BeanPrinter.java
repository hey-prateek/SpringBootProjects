package com.example.employee_management;

import com.example.employee_management.dto.EmployeeDTO;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Component
public class BeanPrinter {
    @Autowired
    ApplicationContext applicationContext;

    @PostConstruct
    public void printBeans()
    {

        System.out.println("=== All Beans Loaded ===");
        Arrays.stream(applicationContext.getBeanDefinitionNames())
                .filter(s -> s.startsWith("employee"))
                .forEach(System.out::println);

        System.out.println("=== contains this bean or not ===");
        System.out.println(applicationContext.containsBean("employeeDTO"));

        System.out.println("=== All Beans Loaded of specific type ===");
        Map<String, EmployeeDTO> map=applicationContext.getBeansOfType(EmployeeDTO.class);
        map.forEach((a, b) -> System.out.println(a+" "+b));
    }

}
