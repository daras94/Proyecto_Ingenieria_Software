package controllers;

import apimodels.Matricula;

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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2017-11-14T12:09:33.135Z")

public class MatriculaApiController extends Controller {

    private final MatriculaApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private MatriculaApiController(MatriculaApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result matriculaByPromocionPromocionDelete(Integer promocion) throws Exception {
        imp.matriculaByPromocionPromocionDelete(promocion);
        
        return ok();
    }

    @ApiAction
    public Result matriculaByPromocionPromocionGet(Integer promocion) throws Exception {
        Matricula obj = imp.matriculaByPromocionPromocionGet(promocion);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }

    @ApiAction
    public Result matriculaByPromocionPromocionPut(Integer promocion) throws Exception {
        JsonNode nodematricula = request().body().asJson();
        Matricula matricula;

        matricula = mapper.readValue(nodematricula.toString(), Matricula.class);

        imp.matriculaByPromocionPromocionPut(promocion, matricula);
        
        return ok();
    }

    @ApiAction
    public Result matriculaPost() throws Exception {
        JsonNode nodematricula = request().body().asJson();
        Matricula matricula;

        matricula = mapper.readValue(nodematricula.toString(), Matricula.class);

        imp.matriculaPost(matricula);
        
        return ok();
    }
}
