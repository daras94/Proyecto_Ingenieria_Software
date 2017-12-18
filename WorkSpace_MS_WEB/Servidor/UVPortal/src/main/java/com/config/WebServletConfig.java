/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 *
 * @author david
 */
public class WebServletConfig implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext ctx) throws ServletException {
        ServletRegistration.Dynamic servlet = ctx.addServlet("dispatcher", new DispatcherServlet(registerConfig(ctx)));
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
    }
    
    protected AnnotationConfigWebApplicationContext registerConfig(ServletContext ctx){
        AnnotationConfigWebApplicationContext webCtx = new AnnotationConfigWebApplicationContext();
        webCtx.register(WebMvcConfig.class);
        webCtx.setServletContext(ctx);
        return webCtx;
    }

}
