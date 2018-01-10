package controllers;

import apimodels.Cuenta;

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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-09T12:11:16.054Z")

public class UsuarioApiController extends Controller {

    private final UsuarioApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private UsuarioApiController(UsuarioApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result loginNifContrasennaPost(String nif,String contrasenna) throws Exception {
        try{
        Cuenta obj = imp.loginNifContrasennaPost(nif, contrasenna);
        if(obj==null){
            return notFound("No existe usuario con estos credenciales");
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        }
        catch(Exception e){
            System.out.println(e.toString());
            return internalServerError();
        }
        
    }
}
