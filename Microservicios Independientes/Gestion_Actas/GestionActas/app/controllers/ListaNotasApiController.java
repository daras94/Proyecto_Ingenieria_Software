package controllers;

import apimodels.Alumno;
import java.util.List;

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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-10T16:49:20.722Z")

public class ListaNotasApiController extends Controller {

    private final ListaNotasApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private ListaNotasApiController(ListaNotasApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result cerrarActasIdPut(Integer id) throws Exception {
        try{
            
        int n = imp.cerrarActasIdPut(id);
        if(n<0){
            return badRequest("Introduzca correctamente los datos");
        }
        
        return ok(mapper.createObjectNode());
        }
        catch(Exception e){
            System.out.println(e.toString());
            return internalServerError("Error interno del servidor");
        }
    }

    @ApiAction
    public Result obtenerListaIdGet(Integer id) throws Exception {
        try{
        List<Alumno> obj = imp.obtenerListaIdGet(id);
        if(obj==null){
            return badRequest("Introduzca los datos correctamente");
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        }
        catch(Exception e){
            System.out.println(e.toString());
            return internalServerError("Error interno del servidor");
        }
        
    }

    @ApiAction
    public Result subirNotasIdPut(Integer id) throws Exception {
        try{
        JsonNode nodealumnos = request().body().asJson();
        List<Alumno> alumnos = mapper.reader().forType(new TypeReference<List<Alumno>>(){}).readValue(nodealumnos.toString());

        int n =imp.subirNotasIdPut(id, alumnos);
        if(n<0){
            return badRequest("Introduzca los datos correctamente");
        }
        
        return ok(mapper.createObjectNode());
        }
        catch(Exception e){
            System.out.println(e.toString());
            return internalServerError("Error interno del servidor");
        }
    }
}
