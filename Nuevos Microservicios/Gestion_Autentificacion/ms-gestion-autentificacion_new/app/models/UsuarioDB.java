/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author david
 */
public class UsuarioDB {

    private static Map<String, Usuario> userinfos = new HashMap<String, Usuario>();

    public static String addUserInfo(Usuario user) {
        userinfos.put(user.createAuthTokent(), user);
        return user.getAuthTokent();
    }

    public static void deletUser(String nif) {
        userinfos.remove(getUser(nif));
    }

    public static boolean isUser(String nif) {
        return userinfos.containsKey(nif);
    }

    public static Usuario getUser(String nif) {
        return userinfos.get((nif == null) ? null : nif);
    }

   /*public static boolean isValid(String nif, String password) {
        boolean isUser = false;
        if ((nif != null) && (password != null)) {
            Usuario user = getUser(nif);
            isUser = user.getNif().equals(nif) && user.getPassword().equals(password);
        }
        return isUser;
    }*/
}
