package controllers;

import apimodels.Alumno;
import apimodels.Asignatura;
import com.fasterxml.jackson.databind.ObjectMapper;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.validation.constraints.*;
import static play.libs.Json.mapper;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2017-12-18T19:53:01.612Z")

public class AsignaturaApiControllerImp implements AsignaturaApiControllerImpInterface {
    private final ObjectMapper mapper = new ObjectMapper();
    @Override
    public void asignaturaCodeDelete(Integer code) throws Exception {
        //Do your magic!!!
        
    }

    @Override
    public Asignatura asignaturaCodeGet(Integer code) throws Exception {
        //Do your magic!!!
        try{
            String URL = "http://localhost:9500/asignatura/"+code;
            URL enlace = new URL(URL); //Creacion dirección URL
            InputStream is = enlace.openStream(); //Abrir conexion con la API
            JsonReader rdr = Json.createReader(is); //Leer el objeto JSON
            JsonObject obj = rdr.readObject(); //Sacar el objeto JSON leido
            Asignatura asignatura = mapper.readValue(obj.toString(), Asignatura.class);
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
    public List<Asignatura> asignaturasMatriculaGet( @NotNull String NIF,  @NotNull Integer promocion) throws Exception {
        //Do your magic!!!
        return new ArrayList<Asignatura>();
    }

    @Override
    public List<Asignatura> asignaturasMatriculablesNIFGet(String NIF) throws Exception {
        //Do your magic!!!
        return new ArrayList<Asignatura>();
    }

}
