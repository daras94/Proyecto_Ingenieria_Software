package controllers;

import apimodels.Asignatura;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface AsignaturaApiControllerImpInterface {
    boolean editarAsignaturaNumeroAsignaturaPut(Integer numeroAsignatura, Asignatura aula) throws Exception;

    boolean eliminarAsignaturaCodigoAsignaturaDelete(Integer codigoAsignatura) throws Exception;

    boolean insertarAsignaturaPost(Asignatura asignatura) throws Exception;

}
