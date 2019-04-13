package com.luv2code.springdemo.annotationconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.luv2code.springdemo.annotationconfig")
@PropertySource( "classpath:sport.properties" )
public class DriverConfig
{
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    @Bean
    public Driver copDriver() {
        return new CopDriver( sadFortuneService() );
    }
}
