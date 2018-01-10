package controllers;

import apimodels.CreditosAlumno;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface CreditosAlumnoApiControllerImpInterface {
    CreditosAlumno creditosalumnoNumeroExpedienteGet(Integer numeroExpediente) throws Exception;

}
