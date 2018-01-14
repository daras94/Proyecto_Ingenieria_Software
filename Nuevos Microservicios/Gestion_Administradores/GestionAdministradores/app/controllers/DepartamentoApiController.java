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
        imp.borrarDepartamentoNumeroDepartamentoDelete(numeroDepartamento);
        
        return ok();
    }

    @ApiAction
    public Result editarDepartamentoNumeroDepartamentoPut(Integer numeroDepartamento) throws Exception {
        JsonNode nodeaula = request().body().asJson();
        Departamento aula;

        aula = mapper.readValue(nodeaula.toString(), Departamento.class);

        imp.editarDepartamentoNumeroDepartamentoPut(numeroDepartamento, aula);
        
        return ok();
    }

    @ApiAction
    public Result insertarDepartamentoPost() throws Exception {
        JsonNode nodedepartamento = request().body().asJson();
        Departamento departamento;

        departamento = mapper.readValue(nodedepartamento.toString(), Departamento.class);

        imp.insertarDepartamentoPost(departamento);
        
        return ok();
    }
}
