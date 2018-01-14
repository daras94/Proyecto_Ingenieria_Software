package ms.usuario.controller;

import ms.usuario.services.UsuarioByNIFApi;
import ms.usuario.model.Usuario;

import io.swagger.annotations.*;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-16T19:05:52.542Z")

@RestController
public class UsuarioByNIFApiController implements UsuarioByNIFApi {

    /**
     * La conexion a la base de datos
     */
    @Autowired
    private DataSource dataSource;
    
    @Override
    public ResponseEntity<Usuario> usuarioByNIFNIFGet(@ApiParam(value = "NIF del usuario", required = true) @PathVariable("NIF") String NIF) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
