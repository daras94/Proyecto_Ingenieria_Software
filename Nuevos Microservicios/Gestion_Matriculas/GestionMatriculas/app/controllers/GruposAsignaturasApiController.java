package controllers;

import apimodels.Asignatura;
import apimodels.GrupoAsignatura;

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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-04T19:26:19.921Z")

public class GruposAsignaturasApiController extends Controller {

    private final GruposAsignaturasApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private GruposAsignaturasApiController(GruposAsignaturasApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result asignaturasMatriculablesByAlumnoNumeroExpedienteGet(Integer numeroExpediente) throws Exception {
        try{
        List<GrupoAsignatura> obj = imp.asignaturasMatriculablesByAlumnoNumeroExpedienteGet(numeroExpediente);
        if(obj==null){
            return badRequest();
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        }catch(Exception e){
            System.out.println(e.toString());
            return internalServerError();
        }
        
    }
}
