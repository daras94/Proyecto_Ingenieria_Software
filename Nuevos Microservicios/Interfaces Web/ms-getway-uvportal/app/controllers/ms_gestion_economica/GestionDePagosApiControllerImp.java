package controllers.ms_gestion_economica;

import services.GestionDePagosApiControllerImpInterface;
import models.Pago;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-05T21:31:07.061Z")

public class GestionDePagosApiControllerImp implements GestionDePagosApiControllerImpInterface {
    @Override
    public void actualizarPagoPut( @NotNull Integer promocion,  @NotNull String alumno,  @NotNull Integer numeroPago) throws Exception {
        //Do your magic!!!
        
    }

    @Override
    public List<Pago> pagosMatriculaGet( @NotNull Integer promocion,  @NotNull String alumno) throws Exception {
        //Do your magic!!!
        return new ArrayList<Pago>();
    }

}
