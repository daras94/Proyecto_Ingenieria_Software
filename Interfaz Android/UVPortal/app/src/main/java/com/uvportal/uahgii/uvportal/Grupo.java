package com.uvportal.uahgii.uvportal;

/**
 * Created by Daniel on 12/01/2018.
 */

class Grupo {

    private int id;
    private int miembros;
    private String tipo;

    public Grupo(int id, int miembros, String tipo) {
        this.id = id;
        this.miembros = miembros;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMiembros() {
        return miembros;
    }

    public void setMiembros(int miembros) {
        this.miembros = miembros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
