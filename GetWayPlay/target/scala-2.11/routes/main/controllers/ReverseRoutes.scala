
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/usuario/Documents/GitHub/Proyecto_Ingenieria_Software/GetWayPlay/conf/routes
// @DATE:Mon Dec 18 21:14:08 CET 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

  // @LINE:32
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:22
  class ReverseLoginApiController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def loginGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:9
  class ReverseAlumnoApiController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def alumnoPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "alumno")
    }
  
    // @LINE:10
    def alumnoNIFGet(NIF:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "alumno/" + implicitly[PathBindable[String]].unbind("NIF", dynamicString(NIF)))
    }
  
    // @LINE:9
    def alumnoNIFDelete(NIF:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "alumno/" + implicitly[PathBindable[String]].unbind("NIF", dynamicString(NIF)))
    }
  
    // @LINE:11
    def alumnoNIFPut(NIF:String): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "alumno/" + implicitly[PathBindable[String]].unbind("NIF", dynamicString(NIF)))
    }
  
  }

  // @LINE:15
  class ReverseCarreraApiController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def carreraCodeGet(code:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "carrera/" + implicitly[PathBindable[Integer]].unbind("code", code))
    }
  
    // @LINE:18
    def carreraPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "carrera")
    }
  
    // @LINE:19
    def carrerasGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "carreras")
    }
  
    // @LINE:15
    def carreraCodeDelete(code:Integer): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "carrera/" + implicitly[PathBindable[Integer]].unbind("code", code))
    }
  
    // @LINE:17
    def carreraCodePut(code:Integer): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "carrera/" + implicitly[PathBindable[Integer]].unbind("code", code))
    }
  
  }

  // @LINE:5
  class ReverseApiDocController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def api(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api")
    }
  
  }

  // @LINE:25
  class ReverseMatriculaApiController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def matriculaPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "matricula")
    }
  
    // @LINE:26
    def matriculaGet(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "matricula")
    }
  
    // @LINE:28
    def matriculaPut(): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "matricula")
    }
  
    // @LINE:25
    def matriculaDelete(): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "matricula")
    }
  
    // @LINE:29
    def matriculasNIFNIFGet(NIF:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "matriculas/NIF/" + implicitly[PathBindable[String]].unbind("NIF", dynamicString(NIF)))
    }
  
  }


}
