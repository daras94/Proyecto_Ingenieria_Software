package controllers.ms_gestion_autentificacion;

import services.GestionDeAuthentificacionApiControllerImpInterface;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-05T21:31:07.061Z")

public class GestionDeAuthentificacionApiControllerImp implements GestionDeAuthentificacionApiControllerImpInterface {

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
    public void logoutUser() throws Exception {

    }

}
