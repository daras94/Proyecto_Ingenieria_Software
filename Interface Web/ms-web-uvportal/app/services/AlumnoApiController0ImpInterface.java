package services;

import models.Alumno;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface AlumnoApiController0ImpInterface {
    void altaAlumnoPost(Alumno alumno) throws Exception;

    void alumnoByNIFNIFDelete(String NIF) throws Exception;

    Alumno alumnoByNIFNIFGet(String NIF) throws Exception;

    void alumnoByNIFNIFPut(String NIF, Alumno alumno) throws Exception;

}
