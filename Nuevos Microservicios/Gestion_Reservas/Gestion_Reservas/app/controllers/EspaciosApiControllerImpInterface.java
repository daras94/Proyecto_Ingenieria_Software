package controllers;

import apimodels.Espacio;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface EspaciosApiControllerImpInterface {
    List<Espacio> espaciosGet() throws Exception;

}
