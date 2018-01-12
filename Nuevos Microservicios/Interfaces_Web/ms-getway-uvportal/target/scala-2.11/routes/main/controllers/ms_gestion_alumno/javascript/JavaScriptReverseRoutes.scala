
// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/HDD-I Datos/Documentos/Mis Estudios/UAH/GII/3º de Carrera/1º Cuatrimestre/Ingeneria de Software Avazada/Laboratorio/WorkSpace/My_WorkSpace/WorkSpace/ms-getway-uvportal/ms-getway-uvportal/conf/routes
// @DATE:Wed Jan 10 20:52:16 CET 2018

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:17
package controllers.ms_gestion_alumno.javascript {
  import ReverseRouteContext.empty

  // @LINE:17
  class ReverseGestionDeAlumnoApiController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def alumnoByNIFNIFDelete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ms_gestion_alumno.GestionDeAlumnoApiController.alumnoByNIFNIFDelete",
      """
        function(NIF0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "alumnoByNIF/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("NIF", encodeURIComponent(NIF0))})
        }
      """
    )
  
    // @LINE:20
    def alumnoByNIFNIFPut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ms_gestion_alumno.GestionDeAlumnoApiController.alumnoByNIFNIFPut",
      """
        function(NIF0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "alumnoByNIF/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("NIF", encodeURIComponent(NIF0))})
        }
      """
    )
  
    // @LINE:19
    def alumnoByNIFNIFGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ms_gestion_alumno.GestionDeAlumnoApiController.alumnoByNIFNIFGet",
      """
        function(NIF0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "alumnoByNIF/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("NIF", encodeURIComponent(NIF0))})
        }
      """
    )
  
    // @LINE:17
    def altaAlumnoPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ms_gestion_alumno.GestionDeAlumnoApiController.altaAlumnoPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "alta_alumno"})
        }
      """
    )
  
  }


}
