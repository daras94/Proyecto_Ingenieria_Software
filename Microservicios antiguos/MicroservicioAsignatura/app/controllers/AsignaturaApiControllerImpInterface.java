package controllers;

import apimodels.Asignatura;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface AsignaturaApiControllerImpInterface {
    void asignaturaCodeDelete(Integer code) throws Exception;

    Asignatura asignaturaCodeGet(Integer code) throws Exception;

    void asignaturaCodePut(Integer code, Asignatura asignatura) throws Exception;

    void asignaturaPost(Asignatura asignatura) throws Exception;

    List<Asignatura> asignaturasCarreraCodeGet(String code) throws Exception;

    List<Asignatura> asignaturasMatriculablesNIFGet(String NIF) throws Exception;

}
