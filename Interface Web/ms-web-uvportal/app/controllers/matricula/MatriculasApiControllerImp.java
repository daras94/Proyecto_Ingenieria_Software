package controllers.matricula;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import controllers.authentificacion.Secured;
import models.Matricula;
import models.MatriculaAlta;

import play.mvc.Http;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.impl.client.DefaultHttpClient;
import play.Logger;
import play.libs.Json;
import services.MatriculasApiControllerImpInterface;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T00:24:22.734Z")

public class MatriculasApiControllerImp implements MatriculasApiControllerImpInterface {
    
    /**
     * Declaracion de atributos globales.
     */
    protected Logger.ALogger log = Logger.of(this.getClass());
    protected final ObjectMapper mapper = new ObjectMapper();
    
    @Override
    public void crearMatriculaNumeroExpedientePost(Integer numeroExpediente, MatriculaAlta grupos) throws Exception {
        HttpPost post  = new HttpPost("http://localhost:9200/crearMatricula/" + numeroExpediente);
        post.setHeader(Secured.AUTH_TOKEN_HEADER, Http.Context.current().request().username());
        HttpResponse response = new DefaultHttpClient().execute(post);
        System.out.println(" - Crear Matricula POST: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " +response.getStatusLine().getReasonPhrase());
        log.info(" - Crear Matricula POST: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " +response.getStatusLine().getReasonPhrase());     
    }

    @Override
    public void realizarReservaNumeroExpedientePut(Integer numeroExpediente) throws Exception {
        HttpPut put = new HttpPut("http://localhost:9200/realizarReserva/" + numeroExpediente);
        put.setHeader(Secured.AUTH_TOKEN_HEADER, Http.Context.current().request().username());
        HttpResponse response = new DefaultHttpClient().execute(put);
        System.out.println(" - Reservar Matricula PUT: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " +response.getStatusLine().getReasonPhrase());
        log.info(" - Reservar Matricula PUT: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " +response.getStatusLine().getReasonPhrase());    
    }

    @Override
    public List<Matricula> verExpedienteNumeroExpedienteGet(Integer numeroExpediente) throws Exception {
        HttpGet get  = new HttpGet("http://localhost:9200/verExpediente/" + numeroExpediente);
        get.setHeader(Secured.AUTH_TOKEN_HEADER, Http.Context.current().request().username());
        HttpResponse response = new DefaultHttpClient().execute(get);
        JsonNode expediente = mapper.readTree(response.getEntity().getContent());
        System.out.println(" - Ver Expediente GET: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " +response.getStatusLine().getReasonPhrase());
        log.info(" - Ver Expediente GET: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " +response.getStatusLine().getReasonPhrase());
        return Json.fromJson(expediente, List.class);
    }

}
