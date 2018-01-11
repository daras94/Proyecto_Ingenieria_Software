/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.ms_gestion_autentificacion;

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
        String[] authTokenHeaderValues = ctx.request().headers().get("Cookie");
        if ((authTokenHeaderValues != null) && (authTokenHeaderValues.length == 1) && (authTokenHeaderValues[0] != null)) {
            this.user = UsuarioDB.getUser(authTokenHeaderValues[0].substring(authTokenHeaderValues[0].indexOf("authToken=")+10, authTokenHeaderValues[0].length()));
            if (user != null) {
                if (ctx.args.get("user") != null){
                    ctx.args.put("user", user);
                    ctx.session().put("nif", user.getNif());
                }
                return user.getNif();
            }
        }
        return (user != null)? user.getNif() : null;
    }

    @Override
    public Result onUnauthorized(Http.Context context) {
        return redirect(routes.GestionDeAuthentificacionApiController.loginUser());
    }

    public static Usuario getUser(Http.Context ctx) {
        return (Usuario)ctx.args.get("user");
    }

    public static boolean isLoggedIn(Http.Context ctx) {
        return (getUser(ctx) != null);
    }

    public static Usuario getUserInfo(Http.Context ctx) {
        return (isLoggedIn(ctx)? UsuarioDB.getUser(getUser(ctx).getAuthTokent()) : null);
    }    
}
