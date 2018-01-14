package com.uvportal.uahgii.uvportal;

/**
 * Created by Daniel on 10/01/2018.
 */

public class Usuario {

    private static String nif;

    private static  int expediente;

    public static String getNif() {
        return nif;
    }

    public static void setNif(String nif) {
        Usuario.nif = nif;
    }

    public static int getExpediente() {
        return expediente;
    }

    public static void setExpediente(int expediente) {
        Usuario.expediente = expediente;
    }
}
