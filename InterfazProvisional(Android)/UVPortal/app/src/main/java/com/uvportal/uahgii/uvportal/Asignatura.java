package com.uvportal.uahgii.uvportal;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Daniel on 12/01/2018.
 */

class Asignatura {

    private int codigo;
    private String nombre;
    private int carrera;
    private String tipo;
    private int creditos;
    private double nota;

    public Asignatura(int codigo, String nombre, int carrera, String tipo, int creditos, double nota) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carrera = carrera;
        this.tipo = tipo;
        this.creditos = creditos;
        this.nota = nota;
    }

    public Asignatura(int codigo, String nombre, int carrera, String tipo, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carrera = carrera;
        this.tipo = tipo;
        this.creditos = creditos;
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

    public int getCarrera() {
        return carrera;
    }

    public void setCarrera(int carrera) {
        this.carrera = carrera;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}

