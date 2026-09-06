package com.example.SpringDataJPA;

import org.springframework.boot.health.contributor.Health;
import org.springframework.boot.health.contributor.HealthIndicator;
import org.springframework.stereotype.Component;

//custom health indicator - access using actuator endpoint
@Component
public class CustomHealthIndicator implements HealthIndicator {

    @Override
    public Health health(){
        if(checkHealth()){
            return Health.up().withDetail("health", "is up").build();
        }
        else {
            return Health.down().withDetail("health", "is down").build();
        }
    }
    public boolean checkHealth()
    {
        return true;
    }
}
