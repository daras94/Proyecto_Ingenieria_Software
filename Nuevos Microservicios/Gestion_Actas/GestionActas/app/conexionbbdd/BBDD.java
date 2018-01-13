/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conexionbbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class BBDD {
    
    //Atributos
    public static Connection conexion;
    
    //Conexion Base de datos
    public static void conectar() throws ClassNotFoundException, SQLException{
        
        Class.forName("com.mysql.jdbc.Driver");
        String BaseDeDatos = "jdbc:mysql://localhost:3306/UVisa2017";
        conexion=DriverManager.getConnection(BaseDeDatos,"root","0000");
        if (conexion != null) {
            System.out.println("Conexion exitosa!");
        } else {
            System.out.println("Conexion fallida!");
        }
        
    
    }
    
    public static ResultSet consulta_BDD (String SQL) throws SQLException{
        ResultSet resultado = null;
        Statement sentencia = null;
        
        try{
            sentencia = conexion.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            resultado = sentencia.executeQuery(SQL);
        }
        catch(Exception e){
            System.out.println(e.toString());
            
        }
        
        
        
        return resultado;
    }
    
    public static int actualizar_BDD (String SQL, String SQL2   ) throws SQLException{
        int resultado =-1;
        PreparedStatement sentencia1 = null;
        PreparedStatement sentencia2 = null;
        try{
            conexion.setAutoCommit(false);
            sentencia1 = conexion.prepareStatement(SQL);
            sentencia2 = conexion.prepareStatement(SQL2);
            sentencia1.execute();
            sentencia2.execute();
            conexion.commit();
            resultado=0;
            
        }
        catch(Exception e){
            System.out.println(e.toString());
            if(conexion!=null){
                conexion.rollback();
            
            }
        
        }
        
        finally{
            if(sentencia1!=null){
                sentencia1.close();
            }
            if(sentencia2!=null){
                sentencia2.close();
            }
            conexion.setAutoCommit(true);
            return resultado;
        
        }
        
    
    }
    
    public static int actualizar_BDD(String SQL) throws SQLException{
        int resultado = -1;
        PreparedStatement sentencia1 = null;
        try{
            conexion.setAutoCommit(false);
            sentencia1 = conexion.prepareStatement(SQL);
            sentencia1.execute();
            conexion.commit();
            resultado=0;
        }
        catch(Exception e){
            System.out.println(e.toString());
            if(conexion!=null){
                conexion.rollback();
            
            }
            
        }
        finally{
            if(sentencia1!=null){
                sentencia1.close();
            }
            conexion.setAutoCommit(true);
            return resultado;
            
        }
        
        
    }
    
    public static int actualizar_BDD(List<String> asignaturas) throws SQLException{
        int resultado = -1;
        List<PreparedStatement> sentencias = new ArrayList<>();
        try{ 
            conexion.setAutoCommit(false);
            
            
            PreparedStatement aux = null;
            for(int i=0;i<asignaturas.size();i++){
                aux = conexion.prepareStatement(asignaturas.get(i));
                aux.execute();
                sentencias.add(aux);
                aux=null;
            }
            conexion.commit();
            resultado=0;
        }
        catch(Exception e){
            System.out.println(e.toString());
            if(conexion!=null){
                conexion.rollback();
            
            }
            
        }
        finally{
            
            for(int i=0;i<sentencias.size();i++){
                if(sentencias.get(i)!=null){
                    sentencias.get(i).close();
                }
            }
            if(conexion!=null){
                conexion.setAutoCommit(true);
                
            }
            return resultado;
        }
        
        
        
    }
}