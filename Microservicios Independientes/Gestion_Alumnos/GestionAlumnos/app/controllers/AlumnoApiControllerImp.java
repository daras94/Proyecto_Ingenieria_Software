package controllers;

import apimodels.Alumno;
import static conexionbbdd.BBDD.*;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import java.sql.ResultSet;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2017-12-30T09:32:26.982Z")

public class AlumnoApiControllerImp implements AlumnoApiControllerImpInterface {
    @Override
    public boolean altaAlumnoPost(Alumno alumno) throws Exception {
        //Do your magic!!!
        boolean exito = false;
        try{
            conectar();
            conexion.setAutoCommit(false);
            ArrayList<String> datos = new ArrayList();
            datos.add("'"+alumno.getNIF()+"'");
            datos.add("'ALUMNO'");
            datos.add("'"+alumno.getNombre()+"'");
            datos.add("'"+alumno.getApellido1()+"'");
            datos.add("'"+alumno.getApellido2()+"'");
            datos.add("'"+alumno.getFechaNacimiento()+"'");
            datos.add("'"+alumno.getEmail()+"'");
            datos.add("'"+alumno.getContrasenna()+"'");
            datos.add(alumno.getCuentaCorriente());
            datos.add(String.valueOf(alumno.getCarrera()));
            int numero = generar_expediente();
            Integer exp = (int) (Math.random() * 20000) + 1;
            datos.add(String.valueOf(exp));
            
           
            String sql="";
            sql += "INSERT INTO Usuario values("+datos.get(0);
            for(int i=1;i<(datos.size()-2);i++){
                sql += ","+datos.get(i);
            
            
            }
            sql +=");";
            
            
            String sql2 = "INSERT INTO Alumno values("+datos.get(0)+","+datos.get(9)+","+datos.get(10)+");";
            
            
            
            int resultado = actualizar_BDD(sql, sql2);
            if(resultado == 0){
                exito = true;
            }
            
        }
        catch(Exception e){
            System.out.println(e.toString());
        
        }
        
        finally{
            if (conexion != null){
                conexion.close();
                
            }
            return exito;
        }
        
    }

    @Override
    public boolean alumnoByNIFNIFDelete(String NIF) throws Exception {
        //Do your magic!!!
        boolean exito = false;
        try{
            conectar();
            String sql1 = "DELETE FROM Alumno WHERE Usuario_NIF = '"+NIF+"';";
            String sql2 = "DELETE FROM Usuario WHERE NIF = '"+NIF+"';";
            int n = actualizar_BDD(sql1,sql2);
            if(n==0){
                exito=true;
            }
            
        }
        catch(Exception e){
            System.out.println(e.toString());
            
        }
        finally{
            if(conexion!=null){
                conexion.close();
            }
            return exito;
        }
        
    }

    @Override
    public Alumno alumnoByNIFNIFGet(String NIF) throws Exception {
        //Do your magic!!!
        Alumno alumno = null;
        try{
            conectar();
            String sql = "SELECT * FROM Alumno NATURAL JOIN Usuario WHERE Usuario.NIF = '"+NIF+"';";
            ResultSet resultado = consulta_BDD(sql);
            
            
            if(resultado.next()){
                String dni = resultado.getString("NIF");
                String contrasenna = resultado.getString("password");
                String nombre = resultado.getString("nombre");
                String apellido1 = resultado.getString("apellido1");
                String apellido2 = resultado.getString("apellido2");
                String fecha_nacimiento = String.valueOf(resultado.getDate("fecha_nacimiento"));
                String email = resultado.getString("email");
                String CC = resultado.getString("CC");
                int carrera = resultado.getInt("Cod_carrera");
                int num_expediente = resultado.getInt("num_expediente");
                
               
                alumno = new Alumno();
                alumno.setNIF(dni);
                alumno.setContrasenna(contrasenna);
                alumno.setNombre(nombre);
                alumno.setApellido1(apellido1);
                alumno.setApellido2(apellido2);
                alumno.setFechaNacimiento(fecha_nacimiento);
                alumno.setEmail(email);
                alumno.setCuentaCorriente(CC);
                alumno.setCarrera(carrera);
                alumno.setExpediente(num_expediente);
                
                
            }
            else{
                System.out.println("No exite Alumno con ese DNI");
                alumno=null;
                
            }
            
            
         
             
        }
        catch(Exception e){
                System.out.println(e.toString());
                
        }
        
        finally{
            if(conexion!=null){
                conexion.close();
            }
              return alumno; 
        }
    }

    @Override
    public boolean alumnoByNIFNIFPut(String NIF, Alumno alumno) throws Exception {
        //Do your magic!!!
        
        boolean exito = false;
        try{
            conectar();
            
            ArrayList<String> datos = new ArrayList();
            datos.add("'"+alumno.getNIF()+"'");
            datos.add("'"+alumno.getNombre()+"'");
            datos.add("'"+alumno.getApellido1()+"'");
            datos.add("'"+alumno.getApellido2()+"'");
            datos.add("'"+alumno.getFechaNacimiento()+"'");
            datos.add("'"+alumno.getEmail()+"'");
            datos.add("'"+alumno.getContrasenna()+"'");
            datos.add(alumno.getCuentaCorriente());
            
            String sql1 = "";
            sql1 += "UPDATE Usuario SET NIF="+datos.get(0)+", ";  
            sql1 += "nombre="+datos.get(1)+", "; 
            sql1+= "apellido1="+datos.get(2)+", ";
            sql1+= "apellido2="+datos.get(3)+", ";
            sql1+= "fecha_nacimiento="+datos.get(4)+", ";
            sql1+= "email="+datos.get(5)+", ";
            sql1+= "password="+datos.get(6)+", ";
            sql1+= "CC="+datos.get(7)+" ";  
            sql1+= "WHERE NIF='"+NIF+"'";
            
            int n = actualizar_BDD(sql1);
            if(n==0){
                exito=true;
            }
            
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        finally{
            if(conexion!=null){
                conexion.close();
            }
            return exito;
        }
        
    }
    
    private int generar_expediente(){
        int numero=0;
        try{
            ResultSet result = null;
            String SQL = "SELECT * FROM Alumno WHERE num_expediente = ";
            do{
                numero = (int) (Math.random() * 20000) + 1;
                result = consulta_BDD(SQL+String.valueOf(numero)+";");
                
            }while(result.next());
            
            
            
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        finally{
            return numero;
        }
    }

}
