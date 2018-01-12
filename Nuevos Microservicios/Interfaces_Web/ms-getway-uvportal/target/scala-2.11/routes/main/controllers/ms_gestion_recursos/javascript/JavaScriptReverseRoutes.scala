
// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/HDD-I Datos/Documentos/Mis Estudios/UAH/GII/3º de Carrera/1º Cuatrimestre/Ingeneria de Software Avazada/Laboratorio/WorkSpace/My_WorkSpace/WorkSpace/ms-getway-uvportal/ms-getway-uvportal/conf/routes
// @DATE:Wed Jan 10 20:52:16 CET 2018

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:32
package controllers.ms_gestion_recursos.javascript {
  import ReverseRouteContext.empty

  // @LINE:35
  class ReverseGestionDeFactura_ApiController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def facturasGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ms_gestion_recursos.GestionDeFactura_ApiController.facturasGet",
      """
        function(NIF0,mes1,ao2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "facturas" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("NIF", NIF0), (""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("mes", mes1), (""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("ao", ao2)])})
        }
      """
    )
  
  }

  // @LINE:32
  class ReverseGestionDeEspacios_ApiController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def espaciosGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ms_gestion_recursos.GestionDeEspacios_ApiController.espaciosGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "espacios"})
        }
      """
    )
  
  }


}
