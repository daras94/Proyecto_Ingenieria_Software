package controllers;

import apimodels.Reserva;

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
import java.sql.SQLException;

import javax.validation.constraints.*;

import swagger.SwaggerUtils.ApiAction;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-04T16:38:57.570Z")

public class GestionReservasApiController extends Controller {

    private final GestionReservasApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private GestionReservasApiController(GestionReservasApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result reservasActualizarPut() throws Exception {
        JsonNode nodereserva = request().body().asJson();
        Reserva reserva;

        reserva = mapper.readValue(nodereserva.toString(), Reserva.class);

        String valuedia = request().getQueryString("dia");
        String dia;

        dia = (String)valuedia;

        String valuehora = request().getQueryString("hora");
        Integer hora;

        hora = Integer.parseInt(valuehora);

        String valueespacio = request().getQueryString("espacio");
        Integer espacio;

        espacio = Integer.parseInt(valueespacio);

        try{
            imp.reservasActualizarPut(dia, hora, espacio, reserva);
        
            return ok(mapper.createObjectNode()); 
        }catch(Exception e){
            return badRequest();
        }
    }

    @ApiAction
    public Result reservasCancelarDelete() throws Exception {
        String valuedia = request().getQueryString("dia");
        String dia;

        dia = (String)valuedia;

        String valuehora = request().getQueryString("hora");
        Integer hora;

        hora = Integer.parseInt(valuehora);

        String valueespacio = request().getQueryString("espacio");
        Integer espacio;

        espacio = Integer.parseInt(valueespacio);
           System.out.println("1");
        try{
            imp.reservasCancelarDelete(dia, hora, espacio);

            return ok(mapper.createObjectNode());
        }catch(Exception e){
            return badRequest();
        }
    }

    @ApiAction
    public Result reservasReservarPost() throws Exception {
        JsonNode nodereserva = request().body().asJson();
        Reserva reserva;

        reserva = mapper.readValue(nodereserva.toString(), Reserva.class);

        try{
            imp.reservasReservarPost(reserva);
        
            return ok(mapper.createObjectNode()); 
        }catch(Exception e){
            return badRequest();
        }
    }
    
    @ApiAction
    public Result reservasNifGet(String nif) throws Exception {
        List<Reserva> obj = imp.reservasNifGet(nif);
        
        try{
            JsonNode result = mapper.valueToTree(obj);
            return ok(result); 
        }catch(Exception e){
            return badRequest();
        }
        
    }
}
