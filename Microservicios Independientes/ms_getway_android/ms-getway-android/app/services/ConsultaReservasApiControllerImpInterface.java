package services;

import models.EspaciosLibres;
import models.HorasLibres;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface ConsultaReservasApiControllerImpInterface {
    List<EspaciosLibres> reservasDisponiblesEspaciosGet( @NotNull String dia,  @NotNull Integer hora) throws Exception;

    HorasLibres reservasDisponiblesHorasGet( @NotNull String dia,  @NotNull Integer espacio) throws Exception;

}
