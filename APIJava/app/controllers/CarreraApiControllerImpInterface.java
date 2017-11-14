package controllers;

import apimodels.Carrera;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface CarreraApiControllerImpInterface {
    void carreraByCodeCodeDelete(Integer code) throws Exception;

    Carrera carreraByCodeCodeGet(Integer code) throws Exception;

    void carreraByCodeCodePut(Integer code, Carrera carrera) throws Exception;

    void carreraPost(Carrera carrera) throws Exception;

}
