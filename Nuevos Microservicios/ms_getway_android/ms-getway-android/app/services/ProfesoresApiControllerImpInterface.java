package services;

import apimodels.ProfesorG;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface ProfesoresApiControllerImpInterface {
    List<ProfesorG> getProfesoresGet() throws Exception;

}