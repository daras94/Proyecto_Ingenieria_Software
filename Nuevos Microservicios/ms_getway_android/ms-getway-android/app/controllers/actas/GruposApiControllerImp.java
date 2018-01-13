package controllers.actas;

import models.Grupo;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
import services.GruposApiControllerImpInterface;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T00:24:22.734Z")

public class GruposApiControllerImp implements GruposApiControllerImpInterface {
    @Override
    public List<Grupo> obtenerGruposNifGet(String nif) throws Exception {
        //Do your magic!!!
        return new ArrayList<Grupo>();
    }

}
