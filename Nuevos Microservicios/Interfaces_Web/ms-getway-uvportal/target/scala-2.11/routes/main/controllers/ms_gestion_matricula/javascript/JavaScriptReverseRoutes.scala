
// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/HDD-I Datos/Documentos/Mis Estudios/UAH/GII/3º de Carrera/1º Cuatrimestre/Ingeneria de Software Avazada/Laboratorio/WorkSpace/My_WorkSpace/WorkSpace/ms-getway-uvportal/ms-getway-uvportal/conf/routes
// @DATE:Wed Jan 10 20:52:16 CET 2018

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:38
package controllers.ms_gestion_matricula.javascript {
  import ReverseRouteContext.empty

  // @LINE:38
  class ReverseGestionDeMatriculaApiController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def reservaMatriculaPut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ms_gestion_matricula.GestionDeMatriculaApiController.reservaMatriculaPut",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "reservaMatricula"})
        }
      """
    )
  
    // @LINE:38
    def reservaMatriculaGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ms_gestion_matricula.GestionDeMatriculaApiController.reservaMatriculaGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reservaMatricula"})
        }
      """
    )
  
  }

  // @LINE:42
  class ReverseGestionDeMatriculas_ApiController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def realizarReservaNumeroExpedientePut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ms_gestion_matricula.GestionDeMatriculas_ApiController.realizarReservaNumeroExpedientePut",
      """
        function(numeroExpediente0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "realizarReserva/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("numeroExpediente", numeroExpediente0)})
        }
      """
    )
  
    // @LINE:44
    def verExpedienteNumeroExpedienteGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ms_gestion_matricula.GestionDeMatriculas_ApiController.verExpedienteNumeroExpedienteGet",
      """
        function(numeroExpediente0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "verExpediente/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("numeroExpediente", numeroExpediente0)})
        }
      """
    )
  
    // @LINE:42
    def crearMatriculaNumeroExpedientePost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ms_gestion_matricula.GestionDeMatriculas_ApiController.crearMatriculaNumeroExpedientePost",
      """
        function(numeroExpediente0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "crearMatricula/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("numeroExpediente", numeroExpediente0)})
        }
      """
    )
  
  }


}
