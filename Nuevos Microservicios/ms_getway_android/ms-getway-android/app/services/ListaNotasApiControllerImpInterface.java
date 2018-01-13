package services;

import models.AlumnoActas;
import java.util.List;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface ListaNotasApiControllerImpInterface {
    void cerrarActasIdPut(Integer id) throws Exception;

    List<AlumnoActas> obtenerListaIdGet(Integer id) throws Exception;

    void subirNotasIdPut(Integer id, List<AlumnoActas> alumnos) throws Exception;

}
