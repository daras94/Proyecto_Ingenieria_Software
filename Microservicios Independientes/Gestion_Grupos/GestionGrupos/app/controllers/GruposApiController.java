package controllers;

import apimodels.Grupo;
import apimodels.InfoGrupo;

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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-14T17:36:45.634Z")

public class GruposApiController extends Controller {

    private final GruposApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private GruposApiController(GruposApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result grupoAsignadoPost() throws Exception {
        JsonNode nodecuerpo = request().body().asJson();
        Object cuerpo;

        cuerpo = mapper.readValue(nodecuerpo.toString(), Object.class);

        String valueprofesor = request().getQueryString("profesor");
        String profesor;

        profesor = (String)valueprofesor;

        String valuegrupo = request().getQueryString("grupo");
        Integer grupo;

        grupo = Integer.parseInt(valuegrupo);

        imp.grupoAsignadoPost(profesor, grupo, cuerpo);
        
        return ok();
    }

    @ApiAction
    public Result gruposGet() throws Exception {
        List<Grupo> obj = imp.gruposGet();
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }

    @ApiAction
    public Result infoGrupoNIFGet(String NIF) throws Exception {
        List<InfoGrupo> obj = imp.infoGrupoNIFGet(NIF);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }
}
