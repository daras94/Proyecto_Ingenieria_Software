package controllers;

import apimodels.Profesor;
import static conexionbbdd.BBDD.conectar;
import static conexionbbdd.BBDD.conexion;
import static conexionbbdd.BBDD.consulta_BDD;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import java.sql.ResultSet;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T15:37:03.349Z")

public class ProfesoresApiControllerImp implements ProfesoresApiControllerImpInterface {
    @Override
    public List<Profesor> getProfesoresGet() throws Exception {
        String query = "SELECT NIF, departamento FROM profesor WHERE";
        ArrayList<Profesor> profesores = new ArrayList<Profesor>();
        
        try{
            conectar();
        
            ResultSet respuesta = consulta_BDD(query);
            while(respuesta.next()){
                String NIF = respuesta.getString("NIF");
                String query2 = "SELECT nombre, apellido1, apellido2 FROM usuario WHERE NIF = "+NIF+";";
                ResultSet respuesta2 = consulta_BDD(query2);
                if(respuesta2.next()){
                    int departamento = respuesta.getInt("departamento");
                    String nombre = respuesta2.getString("nombre");
                    String apellido1 = respuesta2.getString("apellido1");
                    String apellido2 = respuesta2.getString("apellido2");
                    Profesor profesor = new Profesor();
                    profesor.setNIF(NIF);
                    profesor.setNombre(nombre);
                    profesor.setApellido1(apellido1);
                    profesor.setApellido2(apellido2);
                    profesor.setDepartamento(departamento);
                    profesores.add(profesor);
                }
            }
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        finally{
            if(conexion!=null){
                conexion.close();
            }
            return profesores;
        }
    }

}
