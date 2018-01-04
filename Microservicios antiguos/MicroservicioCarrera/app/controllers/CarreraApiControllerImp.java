package controllers;

import apimodels.Carrera;
import static conexiondb.BBDD.conectar;
import static conexiondb.BBDD.conexion;
import static conexiondb.BBDD.consulta_BDD;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import java.sql.ResultSet;
import java.util.HashSet;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2017-12-18T17:04:08.877Z")

public class CarreraApiControllerImp implements CarreraApiControllerImpInterface {
    @Override
    public void carreraCodeDelete(Integer code) throws Exception {
        //Do your magic!!!
        
    }

    @Override
    public Carrera carreraCodeGet(Integer code) throws Exception {
        //Do your magic!!!
        return new Carrera();
    }

    @Override
    public void carreraCodePut(Integer code, Carrera carrera) throws Exception {
        //Do your magic!!!
        
    }

    @Override
    public void carreraPost(Carrera carrera) throws Exception {
        //Do your magic!!!
        
    }

    @Override
    public List<Carrera> carrerasGet() throws Exception {
        
        ArrayList <Carrera> arrayCarreras= new ArrayList <>();
        
        try{
            conectar();

            String sql= "SELECT * From Carrera";
            ResultSet resultado = consulta_BDD(sql);

            while (resultado.next()){
                String nombre = resultado.getString("nombre");
                int cod_carrera = resultado.getInt("cod_carrera");
                String facultad = resultado.getString("facultad");
                int num_cred_opt = resultado.getInt("num_cred_opt");
                int num_cred_tran = resultado.getInt("num_cred_tran");
                int num_cred_obl = resultado.getInt("num_cred_obl");

                Carrera carrera= new Carrera();
                carrera.setNombre(nombre);
                carrera.setCodigo(cod_carrera);
                carrera.setFacultad(facultad);
                carrera.setNumeroCreditosObligatorios(num_cred_obl);
                carrera.setNumeroCreditosOptativos(num_cred_opt);
                carrera.setNumeroCreditosTransversales(num_cred_obl);

                arrayCarreras.add(carrera);

            }
            conexion.close();
            return arrayCarreras;
        }
        catch(Exception e){
                System.out.println(e.toString());
                return arrayCarreras;
        }
        
    }                
}

