/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package ms.matricula.services;

import ms.matricula.model.Carrera;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-16T19:17:33.453Z")

@Api(value = "carreraByCode", description = "the carreraByCode API")
public interface CarreraByCodeApi {

    @ApiOperation(value = "Eliminar carrera por el codigo", notes = "Eliminar la carrera de la base de datos por ID de usuario", response = Void.class, tags={ "Carrera", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Operacion realizada con exito", response = Void.class),
        @ApiResponse(code = 405, message = "Operacion sin realizar", response = Void.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Void.class) })
    
    @RequestMapping(value = "/carreraByCode/{code}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> carreraByCodeCodeDelete(@ApiParam(value = "Codigo de la carrera",required=true ) @PathVariable("code") Integer code);


    @ApiOperation(value = "Obtener carrera por codigo", notes = "Busqueda de la informacion de una carrera con su codigo", response = Carrera.class, tags={ "Carrera", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operacion realizada con exito", response = Carrera.class),
        @ApiResponse(code = 405, message = "Operacion sin realizar", response = Void.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Void.class) })
    
    @RequestMapping(value = "/carreraByCode/{code}",
        method = RequestMethod.GET)
    ResponseEntity<Carrera> carreraByCodeCodeGet(@ApiParam(value = "Codigo de la carrera",required=true ) @PathVariable("code") Integer code);


    @ApiOperation(value = "Actualizar carrera por code", notes = "Actualizacion de la informacion de una carrera.", response = Void.class, tags={ "Carrera", })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "Operacion realizada con exito", response = Void.class),
        @ApiResponse(code = 405, message = "Operacion sin realizar", response = Void.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Void.class) })
    
    @RequestMapping(value = "/carreraByCode/{code}",
        method = RequestMethod.PUT)
    ResponseEntity<Void> carreraByCodeCodePut(@ApiParam(value = "Codigo de la carrera que se quiere actualizar",required=true ) @PathVariable("code") Integer code,@ApiParam(value = "Objeto JSON del contenido de la carrera" ,required=true )  @Valid @RequestBody Carrera carrera);

}
