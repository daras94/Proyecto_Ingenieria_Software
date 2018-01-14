package controllers.actas;

import models.Grupo;

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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T00:24:22.734Z")

public class GruposApiController extends Controller {

    private final GruposApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private GruposApiController(GruposApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result obtenerGruposNifGet(String nif) throws Exception {
        List<Grupo> obj = imp.obtenerGruposNifGet(nif);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }
}
