package controllers.ms_gestion_matricula;

import services.GestionDeMatriculas_ApiControllerImpInterface;
import models.GrupoAsignatura;
import java.util.List;
import models.Matricula;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-05T21:31:07.061Z")

public class GestionDeMatriculas_ApiControllerImp implements GestionDeMatriculas_ApiControllerImpInterface {
    @Override
    public void crearMatriculaNumeroExpedientePost(Integer numeroExpediente, List<GrupoAsignatura> grupos) throws Exception {
        //Do your magic!!!
        
    }

    @Override
    public void realizarReservaNumeroExpedientePut(Integer numeroExpediente) throws Exception {
        //Do your magic!!!
        
    }

    @Override
    public List<Matricula> verExpedienteNumeroExpedienteGet(Integer numeroExpediente) throws Exception {
        //Do your magic!!!
        return new ArrayList<Matricula>();
    }

}
