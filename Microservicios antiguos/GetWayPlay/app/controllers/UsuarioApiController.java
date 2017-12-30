package controllers;

import apimodels.Usuario;

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

public class UsuarioApiController extends Controller {

    private final UsuarioApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private UsuarioApiController(UsuarioApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result usuarioNIFGet(String NIF) throws Exception {
        Usuario obj = imp.usuarioNIFGet(NIF);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }
}
