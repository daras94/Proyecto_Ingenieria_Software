package services;

import models.GrupoAsignatura;
import java.util.List;
import models.Matricula;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface GestionDeMatriculas_ApiControllerImpInterface {
    void crearMatriculaNumeroExpedientePost(Integer numeroExpediente, List<GrupoAsignatura> grupos) throws Exception;

    void realizarReservaNumeroExpedientePut(Integer numeroExpediente) throws Exception;

    List<Matricula> verExpedienteNumeroExpedienteGet(Integer numeroExpediente) throws Exception;

}
