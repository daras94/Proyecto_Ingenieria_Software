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

public class MatriculaApiControllerImp implements MatriculaApiControllerImpInterface {
    @Override
    public void eliminarMatriculasDelete( @NotNull Integer promocion) throws Exception {
        String query = "DELETE FROM matricula WHERE Curso = "+promocion+" AND reserva = false);";
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

    @Override
    public void eliminarMatriculasPorPlazoDelete( @NotNull Integer promocion,  @NotNull Integer numPago) throws Exception {
        String query1 = "SELECT pagado, num_expediente FROM Pago WHERE Curso = "+promocion+" AND numero_pago = "+numPago+";";
        try{
            conectar();
        
            ResultSet respuesta = consulta_BDD(query1);
            while(respuesta.next()){
                if(respuesta.getBoolean("pagado") == false){
                    String query2 = "DELETE FROM Pago WHERE num_expediente = "+respuesta.getInt("num_expediente")+" AND Curso = "+promocion+";";
                    String query3 = "DELETE FROM Matricula WHERE Curso = "+promocion+" AND num_expediente = "+respuesta.getInt("num_expediente")+";";
                    actualizar_BDD(query2, query3);
                }
            }
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
        finally{
            if(conexion!=null){
                conexion.close();
            }
        }
        
    }

}
