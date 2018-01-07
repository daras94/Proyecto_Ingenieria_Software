package controllers;

import apimodels.Espacio;
import apimodels.EspaciosLibres;
import apimodels.Reserva;
import static conexionbbdd.BBDD.*;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
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
            
            
        }catch(SQLException e){
            throw(e);
            
        }
        
    }

    @Override
    public void reservasCancelarDelete( @NotNull String dia,  @NotNull Integer hora,  @NotNull Integer espacio) throws Exception {
        try{
            
            conectar();
            String sql = "DELETE FROM reservaprofesor WHERE fecha = '"+dia+"' AND hora = "+hora+" AND ID_Espacio ="+espacio+";";
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
            
            
        }catch(SQLException e){
            throw(e);
            
        }
        
        
    }

}
