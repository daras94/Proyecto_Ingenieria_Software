package controllers;

import apimodels.Factura;
import static conexionbbdd.BBDD.conectar;
import static conexionbbdd.BBDD.consulta_BDD;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.sql.ResultSet;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-14T17:04:47.834Z")

public class FacturaApiControllerImp implements FacturaApiControllerImpInterface {
    @Override
    public List<Factura> facturasGet(String NIF, Integer mes, Integer anno) throws Exception {
        ArrayList<Factura> facturas= new ArrayList<>();
        try{
            conectar();
            String sql = "SELECT * FROM reservaprofesor WHERE Profesor_NIF = '"+NIF+ "' AND MONTH(fecha)= "+mes+" AND YEAR(fecha)= "+anno;
            ResultSet resultado = consulta_BDD(sql);
             
            while (resultado.next()){
                int ID_Espacio= resultado.getInt("ID_Espacio");
                String fecha= resultado.getString("fecha");
                int hora= resultado.getInt("hora");
                Factura factura= new Factura();
                factura.setEspacio(String.valueOf(ID_Espacio));
                factura.setHora(String.valueOf(hora));
                factura.setFecha(fecha);
                sql= "SELECT precio_alquiler FROM espacio WHERE codigo = "+ID_Espacio;
                ResultSet resultado_espacio = consulta_BDD(sql);
                if (resultado_espacio.next()){
                    double precio= resultado_espacio.getDouble("precio_alquiler");
                    factura.setCoste(BigDecimal.valueOf(precio));
                }
                facturas.add(factura);
            }
        }
        catch (Exception e){
            return null;
        }
        return facturas;
    }
}
