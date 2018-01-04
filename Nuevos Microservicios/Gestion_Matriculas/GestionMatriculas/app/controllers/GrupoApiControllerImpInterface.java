package controllers;

import apimodels.Asignatura;
import apimodels.Grupo;
import java.util.List;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface GrupoApiControllerImpInterface {
    List<Grupo> gruposDisponiblesGet(List<Asignatura> asignaturas) throws Exception;

}
