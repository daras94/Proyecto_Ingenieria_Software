package ms.profesor.controller;

import ms.profesor.model.Nomina;

import io.swagger.annotations.*;
import javax.sql.DataSource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "ms.profesor.codegen.languages.SpringCodegen", date = "2017-12-16T19:13:21.767Z")

@RestController
public class NominaApiController implements NominaApi {
    
    /**
     * La conexion a la base de datos
     */
    @Autowired
    private DataSource dataSource;

    @Override
    public ResponseEntity<Void> nominaPost(@ApiParam(value = "Objeto JSON del contenido de la nomina", required = true) @Valid @RequestBody Nomina nomina) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
