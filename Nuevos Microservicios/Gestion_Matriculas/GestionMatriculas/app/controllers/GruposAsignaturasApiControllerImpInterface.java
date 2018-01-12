package controllers;

import apimodels.AsignaturaMatriculable;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface GruposAsignaturasApiControllerImpInterface {
    List<AsignaturaMatriculable> asignaturasMatriculablesByAlumnoNumeroExpedienteGet(Integer numeroExpediente) throws Exception;

}
