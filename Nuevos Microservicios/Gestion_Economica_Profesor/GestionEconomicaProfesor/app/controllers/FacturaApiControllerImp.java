package controllers;

import apimodels.Factura;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-04T20:12:09.365Z")

public class FacturaApiControllerImp implements FacturaApiControllerImpInterface {
    @Override
    public List<Factura> facturasGet(String NIF, Integer mes, Integer ao) throws Exception {
        //Do your magic!!!
        return new ArrayList<Factura>();
    }

}
