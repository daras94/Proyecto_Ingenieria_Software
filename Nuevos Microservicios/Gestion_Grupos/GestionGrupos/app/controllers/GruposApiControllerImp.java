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
        String query = "SELECT id_grupo, Cod_asignatura, tipo FROM grupo WHERE id_grupo NOT IN (SELECT grupo_id FROM profesor_grupo);";
        ArrayList<Grupo> grupos = new ArrayList<Grupo>();
        
        try{
            conectar();
        
            ResultSet respuesta = consulta_BDD(query);
            while(respuesta.next()){
                int codAsignatura = respuesta.getInt("Cod_asignatura");
                String query2 = "SELECT nombre FROM asignatura WHERE Cod_asignatura = "+codAsignatura+";";
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
        String query = "SELECT grupo_id FROM profesor_grupo WHERE Profesor_NIF= "+NIF;
        ArrayList<InfoGrupo> infoGrupos = new ArrayList<InfoGrupo>();
        
        try{
            conectar();
        
            ResultSet respuesta = consulta_BDD(query);
            while(respuesta.next()){
                int grupoId = respuesta.getInt("grupo_id");
                String query2 = "SELECT Cod_asignatura FROM grupo WHERE id_grupo = "+grupoId+";";
                ResultSet respuesta2 = consulta_BDD(query2);
                if(respuesta2.next()){
                    int codAsignatura = respuesta2.getInt("Cod_asignatura");
                    String query3 = "SELECT nombre FROM asginatura WHERE Cod_asignatura = "+codAsignatura+";";
                    ResultSet respuesta3 = consulta_BDD(query3);
                    if(respuesta3.next()){
                        String nombre = respuesta3.getString("nombre");
                        InfoGrupo infogrupo = new InfoGrupo();
                        infogrupo.setAsignaturaGrupo(nombre);
                        infogrupo.setIdGrupo(grupoId);
                        infoGrupos.add(infogrupo);
                    }
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
            return infoGrupos;
        }
    }

    @Override
    public void postGrupoAsignadoPost( @NotNull String profesor,  @NotNull Integer grupo) throws Exception {
        String query = "INSERT INTO profesor_grupo VALUES("+grupo+","+profesor+");";
        
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
