package controllers;

import apimodels.Grupo;

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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-10T16:49:20.722Z")

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
        try{
        List<Grupo> obj = imp.obtenerGruposNifGet(nif);
        if(obj==null){
            return badRequest("Introduce los resultados correctamente");
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        }
        catch(Exception e){
            System.out.println(e.toString());
            return internalServerError("Error interno del servidor");
        }
        
    }
}
