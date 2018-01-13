package controllers.reservas;

import models.Reserva;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
import services.GestionReservasApiControllerImpInterface;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T00:24:22.734Z")

public class GestionReservasApiControllerImp implements GestionReservasApiControllerImpInterface {
    @Override
    public void reservasActualizarPut( @NotNull String dia,  @NotNull Integer hora,  @NotNull Integer espacio, Reserva reserva) throws Exception {
        //Do your magic!!!
        
    }

    @Override
    public void reservasCancelarDelete( @NotNull String dia,  @NotNull Integer hora,  @NotNull Integer espacio) throws Exception {
        //Do your magic!!!
        
    }

    @Override
    public void reservasReservarPost(Reserva reserva) throws Exception {
        //Do your magic!!!
        
    }

}
