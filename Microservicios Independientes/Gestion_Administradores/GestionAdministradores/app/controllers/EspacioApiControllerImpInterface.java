package controllers;

import apimodels.Espacio;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface EspacioApiControllerImpInterface {
    boolean editarEspacioNumeroEspacioPut(Integer numeroEspacio, Espacio aula) throws Exception;

    boolean eliminarEspacioNumeroEspacioDelete(Integer numeroEspacio) throws Exception;

    boolean insertarEspacioPost(Espacio espacio) throws Exception;

}
