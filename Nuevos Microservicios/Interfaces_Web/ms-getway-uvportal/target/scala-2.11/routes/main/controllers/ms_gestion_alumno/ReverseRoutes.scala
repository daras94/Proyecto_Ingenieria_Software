
// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/HDD-I Datos/Documentos/Mis Estudios/UAH/GII/3º de Carrera/1º Cuatrimestre/Ingeneria de Software Avazada/Laboratorio/WorkSpace/My_WorkSpace/WorkSpace/ms-getway-uvportal/ms-getway-uvportal/conf/routes
// @DATE:Wed Jan 10 20:52:16 CET 2018

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:17
package controllers.ms_gestion_alumno {

  // @LINE:17
  class ReverseGestionDeAlumnoApiController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def alumnoByNIFNIFDelete(NIF:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "alumnoByNIF/" + implicitly[PathBindable[String]].unbind("NIF", dynamicString(NIF)))
    }
  
    // @LINE:20
    def alumnoByNIFNIFPut(NIF:String): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "alumnoByNIF/" + implicitly[PathBindable[String]].unbind("NIF", dynamicString(NIF)))
    }
  
    // @LINE:19
    def alumnoByNIFNIFGet(NIF:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "alumnoByNIF/" + implicitly[PathBindable[String]].unbind("NIF", dynamicString(NIF)))
    }
  
    // @LINE:17
    def altaAlumnoPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "alta_alumno")
    }
  
  }


}
