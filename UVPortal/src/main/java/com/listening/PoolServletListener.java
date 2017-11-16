/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.listening;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;
import javax.sql.DataSource;

/**
 * Web application lifecycle listener.
 *
 * @author Daviid
 */
@WebListener
public class PoolServletListener implements ServletContextListener {
    // Variables
    private static final String ATTRIBUTE_BBDD = "conexion";
    private DataSource pool;  // Pool MySQL
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        try{
            this.pool = (DataSource)new InitialContext().lookup("java:comp/env/jdbc/mysql_UV"); //Mysql.
            if (this.pool == null){
                throw new ServletException("DataSource desconocida 'mysql_UV'");
            }
            if(context.getAttribute("conexion") == null){
                final Connection con = this.pool.getConnection();
                context.setAttribute(ATTRIBUTE_BBDD, con); //Save conection BD.
            }
        } catch (ServletException | NamingException | SQLException ex) {
            Logger.getLogger(PoolServletListener.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error en 'PoolServletListener.java': " + ex.getMessage());
        } 
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent event) {
        // NOOP.
    }

    public DataSource getDataSource() {
        return pool;
    }

    public static PoolServletListener getInstance(ServletContext servletContext) {
        return (PoolServletListener) servletContext.getAttribute(ATTRIBUTE_BBDD);
    }

}
