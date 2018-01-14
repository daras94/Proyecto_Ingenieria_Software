package controllers;

import apimodels.Profesor;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface ProfesorApiControllerImpInterface {
    boolean editarProfesorNumeroProfesorPut(Integer numeroProfesor, Profesor profesor) throws Exception;

    boolean eliminarProfesorNIFDelete(String NIF) throws Exception;

    boolean insertarProfesorPost(Profesor profesor) throws Exception;

}
