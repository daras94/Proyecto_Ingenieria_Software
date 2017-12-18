/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swagger;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 *
 * @author david
 */
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "documentation.swagger.services")
public class SwaggerServices {
    
    /**
     * Declaracion de variables globales.
     */
    private String name;
    private String url;
    private String version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "ms-api-rest [name=" + name + ", url=" + url + ", version=" + version + "]";
    }
}
