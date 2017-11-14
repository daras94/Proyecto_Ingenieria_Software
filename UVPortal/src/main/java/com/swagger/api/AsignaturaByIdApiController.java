package com.swagger.api;

import com.swagger.model.Asignatura;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-14T09:20:41.795Z")

@Controller
public class AsignaturaByIdApiController implements AsignaturaByIdApi {



    public ResponseEntity<Void> asignaturaByIdIDDelete(@ApiParam(value = "ID de la asignatura",required=true ) @PathVariable("ID") Integer ID) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Asignatura> asignaturaByIdIDGet(@ApiParam(value = "ID de la asignatura",required=true ) @PathVariable("ID") Integer ID) {
        // do some magic!
        return new ResponseEntity<Asignatura>(HttpStatus.OK);
    }

    public ResponseEntity<Void> asignaturaByIdIDPut(@ApiParam(value = "ID de la asignatura que se quiere actualizar",required=true ) @PathVariable("ID") Integer ID,
        @ApiParam(value = "Objeto JSON del contenido de la asignatura" ,required=true )  @Valid @RequestBody Asignatura asignatura) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
