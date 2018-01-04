package ms.profesor.controller;

import ms.profesor.services.DepartamentosApi;
import ms.profesor.model.Departamento;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-16T19:13:21.767Z")

@RestController
public class DepartamentosApiController implements DepartamentosApi {
    
    /**
     * La conexion a la base de datos
     */
    @Autowired
    private DataSource dataSource;

    @Override
    public ResponseEntity<List<Departamento>> departamentosGet() {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
