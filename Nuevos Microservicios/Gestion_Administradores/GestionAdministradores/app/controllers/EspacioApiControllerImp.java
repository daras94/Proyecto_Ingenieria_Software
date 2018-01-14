package controllers;

import apimodels.Espacio;
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

public class EspacioApiControllerImp implements EspacioApiControllerImpInterface {
    @Override
    public boolean editarEspacioNumeroEspacioPut(Integer numeroEspacio, Espacio espacio) throws Exception {
        boolean exito = false;
        try{
            conectar();
            
            ArrayList<String> datos = new ArrayList();
            datos.add(String.valueOf(espacio.getCodigo()));
            datos.add("'"+espacio.getNombre()+"'");
            datos.add(String.valueOf(espacio.getAforoMax()));
            datos.add(String.valueOf(espacio.getPrecioAlquiler()));
            
            String sql1 = "";
            sql1 += "UPDATE Espacio SET codigo="+datos.get(0)+", ";  
            sql1 += "nombre="+datos.get(1)+", "; 
            sql1+= "aforo_max="+datos.get(2)+", ";
            sql1+= "precio_alquiler="+datos.get(3)+", "; 
            sql1+= "WHERE codigo='"+String.valueOf(numeroEspacio)+"'";
            
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
    public boolean eliminarEspacioNumeroEspacioDelete(Integer numeroEspacio) throws Exception {
        //Do your magic!!!
        boolean exito = false;
        try{
            conectar();
            String sql1 = "DELETE FROM Espacio WHERE codigo = '"+String.valueOf(numeroEspacio)+"';";
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
    public boolean insertarEspacioPost(Espacio espacio) throws Exception {
        boolean exito = false;
        try{
            conectar();
            conexion.setAutoCommit(false);
            ArrayList<String> datos = new ArrayList();
            datos.add(String.valueOf(espacio.getCodigo()));
            datos.add("'"+espacio.getNombre()+"'");
            datos.add(String.valueOf(espacio.getAforoMax()));
            datos.add(String.valueOf(espacio.getPrecioAlquiler()));
            
           
            String sql="";
            sql += "INSERT INTO Espacio values("+datos.get(0);
            for(int i=1;i<(datos.size()-2);i++){
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
