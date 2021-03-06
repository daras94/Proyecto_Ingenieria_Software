/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package ms.profesor.services;

import ms.profesor.model.Profesor;

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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-16T19:13:21.767Z")

@Api(value = "profesor", description = "the profesor API")
public interface ProfesorApi {

    @ApiOperation(value = "Dar de alta un profesor", notes = "Integrar en la base de datos la informacion de un nuevo profesor.", response = Void.class, tags={ "Profesor", })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "Operacion realizada con exito", response = Void.class),
        @ApiResponse(code = 405, message = "Operacion sin realizar", response = Void.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Void.class) })
    
    @RequestMapping(value = "/profesor",
        method = RequestMethod.POST)
    ResponseEntity<Void> profesorPost(@ApiParam(value = "Objeto JSON del contenido del profesor" ,required=true )  @Valid @RequestBody Profesor profesor);

}
