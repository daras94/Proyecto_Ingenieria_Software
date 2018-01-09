package controllers;


import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface AlumnoApiControllerImpInterface {
    List<String> getCorreosGet( @NotNull Integer promocion,  @NotNull Integer plazo) throws Exception;

}
