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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-12T19:17:10.953Z")

public class ProfesoresApiController extends Controller {

    private final ProfesoresApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private ProfesoresApiController(ProfesoresApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result getProfesoresGet() throws Exception {
        List<Profesor> obj = imp.getProfesoresGet();
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }
}
