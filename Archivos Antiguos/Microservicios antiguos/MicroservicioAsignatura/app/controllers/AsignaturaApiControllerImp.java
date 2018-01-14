package controllers;

import apimodels.Asignatura;
import static conexiondb.BBDD.conectar;
import static conexiondb.BBDD.conexion;
import static conexiondb.BBDD.consulta_BDD;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import java.sql.ResultSet;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2017-12-18T19:12:09.891Z")

public class AsignaturaApiControllerImp implements AsignaturaApiControllerImpInterface {
    @Override
    public void asignaturaCodeDelete(Integer code) throws Exception {
        //Do your magic!!!
        
    }

    @Override
    public Asignatura asignaturaCodeGet(Integer code) throws Exception {
        //Do your magic!!!
        Asignatura asignatura = new Asignatura();
        try{
            conectar();
            String sql = "SELECT * FROM Asignatura WHERE Cod_asignatura = "+code+";";
            ResultSet resultado = consulta_BDD(sql);
            
            
            if(resultado.next()){
                String nombre = resultado.getString("nombre");
                int cod_asignatura = resultado.getInt("Cod_asignatura");
                int cod_carrera = resultado.getInt("Cod_carrera");
                int creditos = resultado.getInt("creditos");
                String tipo = resultado.getString("tipo");
                
               
                
                asignatura.setCodigo(cod_asignatura);
                asignatura.setCarrera(cod_carrera);
                asignatura.setNombre(nombre);
                asignatura.setCreditos(creditos);
                asignatura.setTipo(tipo);
                System.out.println(resultado.toString());
            }
            else{
                System.out.println("No exite Asignatura con ese codigo");
                asignatura=null;
                
            }
            
            
            conexion.close();
         
            return asignatura;   
        }
        catch(Exception e){
                System.out.println(e.toString());
                return null;
            }
        
       
    }

    @Override
    public void asignaturaCodePut(Integer code, Asignatura asignatura) throws Exception {
        //Do your magic!!!
        
    }

    @Override
    public void asignaturaPost(Asignatura asignatura) throws Exception {
        //Do your magic!!!
        
    }

    @Override
    public List<Asignatura> asignaturasCarreraCodeGet(String code) throws Exception {
        //Do your magic!!!
        return new ArrayList<Asignatura>();
    }

    @Override
    public List<Asignatura> asignaturasMatriculablesNIFGet(String NIF) throws Exception {
        //Do your magic!!!
        return new ArrayList<Asignatura>();
    }

}
