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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2017-11-14T12:09:33.135Z")

public class CarreraApiController extends Controller {

    private final CarreraApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private CarreraApiController(CarreraApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result carreraByCodeCodeDelete(Integer code) throws Exception {
        imp.carreraByCodeCodeDelete(code);
        
        return ok();
    }

    @ApiAction
    public Result carreraByCodeCodeGet(Integer code) throws Exception {
        Carrera obj = imp.carreraByCodeCodeGet(code);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }

    @ApiAction
    public Result carreraByCodeCodePut(Integer code) throws Exception {
        JsonNode nodecarrera = request().body().asJson();
        Carrera carrera;

        carrera = mapper.readValue(nodecarrera.toString(), Carrera.class);

        imp.carreraByCodeCodePut(code, carrera);
        
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
}
