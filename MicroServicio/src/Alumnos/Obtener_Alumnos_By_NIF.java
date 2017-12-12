/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumnos;

import java.math.BigDecimal;
import java.sql.*;
import javax.json.*;

/**
 *
 * @author febis
 */
public class Obtener_Alumnos_By_NIF {
    
    //Constructor
    public Obtener_Alumnos_By_NIF(){};
    
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
    
    private ResultSet consulta_BDD (String NIF){
        ResultSet resultado = null;
       
        try{
            String sql = "SELECT * FROM Alumno NATURAL JOIN Usuario WHERE Usuario.DNI = '"+NIF+"';";
            sentencia = getConexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            resultado = sentencia.executeQuery(sql);
            
       
        }
        catch(Exception e){
            System.out.println(e.toString());
            return null;
        }
        
        return resultado;
    }
    
    
    public JsonObject ejecutar(String DNI){
        try{
            conectar();
            ResultSet resultado = consulta_BDD(DNI);
            JsonObject obj = null;
            if(resultado.next()){
                String dni = resultado.getString("DNI");
                String nombre = resultado.getString("nombre");
                String apellido1 = resultado.getString("apellido1");
                String apellido2 = resultado.getString("apellido2");
                String fecha_nacimiento = String.valueOf(resultado.getDate("fecha_nacimiento"));
                String email = resultado.getString("email");
                String CC = resultado.getString("CC");
                int carrera = resultado.getInt("Cod_carrera");
                int num_expediente = resultado.getInt("num_expediente");
                
                //System.out.println("[ "+dni+", "+nombre+", "+apellido1+", "+apellido2+", "+fecha_nacimiento+", "+email+", "+CC+", "+carrera+", "+num_expediente+" ]");
                
                obj = Json.createObjectBuilder()
                            .add("NIF", dni)
                            .add("Nombre", nombre)
                            .add("Apellido1", apellido1)
                            .add("Apellido2", apellido2)
                            .add("FechaNacimiento", fecha_nacimiento)
                            .add("Email", email)
                            .add("CuentaCorriente", CC)
                            .add("Carrera", carrera)
                            .add("NumeroExpediente", num_expediente)
                            .build();
            }
            sentencia.close();
            conexion.close();
            return obj;
           
            
            
        }
        catch(Exception e){
            System.out.println(e.toString());
            return null;
            
        }
    
    
    
    
    }
    
    
    
    
    //Metodos GET y SET
    
    public Connection getConexion(){
        return this.conexion;
    }
    
    public void setConexion(Connection conexion){
        this.conexion=conexion;
    }
    
    public Statement getSentencia(){
        return this.sentencia;
    }
    
    public void setConexion(Statement sentencia){
        this.sentencia=sentencia;
    }
    
}
