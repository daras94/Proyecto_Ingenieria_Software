
// @GENERATOR:play-routes-compiler
// @SOURCE:/mnt/HDD-I Datos/Documentos/Mis Estudios/UAH/GII/3º de Carrera/1º Cuatrimestre/Ingeneria de Software Avazada/Laboratorio/WorkSpace/My_WorkSpace/WorkSpace/ms-getway-uvportal/ms-getway-uvportal/conf/routes
// @DATE:Wed Jan 10 20:52:16 CET 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_3: controllers.HomeController,
  // @LINE:8
  CountController_2: controllers.CountController,
  // @LINE:12
  AsyncController_5: controllers.AsyncController,
  // @LINE:14
  ApiDocController_9: controllers.ApiDocController,
  // @LINE:17
  GestionDeAlumnoApiController_11: controllers.ms_gestion_alumno.GestionDeAlumnoApiController,
  // @LINE:23
  GestionDeAuthentificacionApiController_4: controllers.ms_gestion_autentificacion.GestionDeAuthentificacionApiController,
  // @LINE:28
  GestionDeConsultasDeReservas_ApiController_12: controllers.ms_gestion_reservas.GestionDeConsultasDeReservas_ApiController,
  // @LINE:32
  GestionDeEspacios_ApiController_1: controllers.ms_gestion_recursos.GestionDeEspacios_ApiController,
  // @LINE:35
  GestionDeFactura_ApiController_6: controllers.ms_gestion_recursos.GestionDeFactura_ApiController,
  // @LINE:38
  GestionDeMatriculaApiController_8: controllers.ms_gestion_matricula.GestionDeMatriculaApiController,
  // @LINE:42
  GestionDeMatriculas_ApiController_7: controllers.ms_gestion_matricula.GestionDeMatriculas_ApiController,
  // @LINE:47
  GestionDeNominas_ApiController_13: controllers.ms_gestion_economica.GestionDeNominas_ApiController,
  // @LINE:51
  GestionDePagosApiController_15: controllers.ms_gestion_economica.GestionDePagosApiController,
  // @LINE:55
  GestionDeReservasApiController_14: controllers.ms_gestion_reservas.GestionDeReservasApiController,
  // @LINE:60
  GestionGruposDeAsignaturas_ApiController_0: controllers.ms_gestion_grupos.GestionGruposDeAsignaturas_ApiController,
  // @LINE:63
  Assets_10: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_3: controllers.HomeController,
    // @LINE:8
    CountController_2: controllers.CountController,
    // @LINE:12
    AsyncController_5: controllers.AsyncController,
    // @LINE:14
    ApiDocController_9: controllers.ApiDocController,
    // @LINE:17
    GestionDeAlumnoApiController_11: controllers.ms_gestion_alumno.GestionDeAlumnoApiController,
    // @LINE:23
    GestionDeAuthentificacionApiController_4: controllers.ms_gestion_autentificacion.GestionDeAuthentificacionApiController,
    // @LINE:28
    GestionDeConsultasDeReservas_ApiController_12: controllers.ms_gestion_reservas.GestionDeConsultasDeReservas_ApiController,
    // @LINE:32
    GestionDeEspacios_ApiController_1: controllers.ms_gestion_recursos.GestionDeEspacios_ApiController,
    // @LINE:35
    GestionDeFactura_ApiController_6: controllers.ms_gestion_recursos.GestionDeFactura_ApiController,
    // @LINE:38
    GestionDeMatriculaApiController_8: controllers.ms_gestion_matricula.GestionDeMatriculaApiController,
    // @LINE:42
    GestionDeMatriculas_ApiController_7: controllers.ms_gestion_matricula.GestionDeMatriculas_ApiController,
    // @LINE:47
    GestionDeNominas_ApiController_13: controllers.ms_gestion_economica.GestionDeNominas_ApiController,
    // @LINE:51
    GestionDePagosApiController_15: controllers.ms_gestion_economica.GestionDePagosApiController,
    // @LINE:55
    GestionDeReservasApiController_14: controllers.ms_gestion_reservas.GestionDeReservasApiController,
    // @LINE:60
    GestionGruposDeAsignaturas_ApiController_0: controllers.ms_gestion_grupos.GestionGruposDeAsignaturas_ApiController,
    // @LINE:63
    Assets_10: controllers.Assets
  ) = this(errorHandler, HomeController_3, CountController_2, AsyncController_5, ApiDocController_9, GestionDeAlumnoApiController_11, GestionDeAuthentificacionApiController_4, GestionDeConsultasDeReservas_ApiController_12, GestionDeEspacios_ApiController_1, GestionDeFactura_ApiController_6, GestionDeMatriculaApiController_8, GestionDeMatriculas_ApiController_7, GestionDeNominas_ApiController_13, GestionDePagosApiController_15, GestionDeReservasApiController_14, GestionGruposDeAsignaturas_ApiController_0, Assets_10, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_3, CountController_2, AsyncController_5, ApiDocController_9, GestionDeAlumnoApiController_11, GestionDeAuthentificacionApiController_4, GestionDeConsultasDeReservas_ApiController_12, GestionDeEspacios_ApiController_1, GestionDeFactura_ApiController_6, GestionDeMatriculaApiController_8, GestionDeMatriculas_ApiController_7, GestionDeNominas_ApiController_13, GestionDePagosApiController_15, GestionDeReservasApiController_14, GestionGruposDeAsignaturas_ApiController_0, Assets_10, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registro""", """controllers.HomeController.registro"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api""", """controllers.ApiDocController.api"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """alta_alumno""", """controllers.ms_gestion_alumno.GestionDeAlumnoApiController.altaAlumnoPost()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """alumnoByNIF/""" + "$" + """NIF<[^/]+>""", """controllers.ms_gestion_alumno.GestionDeAlumnoApiController.alumnoByNIFNIFDelete(NIF:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """alumnoByNIF/""" + "$" + """NIF<[^/]+>""", """controllers.ms_gestion_alumno.GestionDeAlumnoApiController.alumnoByNIFNIFGet(NIF:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """alumnoByNIF/""" + "$" + """NIF<[^/]+>""", """controllers.ms_gestion_alumno.GestionDeAlumnoApiController.alumnoByNIFNIFPut(NIF:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.ms_gestion_autentificacion.GestionDeAuthentificacionApiController.loginUserInit()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.ms_gestion_autentificacion.GestionDeAuthentificacionApiController.loginUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.ms_gestion_autentificacion.GestionDeAuthentificacionApiController.logoutUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reservas/disponibles/espacios""", """controllers.ms_gestion_reservas.GestionDeConsultasDeReservas_ApiController.reservasDisponiblesEspaciosGet()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reservas/disponibles/horas""", """controllers.ms_gestion_reservas.GestionDeConsultasDeReservas_ApiController.reservasDisponiblesHorasGet()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """espacios""", """controllers.ms_gestion_recursos.GestionDeEspacios_ApiController.espaciosGet()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """facturas""", """controllers.ms_gestion_recursos.GestionDeFactura_ApiController.facturasGet(NIF:String, mes:Integer, ao:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reservaMatricula""", """controllers.ms_gestion_matricula.GestionDeMatriculaApiController.reservaMatriculaGet()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reservaMatricula""", """controllers.ms_gestion_matricula.GestionDeMatriculaApiController.reservaMatriculaPut()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """crearMatricula/""" + "$" + """numeroExpediente<[^/]+>""", """controllers.ms_gestion_matricula.GestionDeMatriculas_ApiController.crearMatriculaNumeroExpedientePost(numeroExpediente:Integer)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """realizarReserva/""" + "$" + """numeroExpediente<[^/]+>""", """controllers.ms_gestion_matricula.GestionDeMatriculas_ApiController.realizarReservaNumeroExpedientePut(numeroExpediente:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """verExpediente/""" + "$" + """numeroExpediente<[^/]+>""", """controllers.ms_gestion_matricula.GestionDeMatriculas_ApiController.verExpedienteNumeroExpedienteGet(numeroExpediente:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """nomina""", """controllers.ms_gestion_economica.GestionDeNominas_ApiController.nominaPost()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """nominas/""" + "$" + """NIF<[^/]+>""", """controllers.ms_gestion_economica.GestionDeNominas_ApiController.nominasNIFGet(NIF:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """actualizarPago""", """controllers.ms_gestion_economica.GestionDePagosApiController.actualizarPagoPut()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pagosMatricula""", """controllers.ms_gestion_economica.GestionDePagosApiController.pagosMatriculaGet()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reservas/actualizar""", """controllers.ms_gestion_reservas.GestionDeReservasApiController.reservasActualizarPut()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reservas/cancelar""", """controllers.ms_gestion_reservas.GestionDeReservasApiController.reservasCancelarDelete()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reservas/reservar""", """controllers.ms_gestion_reservas.GestionDeReservasApiController.reservasReservarPost()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """asignaturasMatriculablesByAlumno/""" + "$" + """numeroExpediente<[^/]+>""", """controllers.ms_gestion_grupos.GestionGruposDeAsignaturas_ApiController.asignaturasMatriculablesByAlumnoNumeroExpedienteGet(numeroExpediente:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_3.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_2.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_registro2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registro")))
  )
  private[this] lazy val controllers_HomeController_registro2_invoker = createInvoker(
    HomeController_3.registro,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "registro",
      Nil,
      "GET",
      """""",
      this.prefix + """registro"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_AsyncController_message3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message3_invoker = createInvoker(
    AsyncController_5.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_ApiDocController_api4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api")))
  )
  private[this] lazy val controllers_ApiDocController_api4_invoker = createInvoker(
    ApiDocController_9.api,
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

  // @LINE:17
  private[this] lazy val controllers_ms_gestion_alumno_GestionDeAlumnoApiController_altaAlumnoPost5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("alta_alumno")))
  )
  private[this] lazy val controllers_ms_gestion_alumno_GestionDeAlumnoApiController_altaAlumnoPost5_invoker = createInvoker(
    GestionDeAlumnoApiController_11.altaAlumnoPost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ms_gestion_alumno.GestionDeAlumnoApiController",
      "altaAlumnoPost",
      Nil,
      "POST",
      """Functions for GestionDeAlumno API""",
      this.prefix + """alta_alumno"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ms_gestion_alumno_GestionDeAlumnoApiController_alumnoByNIFNIFDelete6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("alumnoByNIF/"), DynamicPart("NIF", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ms_gestion_alumno_GestionDeAlumnoApiController_alumnoByNIFNIFDelete6_invoker = createInvoker(
    GestionDeAlumnoApiController_11.alumnoByNIFNIFDelete(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ms_gestion_alumno.GestionDeAlumnoApiController",
      "alumnoByNIFNIFDelete",
      Seq(classOf[String]),
      "DELETE",
      """""",
      this.prefix + """alumnoByNIF/""" + "$" + """NIF<[^/]+>"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ms_gestion_alumno_GestionDeAlumnoApiController_alumnoByNIFNIFGet7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("alumnoByNIF/"), DynamicPart("NIF", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ms_gestion_alumno_GestionDeAlumnoApiController_alumnoByNIFNIFGet7_invoker = createInvoker(
    GestionDeAlumnoApiController_11.alumnoByNIFNIFGet(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ms_gestion_alumno.GestionDeAlumnoApiController",
      "alumnoByNIFNIFGet",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """alumnoByNIF/""" + "$" + """NIF<[^/]+>"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ms_gestion_alumno_GestionDeAlumnoApiController_alumnoByNIFNIFPut8_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("alumnoByNIF/"), DynamicPart("NIF", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ms_gestion_alumno_GestionDeAlumnoApiController_alumnoByNIFNIFPut8_invoker = createInvoker(
    GestionDeAlumnoApiController_11.alumnoByNIFNIFPut(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ms_gestion_alumno.GestionDeAlumnoApiController",
      "alumnoByNIFNIFPut",
      Seq(classOf[String]),
      "PUT",
      """""",
      this.prefix + """alumnoByNIF/""" + "$" + """NIF<[^/]+>"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_ms_gestion_autentificacion_GestionDeAuthentificacionApiController_loginUserInit9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_ms_gestion_autentificacion_GestionDeAuthentificacionApiController_loginUserInit9_invoker = createInvoker(
    GestionDeAuthentificacionApiController_4.loginUserInit(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ms_gestion_autentificacion.GestionDeAuthentificacionApiController",
      "loginUserInit",
      Nil,
      "GET",
      """Functions for GestionDeAuthentificacion API""",
      this.prefix + """login"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ms_gestion_autentificacion_GestionDeAuthentificacionApiController_loginUser10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_ms_gestion_autentificacion_GestionDeAuthentificacionApiController_loginUser10_invoker = createInvoker(
    GestionDeAuthentificacionApiController_4.loginUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ms_gestion_autentificacion.GestionDeAuthentificacionApiController",
      "loginUser",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_ms_gestion_autentificacion_GestionDeAuthentificacionApiController_logoutUser11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_ms_gestion_autentificacion_GestionDeAuthentificacionApiController_logoutUser11_invoker = createInvoker(
    GestionDeAuthentificacionApiController_4.logoutUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ms_gestion_autentificacion.GestionDeAuthentificacionApiController",
      "logoutUser",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_ms_gestion_reservas_GestionDeConsultasDeReservas_ApiController_reservasDisponiblesEspaciosGet12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reservas/disponibles/espacios")))
  )
  private[this] lazy val controllers_ms_gestion_reservas_GestionDeConsultasDeReservas_ApiController_reservasDisponiblesEspaciosGet12_invoker = createInvoker(
    GestionDeConsultasDeReservas_ApiController_12.reservasDisponiblesEspaciosGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ms_gestion_reservas.GestionDeConsultasDeReservas_ApiController",
      "reservasDisponiblesEspaciosGet",
      Nil,
      "GET",
      """Functions for GestionDeConsultasDeReservas_ API""",
      this.prefix + """reservas/disponibles/espacios"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_ms_gestion_reservas_GestionDeConsultasDeReservas_ApiController_reservasDisponiblesHorasGet13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reservas/disponibles/horas")))
  )
  private[this] lazy val controllers_ms_gestion_reservas_GestionDeConsultasDeReservas_ApiController_reservasDisponiblesHorasGet13_invoker = createInvoker(
    GestionDeConsultasDeReservas_ApiController_12.reservasDisponiblesHorasGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ms_gestion_reservas.GestionDeConsultasDeReservas_ApiController",
      "reservasDisponiblesHorasGet",
      Nil,
      "GET",
      """""",
      this.prefix + """reservas/disponibles/horas"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_ms_gestion_recursos_GestionDeEspacios_ApiController_espaciosGet14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("espacios")))
  )
  private[this] lazy val controllers_ms_gestion_recursos_GestionDeEspacios_ApiController_espaciosGet14_invoker = createInvoker(
    GestionDeEspacios_ApiController_1.espaciosGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ms_gestion_recursos.GestionDeEspacios_ApiController",
      "espaciosGet",
      Nil,
      "GET",
      """Functions for GestionDeEspacios_ API""",
      this.prefix + """espacios"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_ms_gestion_recursos_GestionDeFactura_ApiController_facturasGet15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("facturas")))
  )
  private[this] lazy val controllers_ms_gestion_recursos_GestionDeFactura_ApiController_facturasGet15_invoker = createInvoker(
    GestionDeFactura_ApiController_6.facturasGet(fakeValue[String], fakeValue[Integer], fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ms_gestion_recursos.GestionDeFactura_ApiController",
      "facturasGet",
      Seq(classOf[String], classOf[Integer], classOf[Integer]),
      "GET",
      """Functions for GestionDeFactura_ API""",
      this.prefix + """facturas"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_ms_gestion_matricula_GestionDeMatriculaApiController_reservaMatriculaGet16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reservaMatricula")))
  )
  private[this] lazy val controllers_ms_gestion_matricula_GestionDeMatriculaApiController_reservaMatriculaGet16_invoker = createInvoker(
    GestionDeMatriculaApiController_8.reservaMatriculaGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ms_gestion_matricula.GestionDeMatriculaApiController",
      "reservaMatriculaGet",
      Nil,
      "GET",
      """Functions for GestionDeMatricula API""",
      this.prefix + """reservaMatricula"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_ms_gestion_matricula_GestionDeMatriculaApiController_reservaMatriculaPut17_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reservaMatricula")))
  )
  private[this] lazy val controllers_ms_gestion_matricula_GestionDeMatriculaApiController_reservaMatriculaPut17_invoker = createInvoker(
    GestionDeMatriculaApiController_8.reservaMatriculaPut(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ms_gestion_matricula.GestionDeMatriculaApiController",
      "reservaMatriculaPut",
      Nil,
      "PUT",
      """""",
      this.prefix + """reservaMatricula"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_ms_gestion_matricula_GestionDeMatriculas_ApiController_crearMatriculaNumeroExpedientePost18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("crearMatricula/"), DynamicPart("numeroExpediente", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ms_gestion_matricula_GestionDeMatriculas_ApiController_crearMatriculaNumeroExpedientePost18_invoker = createInvoker(
    GestionDeMatriculas_ApiController_7.crearMatriculaNumeroExpedientePost(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ms_gestion_matricula.GestionDeMatriculas_ApiController",
      "crearMatriculaNumeroExpedientePost",
      Seq(classOf[Integer]),
      "POST",
      """Functions for GestionDeMatriculas_ API""",
      this.prefix + """crearMatricula/""" + "$" + """numeroExpediente<[^/]+>"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_ms_gestion_matricula_GestionDeMatriculas_ApiController_realizarReservaNumeroExpedientePut19_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("realizarReserva/"), DynamicPart("numeroExpediente", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ms_gestion_matricula_GestionDeMatriculas_ApiController_realizarReservaNumeroExpedientePut19_invoker = createInvoker(
    GestionDeMatriculas_ApiController_7.realizarReservaNumeroExpedientePut(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ms_gestion_matricula.GestionDeMatriculas_ApiController",
      "realizarReservaNumeroExpedientePut",
      Seq(classOf[Integer]),
      "PUT",
      """""",
      this.prefix + """realizarReserva/""" + "$" + """numeroExpediente<[^/]+>"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_ms_gestion_matricula_GestionDeMatriculas_ApiController_verExpedienteNumeroExpedienteGet20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("verExpediente/"), DynamicPart("numeroExpediente", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ms_gestion_matricula_GestionDeMatriculas_ApiController_verExpedienteNumeroExpedienteGet20_invoker = createInvoker(
    GestionDeMatriculas_ApiController_7.verExpedienteNumeroExpedienteGet(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ms_gestion_matricula.GestionDeMatriculas_ApiController",
      "verExpedienteNumeroExpedienteGet",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """verExpediente/""" + "$" + """numeroExpediente<[^/]+>"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_ms_gestion_economica_GestionDeNominas_ApiController_nominaPost21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("nomina")))
  )
  private[this] lazy val controllers_ms_gestion_economica_GestionDeNominas_ApiController_nominaPost21_invoker = createInvoker(
    GestionDeNominas_ApiController_13.nominaPost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ms_gestion_economica.GestionDeNominas_ApiController",
      "nominaPost",
      Nil,
      "POST",
      """Functions for GestionDeNominas_ API""",
      this.prefix + """nomina"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_ms_gestion_economica_GestionDeNominas_ApiController_nominasNIFGet22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("nominas/"), DynamicPart("NIF", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ms_gestion_economica_GestionDeNominas_ApiController_nominasNIFGet22_invoker = createInvoker(
    GestionDeNominas_ApiController_13.nominasNIFGet(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ms_gestion_economica.GestionDeNominas_ApiController",
      "nominasNIFGet",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """nominas/""" + "$" + """NIF<[^/]+>"""
    )
  )

  // @LINE:51
  private[this] lazy val controllers_ms_gestion_economica_GestionDePagosApiController_actualizarPagoPut23_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("actualizarPago")))
  )
  private[this] lazy val controllers_ms_gestion_economica_GestionDePagosApiController_actualizarPagoPut23_invoker = createInvoker(
    GestionDePagosApiController_15.actualizarPagoPut(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ms_gestion_economica.GestionDePagosApiController",
      "actualizarPagoPut",
      Nil,
      "PUT",
      """Functions for GestionDePagos API""",
      this.prefix + """actualizarPago"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_ms_gestion_economica_GestionDePagosApiController_pagosMatriculaGet24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pagosMatricula")))
  )
  private[this] lazy val controllers_ms_gestion_economica_GestionDePagosApiController_pagosMatriculaGet24_invoker = createInvoker(
    GestionDePagosApiController_15.pagosMatriculaGet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ms_gestion_economica.GestionDePagosApiController",
      "pagosMatriculaGet",
      Nil,
      "GET",
      """""",
      this.prefix + """pagosMatricula"""
    )
  )

  // @LINE:55
  private[this] lazy val controllers_ms_gestion_reservas_GestionDeReservasApiController_reservasActualizarPut25_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reservas/actualizar")))
  )
  private[this] lazy val controllers_ms_gestion_reservas_GestionDeReservasApiController_reservasActualizarPut25_invoker = createInvoker(
    GestionDeReservasApiController_14.reservasActualizarPut(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ms_gestion_reservas.GestionDeReservasApiController",
      "reservasActualizarPut",
      Nil,
      "PUT",
      """Functions for GestionDeReservas API""",
      this.prefix + """reservas/actualizar"""
    )
  )

  // @LINE:56
  private[this] lazy val controllers_ms_gestion_reservas_GestionDeReservasApiController_reservasCancelarDelete26_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reservas/cancelar")))
  )
  private[this] lazy val controllers_ms_gestion_reservas_GestionDeReservasApiController_reservasCancelarDelete26_invoker = createInvoker(
    GestionDeReservasApiController_14.reservasCancelarDelete(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ms_gestion_reservas.GestionDeReservasApiController",
      "reservasCancelarDelete",
      Nil,
      "DELETE",
      """""",
      this.prefix + """reservas/cancelar"""
    )
  )

  // @LINE:57
  private[this] lazy val controllers_ms_gestion_reservas_GestionDeReservasApiController_reservasReservarPost27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reservas/reservar")))
  )
  private[this] lazy val controllers_ms_gestion_reservas_GestionDeReservasApiController_reservasReservarPost27_invoker = createInvoker(
    GestionDeReservasApiController_14.reservasReservarPost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ms_gestion_reservas.GestionDeReservasApiController",
      "reservasReservarPost",
      Nil,
      "POST",
      """""",
      this.prefix + """reservas/reservar"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_ms_gestion_grupos_GestionGruposDeAsignaturas_ApiController_asignaturasMatriculablesByAlumnoNumeroExpedienteGet28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("asignaturasMatriculablesByAlumno/"), DynamicPart("numeroExpediente", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ms_gestion_grupos_GestionGruposDeAsignaturas_ApiController_asignaturasMatriculablesByAlumnoNumeroExpedienteGet28_invoker = createInvoker(
    GestionGruposDeAsignaturas_ApiController_0.asignaturasMatriculablesByAlumnoNumeroExpedienteGet(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ms_gestion_grupos.GestionGruposDeAsignaturas_ApiController",
      "asignaturasMatriculablesByAlumnoNumeroExpedienteGet",
      Seq(classOf[Integer]),
      "GET",
      """Functions for GestionGruposDeAsignaturas_ API""",
      this.prefix + """asignaturasMatriculablesByAlumno/""" + "$" + """numeroExpediente<[^/]+>"""
    )
  )

  // @LINE:63
  private[this] lazy val controllers_Assets_versioned29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned29_invoker = createInvoker(
    Assets_10.versioned(fakeValue[String], fakeValue[Asset]),
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
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_3.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_2.count)
      }
  
    // @LINE:9
    case controllers_HomeController_registro2_route(params) =>
      call { 
        controllers_HomeController_registro2_invoker.call(HomeController_3.registro)
      }
  
    // @LINE:12
    case controllers_AsyncController_message3_route(params) =>
      call { 
        controllers_AsyncController_message3_invoker.call(AsyncController_5.message)
      }
  
    // @LINE:14
    case controllers_ApiDocController_api4_route(params) =>
      call { 
        controllers_ApiDocController_api4_invoker.call(ApiDocController_9.api)
      }
  
    // @LINE:17
    case controllers_ms_gestion_alumno_GestionDeAlumnoApiController_altaAlumnoPost5_route(params) =>
      call { 
        controllers_ms_gestion_alumno_GestionDeAlumnoApiController_altaAlumnoPost5_invoker.call(GestionDeAlumnoApiController_11.altaAlumnoPost())
      }
  
    // @LINE:18
    case controllers_ms_gestion_alumno_GestionDeAlumnoApiController_alumnoByNIFNIFDelete6_route(params) =>
      call(params.fromPath[String]("NIF", None)) { (NIF) =>
        controllers_ms_gestion_alumno_GestionDeAlumnoApiController_alumnoByNIFNIFDelete6_invoker.call(GestionDeAlumnoApiController_11.alumnoByNIFNIFDelete(NIF))
      }
  
    // @LINE:19
    case controllers_ms_gestion_alumno_GestionDeAlumnoApiController_alumnoByNIFNIFGet7_route(params) =>
      call(params.fromPath[String]("NIF", None)) { (NIF) =>
        controllers_ms_gestion_alumno_GestionDeAlumnoApiController_alumnoByNIFNIFGet7_invoker.call(GestionDeAlumnoApiController_11.alumnoByNIFNIFGet(NIF))
      }
  
    // @LINE:20
    case controllers_ms_gestion_alumno_GestionDeAlumnoApiController_alumnoByNIFNIFPut8_route(params) =>
      call(params.fromPath[String]("NIF", None)) { (NIF) =>
        controllers_ms_gestion_alumno_GestionDeAlumnoApiController_alumnoByNIFNIFPut8_invoker.call(GestionDeAlumnoApiController_11.alumnoByNIFNIFPut(NIF))
      }
  
    // @LINE:23
    case controllers_ms_gestion_autentificacion_GestionDeAuthentificacionApiController_loginUserInit9_route(params) =>
      call { 
        controllers_ms_gestion_autentificacion_GestionDeAuthentificacionApiController_loginUserInit9_invoker.call(GestionDeAuthentificacionApiController_4.loginUserInit())
      }
  
    // @LINE:24
    case controllers_ms_gestion_autentificacion_GestionDeAuthentificacionApiController_loginUser10_route(params) =>
      call { 
        controllers_ms_gestion_autentificacion_GestionDeAuthentificacionApiController_loginUser10_invoker.call(GestionDeAuthentificacionApiController_4.loginUser())
      }
  
    // @LINE:25
    case controllers_ms_gestion_autentificacion_GestionDeAuthentificacionApiController_logoutUser11_route(params) =>
      call { 
        controllers_ms_gestion_autentificacion_GestionDeAuthentificacionApiController_logoutUser11_invoker.call(GestionDeAuthentificacionApiController_4.logoutUser())
      }
  
    // @LINE:28
    case controllers_ms_gestion_reservas_GestionDeConsultasDeReservas_ApiController_reservasDisponiblesEspaciosGet12_route(params) =>
      call { 
        controllers_ms_gestion_reservas_GestionDeConsultasDeReservas_ApiController_reservasDisponiblesEspaciosGet12_invoker.call(GestionDeConsultasDeReservas_ApiController_12.reservasDisponiblesEspaciosGet())
      }
  
    // @LINE:29
    case controllers_ms_gestion_reservas_GestionDeConsultasDeReservas_ApiController_reservasDisponiblesHorasGet13_route(params) =>
      call { 
        controllers_ms_gestion_reservas_GestionDeConsultasDeReservas_ApiController_reservasDisponiblesHorasGet13_invoker.call(GestionDeConsultasDeReservas_ApiController_12.reservasDisponiblesHorasGet())
      }
  
    // @LINE:32
    case controllers_ms_gestion_recursos_GestionDeEspacios_ApiController_espaciosGet14_route(params) =>
      call { 
        controllers_ms_gestion_recursos_GestionDeEspacios_ApiController_espaciosGet14_invoker.call(GestionDeEspacios_ApiController_1.espaciosGet())
      }
  
    // @LINE:35
    case controllers_ms_gestion_recursos_GestionDeFactura_ApiController_facturasGet15_route(params) =>
      call(params.fromQuery[String]("NIF", None), params.fromQuery[Integer]("mes", None), params.fromQuery[Integer]("ao", None)) { (NIF, mes, ao) =>
        controllers_ms_gestion_recursos_GestionDeFactura_ApiController_facturasGet15_invoker.call(GestionDeFactura_ApiController_6.facturasGet(NIF, mes, ao))
      }
  
    // @LINE:38
    case controllers_ms_gestion_matricula_GestionDeMatriculaApiController_reservaMatriculaGet16_route(params) =>
      call { 
        controllers_ms_gestion_matricula_GestionDeMatriculaApiController_reservaMatriculaGet16_invoker.call(GestionDeMatriculaApiController_8.reservaMatriculaGet())
      }
  
    // @LINE:39
    case controllers_ms_gestion_matricula_GestionDeMatriculaApiController_reservaMatriculaPut17_route(params) =>
      call { 
        controllers_ms_gestion_matricula_GestionDeMatriculaApiController_reservaMatriculaPut17_invoker.call(GestionDeMatriculaApiController_8.reservaMatriculaPut())
      }
  
    // @LINE:42
    case controllers_ms_gestion_matricula_GestionDeMatriculas_ApiController_crearMatriculaNumeroExpedientePost18_route(params) =>
      call(params.fromPath[Integer]("numeroExpediente", None)) { (numeroExpediente) =>
        controllers_ms_gestion_matricula_GestionDeMatriculas_ApiController_crearMatriculaNumeroExpedientePost18_invoker.call(GestionDeMatriculas_ApiController_7.crearMatriculaNumeroExpedientePost(numeroExpediente))
      }
  
    // @LINE:43
    case controllers_ms_gestion_matricula_GestionDeMatriculas_ApiController_realizarReservaNumeroExpedientePut19_route(params) =>
      call(params.fromPath[Integer]("numeroExpediente", None)) { (numeroExpediente) =>
        controllers_ms_gestion_matricula_GestionDeMatriculas_ApiController_realizarReservaNumeroExpedientePut19_invoker.call(GestionDeMatriculas_ApiController_7.realizarReservaNumeroExpedientePut(numeroExpediente))
      }
  
    // @LINE:44
    case controllers_ms_gestion_matricula_GestionDeMatriculas_ApiController_verExpedienteNumeroExpedienteGet20_route(params) =>
      call(params.fromPath[Integer]("numeroExpediente", None)) { (numeroExpediente) =>
        controllers_ms_gestion_matricula_GestionDeMatriculas_ApiController_verExpedienteNumeroExpedienteGet20_invoker.call(GestionDeMatriculas_ApiController_7.verExpedienteNumeroExpedienteGet(numeroExpediente))
      }
  
    // @LINE:47
    case controllers_ms_gestion_economica_GestionDeNominas_ApiController_nominaPost21_route(params) =>
      call { 
        controllers_ms_gestion_economica_GestionDeNominas_ApiController_nominaPost21_invoker.call(GestionDeNominas_ApiController_13.nominaPost())
      }
  
    // @LINE:48
    case controllers_ms_gestion_economica_GestionDeNominas_ApiController_nominasNIFGet22_route(params) =>
      call(params.fromPath[String]("NIF", None)) { (NIF) =>
        controllers_ms_gestion_economica_GestionDeNominas_ApiController_nominasNIFGet22_invoker.call(GestionDeNominas_ApiController_13.nominasNIFGet(NIF))
      }
  
    // @LINE:51
    case controllers_ms_gestion_economica_GestionDePagosApiController_actualizarPagoPut23_route(params) =>
      call { 
        controllers_ms_gestion_economica_GestionDePagosApiController_actualizarPagoPut23_invoker.call(GestionDePagosApiController_15.actualizarPagoPut())
      }
  
    // @LINE:52
    case controllers_ms_gestion_economica_GestionDePagosApiController_pagosMatriculaGet24_route(params) =>
      call { 
        controllers_ms_gestion_economica_GestionDePagosApiController_pagosMatriculaGet24_invoker.call(GestionDePagosApiController_15.pagosMatriculaGet())
      }
  
    // @LINE:55
    case controllers_ms_gestion_reservas_GestionDeReservasApiController_reservasActualizarPut25_route(params) =>
      call { 
        controllers_ms_gestion_reservas_GestionDeReservasApiController_reservasActualizarPut25_invoker.call(GestionDeReservasApiController_14.reservasActualizarPut())
      }
  
    // @LINE:56
    case controllers_ms_gestion_reservas_GestionDeReservasApiController_reservasCancelarDelete26_route(params) =>
      call { 
        controllers_ms_gestion_reservas_GestionDeReservasApiController_reservasCancelarDelete26_invoker.call(GestionDeReservasApiController_14.reservasCancelarDelete())
      }
  
    // @LINE:57
    case controllers_ms_gestion_reservas_GestionDeReservasApiController_reservasReservarPost27_route(params) =>
      call { 
        controllers_ms_gestion_reservas_GestionDeReservasApiController_reservasReservarPost27_invoker.call(GestionDeReservasApiController_14.reservasReservarPost())
      }
  
    // @LINE:60
    case controllers_ms_gestion_grupos_GestionGruposDeAsignaturas_ApiController_asignaturasMatriculablesByAlumnoNumeroExpedienteGet28_route(params) =>
      call(params.fromPath[Integer]("numeroExpediente", None)) { (numeroExpediente) =>
        controllers_ms_gestion_grupos_GestionGruposDeAsignaturas_ApiController_asignaturasMatriculablesByAlumnoNumeroExpedienteGet28_invoker.call(GestionGruposDeAsignaturas_ApiController_0.asignaturasMatriculablesByAlumnoNumeroExpedienteGet(numeroExpediente))
      }
  
    // @LINE:63
    case controllers_Assets_versioned29_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned29_invoker.call(Assets_10.versioned(path, file))
      }
  }
}
