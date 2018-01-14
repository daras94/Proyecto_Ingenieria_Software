package ms.alumno.controller;

import ms.alumno.services.PagosApi;
import ms.alumno.model.Pago;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import javax.sql.DataSource;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "ms.alumno.codegen.languages.SpringCodegen", date = "2017-12-16T19:24:41.547Z")

@RestController
public class PagosApiController implements PagosApi {
    
    /**
     * La conexion a la base de datos
     */
    @Autowired
    private DataSource dataSource;

    @Override
    public ResponseEntity<Void> pagosPost(@ApiParam(value = "Objeto JSON del contenido del pago", required = true) @Valid @RequestBody List<Pago> pago) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
