package ms.alumno.controller;

import ms.alumno.services.MatriculaApi;
import ms.alumno.model.Matricula;

import io.swagger.annotations.*;
import javax.sql.DataSource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-16T19:24:41.547Z")

@RestController
public class MatriculaApiController implements MatriculaApi {
    
    /**
     * La conexion a la base de datos
     */
    @Autowired
    private DataSource dataSource;

    @Override
    public ResponseEntity<Void> matriculaPost(@ApiParam(value = "Objeto JSON del contenido de la matricula", required = true) @Valid @RequestBody Matricula matricula) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
