
// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/HDD-I Datos/Documentos/Mis Estudios/UAH/GII/3º de Carrera/1º Cuatrimestre/Ingeneria de Software Avazada/Laboratorio/WorkSpace/My_WorkSpace/WorkSpace/ms-getway-uvportal/ms-getway-uvportal/conf/routes
// @DATE:Wed Jan 10 20:52:16 CET 2018

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:28
package controllers.ms_gestion_reservas.javascript {
  import ReverseRouteContext.empty

  // @LINE:55
  class ReverseGestionDeReservasApiController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:55
    def reservasActualizarPut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ms_gestion_reservas.GestionDeReservasApiController.reservasActualizarPut",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "reservas/actualizar"})
        }
      """
    )
  
    // @LINE:57
    def reservasReservarPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ms_gestion_reservas.GestionDeReservasApiController.reservasReservarPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reservas/reservar"})
        }
      """
    )
  
    // @LINE:56
    def reservasCancelarDelete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ms_gestion_reservas.GestionDeReservasApiController.reservasCancelarDelete",
      """
        function() {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "reservas/cancelar"})
        }
      """
    )
  
  }

  // @LINE:28
  class ReverseGestionDeConsultasDeReservas_ApiController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def reservasDisponiblesHorasGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ms_gestion_reservas.GestionDeConsultasDeReservas_ApiController.reservasDisponiblesHorasGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reservas/disponibles/horas"})
        }
      """
    )
  
    // @LINE:28
    def reservasDisponiblesEspaciosGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ms_gestion_reservas.GestionDeConsultasDeReservas_ApiController.reservasDisponiblesEspaciosGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reservas/disponibles/espacios"})
        }
      """
    )
  
  }


}
