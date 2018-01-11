package controllers;

import apimodels.Alumno;
import java.util.List;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface ListaNotasApiControllerImpInterface {
    int cerrarActasIdPut(Integer id) throws Exception;

    List<Alumno> obtenerListaIdGet(Integer id) throws Exception;

    int subirNotasIdPut(Integer id, List<Alumno> alumnos) throws Exception;

}
