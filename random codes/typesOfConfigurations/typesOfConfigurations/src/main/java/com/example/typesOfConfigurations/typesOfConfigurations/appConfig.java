package com.example.typesOfConfigurations.typesOfConfigurations;

import com.example.typesOfConfigurations.typesOfConfigurations.forConfig.configClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class appConfig {

    @Bean
    public configClass getConfigClass()
    {
        return new configClass();
    }
}
