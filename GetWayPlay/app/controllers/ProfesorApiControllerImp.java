package controllers;

import apimodels.Profesor;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2017-12-18T19:53:01.612Z")

public class ProfesorApiControllerImp implements ProfesorApiControllerImpInterface {
    @Override
    public void profesorNIFDelete(String NIF) throws Exception {
        //Do your magic!!!
        
    }

    @Override
    public Profesor profesorNIFGet(String NIF) throws Exception {
        //Do your magic!!!
        return new Profesor();
    }

    @Override
    public void profesorNIFPut(String NIF, Profesor alumno) throws Exception {
        //Do your magic!!!
        
    }

    @Override
    public void profesorPost(Profesor profesor) throws Exception {
        //Do your magic!!!
        
    }

    @Override
    public List<Profesor> profesoresDepartamentoCodeGet(String code) throws Exception {
        //Do your magic!!!
        return new ArrayList<Profesor>();
    }

    @Override
    public List<Profesor> profesoresGrupoCodeGet(String code) throws Exception {
        //Do your magic!!!
        return new ArrayList<Profesor>();
    }

}
