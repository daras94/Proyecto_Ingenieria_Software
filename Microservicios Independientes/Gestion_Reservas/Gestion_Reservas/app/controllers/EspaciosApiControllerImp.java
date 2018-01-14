package controllers;

import apimodels.Espacio;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
import static conexionbbdd.BBDD.*;
import java.math.BigDecimal;
import java.sql.ResultSet;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-04T16:38:57.570Z")

public class EspaciosApiControllerImp implements EspaciosApiControllerImpInterface {
    @Override
    public List<Espacio> espaciosGet() throws Exception {
        ArrayList<Espacio> espacios = new ArrayList<>();
        try{
            conectar();
            String sql = "SELECT * FROM espacio;";
            ResultSet resultado = consulta_BDD(sql);
            
            while(resultado.next()){
                int codigo = resultado.getInt("codigo");
                String nombre = resultado.getString("nombre");
                int aforo_max = resultado.getInt("aforo_max");
                double precio_alquiler = resultado.getDouble("precio_alquiler");
 
                Espacio espacio = new Espacio();
                espacio.setNombre(nombre);
                espacio.setCodigo(codigo);
                espacio.setAforo(aforo_max);
                espacio.setPrecio(BigDecimal.valueOf(precio_alquiler));
                
                espacios.add(espacio);
                
            }
        }catch(Exception e){
            
        }
        
        
        return espacios;
    }

}
