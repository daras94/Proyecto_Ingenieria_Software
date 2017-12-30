package ms.reserva.controller;

import ms.reserva.services.ReservasByProfesorApi;
import ms.reserva.model.ReservaProfesor;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-16T19:10:53.003Z")

@RestController
public class ReservasByProfesorApiController implements ReservasByProfesorApi {
    
    /**
     * La conexion a la base de datos
     */
    @Autowired
    private DataSource dataSource;

    @Override
    public ResponseEntity<List<ReservaProfesor>> reservasByProfesorNIFGet(@ApiParam(value = "NIF del profesor", required = true) @PathVariable("NIF") Integer NIF) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
