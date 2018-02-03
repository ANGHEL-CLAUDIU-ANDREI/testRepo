package com.mkyong.configuration;

import com.mkyong.aspect.LoggingAspect;
import com.mkyong.customer.bo.CustomerBo;
import com.mkyong.customer.bo.impl.CustomerBoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public LoggingAspect fooService() {
        return new LoggingAspect();
    }

    @Bean
    public CustomerBo myAspect() {
        return new CustomerBoImpl();
    }
}