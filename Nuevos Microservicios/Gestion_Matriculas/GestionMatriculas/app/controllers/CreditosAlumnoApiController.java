package controllers;

import apimodels.CreditosAlumno;

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
import static play.mvc.Results.internalServerError;
import static play.mvc.Results.notFound;
import static play.mvc.Results.ok;

import swagger.SwaggerUtils.ApiAction;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-10T11:25:04.680Z")

public class CreditosAlumnoApiController extends Controller {

    private final CreditosAlumnoApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private CreditosAlumnoApiController(CreditosAlumnoApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result creditosalumnoNumeroExpedienteGet(Integer numeroExpediente) throws Exception {
        try{
        CreditosAlumno obj = imp.creditosalumnoNumeroExpedienteGet(numeroExpediente);
        if(obj==null){
            return notFound("Introduzca los datos correctamente");
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);}
        catch(Exception e){
              System.out.println(e);
              return internalServerError("Error interno del servidor");
        }
                
        
    }
}
