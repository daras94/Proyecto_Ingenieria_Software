package controllers;

import apimodels.GrupoAsignatura;
import java.util.List;
import apimodels.Matricula;

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

public class MatriculasApiController extends Controller {

    private final MatriculasApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private MatriculasApiController(MatriculasApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result crearMatriculaNumeroExpedientePost(Integer numeroExpediente) throws Exception {
        try{
        
        JsonNode nodegrupos = request().body().asJson();
        List<GrupoAsignatura> grupos;
        grupos = mapper.reader().forType(new TypeReference<List<GrupoAsignatura>>(){}).readValue(nodegrupos.toString());
        boolean exito = imp.crearMatriculaNumeroExpedientePost(numeroExpediente, grupos);
        if(!exito){
            return badRequest();
        }
        
        return ok();
        }
        catch(Exception e){
            System.out.println(e.toString());
            return internalServerError();
        }
    }

    @ApiAction
    public Result realizarReservaNumeroExpedientePut(Integer numeroExpediente) throws Exception {
        imp.realizarReservaNumeroExpedientePut(numeroExpediente);
        
        return ok();
    }

    @ApiAction
    public Result verExpedienteNumeroExpedienteGet(Integer numeroExpediente) throws Exception {
        List<Matricula> obj = imp.verExpedienteNumeroExpedienteGet(numeroExpediente);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }
}
