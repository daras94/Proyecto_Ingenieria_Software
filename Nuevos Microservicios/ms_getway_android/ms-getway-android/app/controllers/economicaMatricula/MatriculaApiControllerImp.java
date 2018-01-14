package controllers.economicaMatricula;

import com.fasterxml.jackson.databind.ObjectMapper;
import controllers.authentificacion.Secured;
import play.mvc.Http;
import javax.validation.constraints.*;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import play.Logger;
import play.libs.Json;
import services.MatriculaApiControllerImpInterface;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T02:07:38.372Z")

public class MatriculaApiControllerImp implements MatriculaApiControllerImpInterface {

    /**
     * Declaracion de atributos globales.
     */
    protected Logger.ALogger log = Logger.of(this.getClass());
    protected final ObjectMapper mapper = new ObjectMapper();

    @Override
    public void eliminarMatriculasDelete(@NotNull Integer promocion) throws Exception {
        HttpDelete delete = new HttpDelete("http://localhost:9500/eliminarMatriculas?Promocion=" + promocion);
        delete.setHeader(Secured.AUTH_TOKEN_HEADER, Http.Context.current().request().username());
        HttpResponse response = new DefaultHttpClient().execute(delete);
        //JsonNode expediente = mapper.readTree(response.getEntity().getContent());
        System.out.println(" - Borrar Matricula DELETE: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());
        log.info(" - Borrar Matricula DELETE: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());
    }

    @Override
    public void eliminarMatriculasPorPlazoDelete(@NotNull Integer promocion, @NotNull Integer numPago) throws Exception {
        HttpDelete delete = new HttpDelete("http://localhost:9500/eliminarMatriculasPorPlazo?Promocion=" + promocion + "&numPago=" +numPago);
        delete.setHeader(Secured.AUTH_TOKEN_HEADER, Http.Context.current().request().username());
        HttpResponse response = new DefaultHttpClient().execute(delete);
        //JsonNode expediente = mapper.readTree(response.getEntity().getContent());
        System.out.println(" - Borrar Matricula por Plazo DELETE: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());
        log.info(" - Borrar Matricula por Palzo DELETE: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());

    }

    @Override
    public void reservaMatriculaPut(@NotNull Integer promocion, @NotNull String alumno) throws Exception {
        HttpPut put = new HttpPut("http://localhost:9500/reservaMatricula?Promocion=" + promocion);
        put.setHeader(Secured.AUTH_TOKEN_HEADER, Http.Context.current().request().username());
        put.addHeader("Content-Type", "application/json");
        put.addHeader("Accept", "application/json");
        put.setEntity(new StringEntity(Json.toJson(alumno).toString()));
        HttpResponse response = new DefaultHttpClient().execute(put);
        //JsonNode expediente = mapper.readTree(response.getEntity().getContent());
        System.out.println(" - Reservar Matricula PUT: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());
        log.info(" - Reservar Matricula PUT: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());
    }

}
