package controllers.reservas;

import models.EspaciosLibres;
import models.HorasLibres;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
import services.ConsultaReservasApiControllerImpInterface;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T00:24:22.734Z")

public class ConsultaReservasApiControllerImp implements ConsultaReservasApiControllerImpInterface {
    @Override
    public List<EspaciosLibres> reservasDisponiblesEspaciosGet( @NotNull String dia,  @NotNull Integer hora) throws Exception {
        //Do your magic!!!
        return new ArrayList<EspaciosLibres>();
    }

    @Override
    public HorasLibres reservasDisponiblesHorasGet( @NotNull String dia,  @NotNull Integer espacio) throws Exception {
        //Do your magic!!!
        return new HorasLibres();
    }

}
