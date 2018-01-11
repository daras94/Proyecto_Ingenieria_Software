package controllers.ms_gestion_economica;

import models.Nomina;

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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-05T21:31:07.061Z")

public class GestionDeNominas_ApiController extends Controller {

    private final GestionDeNominas_ApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private GestionDeNominas_ApiController(GestionDeNominas_ApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result nominaPost() throws Exception {
        String valueNIF = request().getQueryString("NIF");
        String NIF;

        NIF = (String)valueNIF;

        String valuefecha = request().getQueryString("fecha");
        String fecha;

        fecha = (String)valuefecha;

        imp.nominaPost(NIF, fecha);
        
        return ok();
    }

    @ApiAction
    public Result nominasNIFGet(String NIF) throws Exception {
        List<Nomina> obj = imp.nominasNIFGet(NIF);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }
}
