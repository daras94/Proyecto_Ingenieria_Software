package controllers.economicaProfesor;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import controllers.authentificacion.Secured;
import models.Nomina;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
import models.Usuario;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import play.Logger;
import play.libs.Json;
import services.NominaApiControllerImpInterface;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T00:24:22.734Z")

public class NominaApiControllerImp implements NominaApiControllerImpInterface {
    
    /**
     * Declaracion de atributos globales.
     */
    protected Logger.ALogger log = Logger.of(this.getClass());
    protected final ObjectMapper mapper = new ObjectMapper();
    
    @Override
    public void nominaPost( @NotNull String NIF,  @NotNull String fecha) throws Exception {
        HttpPost post = new HttpPost("http://localhost:9700/nomina");
        List<NameValuePair> urlParameters = new ArrayList<>();
        urlParameters.add(new BasicNameValuePair("NIF", NIF));
        urlParameters.add(new BasicNameValuePair("fecha", fecha));
        post.addHeader("Content-Type", "application/json");
        post.addHeader("Accept", "application/json");
        post.setHeader(Secured.AUTH_TOKEN_HEADER, Http.Context.current().request().username());
        post.setEntity(new UrlEncodedFormEntity(urlParameters));
        HttpResponse response = new DefaultHttpClient().execute(post);
        System.out.println(" - Introducir Nomina POST: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " +response.getStatusLine().getReasonPhrase());
        log.info(" - Introducir Nomina POST: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " +response.getStatusLine().getReasonPhrase());
    }

    @Override
    public List<Nomina> nominasNIFGet(String NIF) throws Exception {
        HttpGet get = new HttpGet("http://localhost:9700/nominas/" + NIF);
        get.setHeader(Secured.AUTH_TOKEN_HEADER, Http.Context.current().request().username());
        HttpResponse response = new DefaultHttpClient().execute(get);
        JsonNode expediente = mapper.readTree(response.getEntity().getContent());
        System.out.println(" - Ver Nomina GET: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());
        log.info(" - Ver Nomina GET: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());
        return Json.fromJson(expediente, List.class);
    }

}
