package ms.matricula.controller;

import ms.matricula.services.AsignaturaByIdApi;
import ms.matricula.model.Asignatura;

import io.swagger.annotations.*;
import javax.sql.DataSource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "ms.matricula.codegen.languages.SpringCodegen", date = "2017-12-16T19:17:33.453Z")

@RestController
public class AsignaturaByIdApiController implements AsignaturaByIdApi {
    
    /**
     * La conexion a la base de datos
     */
    @Autowired
    private DataSource dataSource;

    @Override
    public ResponseEntity<Void> asignaturaByIdCodeDelete(@ApiParam(value = "Codigo de la asignatura", required = true) @PathVariable("code") Integer code) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Asignatura> asignaturaByIdCodeGet(@ApiParam(value = "Codigo de la asignatura", required = true) @PathVariable("code") Integer code) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> asignaturaByIdCodePut(@ApiParam(value = "Codigo de la asignatura que se quiere actualizar", required = true) @PathVariable("code") Integer code,
            @ApiParam(value = "Objeto JSON del contenido de la asignatura", required = true) @Valid @RequestBody Asignatura asignatura) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
