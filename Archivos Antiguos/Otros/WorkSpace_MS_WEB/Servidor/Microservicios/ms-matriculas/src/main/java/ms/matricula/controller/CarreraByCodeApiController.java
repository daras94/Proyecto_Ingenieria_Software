package ms.matricula.controller;

import ms.matricula.services.CarreraByCodeApi;
import ms.matricula.model.Carrera;

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
public class CarreraByCodeApiController implements CarreraByCodeApi {
    
    /**
     * La conexion a la base de datos
     */
    @Autowired
    private DataSource dataSource;

    @Override
    public ResponseEntity<Void> carreraByCodeCodeDelete(@ApiParam(value = "Codigo de la carrera", required = true) @PathVariable("code") Integer code) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Carrera> carreraByCodeCodeGet(@ApiParam(value = "Codigo de la carrera", required = true) @PathVariable("code") Integer code) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> carreraByCodeCodePut(@ApiParam(value = "Codigo de la carrera que se quiere actualizar", required = true) @PathVariable("code") Integer code,
            @ApiParam(value = "Objeto JSON del contenido de la carrera", required = true) @Valid @RequestBody Carrera carrera) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
