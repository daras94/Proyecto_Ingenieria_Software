package ms.matricula.controller;

import ms.matricula.services.CarrerasApi;
import ms.matricula.model.Carrera;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "ms.matricula.codegen.languages.SpringCodegen", date = "2017-12-16T19:17:33.453Z")

@RestController
public class CarrerasApiController implements CarrerasApi {
    
    /**
     * La conexion a la base de datos
     */
    @Autowired
    private DataSource dataSource;

    @Override
    public ResponseEntity<List<Carrera>> carrerasGet() {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
