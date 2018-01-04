package controllers;

import apimodels.Asignatura;
import apimodels.Grupo;
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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-04T12:56:13.896Z")

public class GrupoApiController extends Controller {

    private final GrupoApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private GrupoApiController(GrupoApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result gruposDisponiblesGet() throws Exception {
        JsonNode nodeasignaturas = request().body().asJson();
        List<Asignatura> asignaturas;

        asignaturas = mapper.readValue(nodeasignaturas.toString(), new TypeReference<List<List<Asignatura>>>(){});

        List<Grupo> obj = imp.gruposDisponiblesGet(asignaturas);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }
}
