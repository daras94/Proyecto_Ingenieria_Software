package controllers;

import apimodels.Carrera;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface CarreraApiControllerImpInterface {
    void carreraCodeDelete(Integer code) throws Exception;

    Carrera carreraCodeGet(Integer code) throws Exception;

    void carreraCodePut(Integer code, Carrera carrera) throws Exception;

    void carreraPost(Carrera carrera) throws Exception;

    List<Carrera> carrerasGet() throws Exception;

}
