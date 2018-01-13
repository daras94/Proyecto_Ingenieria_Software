/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.authentificacion;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Usuario;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import play.libs.Json;
import play.mvc.Http;
import play.mvc.Result;

/**
 *
 * @author david
 */
public class Secured extends play.mvc.Security.Authenticator {

    /**
     * Declaracion de variables globales.
     */
    public static final String AUTH_TOKEN_HEADER = "X-AUTH-TOKEN";
    public static final String AUTH_TOKEN = "authToken";
    protected volatile boolean isAuthentification = false;
    protected play.Logger.ALogger log = play.Logger.of(this.getClass());

    @Override
    public String getUsername(Http.Context ctx) {
        try {
            HttpResponse response = validateAuth(ctx.request().cookie(AUTH_TOKEN).value());
            System.out.println(" - Token-Validate GET: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " +response.getStatusLine().getReasonPhrase());
            log.info(" - Token-Validate GET: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " +response.getStatusLine().getReasonPhrase());
            JsonNode auth = new ObjectMapper().readTree(response.getEntity().getContent());
            Boolean isAuth = Json.fromJson(auth, Boolean.class);
            if (isAuth) {
                ctx.session().put(AUTH_TOKEN, response.getHeaders(AUTH_TOKEN_HEADER)[0].getValue());
                isAuthentification = isAuth;
            }
        } catch (IOException ex) {
            Logger.getLogger(Secured.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (isAuthentification)? ctx.session().get(AUTH_TOKEN) : null;
    }

    @Override
    public Result onUnauthorized(Http.Context context) {
        return unauthorized("").withHeader(AUTH_TOKEN_HEADER, "");
    }

    protected HttpResponse validateAuth(String auhtoken) throws IOException {
        System.out.println(auhtoken);
        HttpGet get = new HttpGet("http://localhost:9300/token?authtokent=" + auhtoken);
        get.setHeader(AUTH_TOKEN_HEADER, auhtoken);
        return new DefaultHttpClient().execute(get);
    }
}
