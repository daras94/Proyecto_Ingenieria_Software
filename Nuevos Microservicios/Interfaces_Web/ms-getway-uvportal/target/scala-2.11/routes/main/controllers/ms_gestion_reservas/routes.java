
// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/HDD-I Datos/Documentos/Mis Estudios/UAH/GII/3º de Carrera/1º Cuatrimestre/Ingeneria de Software Avazada/Laboratorio/WorkSpace/My_WorkSpace/WorkSpace/ms-getway-uvportal/ms-getway-uvportal/conf/routes
// @DATE:Wed Jan 10 20:52:16 CET 2018

package controllers.ms_gestion_reservas;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ms_gestion_reservas.ReverseGestionDeReservasApiController GestionDeReservasApiController = new controllers.ms_gestion_reservas.ReverseGestionDeReservasApiController(RoutesPrefix.byNamePrefix());
  public static final controllers.ms_gestion_reservas.ReverseGestionDeConsultasDeReservas_ApiController GestionDeConsultasDeReservas_ApiController = new controllers.ms_gestion_reservas.ReverseGestionDeConsultasDeReservas_ApiController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.ms_gestion_reservas.javascript.ReverseGestionDeReservasApiController GestionDeReservasApiController = new controllers.ms_gestion_reservas.javascript.ReverseGestionDeReservasApiController(RoutesPrefix.byNamePrefix());
    public static final controllers.ms_gestion_reservas.javascript.ReverseGestionDeConsultasDeReservas_ApiController GestionDeConsultasDeReservas_ApiController = new controllers.ms_gestion_reservas.javascript.ReverseGestionDeConsultasDeReservas_ApiController(RoutesPrefix.byNamePrefix());
  }

}
