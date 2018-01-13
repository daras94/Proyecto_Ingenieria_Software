package controllers;

import apimodels.Grupo;
import apimodels.InfoGrupo;
import static conexionbbdd.BBDD.*;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import java.sql.ResultSet;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T15:37:03.349Z")

public class GruposApiControllerImp implements GruposApiControllerImpInterface {
    @Override
    public List<Grupo> getGruposGet() throws Exception {
        String query = "SELECT id_grupo, Cod_asignatura, tipo FROM Grupo WHERE id_grupo NOT IN (SELECT grupo_id FROM Profesor_Grupo);";
        ArrayList<Grupo> grupos = new ArrayList<Grupo>();
        
        try{
            conectar();
        
            ResultSet respuesta = consulta_BDD(query);
            while(respuesta.next()){
                int codAsignatura = respuesta.getInt("Cod_asignatura");
                String query2 = "SELECT nombre FROM Asignatura WHERE Cod_asignatura = "+codAsignatura+";";
                ResultSet respuesta2 = consulta_BDD(query2);
                if(respuesta2.next()){
                    int idGrupo = respuesta.getInt("id_grupo");
                    String tipo = respuesta.getString("tipo");
                    String asignatura = respuesta2.getString("nombre");
                    Grupo grupo = new Grupo();
                    grupo.setAsignatura(asignatura);
                    grupo.setId(idGrupo);
                    grupo.setTipo(tipo);
                    grupos.add(grupo);
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
            return grupos;
        }
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
