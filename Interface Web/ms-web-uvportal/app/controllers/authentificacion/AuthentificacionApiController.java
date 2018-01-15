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
import play.Logger;
import play.data.Form;
import play.libs.Json;
import static play.mvc.Controller.ctx;
import static play.mvc.Controller.flash;
import static play.mvc.Controller.request;
import static play.mvc.Http.Status.BAD_REQUEST;
import static play.mvc.Results.badRequest;
import static play.mvc.Results.ok;
import static play.mvc.Results.redirect;
import play.mvc.Security;

import swagger.SwaggerUtils.ApiAction;
import views.html.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T00:24:22.734Z")

public class AuthentificacionApiController extends Controller {

    private final AuthentificacionApiControllerImp imp;
    private final ObjectMapper mapper;
    protected Logger.ALogger log = Logger.of(this.getClass());
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
    public Result loginUserInit() throws Exception {
        Form<LoginForm> loginForm = Form.form(LoginForm.class).bindFromRequest();
        return ok(login.render("UV : Iniciar Sesion", loginForm, Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx())));
    }

    @ApiAction
    public Result loginUser() throws Exception {
        Form<LoginForm> loginForm = Form.form(LoginForm.class).bindFromRequest();
        HttpResponse response = imp.loginUser(loginForm.get().nif, loginForm.get().password);
        final int statusCode = response.getStatusLine().getStatusCode();
        JsonNode auth = mapper.readTree(response.getEntity().getContent());
        System.out.println(auth.toString());
        System.out.println(" - Login POST: " + statusCode + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());
        log.info(" - Login POST: " + statusCode + ", Protocolo = " + response.getProtocolVersion().getProtocol() + ", Response: " + response.getStatusLine().getReasonPhrase());
        if (statusCode == BAD_REQUEST) {
            flash("error", "Error: La contraseña/usuarios no son correctos.");
            return badRequest(login.render("UV : Inicio Session.", loginForm, Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx())));
        } else {
            Secured.userAuth = Json.fromJson(auth, Usuario.class);
            cookie = Http.Cookie.builder(Secured.AUTH_TOKEN, Secured.userAuth.getAuthTokent()).withSecure(ctx().request().secure()).build();
            return redirect(controllers.routes.HomeController.index()).withHeader(Secured.AUTH_TOKEN_HEADER, Secured.userAuth.getAuthTokent()).withCookies(cookie);
        }
    }

    @ApiAction
    @Security.Authenticated(Secured.class)
    public Result logoutUser() throws Exception {
        final String tokenUser = Secured.userAuth.getAuthTokent();
        HttpResponse response = imp.logoutUser(tokenUser);
        //JsonNode result = mapper.readTree(response.getEntity().getContent());
        switch (response.getStatusLine().getStatusCode()) {
            case UNAUTHORIZED:
                return unauthorized();
            case BAD_REQUEST:
                return badRequest();
            case OK:
                Secured.clearAuth(ctx());
                session().clear();
                response().discardCookie(Secured.AUTH_TOKEN);
                cookie = null;
                break;
        }
        return redirect(routes.AuthentificacionApiController.loginUserInit());
    }
}
