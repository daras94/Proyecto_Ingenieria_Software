package ms.profesor.controller;

import ms.profesor.services.ProfesoresByDepartamentoApi;
import ms.profesor.model.Profesor;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "ms.profesor.codegen.languages.SpringCodegen", date = "2017-12-16T19:13:21.767Z")

@RestController
public class ProfesoresByDepartamentoApiController implements ProfesoresByDepartamentoApi {
    
    /**
     * La conexion a la base de datos
     */
    @Autowired
    private DataSource dataSource;

    @Override
    public ResponseEntity<List<Profesor>> profesoresByDepartamentoCodeGet(@ApiParam(value = "Codigo del grupo", required = true) @PathVariable("code") String code) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
