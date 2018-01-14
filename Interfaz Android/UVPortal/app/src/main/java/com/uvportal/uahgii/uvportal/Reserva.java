package com.uvportal.uahgii.uvportal;

/**
 * Created by Daniel on 10/01/2018.
 */

public class Reserva {

    private int espacio;
    private String fecha;
    private int hora;
    private String nif;

    public Reserva(int espacio, String fecha, int hora, String nif) {
        this.espacio = espacio;
        this.fecha = fecha;
        this.hora = hora;
        this.nif = nif;
    }

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
}
