/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.authentificacion;

import java.util.HashMap;
import java.util.Map;
import models.Usuario;

/**
 *
 * @author david
 */
public class UsuarioDB {

    protected static Map<String, Usuario> userinfos = new HashMap<String, Usuario>();
   
    public static void addUserInfo(final Usuario user) {
        userinfos.put(user.getAuthTokent(), user);
    }

    public static boolean deletUser(final String authToken) {
        boolean isUser = (authToken != null) && userinfos.containsKey(authToken);
        if (isUser) {
            userinfos.remove(authToken, userinfos.get(authToken));
        } 
        return isUser;
    }

    public static Usuario getUser(final String authToken) {
        boolean isUser = (authToken != null) && userinfos.containsKey(authToken);
        return (isUser)? userinfos.get(authToken) : null;
    }
    
    public static boolean isAuth(final String authToken){
        return  (authToken != null) && userinfos.containsKey(authToken);
    }
}
