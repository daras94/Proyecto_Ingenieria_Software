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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-14T12:38:44.152Z")

public class EspacioApiController extends Controller {

    private final EspacioApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private EspacioApiController(EspacioApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result editarEspacioNumeroEspacioPut(Integer numeroEspacio) throws Exception {
        JsonNode nodeaula = request().body().asJson();
        Espacio aula;

        aula = mapper.readValue(nodeaula.toString(), Espacio.class);

        imp.editarEspacioNumeroEspacioPut(numeroEspacio, aula);
        
        return ok();
    }

    @ApiAction
    public Result eliminarEspacioNumeroEspacioDelete(Integer numeroEspacio) throws Exception {
        imp.eliminarEspacioNumeroEspacioDelete(numeroEspacio);
        
        return ok();
    }

    @ApiAction
    public Result insertarEspacioPost() throws Exception {
        JsonNode nodeaula = request().body().asJson();
        Espacio aula;

        aula = mapper.readValue(nodeaula.toString(), Espacio.class);

        imp.insertarEspacioPost(aula);
        
        return ok();
    }
}
