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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-07T17:55:13.255Z")

public class CarreraApiController extends Controller {

    private final CarreraApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private CarreraApiController(CarreraApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result getCarrerasGet() throws Exception {
        try{
        List<Carrera> obj = imp.getCarrerasGet();
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        }
        catch(Exception e){
            System.out.println(e.toString());
            return internalServerError("Se ha producido un error interno del servidor");
        }
        
    }
}
