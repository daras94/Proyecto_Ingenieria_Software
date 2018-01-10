package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import models.LoginForm;
import models.Secured;
import play.mvc.Security;
import play.data.Form;
import views.html.*;
import swagger.SwaggerUtils.ApiAction;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-02T17:03:41.435Z")

public class GestionDeAuthentificacionApiController extends Controller {

    private final GestionDeAuthentificacionApiControllerImp imp;
    

    @Inject
    private GestionDeAuthentificacionApiController(GestionDeAuthentificacionApiControllerImp imp) {
        this.imp = imp;
    }

    @ApiAction
    public Result loginUserInit() throws Exception {
        Form<LoginForm> loginForm = Form.form(LoginForm.class).bindFromRequest();
        return ok(login.render("UV : Iniciar Sesion", loginForm, Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx())));
    }

    @ApiAction
    public Result loginUser() throws Exception {
        Form<LoginForm> loginForm = Form.form(LoginForm.class).bindFromRequest();
        if (loginForm.hasErrors()) {
            flash("error", "Error: La contraseña/usuarios no son correctos.");
            return badRequest(login.render("UV : Inicio Session.", loginForm, Secured.isLoggedIn(ctx()), Secured.getUserInfo(ctx())));
        } else {
            imp.loginUser(loginForm.get().nif, loginForm.get().password);
            session().clear();
            session("nif", loginForm.get().nif);
            return redirect(routes.HomeController.index());
        }
    }

    @ApiAction
    @Security.Authenticated(Secured.class)
    public Result logoutUser() throws Exception {
        if (Secured.isLoggedIn(ctx())) {
            imp.logoutUser();
            session().clear();
        }
        return redirect(routes.GestionDeAuthentificacionApiController.loginUserInit());
    }

}
