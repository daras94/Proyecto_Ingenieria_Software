package ms.profesor.controller;

import ms.profesor.services.NominaByNIFApi;
import ms.profesor.model.Nomina;

import io.swagger.annotations.*;
import javax.sql.DataSource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "ms.profesor.codegen.languages.SpringCodegen", date = "2017-12-16T19:13:21.767Z")

@RestController
public class NominaByNIFApiController implements NominaByNIFApi {
    
    /**
     * La conexion a la base de datos
     */
    @Autowired
    private DataSource dataSource;

    @Override
    public ResponseEntity<Void> nominaByNIFNIFNumberDelete(@ApiParam(value = "NIF del profesor", required = true) @PathVariable("NIF") Integer NIF,
            @ApiParam(value = "Fecha de la nomina", required = true) @PathVariable("number") Integer number) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Nomina> nominaByNIFNIFNumberGet(@ApiParam(value = "NIF del profesor", required = true) @PathVariable("NIF") Integer NIF,
            @ApiParam(value = "Fecha de la nomina", required = true) @PathVariable("number") Integer number) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> nominaByNIFNIFNumberPut(@ApiParam(value = "NIF del profesor", required = true) @PathVariable("NIF") Integer NIF,
            @ApiParam(value = "Fecha de la nomina", required = true) @PathVariable("number") Integer number,
            @ApiParam(value = "Objeto JSON del contenido de la nomina", required = true) @Valid @RequestBody Nomina departamento) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
