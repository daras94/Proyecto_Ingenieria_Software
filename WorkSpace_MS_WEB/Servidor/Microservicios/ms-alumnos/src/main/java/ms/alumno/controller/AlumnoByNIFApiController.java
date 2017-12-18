package ms.alumno.controller;

import ms.alumno.services.AlumnoByNIFApi;
import ms.alumno.model.Alumno;

import io.swagger.annotations.*;
import javax.sql.DataSource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "ms.alumno.codegen.languages.SpringCodegen", date = "2017-12-16T19:24:41.547Z")

@RestController
public class AlumnoByNIFApiController implements AlumnoByNIFApi {
    
    /**
     * La conexion a la base de datos
     */
    @Autowired
    private DataSource dataSource;

    @Override
    public ResponseEntity<Void> alumnoByNIFNIFDelete(@ApiParam(value = "NIF del alumno", required = true) @PathVariable("NIF") String NIF) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Alumno> alumnoByNIFNIFGet(@ApiParam(value = "NIF del alumno", required = true) @PathVariable("NIF") String NIF) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> alumnoByNIFNIFPut(@ApiParam(value = "NIF del alumno que se quiere actualizar", required = true) @PathVariable("NIF") String NIF,
            @ApiParam(value = "Objeto JSON del contenido del alumno", required = true) @Valid @RequestBody Alumno alumno) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
