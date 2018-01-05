
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/usuario/Documents/GitHub/Proyecto_Ingenieria_Software/GetWayPlay/conf/routes
// @DATE:Mon Dec 18 21:14:08 CET 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  ApiDocController_3: controllers.ApiDocController,
  // @LINE:9
  AlumnoApiController_2: controllers.AlumnoApiController,
  // @LINE:15
  CarreraApiController_5: controllers.CarreraApiController,
  // @LINE:22
  LoginApiController_1: controllers.LoginApiController,
  // @LINE:25
  MatriculaApiController_0: controllers.MatriculaApiController,
  // @LINE:32
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    ApiDocController_3: controllers.ApiDocController,
    // @LINE:9
    AlumnoApiController_2: controllers.AlumnoApiController,
    // @LINE:15
    CarreraApiController_5: controllers.CarreraApiController,
    // @LINE:22
    LoginApiController_1: controllers.LoginApiController,
    // @LINE:25
    MatriculaApiController_0: controllers.MatriculaApiController,
    // @LINE:32
    Assets_4: controllers.Assets
  ) = this(errorHandler, ApiDocController_3, AlumnoApiController_2, CarreraApiController_5, LoginApiController_1, MatriculaApiController_0, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ApiDocController_3, AlumnoApiController_2, CarreraApiController_5, LoginApiController_1, MatriculaApiController_0, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api""", """controllers.ApiDocController.api"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """alumno/""" + "$" + """NIF<[^/]+>""", """controllers.AlumnoApiController.alumnoNIFDelete(NIF:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """alumno/""" + "$" + """NIF<[^/]+>""", """controllers.AlumnoApiController.alumnoNIFGet(NIF:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """alumno/""" + "$" + """NIF<[^/]+>""", """controllers.AlumnoApiController.alumnoNIFPut(NIF:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """alumno""", """controllers.AlumnoApiController.alumnoPost()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """carrera/""" + "$" + """code<[^/]+>""", """controllers.CarreraApiController.carreraCodeDelete(code:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """carrera/""" + "$" + """code<[^/]+>""", """controllers.CarreraApiController.carreraCodeGet(code:Integer)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """carrera/""" + "$" + """code<[^/]+>""", """controllers.CarreraApiController.carreraCodePut(code:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """carrera""", """controllers.CarreraApiController.carreraPost()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """carreras""", """controllers.CarreraApiController.carrerasGet()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginApiController.loginGet()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """matricula""", """controllers.MatriculaApiController.matriculaDelete()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """matricula""", """controllers.MatriculaApiController.matriculaGet()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """matricula""", """controllers.MatriculaApiController.matriculaPost()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """matricula""", """controllers.MatriculaApiController.matriculaPut()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """matriculas/NIF/""" + "$" + """NIF<[^/]+>""", """controllers.MatriculaApiController.matriculasNIFNIFGet(NIF:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_ApiDocController_api0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api")))
  )
  private[this] lazy val controllers_ApiDocController_api0_invoker = createInvoker(
    ApiDocController_3.api,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiDocController",
      "api",
      Nil,
      "GET",
      """""",
      this.prefix + """api"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_AlumnoApiController_alumnoNIFDelete1_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("alumno/"), DynamicPart("NIF", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AlumnoApiController_alumnoNIFDelete1_invoker = createInvoker(
    AlumnoApiController_2.alumnoNIFDelete(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AlumnoApiController",
      "alumnoNIFDelete",
      Seq(classOf[String]),
      "DELETE",
      """Functions for Alumno API""",
      this.prefix + """alumno/""" + "$" + """NIF<[^/]+>"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AlumnoApiController_alumnoNIFGet2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("alumno/"), DynamicPart("NIF", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AlumnoApiController_alumnoNIFGet2_invoker = createInvoker(
    AlumnoApiController_2.alumnoNIFGet(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AlumnoApiController",
      "alumnoNIFGet",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """alumno/""" + "$" + """NIF<[^/]+>"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_AlumnoApiController_alumnoNIFPut3_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("alumno/"), DynamicPart("NIF", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AlumnoApiController_alumnoNIFPut3_invoker = createInvoker(
    AlumnoApiController_2.alumnoNIFPut(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AlumnoApiController",
      "alumnoNIFPut",
      Seq(classOf[String]),
      "PUT",
      """""",
      this.prefix + """alumno/""" + "$" + """NIF<[^/]+>"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_AlumnoApiController_alumnoPost4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("alumno")))
  )
  private[this] lazy val controllers_AlumnoApiController_alumnoPost4_invoker = createInvoker(
    AlumnoApiController_2.alumnoPost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AlumnoApiController",
      "alumnoPost",
      Nil,
      "POST",
      """""",
      this.prefix + """alumno"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_CarreraApiController_carreraCodeDelete5_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("carrera/"), DynamicPart("code", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CarreraApiController_carreraCodeDelete5_invoker = createInvoker(
    CarreraApiController_5.carreraCodeDelete(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CarreraApiController",
      "carreraCodeDelete",
      Seq(classOf[Integer]),
      "DELETE",
      """Functions for Carrera API""",
      this.prefix + """carrera/""" + "$" + """code<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_CarreraApiController_carreraCodeGet6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("carrera/"), DynamicPart("code", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CarreraApiController_carreraCodeGet6_invoker = createInvoker(
    CarreraApiController_5.carreraCodeGet(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CarreraApiController",
      "carreraCodeGet",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """carrera/""" + "$" + """code<[^/]+>"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_CarreraApiController_carreraCodePut7_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("carrera/"), DynamicPart("code", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CarreraApiController_carreraCodePut7_invoker = createInvoker(
    CarreraApiController_5.carreraCodePut(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CarreraApiController",
      "carreraCodePut",
      Seq(classOf[Integer]),
      "PUT",
      """""",
      this.prefix + """carrera/""" + "$" + """code<[^/]+>"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_CarreraApiController_carreraPost8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("carrera")))
  )
  private[this] lazy val controllers_CarreraApiController_carreraPost8_invoker = createInvoker(
    CarreraApiController_5.carreraPost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CarreraApiController",
      "carreraPost",
      Nil,
      "POST",
      """""",
      this.prefix + """carrera"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_CarreraApiController_carrerasGet9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("carreras")))
  )
  private[this] lazy val controllers_CarreraApiController_carrerasGet9_invoker = createInvoker(
    CarreraApiController_5.carrerasGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CarreraApiController",
      "carrerasGet",
      Nil,
      "GET",
      """""",
      this.prefix + """carreras"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_LoginApiController_loginGet10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginApiController_loginGet10_invoker = createInvoker(
    LoginApiController_1.loginGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginApiController",
      "loginGet",
      Nil,
      "GET",
      """Functions for Login API""",
      this.prefix + """login"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_MatriculaApiController_matriculaDelete11_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("matricula")))
  )
  private[this] lazy val controllers_MatriculaApiController_matriculaDelete11_invoker = createInvoker(
    MatriculaApiController_0.matriculaDelete(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MatriculaApiController",
      "matriculaDelete",
      Nil,
      "DELETE",
      """Functions for Matricula API""",
      this.prefix + """matricula"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_MatriculaApiController_matriculaGet12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("matricula")))
  )
  private[this] lazy val controllers_MatriculaApiController_matriculaGet12_invoker = createInvoker(
    MatriculaApiController_0.matriculaGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MatriculaApiController",
      "matriculaGet",
      Nil,
      "GET",
      """""",
      this.prefix + """matricula"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_MatriculaApiController_matriculaPost13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("matricula")))
  )
  private[this] lazy val controllers_MatriculaApiController_matriculaPost13_invoker = createInvoker(
    MatriculaApiController_0.matriculaPost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MatriculaApiController",
      "matriculaPost",
      Nil,
      "POST",
      """""",
      this.prefix + """matricula"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_MatriculaApiController_matriculaPut14_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("matricula")))
  )
  private[this] lazy val controllers_MatriculaApiController_matriculaPut14_invoker = createInvoker(
    MatriculaApiController_0.matriculaPut(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MatriculaApiController",
      "matriculaPut",
      Nil,
      "PUT",
      """""",
      this.prefix + """matricula"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_MatriculaApiController_matriculasNIFNIFGet15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("matriculas/NIF/"), DynamicPart("NIF", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MatriculaApiController_matriculasNIFNIFGet15_invoker = createInvoker(
    MatriculaApiController_0.matriculasNIFNIFGet(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MatriculaApiController",
      "matriculasNIFNIFGet",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """matriculas/NIF/""" + "$" + """NIF<[^/]+>"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_Assets_versioned16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned16_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_ApiDocController_api0_route(params) =>
      call { 
        controllers_ApiDocController_api0_invoker.call(ApiDocController_3.api)
      }
  
    // @LINE:9
    case controllers_AlumnoApiController_alumnoNIFDelete1_route(params) =>
      call(params.fromPath[String]("NIF", None)) { (NIF) =>
        controllers_AlumnoApiController_alumnoNIFDelete1_invoker.call(AlumnoApiController_2.alumnoNIFDelete(NIF))
      }
  
    // @LINE:10
    case controllers_AlumnoApiController_alumnoNIFGet2_route(params) =>
      call(params.fromPath[String]("NIF", None)) { (NIF) =>
        controllers_AlumnoApiController_alumnoNIFGet2_invoker.call(AlumnoApiController_2.alumnoNIFGet(NIF))
      }
  
    // @LINE:11
    case controllers_AlumnoApiController_alumnoNIFPut3_route(params) =>
      call(params.fromPath[String]("NIF", None)) { (NIF) =>
        controllers_AlumnoApiController_alumnoNIFPut3_invoker.call(AlumnoApiController_2.alumnoNIFPut(NIF))
      }
  
    // @LINE:12
    case controllers_AlumnoApiController_alumnoPost4_route(params) =>
      call { 
        controllers_AlumnoApiController_alumnoPost4_invoker.call(AlumnoApiController_2.alumnoPost())
      }
  
    // @LINE:15
    case controllers_CarreraApiController_carreraCodeDelete5_route(params) =>
      call(params.fromPath[Integer]("code", None)) { (code) =>
        controllers_CarreraApiController_carreraCodeDelete5_invoker.call(CarreraApiController_5.carreraCodeDelete(code))
      }
  
    // @LINE:16
    case controllers_CarreraApiController_carreraCodeGet6_route(params) =>
      call(params.fromPath[Integer]("code", None)) { (code) =>
        controllers_CarreraApiController_carreraCodeGet6_invoker.call(CarreraApiController_5.carreraCodeGet(code))
      }
  
    // @LINE:17
    case controllers_CarreraApiController_carreraCodePut7_route(params) =>
      call(params.fromPath[Integer]("code", None)) { (code) =>
        controllers_CarreraApiController_carreraCodePut7_invoker.call(CarreraApiController_5.carreraCodePut(code))
      }
  
    // @LINE:18
    case controllers_CarreraApiController_carreraPost8_route(params) =>
      call { 
        controllers_CarreraApiController_carreraPost8_invoker.call(CarreraApiController_5.carreraPost())
      }
  
    // @LINE:19
    case controllers_CarreraApiController_carrerasGet9_route(params) =>
      call { 
        controllers_CarreraApiController_carrerasGet9_invoker.call(CarreraApiController_5.carrerasGet())
      }
  
    // @LINE:22
    case controllers_LoginApiController_loginGet10_route(params) =>
      call { 
        controllers_LoginApiController_loginGet10_invoker.call(LoginApiController_1.loginGet())
      }
  
    // @LINE:25
    case controllers_MatriculaApiController_matriculaDelete11_route(params) =>
      call { 
        controllers_MatriculaApiController_matriculaDelete11_invoker.call(MatriculaApiController_0.matriculaDelete())
      }
  
    // @LINE:26
    case controllers_MatriculaApiController_matriculaGet12_route(params) =>
      call { 
        controllers_MatriculaApiController_matriculaGet12_invoker.call(MatriculaApiController_0.matriculaGet())
      }
  
    // @LINE:27
    case controllers_MatriculaApiController_matriculaPost13_route(params) =>
      call { 
        controllers_MatriculaApiController_matriculaPost13_invoker.call(MatriculaApiController_0.matriculaPost())
      }
  
    // @LINE:28
    case controllers_MatriculaApiController_matriculaPut14_route(params) =>
      call { 
        controllers_MatriculaApiController_matriculaPut14_invoker.call(MatriculaApiController_0.matriculaPut())
      }
  
    // @LINE:29
    case controllers_MatriculaApiController_matriculasNIFNIFGet15_route(params) =>
      call(params.fromPath[String]("NIF", None)) { (NIF) =>
        controllers_MatriculaApiController_matriculasNIFNIFGet15_invoker.call(MatriculaApiController_0.matriculasNIFNIFGet(NIF))
      }
  
    // @LINE:32
    case controllers_Assets_versioned16_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned16_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
