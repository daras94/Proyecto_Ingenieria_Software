package controllers.alumno;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import controllers.authentificacion.Secured;
import models.Alumno;
import org.apache.http.HttpEntity;

import play.mvc.Http;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import play.Logger;
import play.libs.Json;
import services.AlumnoApiController0ImpInterface;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T01:55:13.400Z")

public class AlumnoApiControllerImp implements AlumnoApiController0ImpInterface {
    
    /**
     * Declaracion de atributos globales.
     */
    protected Logger.ALogger log = Logger.of(this.getClass());
    protected final ObjectMapper mapper = new ObjectMapper();

    @Override
    public void altaAlumnoPost(Alumno alumno) throws Exception {
        HttpPost post  = new HttpPost("http://localhost:9100/alta_alumno");
        post.setHeader(Secured.AUTH_TOKEN_HEADER, Http.Context.current().request().username());
        post.addHeader("Content-Type", "application/json");
        post.setEntity(new StringEntity(Json.toJson(alumno).toString()));
        HttpResponse response = new DefaultHttpClient().execute(post);
        System.out.println(" - Dar de Alta Alumno POST: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " +response.getStatusLine().getReasonPhrase());
        log.info(" - Dar de Alta Alumno POST: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " +response.getStatusLine().getReasonPhrase());     
    }

    @Override
    public void alumnoByNIFNIFDelete(String NIF) throws Exception {
        HttpDelete delete = new HttpDelete("http://localhost:9100/alumnoByNIF/" + NIF);
        delete.setHeader(Secured.AUTH_TOKEN_HEADER, Http.Context.current().request().username());
        HttpResponse response = new DefaultHttpClient().execute(delete);
        //JsonNode expediente = mapper.readTree(response.getEntity().getContent());
        System.out.println(" - Borrar Alumno DELETE: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());
        log.info(" - Borrar Alumno DELETE: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());
    }

    @Override
    public Alumno alumnoByNIFNIFGet(String NIF) throws Exception {
        HttpGet get = new HttpGet("http://localhost:9100/alumnoByNIF/" + NIF);
        get.setHeader(Secured.AUTH_TOKEN_HEADER, Http.Context.current().request().username());
        HttpResponse response = new DefaultHttpClient().execute(get);
        JsonNode expediente = mapper.readTree(response.getEntity().getContent());
        System.out.println(" - Recuperar Alumno GET: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());
        log.info(" - Recuperrar Alumno GET: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());
        return Json.fromJson(expediente, Alumno.class);
    }

    @Override
    public void alumnoByNIFNIFPut(String NIF, Alumno alumno) throws Exception {
        HttpPut put = new HttpPut("http://localhost:9100/alumnoByNIF/" + NIF);
        put.setHeader(Secured.AUTH_TOKEN_HEADER, Http.Context.current().request().username());
        put.addHeader("Content-Type", "application/json");
        put.addHeader("Accept", "application/json");
        put.setEntity(new StringEntity(Json.toJson(alumno).toString()));
        HttpResponse response = new DefaultHttpClient().execute(put);
        //JsonNode expediente = mapper.readTree(response.getEntity().getContent());
        System.out.println(" - Update Alumno PUT: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());
        log.info(" - Update Alumno PUT: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());
    }

}
