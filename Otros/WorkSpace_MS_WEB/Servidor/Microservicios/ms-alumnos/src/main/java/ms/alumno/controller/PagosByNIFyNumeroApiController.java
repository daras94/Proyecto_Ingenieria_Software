package ms.alumno.controller;

import ms.alumno.services.PagosByNIFyNumeroApi;
import ms.alumno.model.Pago;

import io.swagger.annotations.*;
import javax.sql.DataSource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "ms.alumno.codegen.languages.SpringCodegen", date = "2017-12-16T19:24:41.547Z")

@RestController
public class PagosByNIFyNumeroApiController implements PagosByNIFyNumeroApi {
    
    /**
     * La conexion a la base de datos
     */
    @Autowired
    private DataSource dataSource;

    @Override
    public ResponseEntity<Void> pagosByNIFyNumeroNIFNumberDelete(@ApiParam(value = "NIF del alumno", required = true) @PathVariable("NIF") String NIF,
            @ApiParam(value = "numero de pago", required = true) @PathVariable("number") String number) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> pagosByNIFyNumeroNIFNumberPut(@ApiParam(value = "NIF del alumno", required = true) @PathVariable("NIF") String NIF,
            @ApiParam(value = "numero de pago", required = true) @PathVariable("number") String number,
            @ApiParam(value = "Objeto JSON del contenido del pago", required = true) @Valid @RequestBody Pago pago) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
