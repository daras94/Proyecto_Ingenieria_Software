package controllers;

import apimodels.Asignatura;
import apimodels.Grupo;
import static conexionbbdd.BBDD.conectar;
import static conexionbbdd.BBDD.conexion;
import static conexionbbdd.BBDD.consulta_BDD;
import java.util.List;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-04T16:21:46.745Z")

public class GrupoApiControllerImp implements GrupoApiControllerImpInterface {
    private int anno = 2017;
    @Override
    public List<Grupo> gruposDisponiblesnumeroExpedienteGet(Integer numeroExpediente, List<Asignatura> asignaturas) throws Exception {
        //Do your magic!!!
        List<Grupo> grupos_disponibles = new ArrayList<>();
        ResultSet result = null;
        try{
            conectar();
            String sql = "";
            String codigos_Asignaturas = String.valueOf(asignaturas.get(0).getCarrera());
            for(int i=1;i<asignaturas.size();i++){
                codigos_Asignaturas+=", "+asignaturas.get(i).getCarrera();
            }
            
            boolean correcto = comprobar_asignaturas(codigos_Asignaturas,numeroExpediente);
            if(!correcto){
                return null;
            }
            
            sql+="SELECT id_grupo,miembros,Grupo.Cod_asignatura,Grupo.tipo FROM Grupo INNER JOIN Asignatura on Grupo.Cod_asignatura=Asignatura.Cod_asignatura";
            sql+="WHERE Grupo.Cod_asignatura in ("+codigos_Asignaturas+") AND anno="+String.valueOf(anno)+";";
            
            result=consulta_BDD(sql);
            while(result.next()){
                Grupo aux = new Grupo();
                aux.setAsignatura(result.getInt("Cod_asignatura"));
                aux.setCodigo(result.getInt("id_grupo"));
                aux.setMiembros(result.getInt("miembros"));
                aux.setTipo(result.getString("tipo"));
                
                grupos_disponibles.add(aux);
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
            return grupos_disponibles;
        }
    }
    
    private boolean comprobar_asignaturas(String codigos_asignaturas, Integer numeroExpediente) throws SQLException{
        boolean correcto=false;
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
            
            
            sql += "SELECT tipo,sum(creditos) as numero_cred FROM Asignatura WHERE Cod_asignatura in ("+codigos_asignaturas+");";
            
            result = consulta_BDD(sql);
            int cred_opt_matri = 0;
            int cred_obl_matri = 0;
            int cred_tran_matri = 0;
            
            while(result.next()){
                String tipo = result.getString("tipo");
                if (tipo.equals("T")){cred_tran_matri=result.getInt("numero_cred");}
                else if (tipo.equals("OP")){cred_opt_matri=result.getInt("numero_cred");}
                else if (tipo.equals("OB")){cred_obl_matri=result.getInt("numero_cred");}
            }
            sql="";
            result=null;
            
            //Comprobacion
            sql+="SELECT num_cred_opt,num_cred_tran,num_cred_obl FROM Carrera WHERE cod_carrera = "+codigo_carrera+";";
            result = consulta_BDD(sql);
            result.next();
            int cred_opt_res=result.getInt("num_cred_opt")-cred_opt_matri-cred_opt;
            int cred_obl_res=result.getInt("num_cred_obl")-cred_obl_matri-cred_obl;
            int cred_tran_res=result.getInt("num_cred_tran")-cred_tran_matri-cred_tran;
            
            if((cred_obl_res>=0)&&(cred_tran_res>=0)&&(cred_opt_res>=0)){
                correcto=true;
            }
            result=null;
            sql="";
            
        }
        catch(Exception e){
            System.out.println(e.toString());
            return false;
        }
        finally{
            return correcto;
        }
    }

}
