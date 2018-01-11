package controllers.ms_gestion_economica;

import services.GestionDeNominas_ApiControllerImpInterface;
import models.Nomina;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-05T21:31:07.061Z")

public class GestionDeNominas_ApiControllerImp implements GestionDeNominas_ApiControllerImpInterface {
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
