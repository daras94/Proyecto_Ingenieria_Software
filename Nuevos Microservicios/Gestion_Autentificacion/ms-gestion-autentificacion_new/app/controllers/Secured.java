/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.Usuario;
import models.UsuarioDB;
import play.mvc.Http;
import play.mvc.Result;

/**
 *
 * @author david
 */
public class Secured extends play.mvc.Security.Authenticator {

    protected Usuario user;
    
    @Override
    public String getUsername(Http.Context ctx) {
        String[] authTokenHeaderValues = ctx.request().headers().get(GestionDeAuthentificacionApiController.AUTH_TOKEN_HEADER);
        System.err.println(authTokenHeaderValues);
        if ((authTokenHeaderValues != null) && (authTokenHeaderValues.length == 1) && (authTokenHeaderValues[0] != null)) {
            this.user = UsuarioDB.getUser(authTokenHeaderValues[0]);
            System.out.println(user);
            if (user != null) {
                ctx.args.put("user", user);
            }
        }
        return (user != null)? user.getNif() : null;
        //return ctx.session().get("nif");
    }

    @Override
    public Result onUnauthorized(Http.Context context) {
        return unauthorized();
    }

    public static Usuario getUser(Http.Context ctx) {
        return (Usuario)ctx.args.get("user");
    }

    public static boolean isLoggedIn(Http.Context ctx) {
        return (getUser(ctx) != null);
    }

    public static Usuario getUserInfo(Http.Context ctx) {
        return (isLoggedIn(ctx)? UsuarioDB.getUser(getUser(ctx).getNif()) : null);
    }    
}
