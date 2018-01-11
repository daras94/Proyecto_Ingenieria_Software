package services;

import models.Nomina;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface GestionDeNominas_ApiControllerImpInterface {
    void nominaPost( @NotNull String NIF,  @NotNull String fecha) throws Exception;

    List<Nomina> nominasNIFGet(String NIF) throws Exception;

}
