package com.example.SpringDataJPA;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="customActuatorEndpoint")
public class CustomActuatorEndpoint {
    @ReadOperation
    public String customMethod()
    {
        return "this is a custom actuator endpoint...";
    }
}
