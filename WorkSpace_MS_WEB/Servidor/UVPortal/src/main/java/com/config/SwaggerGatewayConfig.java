/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.config;

import com.swagger.SwaggerServices;
import java.util.List;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 * @author david
 */
@Component
@EnableAutoConfiguration
@EnableSwagger2
@ComponentScan(basePackages = {"com.swagger", "com.swagger.services"})
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "documentation.swagger")
public class SwaggerGatewayConfig {

    /**
     * Declaracion de variables globales.
     */
    private List<SwaggerServices> swagger;

    public List<SwaggerServices> getServices() {
        return swagger;
    }

    public void setServices(List<SwaggerServices> swaggerResources) {
        this.swagger = swaggerResources;
    }

}
