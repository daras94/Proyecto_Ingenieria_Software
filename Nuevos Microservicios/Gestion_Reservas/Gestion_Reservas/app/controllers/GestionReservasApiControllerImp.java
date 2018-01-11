package controllers;

import apimodels.Espacio;
import apimodels.EspaciosLibres;
import apimodels.Reserva;
import static conexionbbdd.BBDD.*;
import java.sql.SQLException;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.sql.ResultSet;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-04T16:38:57.570Z")

public class GestionReservasApiControllerImp implements GestionReservasApiControllerImpInterface {
    @Override
    public void reservasActualizarPut( @NotNull String dia,  @NotNull Integer hora,  @NotNull Integer espacio, Reserva reserva) throws Exception {
        try{
            
            
            String fechaNew = reserva.getFecha();
            int espacioNew = reserva.getEspacio();
            int horaNew = reserva.getHora();
            
            conectar();
            String sql = "UPDATE reservaprofesor SET fecha = '"+fechaNew+"' , hora = "+horaNew+" , ID_Espacio = "+espacioNew+" WHERE fecha = '"+dia+"' AND hora = "+hora+" AND ID_Espacio ="+espacio+";";
            actualizar_BDD(sql);
            
            
        }catch(Exception e){
            throw(e);
            
        }
        
    }

    @Override
    public void reservasCancelarDelete( @NotNull String dia,  @NotNull Integer hora,  @NotNull Integer espacio) throws Exception {
        try{
            System.out.println("sdfvsdfa");
            conectar();
            String sql = "DELETE FROM reservaprofesor WHERE fecha = '"+dia+"' AND hora = "+hora+" AND ID_Espacio = "+espacio+";";
            System.out.println(sql);
            actualizar_BDD(sql);
            
            
        }catch(Exception e){
            throw(e);
            
        }
        
    }

    @Override
    public void reservasReservarPost(Reserva reserva) throws Exception {
        try{
            
            String NIF = reserva.getNIF();
            String fecha = reserva.getFecha();
            int espacio = reserva.getEspacio();
            int hora = reserva.getHora();
            conectar();
            String sql = "INSERT INTO reservaprofesor VALUES ('"+NIF+"',"+espacio+",'"+fecha+"',"+hora+");";
            actualizar_BDD(sql);
            
        }catch(Exception e){
            throw(e);
            
        }
        
        
    }
    
    @Override
    public List<Reserva> reservasNifGet(String nif) throws Exception {
        try{
            
            ArrayList<Reserva> reservas = new ArrayList<>();
            
            conectar();
            String sql = "SELECT * FROM reservaprofesor WHERE Profesor_NIF = '"+nif+"' ORDER BY fecha AND HORA";
            ResultSet result = consulta_BDD(sql);
            
            while(result.next()){
                Reserva reserva = new Reserva();
                String fecha = result.getString("fecha");
                int espacio = result.getInt("ID_Espacio");
                int hora = result.getInt("hora");
                
                reserva.setEspacio(espacio);
                reserva.setFecha(fecha);
                reserva.setHora(hora);;
                reserva.setNIF(nif);
                reservas.add(reserva);
            }
            
            return reservas;
            
        }catch(Exception e){
            throw(e);
            
        }
    }

}
