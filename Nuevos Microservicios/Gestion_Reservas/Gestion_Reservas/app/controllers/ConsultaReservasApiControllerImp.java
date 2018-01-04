package controllers;

import apimodels.Espacio;
import apimodels.EspaciosLibres;
import apimodels.HorasLibres;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-04T19:04:56.558Z")

public class ConsultaReservasApiControllerImp implements ConsultaReservasApiControllerImpInterface {
    @Override
    public EspaciosLibres reservasDisponiblesEspaciosGet( @NotNull String dia,  @NotNull Integer hora) throws Exception {
        ArrayList<Integer> codigos = new ArrayList<>();
        ArrayList<Espacio> espacios = new ArrayList<>();
        try{
            conectar();
            String sql = "SELECT ID_Espacio FROM reservaprofesor WHERE fecha = "+dia+" AND hora = "+hora+";";
            ResultSet resultado = consulta_BDD(sql);
            
            while(resultado.next()){
                codigos.add(resultado.getInt("ID_Espacio"));
            }
            
            for(int i = 0; i< codigos.size(); i++){
                sql = "SELECT * FROM espacio WHERE codigo = "+codigos.get(i)+";";
                resultado = consulta_BDD(sql);
                if(resultado.next()){
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
            }
            
        }catch(Exception e){
            
        }
        
        
        return (EspaciosLibres) espacios;
    }

    @Override
    public HorasLibres reservasDisponiblesHorasGet( @NotNull String dia,  @NotNull Integer espacio) throws Exception {
        ArrayList<Integer> horas = new ArrayList<>();
        ArrayList<Integer> horasOcupadas = new ArrayList<>();
        try{
            conectar();
            String sql = "SELECT hora FROM reservaprofesor WHERE fecha = "+dia+" AND ID_Espacio = "+espacio+";";
            ResultSet resultado = consulta_BDD(sql);
            
            while(resultado.next()){
                horasOcupadas.add(resultado.getInt("hora"));
            }
            
            for(int i = 0; 0<24; i++){
                if(!horasOcupadas.contains(i)){
                    horas.add(i);
                }
            }
        }catch(Exception e){
            
        }
        
        
        return (HorasLibres) horas;
    }

}
