package controllers;

import apimodels.Profesor;

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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2017-12-18T19:53:01.612Z")

public class ProfesorApiController extends Controller {

    private final ProfesorApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private ProfesorApiController(ProfesorApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result profesorNIFDelete(String NIF) throws Exception {
        imp.profesorNIFDelete(NIF);
        
        return ok();
    }

    @ApiAction
    public Result profesorNIFGet(String NIF) throws Exception {
        Profesor obj = imp.profesorNIFGet(NIF);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }

    @ApiAction
    public Result profesorNIFPut(String NIF) throws Exception {
        JsonNode nodealumno = request().body().asJson();
        Profesor alumno;

        alumno = mapper.readValue(nodealumno.toString(), Profesor.class);

        imp.profesorNIFPut(NIF, alumno);
        
        return ok();
    }

    @ApiAction
    public Result profesorPost() throws Exception {
        JsonNode nodeprofesor = request().body().asJson();
        Profesor profesor;

        profesor = mapper.readValue(nodeprofesor.toString(), Profesor.class);

        imp.profesorPost(profesor);
        
        return ok();
    }

    @ApiAction
    public Result profesoresDepartamentoCodeGet(String code) throws Exception {
        List<Profesor> obj = imp.profesoresDepartamentoCodeGet(code);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }

    @ApiAction
    public Result profesoresGrupoCodeGet(String code) throws Exception {
        List<Profesor> obj = imp.profesoresGrupoCodeGet(code);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }
}
