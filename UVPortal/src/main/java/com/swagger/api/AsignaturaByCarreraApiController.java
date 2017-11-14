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
public class AsignaturaByCarreraApiController implements AsignaturaByCarreraApi {



    public ResponseEntity<List<Asignatura>> asignaturaByCarreraCarreraGet(@ApiParam(value = "Carrera de la asignaturas que se quieren obtener",required=true ) @PathVariable("Carrera") String carrera) {
        // do some magic!
        return new ResponseEntity<List<Asignatura>>(HttpStatus.OK);
    }

}
