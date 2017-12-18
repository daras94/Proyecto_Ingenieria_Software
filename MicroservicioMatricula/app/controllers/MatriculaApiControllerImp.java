package controllers;

import apimodels.Matricula;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2017-12-18T17:56:13.194Z")

public class MatriculaApiControllerImp implements MatriculaApiControllerImpInterface {
    @Override
    public void matriculaDelete( @NotNull Integer NIF,  @NotNull Integer curso) throws Exception {
        //Do your magic!!!
        
    }

    @Override
    public Matricula matriculaGet( @NotNull String NIF,  @NotNull Integer curso) throws Exception {
        //Do your magic!!!
        return new Matricula();
    }

    @Override
    public void matriculaPost(Matricula matricula) throws Exception {
        //Do your magic!!!
        
    }

    @Override
    public void matriculaPut( @NotNull Integer NIF,  @NotNull Integer curso, Matricula matricula) throws Exception {
        //Do your magic!!!
        
    }

    @Override
    public List<Matricula> matriculasNIFGet(String NIF) throws Exception {
        //Do your magic!!!
        return new ArrayList<Matricula>();
    }

}
