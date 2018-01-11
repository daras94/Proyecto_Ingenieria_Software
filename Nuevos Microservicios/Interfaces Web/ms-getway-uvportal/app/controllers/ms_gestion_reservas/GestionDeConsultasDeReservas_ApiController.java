package controllers.ms_gestion_reservas;

import models.EspaciosLibres;
import models.HorasLibres;

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

public class GestionDeConsultasDeReservas_ApiController extends Controller {

    private final GestionDeConsultasDeReservas_ApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private GestionDeConsultasDeReservas_ApiController(GestionDeConsultasDeReservas_ApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result reservasDisponiblesEspaciosGet() throws Exception {
        String valuedia = request().getQueryString("dia");
        String dia;

        dia = (String)valuedia;

        String valuehora = request().getQueryString("hora");
        Integer hora;

        hora = Integer.parseInt(valuehora);

        List<EspaciosLibres> obj = imp.reservasDisponiblesEspaciosGet(dia, hora);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }

    @ApiAction
    public Result reservasDisponiblesHorasGet() throws Exception {
        String valuedia = request().getQueryString("dia");
        String dia;

        dia = (String)valuedia;

        String valueespacio = request().getQueryString("espacio");
        Integer espacio;

        espacio = Integer.parseInt(valueespacio);

        HorasLibres obj = imp.reservasDisponiblesHorasGet(dia, espacio);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }
}
