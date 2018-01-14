package controllers;

import apimodels.Carrera;
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

public class CarreraApiControllerImp implements CarreraApiControllerImpInterface {
    @Override
    public boolean editarCarreraNumeroCarreraPut(Integer numeroCarrera, Carrera carrera) throws Exception {
        boolean exito = false;
        try{
            conectar();
            
            ArrayList<String> datos = new ArrayList();
            datos.add(String.valueOf(carrera.getCodigo()));
            datos.add("'"+carrera.getNombre()+"'");
            datos.add("'"+carrera.getFacultad()+"'");
            datos.add(String.valueOf(carrera.getCreditosOptativos()));
            datos.add(String.valueOf(carrera.getCreditosObligatorios()));
            datos.add(String.valueOf(carrera.getCreditosTransversales()));
            
            String sql1 = "";
            sql1 += "UPDATE Asignatura SET cod_carrera="+datos.get(0)+", ";  
            sql1 += "nombre="+datos.get(1)+", "; 
            sql1 += "facultad="+datos.get(2)+", "; 
            sql1+= "num_cred_opt="+datos.get(3)+", ";
            sql1+= "num_cred_obl="+datos.get(4)+", ";
            sql1+= "num_cred_tran="+datos.get(5)+" WHERE cod_carrera= "+String.valueOf(numeroCarrera);
            
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
    public boolean eliminarCarreraCodigoCarreraDelete(Integer codigoCarrera) throws Exception {
        //Do your magic!!!
        boolean exito = false;
        try{
            conectar();
            String sql1 = "DELETE FROM Carrera WHERE cod_carrera = '"+String.valueOf(codigoCarrera)+"';";
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
    public boolean insertarCarreraPost(Carrera carrera) throws Exception {
        boolean exito = false;
        try{
            conectar();
            conexion.setAutoCommit(false);
            ArrayList<String> datos = new ArrayList();
            datos.add("'"+carrera.getNombre()+"'");
            datos.add(String.valueOf(carrera.getCodigo()));
            datos.add("'"+carrera.getFacultad()+"'");
            datos.add(String.valueOf(carrera.getCreditosOptativos()));
            datos.add(String.valueOf(carrera.getCreditosObligatorios()));
            datos.add(String.valueOf(carrera.getCreditosTransversales()));
            
           
            String sql="";
            sql += "INSERT INTO Carrera values("+datos.get(0);
            for(int i=1;i<datos.size();i++){
                sql += ","+datos.get(i);
            
            
            }
            sql +=");";
            
            int resultado = actualizar_BDD(sql);
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
