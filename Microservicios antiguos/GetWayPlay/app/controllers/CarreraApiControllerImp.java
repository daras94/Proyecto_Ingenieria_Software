package controllers;

import apimodels.Carrera;
import com.fasterxml.jackson.databind.ObjectMapper;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2017-12-18T11:43:47.926Z")

public class CarreraApiControllerImp implements CarreraApiControllerImpInterface {
    
    private final ObjectMapper mapper = new ObjectMapper();
    @Override
    public void carreraCodeDelete(Integer code) throws Exception {
        //Do your magic!!!
        
    }

    @Override
    public Carrera carreraCodeGet(Integer code) throws Exception {
        //Do your magic!!!
        return new Carrera();
    }

    @Override
    public void carreraCodePut(Integer code, Carrera carrera) throws Exception {
        //Do your magic!!!
        
    }

    @Override
    public void carreraPost(Carrera carrera) throws Exception {
        //Do your magic!!!
        
    }

    @Override
    public List<Carrera> carrerasGet() throws Exception {
        String URL = "http://localhost:9300/carreras";
        URL enlace = new URL(URL); //Creacion dirección URL
        InputStream is = enlace.openStream(); //Abrir conexion con la API
        JsonReader rdr = Json.createReader(is); //Leer el objeto JSON
        JsonArray array = rdr.readArray();
        ArrayList<Carrera> al = new ArrayList<>();
        for(int i = 0; i<array.size(); i++){
            JsonObject obj = array.getJsonObject(i);
            Carrera carrera = mapper.readValue(obj.toString(), Carrera.class);
            al.add(carrera);
        }
        return al;
    }

}
