package com.swagger.controller;

import com.swagger.api.CarreraByIDApi;
import com.swagger.model.Carrera;

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
public class CarreraByIDApiController implements CarreraByIDApi {



    @Override
    public ResponseEntity<Void> carreraByIDIDDelete(@ApiParam(value = "ID de la carrera",required=true ) @PathVariable("ID") Integer ID) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Carrera> carreraByIDIDGet(@ApiParam(value = "ID de la carrera",required=true ) @PathVariable("ID") Integer ID) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> carreraByIDIDPut(@ApiParam(value = "ID de la carrera que se quiere actualizar",required=true ) @PathVariable("ID") Integer ID,
        @ApiParam(value = "Objeto JSON del contenido de la carrera" ,required=true )  @Valid @RequestBody Carrera carrera) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
