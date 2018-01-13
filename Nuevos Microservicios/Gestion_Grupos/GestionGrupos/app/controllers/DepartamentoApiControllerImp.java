package controllers;


import static conexionbbdd.BBDD.*;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import java.sql.ResultSet;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-13T15:37:03.349Z")

public class DepartamentoApiControllerImp implements DepartamentoApiControllerImpInterface {
    @Override
    public Integer getCargaDocenteGet(Integer departamento) throws Exception {
        String query = "SELECT NIF, categoria FROM Profesor WHERE departamento = "+departamento+";";
        int horasDadas = 0;
        int horasTotalesDepartamento = 0;
        
        try{
            conectar();
        
            ResultSet respuesta = consulta_BDD(query);
            while(respuesta.next()){
                String query2 = "SELECT COUNT(grupo_id) FROM Profesor_Grupo WHERE Profesor_NIF = "+respuesta.getInt("NIF")+";";
                ResultSet respuesta2 = consulta_BDD(query2);
                //Suponemos que un profesor da 2 horas semanales a cada grupo
                horasDadas += respuesta2.getInt(1)*2;
                
                String query3 = "SELECT horas_semanales FROM Categoria WHERE nombre = "+respuesta.getString("categoria")+";";
                ResultSet respuesta3 = consulta_BDD(query3);
                horasTotalesDepartamento += respuesta3.getInt("horas_semanales");
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
