package ms.reserva.controller;

import ms.reserva.services.ReservaGrupoByCodeApi;
import ms.reserva.model.ReservaGrupo;

import io.swagger.annotations.*;
import javax.sql.DataSource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-16T19:10:53.003Z")

@RestController
public class ReservaGrupoByCodeApiController implements ReservaGrupoByCodeApi {
    
    /**
     * La conexion a la base de datos
     */
    @Autowired
    private DataSource dataSource;

    @Override
    public ResponseEntity<Void> reservaGrupoByCodeCodeDateHourDelete(@ApiParam(value = "codigo del grupo", required = true) @PathVariable("code") String code,
            @ApiParam(value = "fecha de la reserva", required = true) @PathVariable("date") String date,
            @ApiParam(value = "hora de la reserva", required = true) @PathVariable("hour") Integer hour) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> reservaGrupoByCodeCodeDateHourPut(@ApiParam(value = "codigo del grupo", required = true) @PathVariable("code") String code,
            @ApiParam(value = "fecha de la reserva", required = true) @PathVariable("date") String date,
            @ApiParam(value = "hora de la reserva", required = true) @PathVariable("hour") Integer hour,
            @ApiParam(value = "Objeto JSON del contenido de la reserva", required = true) @Valid @RequestBody ReservaGrupo reserva) {
        // do some magic!
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
