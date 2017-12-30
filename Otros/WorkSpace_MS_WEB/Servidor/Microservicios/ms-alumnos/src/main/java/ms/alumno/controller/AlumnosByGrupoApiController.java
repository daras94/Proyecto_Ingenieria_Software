package ms.alumno.controller;

import ms.alumno.services.AlumnosByGrupoApi;
import ms.alumno.model.Alumno;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-16T19:24:41.547Z")

@RestController
public class AlumnosByGrupoApiController implements AlumnosByGrupoApi {
    
    /**
     * La conexion a la base de datos
     */
    @Autowired
    private DataSource dataSource;

    @Override
    public ResponseEntity<List<Alumno>> alumnosByGrupoCodeGet(@ApiParam(value = "Codigo del grupo", required = true) @PathVariable("code") String code) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
