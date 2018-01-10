package controllers;

import apimodels.Alumno;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.net.URL;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2017-12-18T11:43:47.926Z")

public class AlumnoApiControllerImp implements AlumnoApiControllerImpInterface {
    
    private final ObjectMapper mapper = new ObjectMapper();
    
    HttpClient httpClient = HttpClients.createDefault();
            
    
    @Override
    public void alumnoNIFDelete(String NIF) throws Exception {
        //Do your magic!!!
        
        
    }

    @Override
    public Alumno alumnoNIFGet(String NIF) throws Exception {
        try{
            System.out.println("alumno");
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
        HttpPost post = new HttpPost("http://localhost:9100/alumno");
        String json = mapper.valueToTree(alumno).toString();
        StringEntity params = new StringEntity(json);
        post.setEntity(params);
        post.setHeader("Accept", "application/json");
        post.setHeader("Content-type", "application/json");
        HttpResponse response = httpClient.execute(post);
    }

}
