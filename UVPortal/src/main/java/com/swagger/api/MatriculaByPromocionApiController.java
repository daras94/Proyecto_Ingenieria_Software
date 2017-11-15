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
public class MatriculaByPromocionApiController implements MatriculaByPromocionApi {



    public ResponseEntity<Void> matriculaByPromocionPromocionDelete(@ApiParam(value = "Promocion de la matricula",required=true ) @PathVariable("promocion") Integer promocion) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Matricula> matriculaByPromocionPromocionGet(@ApiParam(value = "Promocion de la matricula que se esta buscando",required=true ) @PathVariable("promocion") Integer promocion) {
        // do some magic!
        return new ResponseEntity<Matricula>(HttpStatus.OK);
    }

    public ResponseEntity<Void> matriculaByPromocionPromocionPut(@ApiParam(value = "Promocion de la matricula que se quiere actualizar",required=true ) @PathVariable("promocion") Integer promocion,
        @ApiParam(value = "Objeto JSON del contenido de la matricula" ,required=true )  @Valid @RequestBody Matricula matricula) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
