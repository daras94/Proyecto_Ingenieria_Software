package services;

import models.Pago;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface GestionDePagosApiControllerImpInterface {
    void actualizarPagoPut( @NotNull Integer promocion,  @NotNull String alumno,  @NotNull Integer numeroPago) throws Exception;

    List<Pago> pagosMatriculaGet( @NotNull Integer promocion,  @NotNull String alumno) throws Exception;

}
