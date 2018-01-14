package controllers;

import apimodels.Departamento;
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

public class DepartamentoApiControllerImp implements DepartamentoApiControllerImpInterface {
    @Override
    public boolean borrarDepartamentoNumeroDepartamentoDelete(Integer numeroDepartamento) throws Exception {
        //Do your magic!!!
        boolean exito = false;
        try{
            conectar();
            String sql1 = "DELETE FROM Departamento WHERE codigo = '"+numeroDepartamento+"';";
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
    public boolean editarDepartamentoNumeroDepartamentoPut(Integer numeroDepartamento, Departamento departamento) throws Exception {
        //Do your magic!!!
        boolean exito = false;
        try{
            conectar();
            
            ArrayList<String> datos = new ArrayList();
            datos.add(String.valueOf(departamento.getCodigo()));
            datos.add("'"+departamento.getNombre()+"'");
            
            String sql1 = "";
            sql1 += "UPDATE Departamento SET codigo="+datos.get(0)+", ";  
            sql1 += "nombre="+datos.get(1)+", ";
            sql1 +=  "carga=0";
            sql1+= "WHERE codigo='"+String.valueOf(numeroDepartamento)+"'";
            
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
    public boolean insertarDepartamentoPost(Departamento departamento) throws Exception {
        boolean exito = false;
        try{
            conectar();
            conexion.setAutoCommit(false);
            ArrayList<String> datos = new ArrayList();
            datos.add(String.valueOf(departamento.getCodigo()));
            datos.add("'"+departamento.getNombre()+"'");
            
           
            String sql="";
            sql += "INSERT INTO Departamento values("+datos.get(0);
            for(int i=1;i<datos.size()-2;i++){
                sql += ","+datos.get(i);
            
            
            }
            sql +=",0);";
            
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
