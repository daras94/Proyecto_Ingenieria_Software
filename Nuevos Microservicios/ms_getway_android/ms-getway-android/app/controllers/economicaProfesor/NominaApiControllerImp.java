package controllers.economicaProfesor;

import models.Nomina;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
import services.NominaApiControllerImpInterface;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T00:24:22.734Z")

public class NominaApiControllerImp implements NominaApiControllerImpInterface {
    @Override
    public void nominaPost( @NotNull String NIF,  @NotNull String fecha) throws Exception {
        //Do your magic!!!
        
    }

    @Override
    public List<Nomina> nominasNIFGet(String NIF) throws Exception {
        //Do your magic!!!
        return new ArrayList<Nomina>();
    }

}
