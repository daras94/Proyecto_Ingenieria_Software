package controllers;

import apimodels.Factura;

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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-14T17:04:47.834Z")

public class FacturaApiController extends Controller {

    private final FacturaApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private FacturaApiController(FacturaApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result facturasGet(String NIF,Integer mes,Integer ao) throws Exception {
        List<Factura> obj = imp.facturasGet(NIF, mes, ao);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }
}
