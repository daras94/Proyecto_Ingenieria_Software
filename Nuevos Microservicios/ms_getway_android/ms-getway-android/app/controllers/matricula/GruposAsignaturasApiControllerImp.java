package controllers.matricula;

import models.GrupoAsignatura;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
import services.GruposAsignaturasApiControllerImpInterface;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T00:24:22.734Z")

public class GruposAsignaturasApiControllerImp implements GruposAsignaturasApiControllerImpInterface {
    @Override
    public List<GrupoAsignatura> asignaturasMatriculablesByAlumnoNumeroExpedienteGet(Integer numeroExpediente) throws Exception {
        //Do your magic!!!
        return new ArrayList<GrupoAsignatura>();
    }

}
