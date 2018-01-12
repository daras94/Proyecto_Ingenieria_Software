
// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/HDD-I Datos/Documentos/Mis Estudios/UAH/GII/3º de Carrera/1º Cuatrimestre/Ingeneria de Software Avazada/Laboratorio/WorkSpace/My_WorkSpace/WorkSpace/ms-getway-uvportal/ms-getway-uvportal/conf/routes
// @DATE:Wed Jan 10 20:52:16 CET 2018

package controllers.ms_gestion_matricula;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ms_gestion_matricula.ReverseGestionDeMatriculaApiController GestionDeMatriculaApiController = new controllers.ms_gestion_matricula.ReverseGestionDeMatriculaApiController(RoutesPrefix.byNamePrefix());
  public static final controllers.ms_gestion_matricula.ReverseGestionDeMatriculas_ApiController GestionDeMatriculas_ApiController = new controllers.ms_gestion_matricula.ReverseGestionDeMatriculas_ApiController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.ms_gestion_matricula.javascript.ReverseGestionDeMatriculaApiController GestionDeMatriculaApiController = new controllers.ms_gestion_matricula.javascript.ReverseGestionDeMatriculaApiController(RoutesPrefix.byNamePrefix());
    public static final controllers.ms_gestion_matricula.javascript.ReverseGestionDeMatriculas_ApiController GestionDeMatriculas_ApiController = new controllers.ms_gestion_matricula.javascript.ReverseGestionDeMatriculas_ApiController(RoutesPrefix.byNamePrefix());
  }

}
