package controllers;

import models.Usuario;
import play.mvc.*;
import static play.mvc.Controller.ctx;
import play.mvc.Security;
import swagger.SwaggerUtils;

import views.html.*;
import views.html.auth.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     * @return 
     */
    @Security.Authenticated(Secured.class)
    public Result index() {
        Usuario user = controllers.Secured.getUserInfo(ctx());
        String titlePage = "UV : ";
        switch(user.getTipo_user()){
            case "ROLE_USUARIO":
                titlePage += "Dashboard Alumno";
                break;
            case "ROLE_ADMIN":
                titlePage += "Dashboard Administrador";
                break;
            case "ROLE_PROFESOR":
                titlePage += "Dashboard Profesor";
                break;
        }
        return ok(index.render(titlePage, controllers.Secured.isLoggedIn(ctx()), user, user.getTipo_user()));
    }
    
    public Result registro(){
        return ok(registro.render("UV: Registro de Usuario.", controllers.Secured.isLoggedIn(ctx()), controllers.Secured.getUserInfo(ctx())));
    }
}