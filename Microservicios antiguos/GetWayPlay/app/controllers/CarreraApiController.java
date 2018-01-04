package controllers;

import apimodels.Carrera;

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

public class CarreraApiController extends Controller {

    private final CarreraApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private CarreraApiController(CarreraApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result carreraCodeDelete(Integer code) throws Exception {
        imp.carreraCodeDelete(code);
        
        return ok();
    }

    @ApiAction
    public Result carreraCodeGet(Integer code) throws Exception {
        Carrera obj = imp.carreraCodeGet(code);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }

    @ApiAction
    public Result carreraCodePut(Integer code) throws Exception {
        JsonNode nodecarrera = request().body().asJson();
        Carrera carrera;

        carrera = mapper.readValue(nodecarrera.toString(), Carrera.class);

        imp.carreraCodePut(code, carrera);
        
        return ok();
    }

    @ApiAction
    public Result carreraPost() throws Exception {
        JsonNode nodecarrera = request().body().asJson();
        Carrera carrera;

        carrera = mapper.readValue(nodecarrera.toString(), Carrera.class);

        imp.carreraPost(carrera);
        
        return ok();
    }

    @ApiAction
    public Result carrerasGet() throws Exception {
        List<Carrera> obj = imp.carrerasGet();
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }
}
