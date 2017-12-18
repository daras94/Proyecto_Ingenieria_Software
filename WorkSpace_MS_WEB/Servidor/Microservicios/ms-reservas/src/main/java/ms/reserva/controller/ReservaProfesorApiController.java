package ms.reserva.controller;

import ms.reserva.services.ReservaProfesorApi;
import ms.reserva.model.ReservaProfesor;

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
public class ReservaProfesorApiController implements ReservaProfesorApi {
    
    /**
     * La conexion a la base de datos
     */
    @Autowired
    private DataSource dataSource;

    @Override
    public ResponseEntity<Void> reservaProfesorPost(@ApiParam(value = "Objeto JSON del contenido de la reserva", required = true) @Valid @RequestBody ReservaProfesor reserva) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
