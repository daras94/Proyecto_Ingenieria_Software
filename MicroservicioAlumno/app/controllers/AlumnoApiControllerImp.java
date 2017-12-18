package controllers;

import apimodels.Alumno;
import conexiondb.BBDD;
import static conexiondb.BBDD.*;

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
            String sql = "SELECT * FROM Alumno NATURAL JOIN Usuario WHERE Usuario.NIF = '"+NIF+"';";
            ResultSet resultado = consulta_BDD(sql);
            
            
            if(resultado.next()){
                String dni = resultado.getString("NIF");
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
        String dni = alumno.getNIF();
        String contrasenna = alumno.getContrasenna();
        String nombre = alumno.getNombre();
        String apellido1 = alumno.getApellido1();
        String apellido2 = alumno.getApellido2();
        String fecha_nacimiento = alumno.getFechaNacimiento();
        String email = alumno.getEmail();
        String CC = alumno.getCuentaCorriente();
        int carrera = alumno.getCarrera();
        
        try{
            conectar();
            String query1 = "SELECT MAX(num_expediente) AS max_exp FROM Alumnos;";
            ResultSet resultado = consulta_BDD(query1);
            Integer ultimoExpediente;
            if(resultado.next()){
                ultimoExpediente = resultado.getInt(1);
            }
            else{
                ultimoExpediente = 0;
            }
            String query2 = "INSERT INTO Usuario VALUES ('"+dni+"',"+"'ALUMNO', '"+nombre+"', '"+apellido1+"', '"+apellido2+"', "+fecha_nacimiento+", '"+email+"', "+contrasenna+", '"+CC+"');";
            String query3 = "INSERT INTO Alumno VALUES ('"+dni+"', "+carrera+", "+(ultimoExpediente+1)+");";
            consulta_BDD(query2);
            consulta_BDD(query3);
            conexion.close();
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        
    }

}
