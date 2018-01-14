package controllers;

import apimodels.CreditosAlumno;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-10T11:25:04.680Z")

public class CreditosAlumnoApiControllerImp implements CreditosAlumnoApiControllerImpInterface {
    @Override
    public CreditosAlumno creditosalumnoNumeroExpedienteGet(Integer numeroExpediente) throws Exception {
        //Do your magic!!!
        CreditosAlumno creditos = null;
        ResultSet result = null;
        try{
            conectar();
            //Obtener codigo de la carrera del alumno
            String sql="";
            sql+="SELECT cod_carrera FROM Alumno WHERE num_expediente="+numeroExpediente+";";
            result = consulta_BDD(sql);
            result.next();
            int codigo_carrera=result.getInt("cod_carrera");
            sql="";
            result = null;
            
            //Calculo creditos ya obtenidos
            sql += "SELECT tipo,sum(creditos) as numero_cred FROM Asignatura_Matriculada NATURAL JOIN Asignatura WHERE num_expediente=";
            sql+=numeroExpediente+" and nota_teoria>=5 and nota_lab>=5 GROUP BY tipo;";
            
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
            
            //Calculo
            sql+="SELECT num_cred_opt,num_cred_tran,num_cred_obl FROM Carrera WHERE cod_carrera = "+codigo_carrera+";";
            result = consulta_BDD(sql);
            result.next();
            int creditos_extra=((int) (Math.ceil((result.getInt("num_cred_opt")*0.1))));;
            int cred_opt_res=result.getInt("num_cred_opt")-cred_opt;
            if(cred_opt_res<0){
                creditos_extra=creditos_extra-(cred_opt_res*-1);
                cred_opt_res=0;
            }
            int cred_obl_res=result.getInt("num_cred_obl")-cred_obl;
            int cred_tran_res=result.getInt("num_cred_tran")-cred_tran;
            
            creditos = new CreditosAlumno();
            creditos.setCreditosObligatorios(cred_obl_res);
            creditos.setCreditosOptativos(cred_opt_res);
            creditos.setCreditosTransversales(cred_tran_res);
            creditos.setCreditosOptativosExtra(creditos_extra);
            
            
            
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        finally{
            if(conexion!=null){
                conexion.close();
            }
            return creditos;
        }
    }

}
