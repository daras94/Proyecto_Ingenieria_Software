package controllers.matricula;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import controllers.authentificacion.Secured;
import models.GrupoAsignatura;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
import models.CreditosAlumno;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import play.Logger;
import play.libs.Json;
import services.GruposAsignaturasApiControllerImpInterface;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T00:24:22.734Z")

public class GruposAsignaturasApiControllerImp implements GruposAsignaturasApiControllerImpInterface {
    
    /**
     * Declaracion de atributos globales.
     */
    protected Logger.ALogger log = Logger.of(this.getClass());
    protected final ObjectMapper mapper = new ObjectMapper();
    
    @Override
    public List<GrupoAsignatura> asignaturasMatriculablesByAlumnoNumeroExpedienteGet(Integer numeroExpediente) throws Exception {
        HttpGet get  = new HttpGet("http://localhost:9200/asignaturasMatriculablesByAlumno/" + numeroExpediente);
        get.setHeader(Secured.AUTH_TOKEN_HEADER, Http.Context.current().request().username());
        HttpResponse response = new DefaultHttpClient().execute(get);
        JsonNode reditos = mapper.readTree(response.getEntity().getContent());
        System.out.println(" - Asignaturas Matriculadas Alumno GET: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " +response.getStatusLine().getReasonPhrase());
        log.info(" - Asignaturas Matriculadas Alumno GET: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " +response.getStatusLine().getReasonPhrase());
        return Json.fromJson(reditos, ArrayList.class);
    }

}
