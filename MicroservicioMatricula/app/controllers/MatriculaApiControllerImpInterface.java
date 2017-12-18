package controllers;

import apimodels.Matricula;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface MatriculaApiControllerImpInterface {
    void matriculaDelete( @NotNull Integer NIF,  @NotNull Integer curso) throws Exception;

    Matricula matriculaGet( @NotNull String NIF,  @NotNull Integer curso) throws Exception;

    void matriculaPost(Matricula matricula) throws Exception;

    void matriculaPut( @NotNull Integer NIF,  @NotNull Integer curso, Matricula matricula) throws Exception;

    List<Matricula> matriculasNIFGet(String NIF) throws Exception;

}
