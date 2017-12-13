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
import java.util.ArrayList;
import javax.json.JsonObject;

/**
 *
 * @author febis
 */
public class Actualizar_Alumno_By_NIF {
    
    //Constructor
   
    public Actualizar_Alumno_By_NIF(){};
    
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
    
    public void ejecutar(String NIF, JsonObject alumno){
        try{
            conectar();
            ArrayList<String> datos = new ArrayList();
            datos.add("'"+alumno.getString("NIF")+"'");
            datos.add("'"+alumno.getString("Nombre")+"'");
            datos.add("'"+alumno.getString("Apellido1")+"'");
            datos.add("'"+alumno.getString("Apellido2")+"'");
            datos.add("'"+alumno.getString("FechaNacimiento")+"'");
            datos.add("'"+alumno.getString("Email")+"'");
            datos.add("'"+alumno.getString("Contrasenna")+"'");
            datos.add(String.valueOf(alumno.getInt("CuentaCorriente")));
            datos.add(String.valueOf(alumno.getInt("Carrera")));
            datos.add(String.valueOf((int) (Math.random() * 100000) + 1));
            
            String sql1 = "";
            sql1 += "UPDATE Usuario SET DNI="+datos.get(0)+", ";  
            sql1 += "nombre="+datos.get(1)+", "; 
            sql1+= "apellido1="+datos.get(2)+", ";
            sql1+= "apellido2="+datos.get(3)+", ";
            sql1+= "fecha_nacimiento="+datos.get(4)+", ";
            sql1+= "email="+datos.get(5)+", ";
            sql1+= "password="+datos.get(6)+", ";
            sql1+= "CC="+datos.get(7)+" ";  
            sql1+= "WHERE DNI='"+NIF+"'";
            
            
            boolean exito = consulta_BDD(sql1);
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
