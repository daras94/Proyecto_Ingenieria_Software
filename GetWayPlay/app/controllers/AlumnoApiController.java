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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2017-12-18T11:43:47.926Z")

public class AlumnoApiController extends Controller {

    private final AlumnoApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private AlumnoApiController(AlumnoApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result alumnoNIFDelete(String NIF) throws Exception {
        imp.alumnoNIFDelete(NIF);
        
        return ok();
    }

    @ApiAction
    public Result alumnoNIFGet(String NIF) throws Exception {
        
        Alumno obj = imp.alumnoNIFGet(NIF);
        if(obj==null){
            return notFound();
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }

    @ApiAction
    public Result alumnoNIFPut(String NIF) throws Exception {
        JsonNode nodealumno = request().body().asJson();
        Alumno alumno;

        alumno = mapper.readValue(nodealumno.toString(), Alumno.class);

        imp.alumnoNIFPut(NIF, alumno);
        
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
