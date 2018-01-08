package controllers;


import static conexionbbdd.BBDD.*;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-08T16:26:42.569Z")

public class PagosApiControllerImp implements PagosApiControllerImpInterface {
    @Override
    public void actualizarPagoPut( @NotNull Integer promocion,  @NotNull String alumno,  @NotNull Integer numeroPago) throws Exception {
        String query = "UPDATE Pago SET pagado = true WHERE numero_pago = "+numeroPago+" AND Curso = "+promocion+" AND num_expediente = (SELECT num_expediente FROM Alumno WHERE Usuario_DNI = "+alumno+");";
        
        try{
            conectar();
        
            actualizar_BDD(query);
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        finally{
            if(conexion!=null){
                conexion.close();
            }
        }
        
    }

}
