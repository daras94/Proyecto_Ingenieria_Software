package services;

import models.Factura;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface FacturaApiControllerImpInterface {
    List<Factura> facturasGet( @NotNull String NIF,  @NotNull Integer mes,  @NotNull Integer ao) throws Exception;

}
