package controllers;

import apimodels.Asignatura;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface AsignaturaApiControllerImpInterface {
    List<Asignatura> asignaturasMatriculablesByAlumnoNumeroExpedienteGet(String numeroExpediente) throws Exception;

}
