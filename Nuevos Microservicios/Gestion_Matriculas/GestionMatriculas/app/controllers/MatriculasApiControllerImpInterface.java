package controllers;

import apimodels.GrupoAsignatura;
import java.util.List;
import apimodels.Matricula;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface MatriculasApiControllerImpInterface {
    boolean crearMatriculaNumeroExpedientePost(Integer numeroExpediente, List<GrupoAsignatura> grupos) throws Exception;

    boolean realizarReservaNumeroExpedientePut(Integer numeroExpediente) throws Exception;

    List<Matricula> verExpedienteNumeroExpedienteGet(Integer numeroExpediente) throws Exception;

}
