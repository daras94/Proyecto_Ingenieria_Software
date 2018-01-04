package controllers;

import apimodels.Pago;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-04T17:39:30.340Z")

public class PagosApiControllerImp implements PagosApiControllerImpInterface {
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
