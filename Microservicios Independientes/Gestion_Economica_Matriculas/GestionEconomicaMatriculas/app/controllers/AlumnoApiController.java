package controllers;


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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-08T16:26:42.569Z")

public class AlumnoApiController extends Controller {

    private final AlumnoApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private AlumnoApiController(AlumnoApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result getCorreosGet() throws Exception {
        String valuepromocion = request().getQueryString("Promocion");
        Integer promocion;

        promocion = Integer.parseInt(valuepromocion);

        String valueplazo = request().getQueryString("plazo");
        Integer plazo;

        plazo = Integer.parseInt(valueplazo);

        List<String> obj = imp.getCorreosGet(promocion, plazo);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }
}
