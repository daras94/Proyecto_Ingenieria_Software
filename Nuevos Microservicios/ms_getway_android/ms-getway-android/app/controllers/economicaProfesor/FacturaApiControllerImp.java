package controllers.economicaProfesor;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import controllers.authentificacion.Secured;
import models.Factura;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import play.Logger;
import play.libs.Json;
import services.FacturaApiControllerImpInterface;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T00:24:22.734Z")

public class FacturaApiControllerImp implements FacturaApiControllerImpInterface {
    
    /**
     * Declaracion de atributos globales.
     */
    protected Logger.ALogger log = Logger.of(this.getClass());
    protected final ObjectMapper mapper = new ObjectMapper();
    
    @Override
    public List<Factura> facturasGet( @NotNull String NIF,  @NotNull Integer mes,  @NotNull Integer ao) throws Exception {
        HttpGet get = new HttpGet("http://localhost:9700/facturas?NIF=" + NIF + "&Mes=" + mes + "&Año=" + ao);
        get.setHeader(Secured.AUTH_TOKEN_HEADER, Http.Context.current().request().username());
        get.addHeader("Content-Type", "application/json");
        HttpResponse response = new DefaultHttpClient().execute(get);
        JsonNode expediente = mapper.readTree(response.getEntity().getContent());
        System.out.println(" - Factura GET: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());
        log.info(" - Factura GET: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());
        return Json.fromJson(expediente, List.class);
    }

}
