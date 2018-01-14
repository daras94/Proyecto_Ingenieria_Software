package controllers.grupos;


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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T17:20:16.009Z")

public class DepartamentoApiController extends Controller {

    private final DepartamentoApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private DepartamentoApiController(DepartamentoApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }

    
    @ApiAction
    public Result getCargaDocenteGet(Integer departamento) throws Exception {
        Integer obj = imp.getCargaDocenteGet(departamento);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }
}
