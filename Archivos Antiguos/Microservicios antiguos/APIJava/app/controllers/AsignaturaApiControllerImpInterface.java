package controllers;

import apimodels.Asignatura;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface AsignaturaApiControllerImpInterface {
    List<Asignatura> asignaturaByCarreraCodeGet(String code) throws Exception;

    void asignaturaByIdCodeDelete(Integer code) throws Exception;

    Asignatura asignaturaByIdCodeGet(Integer code) throws Exception;

    void asignaturaByIdCodePut(Integer code, Asignatura asignatura) throws Exception;

    void asignaturaPost(Asignatura asignatura) throws Exception;

}
