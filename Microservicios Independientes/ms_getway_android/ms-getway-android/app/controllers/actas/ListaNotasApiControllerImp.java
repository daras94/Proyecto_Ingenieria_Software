package controllers.actas;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import controllers.authentificacion.Secured;
import models.acta.Alumno;

import play.mvc.Http;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import play.Logger;
import play.libs.Json;
import services.ListaNotasApiControllerImpInterface;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T00:24:22.734Z")

public class ListaNotasApiControllerImp implements ListaNotasApiControllerImpInterface {

    /**
     * Declaracion de atributos globales.
     */
    protected Logger.ALogger log = Logger.of(this.getClass());
    protected final ObjectMapper mapper = new ObjectMapper();

    @Override
    public Integer cerrarActasIdPut(Integer id) throws Exception {
        HttpPut put = new HttpPut("http://localhost:9600/cerrarActas/" + id);
        put.setHeader(Secured.AUTH_TOKEN_HEADER, Http.Context.current().request().username());
        HttpResponse response = new DefaultHttpClient().execute(put);
        JsonNode expediente = mapper.readTree(response.getEntity().getContent());
        System.out.println(" - Cerra Actas PUT: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());
        log.info(" - Cerrar Actas PUT: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());
        return Json.fromJson(expediente, Integer.class);
    }

    @Override
    public List<Alumno> obtenerListaIdGet(Integer id) throws Exception {
        HttpGet get = new HttpGet("http://localhost:9600/obtenerLista/" + id);
        get.setHeader(Secured.AUTH_TOKEN_HEADER, Http.Context.current().request().username());
        HttpResponse response = new DefaultHttpClient().execute(get);
        JsonNode expediente = mapper.readTree(response.getEntity().getContent());
        System.out.println(" - Ver Lista Alumno GET: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());
        log.info(" - Ver Lista Alumno GET: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());
        return Json.fromJson(expediente, List.class);
    }

    @Override
    public Integer subirNotasIdPut(Integer id, List<Alumno> alumnos) throws Exception {
        HttpPut put = new HttpPut("http://localhost:9600/subirNotas/" + id);
        put.setHeader(Secured.AUTH_TOKEN_HEADER, Http.Context.current().request().username());
        put.addHeader("Content-Type", "application/json");
        put.setEntity(new StringEntity(Json.toJson(alumnos).toString()));
        HttpResponse response = new DefaultHttpClient().execute(put);
        JsonNode expediente = mapper.readTree(response.getEntity().getContent());
        System.out.println(" - Subir Notas PUT: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());
        log.info(" - Subir Notas PUT: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());
        return Json.fromJson(expediente, Integer.class);
    }

}
