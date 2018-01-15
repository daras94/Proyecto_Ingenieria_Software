package controllers;

import apimodels.Factura;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

public interface FacturaApiControllerImpInterface {
    List<Factura> facturasGet(String NIF, Integer mes, Integer anno) throws Exception;

}
