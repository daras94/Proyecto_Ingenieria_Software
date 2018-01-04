package controllers;

import apimodels.Nomina;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-04T20:12:09.365Z")

public class NominaApiControllerImp implements NominaApiControllerImpInterface {
    @Override
    public void nominaPost( @NotNull String NIF,  @NotNull String fecha) throws Exception {
        //Do your magic!!!
        
    }

    @Override
    public List<Nomina> nominasNIFGet(String NIF) throws Exception {
        ArrayList<Nomina> nominas= new ArrayList<>();
        try{
            conectar();
            String sql = "SELECT * from nomina WHERE Profesor_NIF = "+NIF;
            ResultSet resultado = consulta_BDD(sql);
            while (resultado.next()){
                String profesor= resultado.getString("Profesor_NIF");
                int numero= resultado.getInt("numero");
                String fecha= resultado.getString("fecha");
                double salario= resultado.getDouble("salario");
                Nomina nomina= new Nomina();
                nomina.setNIF(profesor);
                nomina.setNumero(numero);
                nomina.setFecha(fecha);
                nomina.setSalario(BigDecimal.valueOf(salario));
                nominas.add(nomina);
            }
        }
        catch (Exception e){
            
        }
        return nominas;
    }

}
