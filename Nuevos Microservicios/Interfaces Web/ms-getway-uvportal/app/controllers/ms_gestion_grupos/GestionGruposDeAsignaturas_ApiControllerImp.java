package controllers.ms_gestion_grupos;

import services.GestionGruposDeAsignaturas_ApiControllerImpInterface;
import models.GrupoAsignatura;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-05T21:31:07.061Z")

public class GestionGruposDeAsignaturas_ApiControllerImp implements GestionGruposDeAsignaturas_ApiControllerImpInterface {
    @Override
    public List<GrupoAsignatura> asignaturasMatriculablesByAlumnoNumeroExpedienteGet(Integer numeroExpediente) throws Exception {
        //Do your magic!!!
        return new ArrayList<GrupoAsignatura>();
    }

}
