package controllers;

import apimodels.Asignatura;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface AsignaturaApiControllerImpInterface {
    void editarAsignaturaNumeroAsignaturaPut(Integer numeroAsignatura, Asignatura aula) throws Exception;

    void eliminarAsignaturaCodigoAsignaturaDelete(Integer codigoAsignatura) throws Exception;

    void insertarAsignaturaPost(Asignatura asignatura) throws Exception;

}
