package services;

import models.Reserva;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface GestionReservasApiControllerImpInterface {
    void reservasActualizarPut( @NotNull String dia,  @NotNull Integer hora,  @NotNull Integer espacio, Reserva reserva) throws Exception;

    void reservasCancelarDelete( @NotNull String dia,  @NotNull Integer hora,  @NotNull Integer espacio) throws Exception;

    void reservasReservarPost(Reserva reserva) throws Exception;
    
    List<Reserva> reservasNifGet(String nif) throws Exception;

}
