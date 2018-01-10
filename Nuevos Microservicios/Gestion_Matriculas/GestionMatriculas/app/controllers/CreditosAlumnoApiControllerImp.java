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
            String sql="";
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
            
            creditos = new CreditosAlumno();
            creditos.setCreditosObligatorios(cred_obl);
            creditos.setCreditosOptativos(cred_opt);
            creditos.setCreditosTransversales(cred_tran);
            
            
            
            
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
