package controllers;

import apimodels.Alumno;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2017-12-18T12:09:27.067Z")

public class AlumnoApiControllerImp implements AlumnoApiControllerImpInterface {
    //Atributos
    private Connection conexion;
    private Statement sentencia;
    
    //Conexion Base de datos
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
    
    private ResultSet consulta_BDD (String SQL){
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
    @Override
    public void alumnoNIFDelete(String NIF) throws Exception {
        //Do your magic!!!
        
    }

    @Override
    public Alumno alumnoNIFGet(String NIF) throws Exception {
        //Do your magic!!!
        Alumno alumno = new Alumno();
        try{
            conectar();
            String sql = "SELECT * FROM Alumno NATURAL JOIN Usuario WHERE Usuario.DNI = '"+NIF+"';";
            ResultSet resultado = consulta_BDD(sql);
            
            
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
                
               
                
                alumno.setNIF(dni);
                alumno.setNombre(nombre);
                alumno.setApellido1(apellido1);
                alumno.setApellido2(apellido2);
                alumno.setFechaNacimiento(fecha_nacimiento);
                alumno.setEmail(email);
                alumno.setCuentaCorriente(CC);
                alumno.setCarrera(carrera);
                alumno.setExpediente(num_expediente);
                
                System.out.println(resultado.toString());
            }
            else{
                System.out.println("No exite Alumno con ese DNI");
                alumno=null;
                
            }
            
            
            conexion.close();
         
            return alumno;   
        }
        catch(Exception e){
                System.out.println(e.toString());
                return null;
            }
        
    }

    @Override
    public void alumnoNIFPut(String NIF, Alumno alumno) throws Exception {
        //Do your magic!!!
        
    }

    @Override
    public void alumnoPost(Alumno alumno) throws Exception {
        //Do your magic!!!
        
    }

}
