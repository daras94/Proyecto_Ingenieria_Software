package controllers;


import static conexionbbdd.BBDD.*;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import java.sql.ResultSet;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-08T16:26:42.569Z")

public class AlumnoApiControllerImp implements AlumnoApiControllerImpInterface {
    @Override
    public List<String> getCorreosGet( @NotNull Integer promocion,  @NotNull Integer plazo) throws Exception {
        String query = "SELECT email FROM usuario WHERE NIF = (SELECT Usuario_NIF FROM alumno WHERE num_expediente = (SELECT num_expediente FROM pago WHERE Curso = "+promocion+" AND numero_pago = "+plazo+" AND pagado = false));";
        ArrayList<String> correos = new ArrayList<String>();
        
        try{
            conectar();
        
            ResultSet respuesta = consulta_BDD(query);
            
            while(respuesta.next()){
                String email = respuesta.getString(1);
                correos.add(email);
            }
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        finally{
            if(conexion!=null){
                conexion.close();
            }
            return correos;
        }
    }

}
