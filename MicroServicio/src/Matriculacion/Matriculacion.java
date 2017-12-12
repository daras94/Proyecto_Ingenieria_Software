/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriculacion;


import java.sql.*;

/**
 *
 * @author febis
 */
public class Matriculacion {
    
    //Atributos
    private Connection conexion;
    
    
    
    //Metodos
    
    private void conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String BaseDeDatos = "jdbc:mysql://localhost/test?user=usuario&password=123";
            this.conexion=DriverManager.getConnection(BaseDeDatos);
            if (conexion != null) {
                System.out.println("Conexion exitosa!");
            } else {
                System.out.println("Conexion fallida!");
            }
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    
    }
    
    private void obtener_alumno(String DNI){
        
    
    
    
    
    }
    
    
    public void obtener_asignaturas(){
        
    
    
    
    
    
    
    
    
    
    }
    
    
    //Metodos GET y SET
    
    public Connection getConexion(){
        return this.conexion;
    }
    
    public void setConexion(Connection conexion){
        this.conexion=conexion;
    }
    
}
