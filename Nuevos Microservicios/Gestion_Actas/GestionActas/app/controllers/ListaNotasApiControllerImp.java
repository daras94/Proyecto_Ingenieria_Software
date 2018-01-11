package controllers;

import apimodels.Alumno;
import static conexionbbdd.BBDD.actualizar_BDD;
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
    public int cerrarActasIdPut(Integer id) throws Exception {
        //Do your magic!!!
        int resultado = -1;
        try{
            conectar();
            
            String SQL = "UPDATE Grupo SET actas = FALSE WHERE id_grupo = "+String.valueOf(id)+";";
            resultado = actualizar_BDD(SQL);
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        finally{
            if(conexion!=null){
                conexion.close();
            }
            return resultado;
        }
        
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
                aux.setExpediente(result.getInt("num_expediente"));
                
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
    public int subirNotasIdPut(Integer id, List<Alumno> alumnos) throws Exception {
        int resultado = -1;
        List<String> sentencias = null;
        try{
            conectar();
            sentencias=new ArrayList<>();
            String SQL = "UPDATE Asignatura_Matriculada SET nota = ";
            String sql_aux="";
            Alumno alum_aux=null;
            for(int i =0;i<alumnos.size();i++){
                alum_aux=alumnos.get(i);
                sql_aux=String.valueOf(alum_aux.getNota())+" WHERE num_expediente = "+String.valueOf(alum_aux.getExpediente())+" AND Grupo_id_grupo= "+String.valueOf(id)+";";
                sentencias.add(SQL+sql_aux);
                alum_aux=null;
                sql_aux="";
            }
            
            resultado = actualizar_BDD(sentencias);
            
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        finally{
            if(conexion!=null){
                conexion.close();
            }
            return resultado;
        }
        
    }

}
