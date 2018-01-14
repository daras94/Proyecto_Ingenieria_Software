/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.Usuario;
import models.UsuarioDB;
import play.Logger;
import play.mvc.Http;
import play.mvc.Result;

/**
 *
 * @author david
 */
public class Secured extends play.mvc.Security.Authenticator {
    
    protected Logger.ALogger log = Logger.of(this.getClass());
    public final static String AUTH_TOKEN_HEADER = "X-AUTH-TOKEN";
    public static final String AUTH_TOKEN = "authToken";
    
    @Override
    public String getUsername(Http.Context ctx) {
        String[] authTokenHeader = ctx.request().headers().get(AUTH_TOKEN_HEADER);
        if ((authTokenHeader != null) && (authTokenHeader.length == 1) && (authTokenHeader[0] != null)) {
            Usuario user = UsuarioDB.getUser(authTokenHeader[0]);
            if (user != null) {
                ctx.session().put(user.getAuthTokent(), user.getAuthTokent());
                log.info(" - TokentAuth: " + authTokenHeader[0] + " Authorice ----> " + user.toString());
                return user.getNif();
            }
        }
        log.info(" - TokentAuth: " + authTokenHeader[0] + " No authorice ----> 401");
        return null;
    }

    @Override
    public Result onUnauthorized(Http.Context context) {
        return unauthorized("401 o Autorizado").withHeader(AUTH_TOKEN_HEADER, "");
    }

    /*public static Usuario getUser(Http.Context ctx) {
        return (Usuario)ctx.args.get("user");
    }

    public static boolean isLoggedIn(Http.Context ctx) {
        return (getUser(ctx) != null);
    }

    public static Usuario getUserInfo(Http.Context ctx) {
        return (isLoggedIn(ctx)? UsuarioDB.getUser(getUser(ctx).getNif()) : null);
    }*/
}
