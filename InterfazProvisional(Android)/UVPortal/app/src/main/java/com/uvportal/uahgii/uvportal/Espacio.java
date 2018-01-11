package com.uvportal.uahgii.uvportal;

/**
 * Created by Daniel on 10/01/2018.
 */

public class Espacio {

    private int codigo;
    private String nombre;
    private double precio;
    private int aforo;

    public Espacio(int codigo, String nombre, double precio, int aforo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.aforo = aforo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }
}
