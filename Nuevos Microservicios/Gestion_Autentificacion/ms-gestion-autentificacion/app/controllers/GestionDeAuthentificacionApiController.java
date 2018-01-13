package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.mvc.Controller;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import models.LoginForm;
import models.Usuario;
import models.UsuarioDB;
import play.mvc.Security;
import play.mvc.Http.Cookie;
import play.data.Form;
import static play.mvc.Controller.ctx;
import play.mvc.Http;
import swagger.SwaggerUtils.ApiAction;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-02T17:03:41.435Z")

public class GestionDeAuthentificacionApiController extends Controller {

    private final GestionDeAuthentificacionApiControllerImp imp;
    private final ObjectMapper mapper;
    /**
     * Atributos de cabecera para tokents y cookie.
     */
    protected Cookie cookie;
      

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
                session().clear();
                session().put(user.getAuthTokent(), user.getAuthTokent());
                session(user.getAuthTokent(), loginForm.get().nif);
                cookie = Http.Cookie.builder(Secured.AUTH_TOKEN, user.getAuthTokent()).withSecure(ctx().request().secure()).build();
            }
            return (user == null)? unauthorized() : ok((JsonNode)mapper.valueToTree(user)).withHeader(Secured.AUTH_TOKEN_HEADER, user.getAuthTokent()).withCookies(cookie);
        }
    }

    @ApiAction
    @Security.Authenticated(Secured.class)
    public Result logoutUser() throws Exception {
        Form<Token> tokenUser = Form.form(Token.class).bindFromRequest();
        Boolean isAuth = UsuarioDB.isAuth(tokenUser.get().tokenUser);
        if (isAuth) {
            session().clear();
            imp.logoutUser(tokenUser.get().tokenUser);
        }
        JsonNode result = mapper.valueToTree(isAuth);
        return (isAuth)? ok(result) :  badRequest(result);
    }
    
    @ApiAction
    @Security.Authenticated(Secured.class)
    public Result token() throws Exception {
        final String token = request().getQueryString("authtokent");
        Boolean isAuth = imp.token(token);
        System.out.println(" - TOKEN: " + token + " -------> AUTH: " + token);
        if (isAuth) {
            //session().put("nif", user);
        }
        JsonNode result = mapper.valueToTree(isAuth);
        return (isAuth)? ok(result).withHeader(Secured.AUTH_TOKEN_HEADER, token).withCookies(cookie) : unauthorized(result);
    }
    
    public static class Token {
        public String tokenUser;
    }

}
