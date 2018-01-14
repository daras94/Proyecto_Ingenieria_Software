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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-14T16:40:26.439Z")

public class GruposApiController extends Controller {

    private final GruposApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private GruposApiController(GruposApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result getGruposGet() throws Exception {
        List<Grupo> obj = imp.getGruposGet();
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }

    @ApiAction
    public Result getInfoGrupoGet(String NIF) throws Exception {
        List<InfoGrupo> obj = imp.getInfoGrupoGet(NIF);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }

    @ApiAction
    public Result postGrupoAsignadoPost() throws Exception {
        JsonNode nodecuerpo = request().body().asJson();
        Object cuerpo;

        cuerpo = mapper.readValue(nodecuerpo.toString(), Object.class);

        String valueprofesor = request().getQueryString("profesor");
        String profesor;

        profesor = (String)valueprofesor;

        String valuegrupo = request().getQueryString("grupo");
        Integer grupo;

        grupo = Integer.parseInt(valuegrupo);

        imp.postGrupoAsignadoPost(profesor, grupo, cuerpo);
        
        return ok();
    }
}
