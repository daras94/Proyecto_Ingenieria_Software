package controllers.matricula;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import controllers.authentificacion.Secured;
import models.CreditosAlumno;

import play.mvc.Http;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import play.Logger;
import play.libs.Json;
import services.CreditosAlumnoApiControllerImpInterface;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T00:24:22.734Z")

public class CreditosAlumnoApiControllerImp implements CreditosAlumnoApiControllerImpInterface {
    
    /**
     * Declaracion de atributos globales.
     */
    protected Logger.ALogger log = Logger.of(this.getClass());
    protected final ObjectMapper mapper = new ObjectMapper();
    
    @Override
    public CreditosAlumno creditosalumnoNumeroExpedienteGet(Integer numeroExpediente) throws Exception {
        HttpGet get  = new HttpGet("http://localhost:9200/creditosalumno/" + numeroExpediente);
        get.setHeader(Secured.AUTH_TOKEN_HEADER, Http.Context.current().request().username());
        HttpResponse response = new DefaultHttpClient().execute(get);
        JsonNode reditos = mapper.readTree(response.getEntity().getContent());
        System.out.println(" - Nº Creditos Alumno GET: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " +response.getStatusLine().getReasonPhrase());
        log.info(" - Nº Creditos Alumno GET: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " +response.getStatusLine().getReasonPhrase());
        return Json.fromJson(reditos, CreditosAlumno.class);
    }

}
