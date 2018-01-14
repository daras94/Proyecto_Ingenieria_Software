package controllers;

import apimodels.Departamento;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface DepartamentoApiControllerImpInterface {
    boolean borrarDepartamentoNumeroDepartamentoDelete(Integer numeroDepartamento) throws Exception;

    boolean editarDepartamentoNumeroDepartamentoPut(Integer numeroDepartamento, Departamento aula) throws Exception;

    boolean insertarDepartamentoPost(Departamento departamento) throws Exception;

}
