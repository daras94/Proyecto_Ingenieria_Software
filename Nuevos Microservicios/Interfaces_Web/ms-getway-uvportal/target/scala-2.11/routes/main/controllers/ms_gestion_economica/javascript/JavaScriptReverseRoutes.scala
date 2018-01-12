
// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/HDD-I Datos/Documentos/Mis Estudios/UAH/GII/3º de Carrera/1º Cuatrimestre/Ingeneria de Software Avazada/Laboratorio/WorkSpace/My_WorkSpace/WorkSpace/ms-getway-uvportal/ms-getway-uvportal/conf/routes
// @DATE:Wed Jan 10 20:52:16 CET 2018

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:47
package controllers.ms_gestion_economica.javascript {
  import ReverseRouteContext.empty

  // @LINE:51
  class ReverseGestionDePagosApiController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:51
    def actualizarPagoPut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ms_gestion_economica.GestionDePagosApiController.actualizarPagoPut",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "actualizarPago"})
        }
      """
    )
  
    // @LINE:52
    def pagosMatriculaGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ms_gestion_economica.GestionDePagosApiController.pagosMatriculaGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pagosMatricula"})
        }
      """
    )
  
  }

  // @LINE:47
  class ReverseGestionDeNominas_ApiController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def nominaPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ms_gestion_economica.GestionDeNominas_ApiController.nominaPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "nomina"})
        }
      """
    )
  
    // @LINE:48
    def nominasNIFGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ms_gestion_economica.GestionDeNominas_ApiController.nominasNIFGet",
      """
        function(NIF0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "nominas/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("NIF", encodeURIComponent(NIF0))})
        }
      """
    )
  
  }


}
