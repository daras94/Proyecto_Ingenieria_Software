package controllers;

import apimodels.Matricula;
import apimodels.MatriculaAlta;

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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-07T18:34:22.046Z")

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
        MatriculaAlta grupos;

        grupos = mapper.readValue(nodegrupos.toString(), MatriculaAlta.class);

        boolean exito = imp.crearMatriculaNumeroExpedientePost(numeroExpediente, grupos);
        if(!exito){
            return badRequest("Los datos introducidos no son correctos. Por favor vuelve a introducirlos correctamente.");
        }
        
        return ok();
        }
        catch(Exception e){
            System.out.println(e.toString());
            return internalServerError("Error interno del servidor");
        }
    }

    @ApiAction
    public Result realizarReservaNumeroExpedientePost(Integer numeroExpediente) throws Exception {
        try{
        boolean resultado =imp.realizarReservaNumeroExpedientePost(numeroExpediente);
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
