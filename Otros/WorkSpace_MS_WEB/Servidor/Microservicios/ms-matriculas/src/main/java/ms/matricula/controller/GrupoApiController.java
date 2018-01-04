package ms.matricula.controller;

import ms.matricula.services.GrupoApi;
import ms.matricula.model.Grupo;

import io.swagger.annotations.*;
import javax.sql.DataSource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "ms.matricula.codegen.languages.SpringCodegen", date = "2017-12-16T19:17:33.453Z")

@RestController
public class GrupoApiController implements GrupoApi {
    
    /**
     * La conexion a la base de datos
     */
    @Autowired
    private DataSource dataSource;

    @Override
    public ResponseEntity<Void> grupoPost(@ApiParam(value = "Objeto JSON del contenido del grupo", required = true) @Valid @RequestBody Grupo grupo) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
