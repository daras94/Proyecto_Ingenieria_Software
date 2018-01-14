package controllers;

import apimodels.Departamento;

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

public class DepartamentoApiController extends Controller {

    private final DepartamentoApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private DepartamentoApiController(DepartamentoApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result borrarDepartamentoNumeroDepartamentoDelete(Integer numeroDepartamento) throws Exception {
        try{
        if(!imp.borrarDepartamentoNumeroDepartamentoDelete(numeroDepartamento)){
            return badRequest("Introduce los datos correctamente");
        }
        
        return ok();
        }
        catch(Exception e){
            System.out.println(e.toString());
            return internalServerError("Error interno del servidor");
        }
    }

    @ApiAction
    public Result editarDepartamentoNumeroDepartamentoPut(Integer numeroDepartamento) throws Exception {
        try{
        JsonNode nodeaula = request().body().asJson();
        Departamento departamento;

        departamento = mapper.readValue(nodeaula.toString(), Departamento.class);

        if(!imp.editarDepartamentoNumeroDepartamentoPut(numeroDepartamento, departamento)){
            return badRequest("Introduce los datos correctamente");
        }
        
        return ok();
        }
        catch(Exception e){
            System.out.println(e.toString());
            return internalServerError("Error interno del servidor");
        }
    }

    @ApiAction
    public Result insertarDepartamentoPost() throws Exception {
        try{
        JsonNode nodedepartamento = request().body().asJson();
        Departamento departamento;

        departamento = mapper.readValue(nodedepartamento.toString(), Departamento.class);

        if(!imp.insertarDepartamentoPost(departamento)){
            return badRequest("Introduce los datos correctamente");
        }
        
        return ok();
        }
        catch(Exception e){
            System.out.println(e.toString());
            return internalServerError("Error interno del servidor");
        }
    }
}
