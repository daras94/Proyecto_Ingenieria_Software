
// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/HDD-I Datos/Documentos/Mis Estudios/UAH/GII/3º de Carrera/1º Cuatrimestre/Ingeneria de Software Avazada/Laboratorio/WorkSpace/My_WorkSpace/WorkSpace/ms-getway-uvportal/ms-getway-uvportal/conf/routes
// @DATE:Wed Jan 10 20:52:16 CET 2018

package controllers.ms_gestion_alumno;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ms_gestion_alumno.ReverseGestionDeAlumnoApiController GestionDeAlumnoApiController = new controllers.ms_gestion_alumno.ReverseGestionDeAlumnoApiController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.ms_gestion_alumno.javascript.ReverseGestionDeAlumnoApiController GestionDeAlumnoApiController = new controllers.ms_gestion_alumno.javascript.ReverseGestionDeAlumnoApiController(RoutesPrefix.byNamePrefix());
  }

}
