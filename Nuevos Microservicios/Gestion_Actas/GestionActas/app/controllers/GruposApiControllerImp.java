package controllers;

import apimodels.Grupo;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-10T16:49:20.722Z")

public class GruposApiControllerImp implements GruposApiControllerImpInterface {
    String anno = "2017";
    @Override
    public List<Grupo> obtenerGruposNifGet(String nif) throws Exception {
        List<Grupo> grupos = null;
        ResultSet result = null;
        try{
            conectar();
            String SQL = "";
            SQL+="SELECT * FROM Profesor_Grupo INNNER JOIN Grupo ON (grupo_id=id_grupo) WHERE Profesor_NIF = "+nif+" AND Curso= "+anno+";";
            result = consulta_BDD(SQL);
            
            grupos = new ArrayList<>();
            Grupo aux = null;
            while(result.next()){
                aux = new Grupo();
                aux.setID(result.getInt("id_grupo"));
                aux.setActas(result.getBoolean("actas"));
                aux.setTipo(result.getString("tipo"));
                aux.setMiembros(result.getInt("miembros"));
                aux.setAsignatura(result.getInt("Cod_asignatura"));
                aux.setAnno(result.getInt("anno"));
                
                grupos.add(aux);
                aux = null;
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
            return grupos;
        }
    }

}
