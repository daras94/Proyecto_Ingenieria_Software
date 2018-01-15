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
    public static volatile Usuario userAuth = null;
    protected static volatile boolean isAuthentification = false;
    protected play.Logger.ALogger log = play.Logger.of(this.getClass());

    @Override
    public String getUsername(Http.Context ctx) {
        try {
            final String tokenCookie = ctx.request().cookie(AUTH_TOKEN).value();
            HttpResponse response = validateAuth(tokenCookie);
            JsonNode auth = new ObjectMapper().readTree(response.getEntity().getContent());
            isAuthentification = Json.fromJson(auth, Boolean.class) && (userAuth != null)? userAuth.getAuthTokent().equals(tokenCookie) : Boolean.FALSE;
            if (isAuthentification) {
                ctx.session().put(AUTH_TOKEN, response.getHeaders(AUTH_TOKEN_HEADER)[0].getValue());
            }
            System.out.println(" - Token-Validate GET: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " +response.getStatusLine().getReasonPhrase());
            log.info(" - Token-Validate GET: " + response.getStatusLine().getStatusCode() + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " +response.getStatusLine().getReasonPhrase());
        } catch (IOException | NullPointerException ex) {
            Logger.getLogger(Secured.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return (isAuthentification)? ctx.session().get(AUTH_TOKEN) : null;
    }

    @Override
    public Result onUnauthorized(Http.Context context) {
        return redirect(routes.AuthentificacionApiController.loginUserInit()).withHeader(AUTH_TOKEN_HEADER, "");
    }

    protected HttpResponse validateAuth(String auhtoken) throws IOException {
        HttpGet get = new HttpGet("http://localhost:9300/token?authtokent=" + auhtoken);
        get.setHeader(AUTH_TOKEN_HEADER, auhtoken);
        return new DefaultHttpClient().execute(get);
    }
    
    public static Usuario getUser(Http.Context ctx) {
        return userAuth;
    }

    public static boolean isLoggedIn(Http.Context ctx) {
        return isAuthentification;
    }

    public static Usuario getUserInfo(Http.Context ctx) {
        return (isLoggedIn(ctx) ? getUser(ctx) : null);
    }   
    
    public static void clearAuth(Http.Context ctx){
        userAuth = null;
        isAuthentification = false;
    }
    
}
