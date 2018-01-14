package controllers;

import apimodels.Carrera;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface CarreraApiControllerImpInterface {
    void editarCarreraNumeroCarreraPut(Integer numeroCarrera, Carrera aula) throws Exception;

    void eliminarCarreraCodigoCarreraDelete(Integer codigoCarrera) throws Exception;

    void insertarCarreraPost(Carrera carrera) throws Exception;

}
