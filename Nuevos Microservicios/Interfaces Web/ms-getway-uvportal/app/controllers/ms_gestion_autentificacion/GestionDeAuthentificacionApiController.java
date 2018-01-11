package controllers.ms_gestion_autentificacion;

import com.fasterxml.jackson.databind.JsonNode;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import models.Usuario;
import models.UsuarioDB;
import org.apache.http.HttpResponse;
import play.data.Form;
import play.libs.Json;

import static play.mvc.Controller.ctx;
import static play.mvc.Results.ok;
import static play.mvc.Results.redirect;

import views.html.*;

import swagger.SwaggerUtils.ApiAction;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-05T21:31:07.061Z")

public class GestionDeAuthentificacionApiController extends Controller {

    private final GestionDeAuthentificacionApiControllerImp imp;
    private final ObjectMapper mapper;
    /**
     * Tokents De authentificacion.
     */
    public final static String AUTH_TOKEN_HEADER = "X-AUTH-TOKEN";
    public static final String AUTH_TOKEN = "authToken";

    @Inject
    private GestionDeAuthentificacionApiController(GestionDeAuthentificacionApiControllerImp imp) {
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
        System.out.println("Status code Login : " + statusCode);
        JsonNode node = mapper.readTree(response.getEntity().getContent());
        Usuario user = Json.fromJson(node, Usuario.class);
        if (statusCode == BAD_REQUEST) {
            flash("error", "Error: La contraseña/usuarios no son correctos.");
            return badRequest(login.render("UV : Inicio Session.", loginForm, Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx())));
        } else {
            response().setCookie(Http.Cookie.builder(AUTH_TOKEN, user.getAuthTokent()).withSecure(ctx().request().secure()).build());
            UsuarioDB.addUserInfo(user);
            return redirect(controllers.routes.HomeController.index());
        }
    }

    @ApiAction
    public Result logoutUser() throws Exception {
        imp.logoutUser();

        return ok();
    }

}
