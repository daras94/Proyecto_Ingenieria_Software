/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.authentificacion;

import play.data.validation.Constraints.Required;

/**
 *
 * @author david
 */
public class LoginForm {

    /**
     * Variables globales.
     */
    @Required
    public String nif;
    @Required
    public String password;

    @Override
    public String toString() {
        return "LoginForm{" + "nif=" + nif + ", password=" + password + '}';
    }
}
