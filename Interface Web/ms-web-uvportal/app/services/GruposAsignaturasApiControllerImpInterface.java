package services;

import models.GrupoAsignatura;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface GruposAsignaturasApiControllerImpInterface {
    List<GrupoAsignatura> asignaturasMatriculablesByAlumnoNumeroExpedienteGet(Integer numeroExpediente) throws Exception;

}
