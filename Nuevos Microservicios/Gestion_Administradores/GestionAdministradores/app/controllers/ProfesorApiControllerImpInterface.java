package controllers;

import apimodels.Profesor;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface ProfesorApiControllerImpInterface {
    void editarProfesorNumeroProfesorPut(Integer numeroProfesor, Profesor aula) throws Exception;

    void eliminarProfesorNIFDelete(String NIF) throws Exception;

    void insertarProfesorPost(Profesor profesor) throws Exception;

}
