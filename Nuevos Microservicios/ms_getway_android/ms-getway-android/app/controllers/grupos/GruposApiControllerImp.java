package controllers.grupos;

import apimodels.GrupoG;
import apimodels.InfoGrupo;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import controllers.authentificacion.Secured;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import javax.validation.constraints.*;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import play.Logger;
import play.libs.Json;
import services.GruposApiController1ImpInterface;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T17:20:16.009Z")

public class GruposApiControllerImp implements GruposApiController1ImpInterface {

    /**
     * Declaracion de atributos globales.
     */
    protected Logger.ALogger log = Logger.of(this.getClass());
    protected final ObjectMapper mapper = new ObjectMapper();

    @Override
    public List<GrupoG> getGruposGet() throws Exception {
        HttpGet get = new HttpGet("http://localhost:9700/getGrupos");
        get.setHeader(Secured.AUTH_TOKEN_HEADER, Http.Context.current().request().username());
        HttpResponse response = new DefaultHttpClient().execute(get);
        JsonNode expediente = mapper.readTree(response.getEntity().getContent());
        System.out.println(" - Lista Grupos GET: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());
        log.info(" - Lista Grupos GET: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());
        return Json.fromJson(expediente, List.class);
    }

    @Override
    public List<InfoGrupo> getInfoGrupoGet(@NotNull String NIF) throws Exception {
        HttpGet get = new HttpGet("http://localhost:9700/getInfoGrupos/" + NIF);
        get.setHeader(Secured.AUTH_TOKEN_HEADER, Http.Context.current().request().username());
        HttpResponse response = new DefaultHttpClient().execute(get);
        JsonNode expediente = mapper.readTree(response.getEntity().getContent());
        System.out.println(" - Info Grupos GET: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());
        log.info(" - Info Grupos GET: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());
        return Json.fromJson(expediente, List.class);
    }

    @Override
    public void postGrupoAsignadoPost(@NotNull String profesor, @NotNull Integer grupo) throws Exception {
        HttpPost post = new HttpPost("http://localhost:9700/postGrupoAsignado");
        List<NameValuePair> urlParameters = new ArrayList<>();
        urlParameters.add(new BasicNameValuePair("profesor", profesor));
        urlParameters.add(new BasicNameValuePair("grupo", grupo.toString()));
        post.setEntity(new UrlEncodedFormEntity(urlParameters));
        post.setHeader(Secured.AUTH_TOKEN_HEADER, Http.Context.current().request().username());
        HttpResponse response = new DefaultHttpClient().execute(post);
        System.out.println(" - Grupos Asignados POST: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " +response.getStatusLine().getReasonPhrase());
        log.info(" - Grupos Asignados POST: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " +response.getStatusLine().getReasonPhrase());    

    }

}
