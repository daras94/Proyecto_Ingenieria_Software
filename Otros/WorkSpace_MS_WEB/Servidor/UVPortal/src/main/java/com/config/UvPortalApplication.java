package com.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableAutoConfiguration
@SpringBootApplication
public class UvPortalApplication {

    /**
     * Incio del Spring Boot.
     * @param args 
     */
    public static void main(String[] args) {
        SpringApplication.run(UvPortalApplication.class, args);
    }
}
