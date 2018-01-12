
// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/HDD-I Datos/Documentos/Mis Estudios/UAH/GII/3º de Carrera/1º Cuatrimestre/Ingeneria de Software Avazada/Laboratorio/WorkSpace/My_WorkSpace/WorkSpace/ms-getway-uvportal/ms-getway-uvportal/conf/routes
// @DATE:Wed Jan 10 20:52:16 CET 2018

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:38
package controllers.ms_gestion_matricula {

  // @LINE:38
  class ReverseGestionDeMatriculaApiController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def reservaMatriculaPut(): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "reservaMatricula")
    }
  
    // @LINE:38
    def reservaMatriculaGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "reservaMatricula")
    }
  
  }

  // @LINE:42
  class ReverseGestionDeMatriculas_ApiController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def realizarReservaNumeroExpedientePut(numeroExpediente:Integer): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "realizarReserva/" + implicitly[PathBindable[Integer]].unbind("numeroExpediente", numeroExpediente))
    }
  
    // @LINE:44
    def verExpedienteNumeroExpedienteGet(numeroExpediente:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "verExpediente/" + implicitly[PathBindable[Integer]].unbind("numeroExpediente", numeroExpediente))
    }
  
    // @LINE:42
    def crearMatriculaNumeroExpedientePost(numeroExpediente:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "crearMatricula/" + implicitly[PathBindable[Integer]].unbind("numeroExpediente", numeroExpediente))
    }
  
  }


}
