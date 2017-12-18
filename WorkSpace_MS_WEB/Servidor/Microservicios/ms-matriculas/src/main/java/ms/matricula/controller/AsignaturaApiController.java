package ms.matricula.controller;

import ms.matricula.services.AsignaturaApi;
import ms.matricula.model.Asignatura;

import io.swagger.annotations.*;
import javax.sql.DataSource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "ms.matricula.codegen.languages.SpringCodegen", date = "2017-12-16T19:17:33.453Z")

@RestController
public class AsignaturaApiController implements AsignaturaApi {
    
    /**
     * La conexion a la base de datos
     */
    @Autowired
    private DataSource dataSource;

    @Override
    public ResponseEntity<Void> asignaturaPost(@ApiParam(value = "", required = true) @Valid @RequestBody Asignatura asignatura) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
