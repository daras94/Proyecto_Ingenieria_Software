package controllers;

import apimodels.Alumno;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface AlumnoApiControllerImpInterface {
    void alumnoByNIFNIFDelete(String NIF) throws Exception;

    Alumno alumnoByNIFNIFGet(String NIF) throws Exception;

    void alumnoByNIFNIFPut(String NIF, Alumno alumno) throws Exception;

    void alumnoPost(Alumno alumno) throws Exception;

}
