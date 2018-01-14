package controllers;

import apimodels.Asignatura;
import apimodels.AsignaturaAlta;
import apimodels.AsignaturaMatriculada;
import apimodels.Matricula;
import apimodels.MatriculaAlta;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-01-12T18:22:06.797Z")

public class MatriculasApiControllerImp implements MatriculasApiControllerImpInterface {
    String anno="2017";
    @Override
    public boolean crearMatriculaNumeroExpedientePost(Integer numeroExpediente, MatriculaAlta grupos) throws Exception {
        //Do your magic!!!
        boolean exito = false;
        try{
            conectar();
            
            
            String sql_aux="";
            AsignaturaAlta aux = null;
            List<String> sentencias_sql = new ArrayList<>();
            for(int i=0;i<grupos.getGrupos().size();i++){
                aux = grupos.getGrupos().get(i);
                sql_aux = "INSERT INTO Asignatura_Matriculada VALUES("+String.valueOf(aux.getCodigoAsignatura())+", "+String.valueOf(numeroExpediente)+", ";
                sql_aux += anno+", "+String.valueOf(aux.getCodigoGrupoTeoria())+", NULL, "+String.valueOf(aux.getCodigoGrupoLab()+", NULL);");
                sentencias_sql.add(sql_aux);
                sql_aux="";
                aux=null;
            }
            
            String importe = String.valueOf((240 * grupos.getGrupos().size())/grupos.getTipoPago());
            String sql_pago = "INSERT INTO Pago VALUES(";
            String sql_pago_aux="";
            if(grupos.getTipoPago()==1){
                int numero_pago = generar_pago();
                sql_pago_aux+=sql_pago+String.valueOf(numero_pago)+", 'UNITARIO', "+importe+", FALSE, "+String.valueOf(numeroExpediente)+", "+anno+");";
                
            }
            else{
                for(int i=0;i<grupos.getTipoPago();i++){
                    int numero_pago = generar_pago();
                    sql_pago_aux+=sql_pago+String.valueOf(numero_pago)+", 'UNITARIO', "+importe+", FALSE, "+String.valueOf(numeroExpediente)+", "+anno+");";
                    sentencias_sql.add(sql_pago_aux);
                    System.out.println(sql_pago_aux);
                    sql_pago_aux="";
                }
            }
            
            String sql_update = "UPDATE Matricula SET reserva = TRUE WHERE num_expediente= "+String.valueOf(numeroExpediente);
            sentencias_sql.add(sql_update);
            
            int resultado = actualizar_BDD(sentencias_sql);
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
    public boolean realizarReservaNumeroExpedientePost(Integer numeroExpediente) throws Exception {
        //Do your magic!!!
        boolean exito=false;
        ResultSet result = null;
        try{
            conectar();
            String sql="";
            
            sql += "SELECT * FROM Asignatura_Matriculada NATURAL JOIN Asignatura WHERE num_expediente=";
            sql+=String.valueOf(numeroExpediente)+" and nota_teoria>=5 and nota_lab>=5 AND tipo = 'TFG';";
            
            result = consulta_BDD(sql);
            
            
            if(result.next()){
                return false;
            }
            
            sql="";
            result=null;
            sql = "INSERT INTO Matricula VALUES ("+String.valueOf(numeroExpediente)+", "+anno+", FALSE);";
            int resultado = actualizar_BDD(sql);
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
    public List<Matricula> verExpedienteNumeroExpedienteGet(Integer numeroExpediente) throws Exception {
        //Do your magic!!!
        List<Matricula> matriculas = new ArrayList<Matricula>();
        ResultSet result=null;
        ResultSet aux = null;
        try{
            conectar();
            String sql="SELECT * FROM Matricula WHERE num_expediente="+String.valueOf(numeroExpediente)+";";
            result=consulta_BDD(sql);
            String sql_aux="";
            Matricula matricula_aux = null;
            while(result.next()){
                matricula_aux= new Matricula();
                sql_aux="SELECT * FROM Asignatura_Matriculada NATURAL JOIN Asignatura WHERE num_expediente=";
                sql_aux+=String.valueOf(numeroExpediente)+" AND Curso="+String.valueOf(result.getInt("Curso"))+";";
                aux=consulta_BDD(sql_aux);
                matricula_aux.setAnno(result.getInt("Curso"));
                List<AsignaturaMatriculada> asignaturas_matriculadas = new ArrayList<>();
                Asignatura asig_aux = null;
                AsignaturaMatriculada aux_asig_matri = null;
                while(aux.next()){
                    aux_asig_matri = new AsignaturaMatriculada();
                    asig_aux = new Asignatura();
                    asig_aux.setCarrera(aux.getInt("Cod_carrera"));
                    asig_aux.setCodigo(aux.getInt("Cod_asignatura"));
                    asig_aux.setCreditos(aux.getInt("creditos"));
                    asig_aux.setTipo(aux.getString("tipo"));
                    asig_aux.setNombre(aux.getString("nombre"));
                    
                    aux_asig_matri.setAsignatura(asig_aux);
                    aux_asig_matri.setNota((aux.getInt("nota_teoria")+aux.getInt("nota_lab"))/2);
                    
                    asignaturas_matriculadas.add(aux_asig_matri);
                    asig_aux=null;
                    aux_asig_matri=null;
                    
                    
                }
                matricula_aux.setAsignaturas(asignaturas_matriculadas);
                matriculas.add(matricula_aux);
                matricula_aux=null;
                aux=null;
                sql_aux="";
                asignaturas_matriculadas=null;
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
            return matriculas;
        }
    }
    
    private int generar_pago(){
        int numero=0;
        try{
            ResultSet result = null;
            String sql = "SELECT * FROM Pago WHERE numero_pago = ";
            do{
                numero = (int) (Math.random() * 999999999) + 1;
                result = consulta_BDD(sql+String.valueOf(numero)+";");
                
            }while(result.next());
              
            
            
        }catch(Exception e){
            System.out.println(e.toString());
        }
        finally{
            return numero;
        }
    }
    
    /*private boolean comprobar_asignaturas(Integer numeroExpediente, List<AsignaturaAlta> grupos){
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
        
        
        
        
        
    }*/

}
