package controllers;


import static ConexionBBDD.BBDD.*;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-04T17:39:30.340Z")

public class MatriculaApiControllerImp implements MatriculaApiControllerImpInterface {
    @Override
    public Boolean reservaMatriculaGet( @NotNull Integer promocion,  @NotNull String alumno) throws Exception {
        //Do your magic!!!
        return new Boolean();
    }

    @Override
    public void reservaMatriculaPut( @NotNull Integer promocion,  @NotNull String alumno) throws Exception {
        String query = "UPDATE Matricula SET reserva = true WHERE Curso = "+promocion+" AND num_expediente = (SELECT num_expediente FROM Alumno WHERE Usuario_DNI = "+alumno+");";
        try{
            conectar();
        
            actualizar_BDD(query);
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }

}
