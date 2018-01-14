package controllers.authentificacion;


import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.IOException;
import swagger.SwaggerUtils;
import com.fasterxml.jackson.core.type.TypeReference;
import javax.servlet.http.Cookie;

import javax.validation.constraints.*;
import models.Usuario;
import org.apache.http.HttpResponse;
import play.libs.Json;
import static play.mvc.Controller.request;
import static play.mvc.Results.ok;
import play.mvc.Security;

import swagger.SwaggerUtils.ApiAction;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T00:24:22.734Z")

public class AuthentificacionApiController extends Controller {

    private final AuthentificacionApiControllerImp imp;
    private final ObjectMapper mapper;
    /**
     * Atributos de cabecera para tokents y cookie.
     */
    protected Http.Cookie cookie;

    @Inject
    private AuthentificacionApiController(AuthentificacionApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }
    
    @ApiAction
    public Result loginUser() throws Exception {
        String nif = request().getQueryString("nif");
        String password = request().getQueryString("password");
        Usuario obj = imp.loginUser(nif, password);
        cookie = Http.Cookie.builder(Secured.AUTH_TOKEN, obj.getAuthTokent()).withSecure(ctx().request().secure()).build();
        return ok((JsonNode)mapper.valueToTree(obj)).withHeader(Secured.AUTH_TOKEN_HEADER, obj.getAuthTokent()).withCookies(cookie);
        
    }

    @ApiAction
    @Security.Authenticated(Secured.class)
    public Result logoutUser() throws Exception {
        String tokenUser = request().getQueryString("tokenUser");
        HttpResponse response = imp.logoutUser(tokenUser);
        JsonNode result = mapper.readTree(response.getEntity().getContent());
        if(response.getStatusLine().getStatusCode() == 401){
            return unauthorized(result);
        }
        return (Json.fromJson(result, Boolean.class))? ok(result) :  badRequest(result);
    }
}
