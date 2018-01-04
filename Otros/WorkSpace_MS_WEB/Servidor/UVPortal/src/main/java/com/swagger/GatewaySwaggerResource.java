/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swagger;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;
import com.config.SwaggerGatewayConfig;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 *
 * @author david
 */
@Component
@Primary
@EnableAutoConfiguration
public class GatewaySwaggerResource implements SwaggerResourcesProvider {

    @Autowired
    private SwaggerGatewayConfig swaggerServiceList;

    @Override
    public List<SwaggerResource> get() {
        List<SwaggerResource> resources = new ArrayList<>();
        swaggerServiceList.getServices().forEach(service -> {
            resources.add(swaggerResource(service.getName(), service.getUrl(), service.getVersion()));
        });
        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }

}
