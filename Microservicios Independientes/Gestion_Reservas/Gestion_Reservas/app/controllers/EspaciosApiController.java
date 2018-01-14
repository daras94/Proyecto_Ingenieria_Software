package controllers;

import apimodels.Espacio;

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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-04T16:38:57.570Z")

public class EspaciosApiController extends Controller {

    private final EspaciosApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private EspaciosApiController(EspaciosApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result espaciosGet() throws Exception {
        List<Espacio> obj = imp.espaciosGet();
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }
}
