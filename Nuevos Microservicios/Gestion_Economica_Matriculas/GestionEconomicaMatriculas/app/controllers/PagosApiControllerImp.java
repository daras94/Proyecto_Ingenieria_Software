package controllers;

import apimodels.Pago;

import static ConexionBBDD.BBDD.*;
import java.sql.ResultSet;
import java.math.BigDecimal;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-04T17:39:30.340Z")

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

    @Override
    public List<Pago> pagosMatriculaGet( @NotNull Integer promocion,  @NotNull String alumno) throws Exception {
        
        String query = "SELECT * FROM Pago WHERE Curso = "+promocion+" AND num_expediente = (SELECT num_expediente FROM Alumno WHERE Usuario_DNI = "+alumno+");";
        ArrayList<Pago> pagos = new ArrayList<Pago>();
        
        try{
            conectar();
        
           ResultSet resultado = consulta_BDD(query);
           while(resultado.next()){
               Integer numPago = (Integer) resultado.getInt("numero_pago");
               BigDecimal importe = resultado.getBigDecimal("importe");
               boolean pagado = resultado.getBoolean("pagado");
               Pago pago = new Pago();
               pago.setNumPago(numPago);
               pago.setImporte(importe);
               pago.setPagado(pagado);
               
               pagos.add(pago);
           }
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        finally{
            if(conexion!=null){
                conexion.close();
            }
            return pagos;
        }
    }

}
