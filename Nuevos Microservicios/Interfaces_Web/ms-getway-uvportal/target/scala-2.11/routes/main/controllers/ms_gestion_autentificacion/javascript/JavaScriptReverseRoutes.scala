
// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/HDD-I Datos/Documentos/Mis Estudios/UAH/GII/3º de Carrera/1º Cuatrimestre/Ingeneria de Software Avazada/Laboratorio/WorkSpace/My_WorkSpace/WorkSpace/ms-getway-uvportal/ms-getway-uvportal/conf/routes
// @DATE:Wed Jan 10 20:52:16 CET 2018

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:23
package controllers.ms_gestion_autentificacion.javascript {
  import ReverseRouteContext.empty

  // @LINE:23
  class ReverseGestionDeAuthentificacionApiController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def loginUserInit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ms_gestion_autentificacion.GestionDeAuthentificacionApiController.loginUserInit",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:24
    def loginUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ms_gestion_autentificacion.GestionDeAuthentificacionApiController.loginUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:25
    def logoutUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ms_gestion_autentificacion.GestionDeAuthentificacionApiController.logoutUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
  }


}
