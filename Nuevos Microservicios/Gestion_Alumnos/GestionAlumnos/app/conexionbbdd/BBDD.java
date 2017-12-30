/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conexionbbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Daniel
 */
public class BBDD {
    
    //Atributos
    public static Connection conexion;
    public static Statement sentencia;
    
    //Conexion Base de datos
    public static void conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String BaseDeDatos = "jdbc:mysql://localhost:3306/UVisa2017";
            conexion=DriverManager.getConnection(BaseDeDatos,"root","0000");
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
    
    public static ResultSet consulta_BDD (String SQL){
        ResultSet resultado = null;
       
        try{
            sentencia = conexion.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            resultado = sentencia.executeQuery(SQL);
        }
        catch(Exception e){
            System.out.println(e.toString());
            return null;
        }
        
        return resultado;
    }
    
    public static int actualizar_BDD (String SQL){
        int resultado = -1;
        try{
            sentencia = conexion.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            resultado = sentencia.executeUpdate(SQL);
            return resultado;
            
        }
        catch(Exception e){
            System.out.println(e.toString());
            return resultado;
        
        }
    
    }
}