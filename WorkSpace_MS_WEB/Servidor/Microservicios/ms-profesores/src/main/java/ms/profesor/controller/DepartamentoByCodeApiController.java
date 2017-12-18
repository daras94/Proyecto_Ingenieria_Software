package ms.profesor.controller;

import ms.profesor.services.DepartamentoByCodeApi;
import ms.profesor.model.Departamento;

import io.swagger.annotations.*;
import javax.sql.DataSource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "ms.controller.codegen.languages.SpringCodegen", date = "2017-12-16T19:13:21.767Z")

@RestController
public class DepartamentoByCodeApiController implements DepartamentoByCodeApi {
    
    /**
     * La conexion a la base de datos
     */
    @Autowired
    private DataSource dataSource;

    @Override
    public ResponseEntity<Void> departamentoByCodeCodeDelete(@ApiParam(value = "Codigo del departamento", required = true) @PathVariable("code") Integer code) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Departamento> departamentoByCodeCodeGet(@ApiParam(value = "Codigo del departamento", required = true) @PathVariable("code") Integer code) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> departamentoByCodeCodePut(@ApiParam(value = "Codigo del departamento", required = true) @PathVariable("code") Integer code,
            @ApiParam(value = "Objeto JSON del contenido del departamento", required = true) @Valid @RequestBody Departamento departamento) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
