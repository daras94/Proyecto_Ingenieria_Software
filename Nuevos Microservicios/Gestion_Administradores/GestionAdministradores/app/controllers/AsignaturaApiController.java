package controllers;

import apimodels.Asignatura;

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

public class AsignaturaApiController extends Controller {

    private final AsignaturaApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private AsignaturaApiController(AsignaturaApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result editarAsignaturaNumeroAsignaturaPut(Integer numeroAsignatura) throws Exception {
        try{
        JsonNode nodeaula = request().body().asJson();
        Asignatura asignatura;

        asignatura = mapper.readValue(nodeaula.toString(), Asignatura.class);

        if(!imp.editarAsignaturaNumeroAsignaturaPut(numeroAsignatura, asignatura)){
            return badRequest("Se han introducido mal los datos");
        }
        
        return ok();
        }
        catch(Exception e){
            System.out.println(e.toString());
            return internalServerError("Error interno del servidor");
        }
    }

    @ApiAction
    public Result eliminarAsignaturaCodigoAsignaturaDelete(Integer codigoAsignatura) throws Exception {
        try{
        if(!imp.eliminarAsignaturaCodigoAsignaturaDelete(codigoAsignatura)){
            return badRequest("Se han introducido mal los datos");
        }
        
        return ok();
        }
        catch(Exception e){
            System.out.println(e.toString());
            return internalServerError("Error interno del servidor");
        }
    }

    @ApiAction
    public Result insertarAsignaturaPost() throws Exception {
        try{
        JsonNode nodeasignatura = request().body().asJson();
        Asignatura asignatura;

        asignatura = mapper.readValue(nodeasignatura.toString(), Asignatura.class);

        if(!imp.insertarAsignaturaPost(asignatura)){
            return badRequest("Se han introducido mal los datos");
        }
        
        return ok();
        }
        catch(Exception e){
            System.out.println(e.toString());
            return internalServerError("Error interno del servidor");
        }
    }
}
