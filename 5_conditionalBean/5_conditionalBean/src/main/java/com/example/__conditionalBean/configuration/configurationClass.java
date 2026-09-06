package com.example.__conditionalBean.configuration;

import com.example.__conditionalBean.paymentMethod.cash;
import com.example.__conditionalBean.paymentMethod.conditionForCash;
import com.example.__conditionalBean.paymentMethod.onlinePayment;
import com.example.__conditionalBean.paymentMethod.phonepe;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configurationClass {

    @Bean
    @ConditionalOnProperty(name= "info.paymentType", havingValue = "cash")
    @Conditional(conditionForCash.class)
    public cash cashService()
    {
        return new cash();
    }

    @Bean
    @ConditionalOnProperty(name= "info.paymentType", havingValue = "online")
    public onlinePayment onlinePayment()
    {
        return new onlinePayment();
    }

    @Bean
    @ConditionalOnBean(onlinePayment.class)
    public phonepe phonepeService()
    {
        return new phonepe();
    }
}
