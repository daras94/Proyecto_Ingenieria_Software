package ms.alumno.controller;

import ms.alumno.services.AlumnoApi;
import ms.alumno.model.Alumno;

import io.swagger.annotations.*;
import javax.sql.DataSource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "ms.alumno.codegen.languages.SpringCodegen", date = "2017-12-16T19:24:41.547Z")

@RestController
public class AlumnoApiController implements AlumnoApi {
    
    /**
     * La conexion a la base de datos
     */
    @Autowired
    private DataSource dataSource;

    @Override
    public ResponseEntity<Void> alumnoPost(@ApiParam(value = "Objeto JSON del contenido del alumno", required = true) @Valid @RequestBody Alumno alumno) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
