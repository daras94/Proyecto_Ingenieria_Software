package controllers.economicaProfesor;

import models.Factura;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
import services.FacturaApiControllerImpInterface;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T00:24:22.734Z")

public class FacturaApiControllerImp implements FacturaApiControllerImpInterface {
    @Override
    public List<Factura> facturasGet( @NotNull String NIF,  @NotNull Integer mes,  @NotNull Integer ao) throws Exception {
        //Do your magic!!!
        return new ArrayList<Factura>();
    }

}
