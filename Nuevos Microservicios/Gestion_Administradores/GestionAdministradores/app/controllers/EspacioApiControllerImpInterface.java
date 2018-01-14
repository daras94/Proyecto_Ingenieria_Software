package controllers;

import apimodels.Espacio;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface EspacioApiControllerImpInterface {
    void editarEspacioNumeroEspacioPut(Integer numeroEspacio, Espacio aula) throws Exception;

    void eliminarEspacioNumeroEspacioDelete(Integer numeroEspacio) throws Exception;

    void insertarEspacioPost(Espacio aula) throws Exception;

}
