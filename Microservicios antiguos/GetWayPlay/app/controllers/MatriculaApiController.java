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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2017-12-18T11:43:47.926Z")

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

        String valuepromocion = request().getQueryString("promocion");
        Integer promocion;

        promocion = Integer.parseInt(valuepromocion);

        imp.matriculaDelete(NIF, promocion);
        
        return ok();
    }

    @ApiAction
    public Result matriculaGet() throws Exception {
        String valueNIF = request().getQueryString("NIF");
        String NIF;

        NIF = (String)valueNIF;

        String valuepromocion = request().getQueryString("promocion");
        Integer promocion;

        promocion = Integer.parseInt(valuepromocion);

        Matricula obj = imp.matriculaGet(NIF, promocion);
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

        String valuepromocion = request().getQueryString("promocion");
        Integer promocion;

        promocion = Integer.parseInt(valuepromocion);

        imp.matriculaPut(NIF, promocion, matricula);
        
        return ok();
    }

    @ApiAction
    public Result matriculasNIFNIFGet(String NIF) throws Exception {
        List<Matricula> obj = imp.matriculasNIFNIFGet(NIF);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }
}
