package controllers.reservas;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import controllers.authentificacion.Secured;
import models.Reserva;

import play.mvc.Http;
import java.util.List;
import javax.validation.constraints.*;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import play.Logger;
import play.libs.Json;
import services.GestionReservasApiControllerImpInterface;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T00:24:22.734Z")

public class GestionReservasApiControllerImp implements GestionReservasApiControllerImpInterface {
    
    /**
     * Declaracion de atributos globales.
     */
    protected Logger.ALogger log = Logger.of(this.getClass());
    protected final ObjectMapper mapper = new ObjectMapper();
    
    @Override
    public void reservasActualizarPut( @NotNull String dia,  @NotNull Integer hora,  @NotNull Integer espacio, Reserva reserva) throws Exception {
        HttpPut put = new HttpPut("http://localhost:9400/reservas/actualizar?dia=" + dia + "&hora=" + hora + "&espacio=" + espacio);
        put.setHeader(Secured.AUTH_TOKEN_HEADER, Http.Context.current().request().username());
        put.addHeader("Content-Type", "application/json");
        put.addHeader("Accept", "application/json");
        put.setEntity(new StringEntity(Json.toJson(reserva).toString()));
        HttpResponse response = new DefaultHttpClient().execute(put);
        System.out.println(" - Actualizar Reservas PUT: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());
        log.info(" - Actualizar Reservas PUT: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());
    }

    @Override
    public void reservasCancelarDelete( @NotNull String dia,  @NotNull Integer hora,  @NotNull Integer espacio) throws Exception {
        HttpDelete delete = new HttpDelete("http://localhost:9400/reservas/cancelar?dia=" + dia + "&hora=" + hora + "&espacio=" + espacio);
        delete.setHeader(Secured.AUTH_TOKEN_HEADER, Http.Context.current().request().username());
        HttpResponse response = new DefaultHttpClient().execute(delete);
        System.out.println(" - Cancelar Reserva DELETE: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());
        log.info(" - Cancelar Reserva DELETE: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());        
    }

    @Override
    public void reservasReservarPost(Reserva reserva) throws Exception {
        HttpPost post  = new HttpPost("http://localhost:9400/reservas/reservar");
        post.setHeader(Secured.AUTH_TOKEN_HEADER, Http.Context.current().request().username());
        post.setEntity(new StringEntity(Json.toJson(reserva).toString()));
        HttpResponse response = new DefaultHttpClient().execute(post);
        System.out.println(" - Dar de Alta Alumno POST: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " +response.getStatusLine().getReasonPhrase());
        log.info(" - Dar de Alta Alumno POST: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " +response.getStatusLine().getReasonPhrase());     
    }
    
    @Override
    public List<Reserva> reservasNifGet(String nif) throws Exception {
        HttpGet get  = new HttpGet("http://localhost:9400/reservas/" + nif);
        get.setHeader(Secured.AUTH_TOKEN_HEADER, Http.Context.current().request().username());
        HttpResponse response = new DefaultHttpClient().execute(get);
        JsonNode expediente = mapper.readTree(response.getEntity().getContent());
        System.out.println(" - Reservar con NIF GET: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " +response.getStatusLine().getReasonPhrase());
        log.info(" - Reservar con NIF GET: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " +response.getStatusLine().getReasonPhrase());
        return Json.fromJson(expediente, List.class);
    }

}
