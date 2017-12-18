package ms.alumno.controller;

import ms.alumno.services.MatriculasByNIFApi;
import ms.alumno.model.Matricula;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "ms.alumno.codegen.languages.SpringCodegen", date = "2017-12-16T19:24:41.547Z")

@RestController
public class MatriculasByNIFApiController implements MatriculasByNIFApi {
    
    /**
     * La conexion a la base de datos
     */
    @Autowired
    private DataSource dataSource;

    @Override
    public ResponseEntity<List<Matricula>> matriculasByNIFNIFGet(@ApiParam(value = "NIF del alumno", required = true) @PathVariable("NIF") String NIF) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
