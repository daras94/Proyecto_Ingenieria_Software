package controllers;

import apimodels.Grupo;
import apimodels.InfoGrupo;
import static conexionbbdd.BBDD.*;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-12T19:17:10.953Z")

public class GruposApiControllerImp implements GruposApiControllerImpInterface {
    @Override
    public List<Grupo> getGruposGet() throws Exception {
        //Do your magic!!!
        return new ArrayList<Grupo>();
    }

    @Override
    public List<InfoGrupo> getInfoGrupoGet(String NIF) throws Exception {
        //Do your magic!!!
        return new ArrayList<InfoGrupo>();
    }

    @Override
    public void postGrupoAsignadoPost( @NotNull String profesor,  @NotNull Integer grupo) throws Exception {
        String query = "INSERT INTO Profesor_Grupo VALUES("+grupo+","+profesor+");";
        
        try{
            conectar();
        
            consulta_BDD(query);
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        finally{
            if(conexion!=null){
                conexion.close();
            }
        }
    }

}
