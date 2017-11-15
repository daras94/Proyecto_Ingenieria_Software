package com.swagger.api;

import com.swagger.model.Matricula;

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
public class MatriculaApiController implements MatriculaApi {



    public ResponseEntity<Void> matriculaPost(@ApiParam(value = "Objeto JSON del contenido de la matricula" ,required=true )  @Valid @RequestBody Matricula matricula) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
