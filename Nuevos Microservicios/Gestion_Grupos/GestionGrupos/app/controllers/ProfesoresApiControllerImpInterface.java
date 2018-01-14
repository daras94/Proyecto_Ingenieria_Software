package controllers;

import apimodels.Profesor;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface ProfesoresApiControllerImpInterface {
    List<Profesor> profesoresGet() throws Exception;

}
