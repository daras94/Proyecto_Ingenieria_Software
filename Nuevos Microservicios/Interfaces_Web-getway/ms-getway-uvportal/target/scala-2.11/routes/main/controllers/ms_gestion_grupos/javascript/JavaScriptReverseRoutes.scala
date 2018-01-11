
// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/HDD-I Datos/Documentos/Mis Estudios/UAH/GII/3º de Carrera/1º Cuatrimestre/Ingeneria de Software Avazada/Laboratorio/WorkSpace/My_WorkSpace/WorkSpace/ms-getway-uvportal/ms-getway-uvportal/conf/routes
// @DATE:Wed Jan 10 20:52:16 CET 2018

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:60
package controllers.ms_gestion_grupos.javascript {
  import ReverseRouteContext.empty

  // @LINE:60
  class ReverseGestionGruposDeAsignaturas_ApiController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:60
    def asignaturasMatriculablesByAlumnoNumeroExpedienteGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ms_gestion_grupos.GestionGruposDeAsignaturas_ApiController.asignaturasMatriculablesByAlumnoNumeroExpedienteGet",
      """
        function(numeroExpediente0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "asignaturasMatriculablesByAlumno/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("numeroExpediente", numeroExpediente0)})
        }
      """
    )
  
  }


}
