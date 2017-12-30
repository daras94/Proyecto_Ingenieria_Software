package ms.alumno.controller;

import ms.alumno.services.MatriculaByNIFyPromocionApi;
import ms.alumno.model.Matricula;

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
public class MatriculaByNIFyPromocionApiController implements MatriculaByNIFyPromocionApi {
    
    /**
     * La conexion a la base de datos
     */
    @Autowired
    private DataSource dataSource;

    @Override
    public ResponseEntity<Void> matriculaByNIFyPromocionNIFPromocionDelete(@ApiParam(value = "Promocion de la matricula", required = true) @PathVariable("promocion") Integer promocion) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Matricula> matriculaByNIFyPromocionNIFPromocionGet(@ApiParam(value = "NIF del alumno", required = true) @PathVariable("NIF") String NIF,
            @ApiParam(value = "Promocion de la matricula que se esta buscando", required = true) @PathVariable("promocion") Integer promocion) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> matriculaByNIFyPromocionNIFPromocionPut(@ApiParam(value = "Promocion de la matricula que se quiere actualizar", required = true) @PathVariable("promocion") Integer promocion,
            @ApiParam(value = "Objeto JSON del contenido de la matricula", required = true) @Valid @RequestBody Matricula matricula) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
