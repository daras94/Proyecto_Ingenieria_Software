package controllers;

import apimodels.Nomina;
import static conexionbbdd.BBDD.actualizar_BDD;
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

public class NominaApiControllerImp implements NominaApiControllerImpInterface {
    @Override
    public void nominaPost(@NotNull Object svjf, @NotNull String NIF,  @NotNull String fecha) throws Exception {
        try{
            conectar();
            String sql = "SELECT categoria, antiguedad, num_tramos_investigacion, num_tramos_docentes FROM profesor WHERE NIF= '"+NIF+"'";
            ResultSet resultado = consulta_BDD(sql);
            resultado.next();
            String sql2= "SELECT MAX(numero) AS numero FROM nomina";
            ResultSet resultado2 = consulta_BDD(sql2);
                resultado2.next();
                String categoria= resultado.getString("categoria");
                int num_tramos_investigacion= resultado.getInt("num_tramos_investigacion");
                int num_tramos_docentes= resultado.getInt("num_tramos_docentes");
                int antiguedad= resultado.getInt("antiguedad");
                int pago_categoria=0;
                int numero= resultado2.getInt(1);
                int numero_actual=numero+1;
                if (categoria=="Catedratico"){
                    pago_categoria=700;
                }else if (categoria=="Rector"){
                    pago_categoria=1000;
                }else if (categoria=="Adjunto"){
                    pago_categoria=500;
                }else if (categoria=="Suplente"){
                    pago_categoria=100;
                }
                double salario= 1500+num_tramos_investigacion*40+num_tramos_docentes*30+antiguedad*20+pago_categoria;
                String sql3 = "INSERT INTO nomina VALUES('"+NIF+"',"+numero_actual+",'"+fecha+"',"+salario+");";
                actualizar_BDD(sql3);
                
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
    }

    @Override
    public List<Nomina> nominasNIFGet(String NIF) throws Exception {
        ArrayList<Nomina> nominas= new ArrayList<>();
        try{
            conectar();
            String sql = "SELECT * from nomina WHERE Profesor_NIF = '"+NIF+"'";
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
