package ms.reserva.controller;

import ms.reserva.services.EspacioApi;
import ms.reserva.model.Espacio;

import io.swagger.annotations.*;
import javax.sql.DataSource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-16T19:10:53.003Z")

@RestController
public class EspacioApiController implements EspacioApi {
    
    /**
     * La conexion a la base de datos
     */
    @Autowired
    private DataSource dataSource;

    @Override
    public ResponseEntity<Void> espacioPost(@ApiParam(value = "Objeto JSON del contenido del espacio", required = true) @Valid @RequestBody Espacio reserva) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
