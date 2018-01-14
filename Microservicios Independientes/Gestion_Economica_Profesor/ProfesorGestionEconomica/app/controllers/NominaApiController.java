package controllers;

import apimodels.Nomina;

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

public class NominaApiController extends Controller {

    private final NominaApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private NominaApiController(NominaApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result nominaPost() throws Exception {
        JsonNode nodesdfv = request().body().asJson();
        Object sdfv;

        sdfv = mapper.readValue(nodesdfv.toString(), Object.class);

        String valueNIF = request().getQueryString("NIF");
        String NIF;

        NIF = (String)valueNIF;

        String valuefecha = request().getQueryString("fecha");
        String fecha;

        fecha = (String)valuefecha;

        imp.nominaPost(sdfv, NIF, fecha);
        
        return ok();
    }

    @ApiAction
    public Result nominasNIFGet(String NIF) throws Exception {
        List<Nomina> obj = imp.nominasNIFGet(NIF);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }
}
