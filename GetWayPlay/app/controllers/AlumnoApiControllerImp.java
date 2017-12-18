package controllers;

import apimodels.Alumno;
import com.fasterxml.jackson.databind.ObjectMapper;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import javax.json.*;
import javax.validation.constraints.*;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2017-12-18T11:43:47.926Z")

public class AlumnoApiControllerImp implements AlumnoApiControllerImpInterface {
    
    private final ObjectMapper mapper = new ObjectMapper();
    
    HttpClient httpClient = HttpClientBuilder.create().build();
            
    
    @Override
    public void alumnoNIFDelete(String NIF) throws Exception {
        //Do your magic!!!
        
        
    }

    @Override
    public Alumno alumnoNIFGet(String NIF) throws Exception {
        try{
            String URL = "http://localhost:9100/alumno/"+NIF;
            URL enlace = new URL(URL); //Creacion dirección URL
            InputStream is = enlace.openStream(); //Abrir conexion con la API
            JsonReader rdr = Json.createReader(is); //Leer el objeto JSON
            JsonObject obj = rdr.readObject(); //Sacar el objeto JSON leido
            Alumno alumno = mapper.readValue(obj.toString(), Alumno.class);
            return alumno;
        }
        catch(Exception e){
            System.out.println(e.toString());
            return null;
        }
    }

    @Override
    public void alumnoNIFPut(String NIF, Alumno alumno) throws Exception {
        //Do your magic!!!
        
        
    }

    @Override
    public void alumnoPost(Alumno alumno) throws Exception {
        HttpPost request = new HttpPost("http://localhost:9100/alummo");
        StringEntity params = new StringEntity(mapper.valueToTree(alumno).toString());
        request.setEntity(params);
        HttpResponse response = httpClient.execute(request);
    }

}
