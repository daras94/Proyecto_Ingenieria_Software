package controllers.authentificacion;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
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
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import play.libs.Json;
import play.Logger;
import services.AuthentificacionApiControllerImpInterface;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T00:24:22.734Z")

public class AuthentificacionApiControllerImp implements AuthentificacionApiControllerImpInterface {
    
    /**
     * Declaracion de variables
     */
    protected Logger.ALogger log = Logger.of(this.getClass());
    protected final ObjectMapper mapper = new ObjectMapper();
    

    @Override
    public HttpResponse loginUser(@NotNull @Pattern(regexp = "^([0-9]{8}|[XYZ]{1}[0-9]{7})[TRWAGMYFPDXBNJZSQVHLCKET]{1}$") @Size(min = 9, max = 9) String nif, @NotNull String password) throws Exception {
        HttpPost post = new HttpPost("http://localhost:9300/login");
        List<NameValuePair> urlParameters = new ArrayList<>();
        urlParameters.add(new BasicNameValuePair("nif", nif));
        urlParameters.add(new BasicNameValuePair("password", password));
        post.setEntity(new UrlEncodedFormEntity(urlParameters));
        return new DefaultHttpClient().execute(post);
    }

    @Override
    public HttpResponse logoutUser(@NotNull String tokenUser) throws Exception {
        HttpPost post = new HttpPost("http://localhost:9300/logout");
        List<NameValuePair> urlParameters = new ArrayList<>();
        urlParameters.add(new BasicNameValuePair("tokenUser", tokenUser));
        post.setEntity(new UrlEncodedFormEntity(urlParameters));
        post.setHeader(Secured.AUTH_TOKEN_HEADER, tokenUser);
        return new DefaultHttpClient().execute(post);
    }

}
