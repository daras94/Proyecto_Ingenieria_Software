/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.config;

import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;

/**
 *
 * @author david
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;
    /**
     * Query para la autentificacion
     */
    private static final String USER_QUERY = "SELECT NIF, password, enable from Usuario where NIF=?";
    private static final String AUTH_QUERY = "SELECT NIF, tipo_user FROM Usuario where NIF=?";

    // roles admin allow to access /admin/**
    // roles user allow to access /user/**
    // custom 403 access denied handler
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/res/**").permitAll() 
                .antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/index.html")
                .usernameParameter("username")
                .passwordParameter("password")
                .permitAll()
                .and()
            .logout()      
                .logoutSuccessUrl("/index.html?logout")
                .and()
                .exceptionHandling()
                //.authenticationEntryPoint(unauthorizedEntryPoint())
                .accessDeniedPage("/403")
                .and()
            .csrf();
    }

    /*@Bean
    public AuthenticationEntryPoint unauthorizedEntryPoint() {
        return (request, response, authException) -> response.sendError(HttpServletResponse.SC_FORBIDDEN);
    }*/

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource).passwordEncoder(new BCryptPasswordEncoder()).usersByUsernameQuery(USER_QUERY).authoritiesByUsernameQuery(AUTH_QUERY);
    }

}
