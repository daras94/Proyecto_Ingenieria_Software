package com.uvportal.uahgii.uvportal;

import java.util.ArrayList;

/**
 * Created by Daniel on 13/01/2018.
 */

public class AsignaturaGrupos {

    private Asignatura asignatura;
    private ArrayList<Grupo> grupos;

    public AsignaturaGrupos(Asignatura asignatura, ArrayList<Grupo> grupos) {
        this.asignatura = asignatura;
        this.grupos = grupos;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }
}
