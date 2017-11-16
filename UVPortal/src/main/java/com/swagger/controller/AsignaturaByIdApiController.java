package com.swagger.controller;

import com.swagger.api.AsignaturaByIdApi;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-14T22:58:49.788Z")

@Controller
public class AsignaturaByIdApiController implements AsignaturaByIdApi {



    @Override
    public ResponseEntity<Void> asignaturaByIdCodeDelete(@ApiParam(value = "Codigo de la asignatura",required=true ) @PathVariable("code") Integer code) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Asignatura> asignaturaByIdCodeGet(@ApiParam(value = "Codigo de la asignatura",required=true ) @PathVariable("code") Integer code) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> asignaturaByIdCodePut(@ApiParam(value = "Codigo de la asignatura que se quiere actualizar",required=true ) @PathVariable("code") Integer code,
        @ApiParam(value = "Objeto JSON del contenido de la asignatura" ,required=true )  @Valid @RequestBody Asignatura asignatura) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
