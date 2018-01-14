
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/usuario/Documents/GitHub/Proyecto_Ingenieria_Software/GetWayPlay/conf/routes
// @DATE:Mon Dec 18 21:14:08 CET 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:32
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseLoginApiController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def loginGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginApiController.loginGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseAlumnoApiController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def alumnoPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AlumnoApiController.alumnoPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "alumno"})
        }
      """
    )
  
    // @LINE:10
    def alumnoNIFGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AlumnoApiController.alumnoNIFGet",
      """
        function(NIF0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "alumno/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("NIF", encodeURIComponent(NIF0))})
        }
      """
    )
  
    // @LINE:9
    def alumnoNIFDelete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AlumnoApiController.alumnoNIFDelete",
      """
        function(NIF0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "alumno/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("NIF", encodeURIComponent(NIF0))})
        }
      """
    )
  
    // @LINE:11
    def alumnoNIFPut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AlumnoApiController.alumnoNIFPut",
      """
        function(NIF0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "alumno/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("NIF", encodeURIComponent(NIF0))})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseCarreraApiController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def carreraCodeGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CarreraApiController.carreraCodeGet",
      """
        function(code0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "carrera/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("code", code0)})
        }
      """
    )
  
    // @LINE:18
    def carreraPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CarreraApiController.carreraPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "carrera"})
        }
      """
    )
  
    // @LINE:19
    def carrerasGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CarreraApiController.carrerasGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "carreras"})
        }
      """
    )
  
    // @LINE:15
    def carreraCodeDelete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CarreraApiController.carreraCodeDelete",
      """
        function(code0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "carrera/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("code", code0)})
        }
      """
    )
  
    // @LINE:17
    def carreraCodePut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CarreraApiController.carreraCodePut",
      """
        function(code0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "carrera/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("code", code0)})
        }
      """
    )
  
  }

  // @LINE:5
  class ReverseApiDocController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def api: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiDocController.api",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api"})
        }
      """
    )
  
  }

  // @LINE:25
  class ReverseMatriculaApiController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def matriculaPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MatriculaApiController.matriculaPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "matricula"})
        }
      """
    )
  
    // @LINE:26
    def matriculaGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MatriculaApiController.matriculaGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "matricula"})
        }
      """
    )
  
    // @LINE:28
    def matriculaPut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MatriculaApiController.matriculaPut",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "matricula"})
        }
      """
    )
  
    // @LINE:25
    def matriculaDelete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MatriculaApiController.matriculaDelete",
      """
        function() {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "matricula"})
        }
      """
    )
  
    // @LINE:29
    def matriculasNIFNIFGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MatriculaApiController.matriculasNIFNIFGet",
      """
        function(NIF0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "matriculas/NIF/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("NIF", encodeURIComponent(NIF0))})
        }
      """
    )
  
  }


}
