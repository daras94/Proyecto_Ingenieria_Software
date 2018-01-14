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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-14T12:38:44.152Z")

public class CarreraApiController extends Controller {

    private final CarreraApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private CarreraApiController(CarreraApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result editarCarreraNumeroCarreraPut(Integer numeroCarrera) throws Exception {
        JsonNode nodeaula = request().body().asJson();
        Carrera aula;

        aula = mapper.readValue(nodeaula.toString(), Carrera.class);

        imp.editarCarreraNumeroCarreraPut(numeroCarrera, aula);
        
        return ok();
    }

    @ApiAction
    public Result eliminarCarreraCodigoCarreraDelete(Integer codigoCarrera) throws Exception {
        imp.eliminarCarreraCodigoCarreraDelete(codigoCarrera);
        
        return ok();
    }

    @ApiAction
    public Result insertarCarreraPost() throws Exception {
        JsonNode nodecarrera = request().body().asJson();
        Carrera carrera;

        carrera = mapper.readValue(nodecarrera.toString(), Carrera.class);

        imp.insertarCarreraPost(carrera);
        
        return ok();
    }
}
