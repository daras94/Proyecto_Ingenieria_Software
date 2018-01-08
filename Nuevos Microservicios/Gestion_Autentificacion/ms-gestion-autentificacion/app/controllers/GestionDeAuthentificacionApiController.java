package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.mvc.Controller;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import models.LoginForm;
import models.Usuario;
import play.mvc.Security;
import play.data.Form;
import views.html.*;
import play.mvc.Http;
import swagger.SwaggerUtils.ApiAction;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-02T17:03:41.435Z")

public class GestionDeAuthentificacionApiController extends Controller {

    private final GestionDeAuthentificacionApiControllerImp imp;
    private final ObjectMapper mapper;
    /**
     * Atributos de cabecera para tokents.
     */
    public final static String AUTH_TOKEN_HEADER = "X-AUTH-TOKEN";
    public static final String AUTH_TOKEN = "authToken";
    

    @Inject
    private GestionDeAuthentificacionApiController(GestionDeAuthentificacionApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }

    @ApiAction
    public Result loginUser() throws Exception {
        Form<LoginForm> loginForm = Form.form(LoginForm.class).bindFromRequest();
        if (loginForm.hasErrors()) {
            return badRequest(loginForm.errorsAsJson());
        } else {
            Usuario user = imp.loginUser(loginForm.get().nif, loginForm.get().password);
            if(user != null) {
                String authTokent = user.getAuthTokent();
                session().clear();
                session("nif", loginForm.get().nif);
                response().setCookie(Http.Cookie.builder(AUTH_TOKEN, authTokent).withSecure(ctx().request().secure()).build());
                
            }
            return (user == null)? unauthorized() : ok((JsonNode)mapper.valueToTree(user));
        }
    }

    @ApiAction
    @Security.Authenticated(Secured.class)
    public Result logoutUser() throws Exception {
        if (Secured.isLoggedIn(ctx())) {
            imp.logoutUser();
            session().clear();
        }
        return ok();
        //return redirect(routes.GestionDeAuthentificacionApiController.loginUserInit());
    }

}
