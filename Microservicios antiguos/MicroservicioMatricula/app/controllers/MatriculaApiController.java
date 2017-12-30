package controllers;

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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2017-12-18T17:56:13.194Z")

public class MatriculaApiController extends Controller {

    private final MatriculaApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private MatriculaApiController(MatriculaApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result matriculaDelete() throws Exception {
        String valueNIF = request().getQueryString("NIF");
        Integer NIF;

        NIF = Integer.parseInt(valueNIF);

        String valuecurso = request().getQueryString("curso");
        Integer curso;

        curso = Integer.parseInt(valuecurso);

        imp.matriculaDelete(NIF, curso);
        
        return ok();
    }

    @ApiAction
    public Result matriculaGet() throws Exception {
        String valueNIF = request().getQueryString("NIF");
        String NIF;

        NIF = (String)valueNIF;

        String valuecurso = request().getQueryString("curso");
        Integer curso;

        curso = Integer.parseInt(valuecurso);

        Matricula obj = imp.matriculaGet(NIF, curso);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }

    @ApiAction
    public Result matriculaPost() throws Exception {
        JsonNode nodematricula = request().body().asJson();
        Matricula matricula;

        matricula = mapper.readValue(nodematricula.toString(), Matricula.class);

        imp.matriculaPost(matricula);
        
        return ok();
    }

    @ApiAction
    public Result matriculaPut() throws Exception {
        JsonNode nodematricula = request().body().asJson();
        Matricula matricula;

        matricula = mapper.readValue(nodematricula.toString(), Matricula.class);

        String valueNIF = request().getQueryString("NIF");
        Integer NIF;

        NIF = Integer.parseInt(valueNIF);

        String valuecurso = request().getQueryString("curso");
        Integer curso;

        curso = Integer.parseInt(valuecurso);

        imp.matriculaPut(NIF, curso, matricula);
        
        return ok();
    }

    @ApiAction
    public Result matriculasNIFGet(String NIF) throws Exception {
        List<Matricula> obj = imp.matriculasNIFGet(NIF);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }
}
