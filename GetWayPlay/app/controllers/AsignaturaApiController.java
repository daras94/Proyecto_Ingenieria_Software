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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2017-12-18T19:53:01.612Z")

public class AsignaturaApiController extends Controller {

    private final AsignaturaApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private AsignaturaApiController(AsignaturaApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result asignaturaCodeDelete(Integer code) throws Exception {
        imp.asignaturaCodeDelete(code);
        
        return ok();
    }

    @ApiAction
    public Result asignaturaCodeGet(Integer code) throws Exception {
        Asignatura obj = imp.asignaturaCodeGet(code);
        if(obj==null){
            return notFound();
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result asignaturaCodePut(Integer code) throws Exception {
        JsonNode nodeasignatura = request().body().asJson();
        Asignatura asignatura;

        asignatura = mapper.readValue(nodeasignatura.toString(), Asignatura.class);

        imp.asignaturaCodePut(code, asignatura);
        
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

    @ApiAction
    public Result asignaturasCarreraCodeGet(String code) throws Exception {
        List<Asignatura> obj = imp.asignaturasCarreraCodeGet(code);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }

    @ApiAction
    public Result asignaturasMatriculaGet() throws Exception {
        String valueNIF = request().getQueryString("NIF");
        String NIF;

        NIF = (String)valueNIF;

        String valuepromocion = request().getQueryString("promocion");
        Integer promocion;

        promocion = Integer.parseInt(valuepromocion);

        List<Asignatura> obj = imp.asignaturasMatriculaGet(NIF, promocion);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }

    @ApiAction
    public Result asignaturasMatriculablesNIFGet(String NIF) throws Exception {
        List<Asignatura> obj = imp.asignaturasMatriculablesNIFGet(NIF);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }
}
