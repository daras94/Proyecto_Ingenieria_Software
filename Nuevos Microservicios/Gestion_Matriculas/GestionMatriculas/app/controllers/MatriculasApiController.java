package controllers;

import apimodels.GrupoAsignatura;
import apimodels.Matricula;

import play.mvc.Controller;
import play.mvc.Result;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import com.fasterxml.jackson.core.type.TypeReference;


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
            return badRequest("Los datos introducidos no son correctos. Por favor vuelve a introducirlos correctamente.");
        }
        
        return ok();
        }
        catch(Exception e){
            System.out.println(e.toString());
            return internalServerError("Error interno del servidor.");
        }
    }

    @ApiAction
    public Result realizarReservaNumeroExpedientePut(Integer numeroExpediente) throws Exception {
        try{
        boolean resultado =imp.realizarReservaNumeroExpedientePut(numeroExpediente);
        if(!resultado){
            return badRequest("Los datos introducidos no son correctos. Por favor vuelve a introducirlos correctamente.");
        }
        return ok();
        }
        catch(Exception e){
            System.out.println(e.toString());
            return internalServerError("Error interno del servidor.");
        }
    }

    @ApiAction
    public Result verExpedienteNumeroExpedienteGet(Integer numeroExpediente) throws Exception {
        try{
        List<Matricula> obj = imp.verExpedienteNumeroExpedienteGet(numeroExpediente);
        JsonNode result = mapper.valueToTree(obj);
        if(obj==null){
            return badRequest("Los datos introducidos no son correctos. Por favor vuelve a introducirlos correctamente.");
        }
        return ok(result);
        }
        catch(Exception e){
            System.out.println(e.toString());
            return internalServerError("Error interno del servidor.");
        }
            
        
    }
}
