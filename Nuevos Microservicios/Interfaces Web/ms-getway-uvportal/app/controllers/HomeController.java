package controllers;

import controllers.ms_gestion_autentificacion.Secured;
import models.Usuario;
import play.mvc.*;

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
        Usuario user = Secured.getUserInfo(ctx());
        String titlePage = "UV : ";
        switch(user.getTipoUser()){
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
        return ok(index.render(titlePage, controllers.ms_gestion_autentificacion.Secured.isLoggedIn(ctx()), user, user.getTipoUser()));
    }
    
    public Result registro(){
        return ok(registro.render("UV: Registro de Usuario.", controllers.ms_gestion_autentificacion.Secured.isLoggedIn(ctx()), controllers.ms_gestion_autentificacion.Secured.getUserInfo(ctx())));
    }

}
