package controllers;

import apimodels.Asignatura;

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

public class AsignaturaApiController extends Controller {

    private final AsignaturaApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private AsignaturaApiController(AsignaturaApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result asignaturaByCarreraCodeGet(String code) throws Exception {
        List<Asignatura> obj = imp.asignaturaByCarreraCodeGet(code);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }

    @ApiAction
    public Result asignaturaByIdCodeDelete(Integer code) throws Exception {
        imp.asignaturaByIdCodeDelete(code);
        
        return ok();
    }

    @ApiAction
    public Result asignaturaByIdCodeGet(Integer code) throws Exception {
        Asignatura obj = imp.asignaturaByIdCodeGet(code);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }

    @ApiAction
    public Result asignaturaByIdCodePut(Integer code) throws Exception {
        JsonNode nodeasignatura = request().body().asJson();
        Asignatura asignatura;

        asignatura = mapper.readValue(nodeasignatura.toString(), Asignatura.class);

        imp.asignaturaByIdCodePut(code, asignatura);
        
        return ok();
    }

    @ApiAction
    public Result asignaturaPost() throws Exception {
        JsonNode nodeasignatura = request().body().asJson();
        Asignatura asignatura;

        asignatura = mapper.readValue(nodeasignatura.toString(), Asignatura.class);

        imp.asignaturaPost(asignatura);
        
        return ok();
    }
}
