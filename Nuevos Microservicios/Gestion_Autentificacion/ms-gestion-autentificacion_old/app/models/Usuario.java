/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

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
    private String password;
    private String tipo_user;

    public Usuario(String name, String email, String password, String tipo_user) {
        this.name = name;
        this.nif = email;
        this.password = password;
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
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
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
        return "Usuario{" + "name=" + name + ", email=" + nif + ", password=" + password + ", tipo_user=" + tipo_user + '}';
    }
    
    
    
}
