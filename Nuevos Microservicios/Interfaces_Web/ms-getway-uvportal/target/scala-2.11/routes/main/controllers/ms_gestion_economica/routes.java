
// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/HDD-I Datos/Documentos/Mis Estudios/UAH/GII/3º de Carrera/1º Cuatrimestre/Ingeneria de Software Avazada/Laboratorio/WorkSpace/My_WorkSpace/WorkSpace/ms-getway-uvportal/ms-getway-uvportal/conf/routes
// @DATE:Wed Jan 10 20:52:16 CET 2018

package controllers.ms_gestion_economica;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ms_gestion_economica.ReverseGestionDePagosApiController GestionDePagosApiController = new controllers.ms_gestion_economica.ReverseGestionDePagosApiController(RoutesPrefix.byNamePrefix());
  public static final controllers.ms_gestion_economica.ReverseGestionDeNominas_ApiController GestionDeNominas_ApiController = new controllers.ms_gestion_economica.ReverseGestionDeNominas_ApiController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.ms_gestion_economica.javascript.ReverseGestionDePagosApiController GestionDePagosApiController = new controllers.ms_gestion_economica.javascript.ReverseGestionDePagosApiController(RoutesPrefix.byNamePrefix());
    public static final controllers.ms_gestion_economica.javascript.ReverseGestionDeNominas_ApiController GestionDeNominas_ApiController = new controllers.ms_gestion_economica.javascript.ReverseGestionDeNominas_ApiController(RoutesPrefix.byNamePrefix());
  }

}
