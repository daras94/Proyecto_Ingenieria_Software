package controllers.alumno;

import models.Carrera;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
import services.CarreraApiControllerImpInterface;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T00:24:22.734Z")

public class CarreraApiControllerImp implements CarreraApiControllerImpInterface {
    @Override
    public List<Carrera> getCarrerasGet() throws Exception {
        //Do your magic!!!
        return new ArrayList<Carrera>();
    }

}
