/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumnos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author febis
 */
public class Eliminar_Alumno_By_NIF {
    
    //Constructor
   
    public Eliminar_Alumno_By_NIF(){};
    
    //Atributos
    private Connection conexion;
    private Statement sentencia;
    
    
    //Metodos
    
    private void conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String BaseDeDatos = "jdbc:mysql://localhost:3306/UVisa2017";
            this.conexion=DriverManager.getConnection(BaseDeDatos,"root","0000");
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
    
    private boolean consulta_BDD (String sql){
        boolean resultado = false;
        
       
        try{
            
            
            Statement sentencia = getConexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            sentencia.execute(sql);
            resultado=true;
        }
        catch(Exception e){
            System.out.println(e.toString());
            return resultado;
        }
        
        return resultado;
    }
    
    public void ejecutar(String NIF){
        
        try{
            conectar();
            String sql = "DELETE FROM Usuario WHERE DNI='"+NIF+"';";
            boolean exito = consulta_BDD(sql);
            if(exito){
                System.out.println("Consulta realizada con exito.");
            }
            else{
                System.out.println("Consulta no realizada con exito");
            }
            conexion.close();
        
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    //Metodos GET y SET
    
    public Connection getConexion(){
        return this.conexion;
    }
    
    public void setConexion(Connection conexion){
        this.conexion=conexion;
    }
    
}
