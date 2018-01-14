package controllers;

import apimodels.Profesor;
import static conexionbbdd.BBDD.actualizar_BDD;
import static conexionbbdd.BBDD.conectar;
import static conexionbbdd.BBDD.conexion;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-14T12:38:44.152Z")

public class ProfesorApiControllerImp implements ProfesorApiControllerImpInterface {
    @Override
    public boolean editarProfesorNumeroProfesorPut(Integer numeroProfesor, Profesor profesor) throws Exception {
        boolean exito = false;
        try{
            conectar();
            
            ArrayList<String> datos = new ArrayList();
            datos.add("'"+profesor.getNIF()+"'");
            datos.add("'"+profesor.getNombre()+"'");
            datos.add("'"+profesor.getApellido1()+"'");
            datos.add("'"+profesor.getApellido2()+"'");
            datos.add("'"+profesor.getFechaNacimiento()+"'");
            datos.add("'"+profesor.getEmail()+"'");
            datos.add("'"+profesor.getContrasenna()+"'");
            datos.add(String.valueOf(profesor.getCuentaCorriente()));
            
            String sql1 = "";
            sql1 += "UPDATE Usuario SET NIF="+datos.get(0)+", ";  
            sql1 += "nombre="+datos.get(1)+", "; 
            sql1+= "apellido1="+datos.get(2)+", ";
            sql1+= "apellido2="+datos.get(3)+", ";
            sql1+= "fecha_nacimiento="+datos.get(4)+", ";
            sql1+= "email="+datos.get(5)+", ";
            sql1+= "password="+datos.get(6)+", ";
            sql1+= "CC="+datos.get(7)+" ";  
            sql1+= "WHERE NIF='"+numeroProfesor+"'";
            
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

    @Override
    public boolean eliminarProfesorNIFDelete(String NIF) throws Exception {
        //Do your magic!!!
        boolean exito = false;
        try{
            conectar();
            String sql1 = "DELETE FROM Profesor WHERE Usuario_NIF = '"+NIF+"';";
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
    public boolean insertarProfesorPost(Profesor profesor) throws Exception {
        boolean exito = false;
        try{
            conectar();
            conexion.setAutoCommit(false);
            ArrayList<String> datos = new ArrayList();
            datos.add("'"+profesor.getNIF()+"'");
            datos.add("'PROFESOR    '");
            datos.add("'"+profesor.getNombre()+"'");
            datos.add("'"+profesor.getApellido1()+"'");
            datos.add("'"+profesor.getApellido2()+"'");
            datos.add("'"+profesor.getFechaNacimiento()+"'");
            datos.add("'"+profesor.getEmail()+"'");
            datos.add("'"+profesor.getContrasenna()+"'");
            datos.add(String.valueOf(profesor.getCuentaCorriente()));
            datos.add("'"+profesor.getCategoria()+"'");
            datos.add(String.valueOf(profesor.getAntiguedad()));
            datos.add(String.valueOf(profesor.getTramosInvestigacion()));
            datos.add(String.valueOf(profesor.getTramosDocentes()));
            datos.add(String.valueOf(profesor.getDepartamento()));
            
           
            String sql="";
            sql += "INSERT INTO Usuario values("+datos.get(0);
            for(int i=1;i<(datos.size()-2);i++){
                sql += ","+datos.get(i);
            
            
            }
            sql +=");";
            
            
            String sql2 = "INSERT INTO Profesor values("+datos.get(0)+","+datos.get(9)+","+datos.get(10)+","+datos.get(11)+","+datos.get(12)+","+datos.get(13)+");";
            
            
            
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

}
