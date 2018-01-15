package controllers;

import controllers.authentificacion.Secured;
import models.Usuario;
import play.mvc.*;

import views.html.*;
import views.html.auth.*;
import views.html.operation.*;

/**
 * This controller contains an action to handle HTTP requests to the
 * application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message. The
     * configuration in the <code>routes</code> file means that this method will
     * be called when the application receives a <code>GET</code> request with a
     * path of <code>/</code>.
     *
     * @return
     */
    @Security.Authenticated(Secured.class)
    public Result index() {
        try {
            String titlePage = "UV : ";
            Usuario user = Secured.getUserInfo(ctx());
            switch (user.getTipoUser()) {
                case "ALUMNO":
                    titlePage += "Dashboard Alumno";
                    return redirect(routes.HomeAlumno.alumno());
                case "ADMIN":
                    titlePage += "Dashboard Administrador";
                    break;
                case "PROFESOR":
                    titlePage += "Dashboard Profesor";
                    break;
            }
            return ok(index.render(titlePage, Secured.isLoggedIn(ctx()), user, user.getTipoUser()));
        } catch(NullPointerException ex){
            return ok();
        }
    }

    @Security.Authenticated(Secured.class)
    public Result registro() {
        return ok(registro.render("UV: Registro de Usuario.", Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx())));
    }

}
