package controllers;

import apimodels.Departamento;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface DepartamentoApiControllerImpInterface {
    void borrarDepartamentoNumeroDepartamentoDelete(Integer numeroDepartamento) throws Exception;

    void editarDepartamentoNumeroDepartamentoPut(Integer numeroDepartamento, Departamento aula) throws Exception;

    void insertarDepartamentoPost(Departamento departamento) throws Exception;

}
