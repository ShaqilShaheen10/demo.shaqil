package com.shaqil.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {
    @Bean
    public String myFirstBean(){
        return ("First Bean");
    }

    @Bean
    public String mySecondBean(){
        return ("Second Bean");
    }

    @Bean
//    @Primary
    public String myThirdBean(){
        return ("Third Bean");
    }
}
