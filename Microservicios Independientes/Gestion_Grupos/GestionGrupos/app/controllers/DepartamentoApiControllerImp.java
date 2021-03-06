package controllers;


import static conexionbbdd.BBDD.*;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import java.sql.ResultSet;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-14T17:36:45.634Z")

public class DepartamentoApiControllerImp implements DepartamentoApiControllerImpInterface {
    @Override
    public Integer cargaDocenteDepartamentoGet(Integer departamento) throws Exception {
        String query = "SELECT NIF, categoria FROM profesor WHERE departamento = "+departamento+";";
        int horasDadas = 0;
        int horasTotalesDepartamento = 0;
        
        try{
            conectar();
        
            ResultSet respuesta = consulta_BDD(query);
            while(respuesta.next()){
                String query2 = "SELECT COUNT(grupo_id) FROM profesor_grupo WHERE Profesor_NIF = '"+respuesta.getString("NIF")+"';";
                ResultSet respuesta2 = consulta_BDD(query2);
                //Suponemos que un profesor da 2 horas semanales a cada grupo
                if(respuesta2.next()){
                    System.out.println(respuesta2.getInt(1));
                    horasDadas += respuesta2.getInt(1)*2;
                }
                
                String query3 = "SELECT horas_semanales FROM categoria WHERE nombre = '"+respuesta.getString("categoria")+"';";
                ResultSet respuesta3 = consulta_BDD(query3);
                if(respuesta3.next()){
                    System.out.println(respuesta3.getInt("horas_semanales"));
                    horasTotalesDepartamento += respuesta3.getInt("horas_semanales");
                }
            }
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        finally{
            if(conexion!=null){
                conexion.close();
            }
            return (horasDadas/horasTotalesDepartamento)*10;
        }
    }

}
