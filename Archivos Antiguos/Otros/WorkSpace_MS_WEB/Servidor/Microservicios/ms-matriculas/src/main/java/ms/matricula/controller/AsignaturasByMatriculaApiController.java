package ms.matricula.controller;

import ms.matricula.services.AsignaturasByMatriculaApi;
import ms.matricula.model.Asignatura;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "ms.matricula.codegen.languages.SpringCodegen", date = "2017-12-16T19:17:33.453Z")

@RestController
public class AsignaturasByMatriculaApiController implements AsignaturasByMatriculaApi {
    
    /**
     * La conexion a la base de datos
     */
    @Autowired
    private DataSource dataSource;

    @Override
    public ResponseEntity<List<Asignatura>> asignaturasByMatriculaNIFPromocionGet(@ApiParam(value = "NIF del alumno", required = true) @PathVariable("NIF") String NIF,
            @ApiParam(value = "NIF del alumno", required = true) @PathVariable("promocion") String promocion) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
