package services;

import models.Carrera;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface CarreraApiControllerImpInterface {
    List<Carrera> getCarrerasGet() throws Exception;

}
