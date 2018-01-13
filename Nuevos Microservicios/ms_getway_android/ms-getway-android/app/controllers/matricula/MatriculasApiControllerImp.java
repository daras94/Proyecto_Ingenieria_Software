package controllers.matricula;

import models.Matricula;
import models.MatriculaAlta;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
import services.MatriculasApiControllerImpInterface;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T00:24:22.734Z")

public class MatriculasApiControllerImp implements MatriculasApiControllerImpInterface {
    @Override
    public void crearMatriculaNumeroExpedientePost(Integer numeroExpediente, MatriculaAlta grupos) throws Exception {
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
