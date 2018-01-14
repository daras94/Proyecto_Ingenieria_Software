package controllers;

import apimodels.Profesor;

import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.IOException;
import swagger.SwaggerUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;

import swagger.SwaggerUtils.ApiAction;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-14T12:38:44.152Z")

public class ProfesorApiController extends Controller {

    private final ProfesorApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private ProfesorApiController(ProfesorApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result editarProfesorNumeroProfesorPut(Integer numeroProfesor) throws Exception {
        try{
        JsonNode nodeaula = request().body().asJson();
        Profesor profesor;

        profesor = mapper.readValue(nodeaula.toString(), Profesor.class);

        if(!imp.editarProfesorNumeroProfesorPut(numeroProfesor, profesor)){
            return badRequest("Introduzca los datos correctamente");
        }
        
        return ok();
        }
        catch(Exception e){
            System.out.println(e.toString());
            return internalServerError("Error interno del servidor");
        }
    }

    @ApiAction
    public Result eliminarProfesorNIFDelete(String NIF) throws Exception {
        try{
        if(!imp.eliminarProfesorNIFDelete(NIF)){
            return badRequest("Introduzca los datos correctamente");
        }
        
        return ok();
        }
        catch(Exception e){
            System.out.println(e.toString());
            return internalServerError("Error interno del servidor");
        }
    }

    @ApiAction
    public Result insertarProfesorPost() throws Exception {
        try{
        JsonNode nodeprofesor = request().body().asJson();
        Profesor profesor;

        profesor = mapper.readValue(nodeprofesor.toString(), Profesor.class);

        if(!imp.insertarProfesorPost(profesor)){
            return badRequest("Introduzca los datos correctamente");
        }
        
        return ok();
        }catch(Exception e){
            System.out.println(e.toString());
            return internalServerError("Error interno del servidor");
        }
    }
}
