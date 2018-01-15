package controllers.economicaMatricula;


import com.fasterxml.jackson.databind.ObjectMapper;
import controllers.authentificacion.Secured;
import play.mvc.Http;
import javax.validation.constraints.*;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import play.Logger;
import play.libs.Json;
import services.PagosApiControllerImpInterface;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T02:07:38.372Z")

public class PagosApiControllerImp implements PagosApiControllerImpInterface {
    
    /**
     * Declaracion de atributos globales.
     */
    protected Logger.ALogger log = Logger.of(this.getClass());
    protected final ObjectMapper mapper = new ObjectMapper();
    
    @Override
    public void actualizarPagoPut( @NotNull Integer promocion,  @NotNull String alumno,  @NotNull Integer numeroPago) throws Exception {
        HttpPut put = new HttpPut("http://localhost:9500/actualizarPago?Promocion=" + promocion);
        put.setHeader(Secured.AUTH_TOKEN_HEADER, Http.Context.current().request().username());
        put.addHeader("Content-Type", "application/json");
        put.addHeader("Accept", "application/json");
        put.setEntity(new StringEntity(Json.toJson(alumno).toString()));
        HttpResponse response = new DefaultHttpClient().execute(put);
        //JsonNode expediente = mapper.readTree(response.getEntity().getContent());
        System.out.println(" - Actualizar Pagos PUT: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());
        log.info(" - Actualizar Pagos PUT: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());

    }

}
