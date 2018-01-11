package controllers.ms_gestion_matricula;


import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.IOException;
import swagger.SwaggerUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;

import swagger.SwaggerUtils.ApiAction;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-05T21:31:07.061Z")

public class GestionDeMatriculaApiController extends Controller {

    private final GestionDeMatriculaApiControllerImp imp;
    private final ObjectMapper mapper;

    @Inject
    private GestionDeMatriculaApiController(GestionDeMatriculaApiControllerImp imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
    }


    @ApiAction
    public Result reservaMatriculaGet() throws Exception {
        String valuepromocion = request().getQueryString("promocion");
        Integer promocion;

        promocion = Integer.parseInt(valuepromocion);

        String valuealumno = request().getQueryString("alumno");
        String alumno;

        alumno = (String)valuealumno;

        Boolean obj = imp.reservaMatriculaGet(promocion, alumno);
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
        
    }

    @ApiAction
    public Result reservaMatriculaPut() throws Exception {
        String valuepromocion = request().getQueryString("promocion");
        Integer promocion;

        promocion = Integer.parseInt(valuepromocion);

        String valuealumno = request().getQueryString("alumno");
        String alumno;

        alumno = (String)valuealumno;

        imp.reservaMatriculaPut(promocion, alumno);
        
        return ok();
    }
}
