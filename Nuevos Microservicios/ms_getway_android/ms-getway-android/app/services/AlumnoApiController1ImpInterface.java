package services;

import models.Alumno;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface AlumnoApiController1ImpInterface {
    List<String> getCorreosGet( @NotNull Integer promocion,  @NotNull Integer plazo) throws Exception;
}
