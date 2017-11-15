package controllers;

import apimodels.Alumno;

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

public class AlumnoApiController extends Controller {

    private final AlumnoApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private AlumnoApiController(AlumnoApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result alumnoByNIFNIFDelete(String NIF) throws Exception {
        imp.alumnoByNIFNIFDelete(NIF);
        
        return ok();
    }

    @ApiAction
    public Result alumnoByNIFNIFGet(String NIF) throws Exception {
        Alumno obj = imp.alumnoByNIFNIFGet(NIF);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }

    @ApiAction
    public Result alumnoByNIFNIFPut(String NIF) throws Exception {
        JsonNode nodealumno = request().body().asJson();
        Alumno alumno;

        alumno = mapper.readValue(nodealumno.toString(), Alumno.class);

        imp.alumnoByNIFNIFPut(NIF, alumno);
        
        return ok();
    }

    @ApiAction
    public Result alumnoPost() throws Exception {
        JsonNode nodealumno = request().body().asJson();
        Alumno alumno;

        alumno = mapper.readValue(nodealumno.toString(), Alumno.class);

        imp.alumnoPost(alumno);
        
        return ok();
    }
}
