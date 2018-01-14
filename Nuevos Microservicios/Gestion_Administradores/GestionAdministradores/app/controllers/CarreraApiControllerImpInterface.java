package controllers;

import apimodels.Carrera;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface CarreraApiControllerImpInterface {
    boolean editarCarreraNumeroCarreraPut(Integer numeroCarrera, Carrera aula) throws Exception;

    boolean eliminarCarreraCodigoCarreraDelete(Integer codigoCarrera) throws Exception;

    boolean insertarCarreraPost(Carrera carrera) throws Exception;

}
