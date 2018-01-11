
// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/HDD-I Datos/Documentos/Mis Estudios/UAH/GII/3º de Carrera/1º Cuatrimestre/Ingeneria de Software Avazada/Laboratorio/WorkSpace/My_WorkSpace/WorkSpace/ms-getway-uvportal/ms-getway-uvportal/conf/routes
// @DATE:Wed Jan 10 20:52:16 CET 2018

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:32
package controllers.ms_gestion_recursos {

  // @LINE:35
  class ReverseGestionDeFactura_ApiController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def facturasGet(NIF:String, mes:Integer, ao:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "facturas" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("NIF", NIF)), Some(implicitly[QueryStringBindable[Integer]].unbind("mes", mes)), Some(implicitly[QueryStringBindable[Integer]].unbind("ao", ao)))))
    }
  
  }

  // @LINE:32
  class ReverseGestionDeEspacios_ApiController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def espaciosGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "espacios")
    }
  
  }


}
