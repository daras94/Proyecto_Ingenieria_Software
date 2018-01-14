package controllers;

import apimodels.Alumno;

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
import static play.mvc.Controller.request;
import static play.mvc.Results.badRequest;
import static play.mvc.Results.internalServerError;
import static play.mvc.Results.notFound;
import static play.mvc.Results.ok;

import swagger.SwaggerUtils.ApiAction;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2017-12-30T09:32:26.982Z")

public class AlumnoApiController extends Controller {

    private final AlumnoApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private AlumnoApiController(AlumnoApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result altaAlumnoPost() throws Exception {
        try{
        JsonNode nodealumno = request().body().asJson();
        Alumno alumno;

        alumno = mapper.readValue(nodealumno.toString(), Alumno.class);

        boolean exito = imp.altaAlumnoPost(alumno);
        if(exito){
            return ok(mapper.createObjectNode());
        }
        
        else{
            return badRequest("Los datos que se han introducido no son correctos. Por favor repaselos de nuevo.");
        }
        }
        catch(Exception e){
            return internalServerError("Error interno del servidor.");
        
        }
    }

    @ApiAction
    public Result alumnoByNIFNIFDelete(String NIF) throws Exception {
        try{
            boolean exito = imp.alumnoByNIFNIFDelete(NIF);
            if(exito){
                return ok(mapper.createObjectNode());
            }
            else{
                return badRequest("Los datos que se han introducido no son correctos. Por favor repaselos de nuevo.");
            }
            
            
        }
        catch(Exception e){
            System.out.println(e.toString());
            return internalServerError("Error interno del servidor.");
        }
        
        
        
    }

    @ApiAction
    public Result alumnoByNIFNIFGet(String NIF) throws Exception {
        try{
        Alumno obj = imp.alumnoByNIFNIFGet(NIF);
        if(obj==null){
            return notFound("Los datos introducidos no se corresponde con ningun alumno.");
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        }
        catch(Exception e){
            return internalServerError("Error interno del servidor.");
        }
        
    }

    @ApiAction
    public Result alumnoByNIFNIFPut(String NIF) throws Exception {
        try{
            JsonNode nodealumno = request().body().asJson();
            Alumno alumno;

            alumno = mapper.readValue(nodealumno.toString(), Alumno.class);

            boolean exito = imp.alumnoByNIFNIFPut(NIF, alumno);
            if(exito){
                return ok(mapper.createObjectNode());
            }
            else{
                return badRequest("Los datos que se han introducido no son correctos. Por favor repaselos de nuevo.");
            }
        }
        catch(Exception e){
            System.out.println(e.toString());
            return internalServerError("Error interno del servidor.");
        }
    }
}
