package controllers;

import apimodels.GrupoAsignatura;
import java.util.List;
import apimodels.Matricula;
import static conexionbbdd.BBDD.actualizar_BDD;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-04T19:26:19.921Z")

public class MatriculasApiControllerImp implements MatriculasApiControllerImpInterface {
    String anno = "2017";
    @Override
    public boolean crearMatriculaNumeroExpedientePost(Integer numeroExpediente, List<GrupoAsignatura> grupos) throws Exception {
        //Do your magic!!!
        boolean exito = false;
        try{
            conectar();
            boolean comprobacion = comprobar_asignaturas(numeroExpediente, grupos);
            if(!comprobacion){
                return false;
            }
            conexion.setAutoCommit(false);
            String sql = "INSERT INTO Matricula VALUES ("+String.valueOf(numeroExpediente)+", "+anno+", FALSE);";
            String sql_aux="";
            GrupoAsignatura aux = null;
            List<String> sentencias_sql = new ArrayList<>();
            for(int i=0;i<grupos.size();i++){
                aux = grupos.get(i);
                sql_aux = "INSERT INTO Asignatura_Matriculada VALUES("+String.valueOf(aux.getAsignatura().getCodigo())+", "+String.valueOf(numeroExpediente)+", ";
                sql_aux += anno+", "+String.valueOf(aux.getIdGrupo())+", NULL);";
                sentencias_sql.add(sql_aux);
                sql_aux="";
                aux=null;
            }
            
            int resultado = actualizar_BDD(sql,sentencias_sql);
            if(resultado==0){
                exito=true;
            }
            
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        finally{
            if(conexion!=null){
                conexion.close();
            }
            return exito;
        }
        
    }

    @Override
    public void realizarReservaNumeroExpedientePut(Integer numeroExpediente) throws Exception {
        //Do your magic!!!
        
    }

    @Override
    public List<Matricula> verExpedienteNumeroExpedienteGet(Integer numeroExpediente) throws Exception {
        //Do your magic!!!
        return new ArrayList<Matricula>();
    }
    
    
    private boolean comprobar_asignaturas(Integer numeroExpediente, List<GrupoAsignatura> grupos){
        boolean comprobacion = false;
        String sql="";
        ResultSet result=null;
        try{
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
            
            //Calculo creditos matriculados
            int cred_opt_matri = 0;
            int cred_obl_matri = 0;
            int cred_tran_matri = 0;
            
            for(int i=0;i<grupos.size();i++){
                if(grupos.get(i).getAsignatura().getTipo().equals("T")){
                    cred_tran_matri+=grupos.get(i).getAsignatura().getCreditos();
                }
                else if(grupos.get(i).getAsignatura().getTipo().equals("OB")){
                    cred_obl_matri+=grupos.get(i).getAsignatura().getCreditos();
                }
                else if(grupos.get(i).getAsignatura().getTipo().equals("OP")){
                    cred_opt_matri+=grupos.get(i).getAsignatura().getCreditos();
                }
            }
            
            //Comprobacion
            sql+="SELECT num_cred_opt,num_cred_tran,num_cred_obl FROM Carrera WHERE cod_carrera = "+codigo_carrera+";";
            result = consulta_BDD(sql);
            result.next();
            int cred_opt_res=result.getInt("num_cred_opt")-cred_opt_matri-cred_opt;
            int cred_obl_res=result.getInt("num_cred_obl")-cred_obl_matri-cred_obl;
            int cred_tran_res=result.getInt("num_cred_tran")-cred_tran_matri-cred_tran;
            
            if((cred_obl_res>=0)&&(cred_tran_res>=0)&&(cred_opt_res>=0)){
                comprobacion=true;
            }
            result=null;
            sql="";
            
        }catch(Exception e){
            System.out.println(e.toString());
        }
        finally{
            return comprobacion;
        }
        
        
        
        
        
    }

}
