package controllers;

import apimodels.Asignatura;
import apimodels.AsignaturaMatriculable;
import apimodels.GruposAsignatura;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-12T18:22:06.797Z")

public class GruposAsignaturasApiControllerImp implements GruposAsignaturasApiControllerImpInterface {
    String anno="2017";
    @Override
    public List<AsignaturaMatriculable> asignaturasMatriculablesByAlumnoNumeroExpedienteGet(Integer numeroExpediente) throws Exception {
        //Do your magic!!!
        List<AsignaturaMatriculable> asignaturas_disponibles = new ArrayList<>();
        ResultSet result = null;
        String sql = "";
        try{
            conectar();
            //Comprobar Reserva
            sql="SELECT * FROM Matricula WHERE num_expediente ="+String.valueOf(numeroExpediente)+" AND Curso= "+anno;
            result=consulta_BDD(sql);
            if(!result.next()){
                return null;
            }
            sql="";
            result=null;
            
            //Obtener codigo de la carrera del alumno
            sql+="SELECT cod_carrera FROM Alumno WHERE num_expediente="+numeroExpediente+";";
            result = consulta_BDD(sql);
            result.next();
            int codigo_carrera=result.getInt("cod_carrera");
            sql="";
            result = null;
            
            //Calculo creditos ya obtenidos y codigos asignaturas
            List<Integer> codigos_asignaturas_aprobadas = new ArrayList<>();
            sql += "SELECT Cod_asignatura, creditos, tipo FROM Asignatura_Matriculada NATURAL JOIN Asignatura WHERE num_expediente=";
            sql+=numeroExpediente+" and nota_teoria>=5 and nota_lab>=5";
            
            result = consulta_BDD(sql);
            int cred_opt = 0;
            int cred_obl = 0;
            int cred_tran = 0;
            
            while(result.next()){
                String tipo = result.getString("tipo");
                if (tipo.equals("T")){cred_tran+=result.getInt("creditos");}
                else if (tipo.equals("OP")){cred_opt+=result.getInt("creditos");}
                else if (tipo.equals("OB")){cred_obl+=result.getInt("creditos");}
                codigos_asignaturas_aprobadas.add(result.getInt("Cod_asignatura"));
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
            
            //Obtener asignaturas matriculables
            String tipos_asi ="'TFG'";
            if(cred_obl_res>0){
                tipos_asi+=", 'OB'";
            }
            if(cred_opt_res>0){
                tipos_asi+=", 'OP'";
            }
            if(cred_tran_res>0){
                tipos_asi+=", 'T'";
            }
            
            String codigos_aprobados ="0";
            if(codigos_asignaturas_aprobadas.size()!=0){
                for(int i=0;i<codigos_asignaturas_aprobadas.size();i++){
                    codigos_aprobados+=", ";
                    codigos_aprobados+=String.valueOf(codigos_asignaturas_aprobadas.get(i));
                } 
            }
            
            
            sql += "SELECT * FROM Asignatura WHERE (Cod_carrera ="+codigo_carrera+" or Cod_carrera is null";
            sql += ") AND Cod_asignatura not in ("+codigos_aprobados+") AND tipo in ("+tipos_asi+")";
            result = consulta_BDD(sql);
            
            ResultSet result2 = null;
            while(result.next()){
                AsignaturaMatriculable aux_asig = new AsignaturaMatriculable();
                Asignatura asig_aux = new Asignatura();
                List<GruposAsignatura> aux_grupos = new ArrayList<>();
                
                asig_aux.setCarrera(result.getInt("Cod_carrera"));
                asig_aux.setCodigo(result.getInt("Cod_asignatura"));
                asig_aux.setCreditos(result.getInt("creditos"));
                asig_aux.setNombre(result.getString("nombre"));
                asig_aux.setTipo(result.getString("tipo"));
                
                sql = "SELECT * FROM Grupo WHERE anno = "+anno+" AND Cod_asignatura = "+String.valueOf(result.getInt("Cod_asignatura"));
                result2= consulta_BDD(sql);
                while(result2.next()){
                    GruposAsignatura aux_grupo_asignatura = new GruposAsignatura();
                    aux_grupo_asignatura.setIdGrupo(result2.getInt("id_grupo"));
                    aux_grupo_asignatura.setMiembros(result2.getInt("miembros"));
                    aux_grupo_asignatura.setTipo(result2.getString("tipo"));
                    
                    aux_grupos.add(aux_grupo_asignatura);
                    aux_grupo_asignatura=null;
                
                }
                aux_asig.setAsignatura(asig_aux);
                aux_asig.setGrupos(aux_grupos);
                
                asignaturas_disponibles.add(aux_asig);
                
                aux_asig = null;
                asig_aux = null;
                aux_grupos = null;
                
            }
            
            result2=null;
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
