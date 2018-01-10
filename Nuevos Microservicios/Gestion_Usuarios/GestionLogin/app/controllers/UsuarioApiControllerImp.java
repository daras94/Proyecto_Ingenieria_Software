package controllers;

import apimodels.Cuenta;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-09T12:11:16.054Z")

public class UsuarioApiControllerImp implements UsuarioApiControllerImpInterface {
    @Override
    public Cuenta loginNifContrasennaPost(String nif, String contrasenna) throws Exception {
        Cuenta cuenta = null;
        ResultSet result = null;
        try{
            conectar();
            String SQL = "SELECT * FROM Usuario WHERE NIF = "+nif+" AND password = "+contrasenna+";";
            System.out.println(SQL);
            result = consulta_BDD(SQL);
            
            if(result.next()){
                cuenta = new Cuenta();
                cuenta.setNIF(result.getString("NIF"));
                cuenta.setTipo(result.getString("tipo_user"));
            }
            
            
            result = null;
            
            
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        finally{
            if(conexion!=null){
                conexion.close();
            }
            return cuenta;
        }
    }

}
