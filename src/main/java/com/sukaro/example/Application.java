package com.sukaro.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.sukaro.example.config.AppConfig;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan
@EnableAutoConfiguration
public class Application {
	
    public static void main(String[] args) {
    	ConfigurableApplicationContext context = SpringApplication.run(Application.class);
    	AppConfig config = context.getBean(AppConfig.class);
    	config.configure();
    }

}
