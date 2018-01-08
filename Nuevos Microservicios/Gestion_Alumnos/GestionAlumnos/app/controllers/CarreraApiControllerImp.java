package controllers;

import apimodels.Carrera;
import static conexionbbdd.BBDD.conectar;
import static conexionbbdd.BBDD.conexion;
import static conexionbbdd.BBDD.consulta_BDD;

import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-07T17:55:13.255Z")

public class CarreraApiControllerImp implements CarreraApiControllerImpInterface {
    @Override
    public List<Carrera> getCarrerasGet() throws Exception {
        //Do your magic!!!
        ResultSet result = null;
        List<Carrera> carreras = null;
        try{
            conectar();
            String SQL = "SELECT * FROM Carrera";
            result=consulta_BDD(SQL);
            
            carreras = new ArrayList();
            Carrera aux = null;
            while(result.next()){
                aux = new Carrera();
                aux.setCodigo(result.getInt("Cod_carrera"));
                aux.setFacultad(result.getString("facultad"));
                aux.setNombre(result.getString("nombre"));
                aux.setNumeroCreditosObligatorios(result.getInt("num_cred_obl"));
                aux.setNumeroCreditosOptativos(result.getInt("num_cred_obl"));
                aux.setNumeroCreditosTransversales(result.getInt("num_cred_tran"));
                
                carreras.add(aux);
                aux=null;
            }
            
            result=null;
         }
        catch(Exception e){
            System.out.println(e.toString());
        }
        finally{
            if(conexion!=null){
                conexion.close();
            }
            
            return carreras;
        }
    }
}


