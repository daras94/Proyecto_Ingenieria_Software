package controllers.ms_gestion_recursos;

import services.GestionDeFactura_ApiControllerImpInterface;
import models.Factura;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-05T21:31:07.061Z")

public class GestionDeFactura_ApiControllerImp implements GestionDeFactura_ApiControllerImpInterface {
    @Override
    public List<Factura> facturasGet(String NIF, Integer mes, Integer ao) throws Exception {
        //Do your magic!!!
        return new ArrayList<Factura>();
    }

}
