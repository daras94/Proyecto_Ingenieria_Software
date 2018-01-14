package controllers;


import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface MatriculaApiControllerImpInterface {
    void eliminarMatriculasDelete( @NotNull Integer promocion) throws Exception;

    void eliminarMatriculasPorPlazoDelete( @NotNull Integer promocion,  @NotNull Integer numPago) throws Exception;

    void reservaMatriculaPut( @NotNull Integer promocion,  @NotNull String alumno) throws Exception;

}
