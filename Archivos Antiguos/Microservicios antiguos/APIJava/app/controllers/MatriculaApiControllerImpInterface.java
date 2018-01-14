package controllers;

import apimodels.Matricula;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface MatriculaApiControllerImpInterface {
    void matriculaByPromocionPromocionDelete(Integer promocion) throws Exception;

    Matricula matriculaByPromocionPromocionGet(Integer promocion) throws Exception;

    void matriculaByPromocionPromocionPut(Integer promocion, Matricula matricula) throws Exception;

    void matriculaPost(Matricula matricula) throws Exception;

}
