package controllers;

import apimodels.Asignatura;
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

public class AsignaturaApiControllerImp implements AsignaturaApiControllerImpInterface {
    @Override
    public boolean editarAsignaturaNumeroAsignaturaPut(Integer numeroAsignatura, Asignatura asignatura) throws Exception {
        boolean exito = false;
        try{
            conectar();
            
            ArrayList<String> datos = new ArrayList();
            datos.add("'"+asignatura.getNombre()+"'");
            datos.add(String.valueOf(asignatura.getCodigo()));
            datos.add(String.valueOf(asignatura.getCarrera()));
            datos.add(String.valueOf(asignatura.getCreditos()));
            datos.add("'"+asignatura.getTipo()+"'");
            
            String sql1 = "";
            sql1 += "UPDATE Asignatura SET nombre="+datos.get(0)+", ";  
            sql1 += "Cod_Asignatura="+datos.get(1)+", "; 
            sql1+= "Cod_carrera="+datos.get(2)+", ";
            sql1+= "creditos="+datos.get(3)+", ";
            sql1+= "tipo="+datos.get(4)+", "; 
            sql1+= "WHERE Cod_asignatura='"+String.valueOf(numeroAsignatura)+"'";
            
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
    public boolean eliminarAsignaturaCodigoAsignaturaDelete(Integer codigoAsignatura) throws Exception {
        //Do your magic!!!
        //Do your magic!!!
        boolean exito = false;
        try{
            conectar();
            String sql1 = "DELETE FROM Asignatura WHERE Cod_asignatura = '"+String.valueOf(codigoAsignatura)+"';";
            int resultado = actualizar_BDD(sql1);
            if(resultado == 0){
                exito = true;
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
    public boolean insertarAsignaturaPost(Asignatura asignatura) throws Exception {
        //Do your magic!!!
        boolean exito = false;
        try{
            conectar();
            conexion.setAutoCommit(false);
            ArrayList<String> datos = new ArrayList();
            datos.add("'"+asignatura.getNombre()+"'");
            datos.add(String.valueOf(asignatura.getCodigo()));
            datos.add(String.valueOf(asignatura.getCarrera()));
            datos.add(String.valueOf(asignatura.getCreditos()));
            datos.add("'"+asignatura.getTipo()+"'");
            
           
            String sql="";
            sql += "INSERT INTO Asignatura values("+datos.get(0);
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
