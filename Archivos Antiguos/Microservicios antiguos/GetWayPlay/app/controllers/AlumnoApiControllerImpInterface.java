package controllers;

import apimodels.Alumno;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface AlumnoApiControllerImpInterface {
    void alumnoNIFDelete(String NIF) throws Exception;

    Alumno alumnoNIFGet(String NIF) throws Exception;

    void alumnoNIFPut(String NIF, Alumno alumno) throws Exception;

    void alumnoPost(Alumno alumno) throws Exception;

}
