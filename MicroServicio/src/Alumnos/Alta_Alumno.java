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
public class Alta_Alumno {
    //Constructor
    public Alta_Alumno(){};
    
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
    
    private boolean consulta_BDD (String sql1, String sql2){
        boolean resultado = false;
        
       
        try{
            
            
            Statement sentencia = getConexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            resultado = sentencia.execute(sql1);
            if(resultado){resultado=sentencia.execute(sql2);}
       
        }
        catch(Exception e){
            System.out.println(e.toString());
            return resultado;
        }
        
        return resultado;
    }
    
    public void ejecutar(JsonObject alumno){
        
        try{
            conectar();
            ArrayList<String> datos = new ArrayList();
            datos.add("'"+alumno.getString("NIF")+"'");
            datos.add("'ALUMNO'");
            datos.add("'"+alumno.getString("Nombre")+"'");
            datos.add("'"+alumno.getString("Apellido1")+"'");
            datos.add("'"+alumno.getString("Apellido2")+"'");
            datos.add("'"+alumno.getString("FechaNacimiento")+"'");
            datos.add("'"+alumno.getString("Email")+"'");
            datos.add("'"+alumno.getString("Contrasenna")+"'");
            datos.add(String.valueOf(alumno.getInt("CuentaCorriente")));
            datos.add(String.valueOf(alumno.getInt("Carrera")));
            datos.add("987654321");
            
            String sql1 = "";
            sql1 += "INSERT INTO Usuario values("+datos.get(0);
            for(int i=1;i<(datos.size()-2);i++){
                sql1 += ","+datos.get(i);
            
            
            }
            sql1 +=");";
            String sql2 = "INSERT INTO Alumno values("+datos.get(0)+","+datos.get(9)+","+datos.get(10)+");";
            System.out.println(sql1);
            System.out.println(sql2);
        
            consulta_BDD(sql1,sql2);
            sentencia.close();
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
