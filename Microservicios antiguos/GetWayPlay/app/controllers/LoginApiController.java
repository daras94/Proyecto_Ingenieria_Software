package controllers;


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

public class LoginApiController extends Controller {

    private final LoginApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private LoginApiController(LoginApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result loginGet() throws Exception {
        String valueNIF = request().getQueryString("NIF");
        String NIF;

        NIF = (String)valueNIF;

        String valuecontrasenna = request().getQueryString("contrasenna");
        String contrasenna;

        contrasenna = (String)valuecontrasenna;

        String obj = imp.loginGet(NIF, contrasenna);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }
}
