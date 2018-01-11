package controllers.ms_gestion_reservas;

import services.GestionDeConsultasDeReservas_ApiControllerImpInterface;
import models.EspaciosLibres;
import models.HorasLibres;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-05T21:31:07.061Z")

public class GestionDeConsultasDeReservas_ApiControllerImp implements GestionDeConsultasDeReservas_ApiControllerImpInterface {
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
