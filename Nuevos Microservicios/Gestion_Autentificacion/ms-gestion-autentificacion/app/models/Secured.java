/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controllers.routes;
import play.mvc.Http;
import play.mvc.Result;
import static play.mvc.Results.redirect;

/**
 *
 * @author david
 */
public class Secured extends play.mvc.Security.Authenticator {

   
    
    @Override
    public String getUsername(Http.Context ctx) {
        String user = ctx.session().get("nif");
        System.out.println(" 1º) -------> " + user + " ->{ Authorized User }");
        return user;
    }

    @Override
    public Result onUnauthorized(Http.Context context) {
        return redirect(routes.GestionDeAuthentificacionApiController.loginUserInit());
    }

    public static String getUser(Http.Context ctx) {
        return ctx.session().get("nif");
    }

    public static boolean isLoggedIn(Http.Context ctx) {
        return (getUser(ctx) != null);
    }

    public static Usuario getUserInfo(Http.Context ctx) {
        return (isLoggedIn(ctx)? UsuarioDB.getUser(getUser(ctx)) : null);
    }    
}
