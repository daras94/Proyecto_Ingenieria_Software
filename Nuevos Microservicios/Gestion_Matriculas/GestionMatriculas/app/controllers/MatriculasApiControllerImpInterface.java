package controllers;

import apimodels.Grupo;
import java.util.List;
import apimodels.Matricula;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface MatriculasApiControllerImpInterface {
    void crearMatriculaNumeroExpedientePost(Integer numeroExpediente, List<Grupo> grupos) throws Exception;

    void realizarReservaNumeroExpedientePut(Integer numeroExpediente) throws Exception;

    List<Matricula> verExpedienteNumeroExpedienteGet(Integer numeroExpediente) throws Exception;

}