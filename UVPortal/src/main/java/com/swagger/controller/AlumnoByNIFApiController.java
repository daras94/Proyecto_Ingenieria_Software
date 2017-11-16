package com.swagger.controller;

import com.swagger.api.AlumnoByNIFApi;
import com.swagger.model.Alumno;

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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-14T22:58:49.788Z")

@Controller
public class AlumnoByNIFApiController implements AlumnoByNIFApi {



    @Override
    public ResponseEntity<Void> alumnoByNIFNIFDelete(@ApiParam(value = "NIF del alumno",required=true ) @PathVariable("NIF") String NIF) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Alumno> alumnoByNIFNIFGet(@ApiParam(value = "NIF del alumno",required=true ) @PathVariable("NIF") String NIF) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> alumnoByNIFNIFPut(@ApiParam(value = "NIF del alumno que se quiere actualizar",required=true ) @PathVariable("NIF") String NIF,
        @ApiParam(value = "Objeto JSON del contenido del alumno" ,required=true )  @Valid @RequestBody Alumno alumno) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
