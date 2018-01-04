package controllers;

import apimodels.Asignatura;

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

public class AsignaturaApiController extends Controller {

    private final AsignaturaApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private AsignaturaApiController(AsignaturaApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result asignaturasMatriculablesByAlumnoNumeroExpedienteGet(Integer numeroExpediente) throws Exception {
        List<Asignatura> obj = imp.asignaturasMatriculablesByAlumnoNumeroExpedienteGet(numeroExpediente);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }
}
