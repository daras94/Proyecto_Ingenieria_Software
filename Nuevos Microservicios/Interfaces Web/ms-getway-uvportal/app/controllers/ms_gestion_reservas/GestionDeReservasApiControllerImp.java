package controllers.ms_gestion_reservas;

import services.GestionDeReservasApiControllerImpInterface;
import models.Reserva;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-05T21:31:07.061Z")

public class GestionDeReservasApiControllerImp implements GestionDeReservasApiControllerImpInterface {
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
