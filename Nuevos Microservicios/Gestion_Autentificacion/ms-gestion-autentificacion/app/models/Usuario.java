/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.UUID;

/**
 *
 * @author david
 */
public class Usuario {

    /**
     * Variable Global
     */
    private String name;
    private String nif;
    private String tipo_user;
    private String authTokent;

    public Usuario(String name, String nif, String tipo_user) {
        this.name = name;
        this.nif = nif;
        this.tipo_user = tipo_user;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the nif
     */
    public String getNif() {
        return nif;
    }

    /**
     * @param nif the nif to set
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     * @return the tipo_user
     */
    public String getTipo_user() {
        return tipo_user;
    }

    /**
     * @param tipo_user the tipo_user to set
     */
    public void setTipo_user(String tipo_user) {
        this.tipo_user = tipo_user;
    }

    @Override
    public String toString() {
        return "Usuario{" + "name=" + name + ", email=" + nif + ", authTokent=" + getAuthTokent() + ", tipo_user=" + tipo_user + '}';
    }

    /**
     * @return the authTokent
     */
    public String createAuthTokent() {
        return (authTokent = UUID.randomUUID().toString());
    }
    
    /**
     * Boorra el tokent de authentificacion.
     */
    public void deleteAuthTokent() {
        this.authTokent = null;
    }

    /**
     * @return the authTokent
     */
    public String getAuthTokent() {
        return authTokent;
    }
}
