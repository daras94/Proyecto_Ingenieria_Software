
// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/HDD-I Datos/Documentos/Mis Estudios/UAH/GII/3º de Carrera/1º Cuatrimestre/Ingeneria de Software Avazada/Laboratorio/WorkSpace/My_WorkSpace/WorkSpace/ms-getway-uvportal/ms-getway-uvportal/conf/routes
// @DATE:Wed Jan 10 20:52:16 CET 2018

package controllers.ms_gestion_recursos;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ms_gestion_recursos.ReverseGestionDeFactura_ApiController GestionDeFactura_ApiController = new controllers.ms_gestion_recursos.ReverseGestionDeFactura_ApiController(RoutesPrefix.byNamePrefix());
  public static final controllers.ms_gestion_recursos.ReverseGestionDeEspacios_ApiController GestionDeEspacios_ApiController = new controllers.ms_gestion_recursos.ReverseGestionDeEspacios_ApiController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.ms_gestion_recursos.javascript.ReverseGestionDeFactura_ApiController GestionDeFactura_ApiController = new controllers.ms_gestion_recursos.javascript.ReverseGestionDeFactura_ApiController(RoutesPrefix.byNamePrefix());
    public static final controllers.ms_gestion_recursos.javascript.ReverseGestionDeEspacios_ApiController GestionDeEspacios_ApiController = new controllers.ms_gestion_recursos.javascript.ReverseGestionDeEspacios_ApiController(RoutesPrefix.byNamePrefix());
  }

}
