package controllers;

import apimodels.Profesor;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface ProfesorApiControllerImpInterface {
    void profesorNIFDelete(String NIF) throws Exception;

    Profesor profesorNIFGet(String NIF) throws Exception;

    void profesorNIFPut(String NIF, Profesor alumno) throws Exception;

    void profesorPost(Profesor profesor) throws Exception;

    List<Profesor> profesoresDepartamentoCodeGet(String code) throws Exception;

    List<Profesor> profesoresGrupoCodeGet(String code) throws Exception;

}
