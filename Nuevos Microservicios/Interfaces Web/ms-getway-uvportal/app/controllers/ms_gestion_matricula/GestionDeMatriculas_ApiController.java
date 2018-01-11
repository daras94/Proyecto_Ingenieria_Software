package controllers.ms_gestion_matricula;

import models.GrupoAsignatura;
import java.util.List;
import models.Matricula;

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

public class GestionDeMatriculas_ApiController extends Controller {

    private final GestionDeMatriculas_ApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private GestionDeMatriculas_ApiController(GestionDeMatriculas_ApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result crearMatriculaNumeroExpedientePost(Integer numeroExpediente) throws Exception {
        JsonNode nodegrupos = request().body().asJson();
        List<GrupoAsignatura> grupos;

        grupos = mapper.readValue(nodegrupos.toString(), new TypeReference<List<List<GrupoAsignatura>>>(){});

        imp.crearMatriculaNumeroExpedientePost(numeroExpediente, grupos);
        
        return ok();
    }

    @ApiAction
    public Result realizarReservaNumeroExpedientePut(Integer numeroExpediente) throws Exception {
        imp.realizarReservaNumeroExpedientePut(numeroExpediente);
        
        return ok();
    }

    @ApiAction
    public Result verExpedienteNumeroExpedienteGet(Integer numeroExpediente) throws Exception {
        List<Matricula> obj = imp.verExpedienteNumeroExpedienteGet(numeroExpediente);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }
}
