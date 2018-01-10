package controllers;

import apimodels.Alumno;
import static conexionbbdd.BBDD.conectar;
import static conexionbbdd.BBDD.conexion;
import static conexionbbdd.BBDD.consulta_BDD;
import java.util.List;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import java.sql.ResultSet;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-10T16:49:20.722Z")

public class ListaNotasApiControllerImp implements ListaNotasApiControllerImpInterface {
    String anno = "2017";
    @Override
    public void cerrarActasIdPut(Integer id) throws Exception {
        //Do your magic!!!
        
    }

    @Override
    public List<Alumno> obtenerListaIdGet(Integer id) throws Exception {
        //Do your magic!!!
        List<Alumno> alumnos = null;
        ResultSet result = null;
        try{
            conectar();
            String SQL = "";
            SQL+="SELECT * FROM Asignatura_Matriculada NATURAL JOIN Alumno INNER JOIN Usuario ON (Usuario_NIF=NIF) WHERE Curso= "+anno+" AND Grupo_id_grupo = ";
            SQL+=String.valueOf(id)+";";
            
            result = consulta_BDD(SQL);
            
            alumnos = new ArrayList<>();
            Alumno aux = null;
            while(result.next()){
                aux = new Alumno();
                aux.setDNI(result.getString("NIF"));
                aux.setNombre(result.getString("nombre"));
                aux.setApellido1(result.getString("apellido1"));
                aux.setApellido2(result.getString("apellido2"));
                aux.setEmail(result.getString("email"));
                aux.setNota(result.getDouble("nota"));
                
                alumnos.add(aux);
                aux=null;
            }
            
            result=null;
            
            
            
            
            
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        finally{
            if(conexion!=null){
                conexion.close();
            }
            return alumnos;
        }
    }

    @Override
    public void subirNotasIdPut(Integer id, List<Alumno> alumnos) throws Exception {
        //Do your magic!!!
        
    }

}
