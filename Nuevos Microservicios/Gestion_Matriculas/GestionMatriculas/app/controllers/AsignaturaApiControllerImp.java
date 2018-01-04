package controllers;

import apimodels.Asignatura;
import static conexionbbdd.BBDD.conectar;
import static conexionbbdd.BBDD.conexion;
import static conexionbbdd.BBDD.consulta_BDD;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import java.sql.ResultSet;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-03T17:06:28.985Z")

public class AsignaturaApiControllerImp implements AsignaturaApiControllerImpInterface {
    @Override
    public List<Asignatura> asignaturasMatriculablesByAlumnoNumeroExpedienteGet(Integer numeroExpediente) throws Exception {
        //Do your magic!!!
        List<Asignatura> asignaturas_disponibles = new ArrayList<Asignatura>();
        ResultSet result = null;
        String sql = "";
        try{
            conectar();
            //Obtener codigo de la carrera del alumno
            sql+="SELECT cod_carrera FROM Alumno WHERE num_expediente="+numeroExpediente+";";
            result = consulta_BDD(sql);
            result.next();
            int codigo_carrera=result.getInt("cod_carrera");
            sql="";
            result = null;
            
            //Calculo creditos ya obtenidos
            sql += "SELECT tipo,sum(creditos) as numero_cred FROM Asignatura_Matriculada NATURAL JOIN Asignatura WHERE num_expediente=";
            sql+=numeroExpediente+" and nota>=5 GROUP BY tipo;";
            
            result = consulta_BDD(sql);
            int cred_opt = 0;
            int cred_obl = 0;
            int cred_tran = 0;
            
            while(result.next()){
                String tipo = result.getString("tipo");
                if (tipo.equals("T")){cred_tran=result.getInt("numero_cred");}
                else if (tipo.equals("OP")){cred_opt=result.getInt("numero_cred");}
                else if (tipo.equals("OB")){cred_obl=result.getInt("numero_cred");}
            }
            sql="";
            result=null;
            
            //Calculo creditos restantes para terminar la carrera
            sql+="SELECT num_cred_opt,num_cred_tran,num_cred_obl FROM Carrera WHERE cod_carrera = "+codigo_carrera+";";
            result = consulta_BDD(sql);
            result.next();
            int cred_opt_res=result.getInt("num_cred_opt")-cred_opt;
            int cred_obl_res=result.getInt("num_cred_obl")-cred_obl;
            int cred_tran_res=result.getInt("num_cred_tran")-cred_tran;
            result=null;
            sql="";
            
            //Annadir asignaturas matriculables
            String tipos_asi ="";
            if(cred_obl_res>0){
                tipos_asi+="'OB'";
            }
            if(cred_opt_res>0){
                if(!tipos_asi.equals("")){
                    tipos_asi+=",";
                }
                tipos_asi+="'OP'";
            }
            if(cred_tran_res>0){
                if(!tipos_asi.equals("")){
                    tipos_asi+=",";
                }
                tipos_asi+="'T'";
            }
            
            sql += "SELECT * FROM Asignatura WHERE (Cod_carrera ="+codigo_carrera+" or Cod_carrera is null";
            sql += ") AND Cod_asignatura not in (SELECT Cod_asignatura FROM Asignatura_Matriculada WHERE nota>=5 AND ";
            sql += "num_expediente="+numeroExpediente+") AND tipo in ("+tipos_asi+");";
            result = consulta_BDD(sql);
            
            Asignatura aux;
            while(result.next()){
                aux = new Asignatura();
                aux.setCarrera(Integer.valueOf(result.getString("Cod_carrera")));
                aux.setCodigo(Integer.valueOf(result.getString("Cod_asignatura")));
                aux.setCreditos(Integer.valueOf(result.getString("creditos")));
                aux.setNombre(result.getString("nombre"));
                aux.setTipo(result.getString("tipo"));
                
                asignaturas_disponibles.add(aux);
                
                aux = null;
            }
            
            result=null;
            
            
        }
        catch(Exception e){
            System.out.println(e.toString());
            return null;
            
        
        }
        finally{
            if(conexion!=null){
                conexion.close();
            }
            return asignaturas_disponibles;
        }
        
    }

}
