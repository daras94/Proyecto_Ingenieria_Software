
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,Form[ms_gestion_autentificacion.LoginForm],Boolean,Usuario,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, form: Form[ms_gestion_autentificacion.LoginForm], isLoggedIn: Boolean, userInfo: Usuario):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import auth._
import controllers.ms_gestion_autentificacion.routes

Seq[Any](format.raw/*1.107*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main(title, isLoggedIn, userInfo)/*6.35*/ {_display_(Seq[Any](format.raw/*6.37*/("""
    """),_display_(/*7.6*/(loginform(routes.GestionDeAuthentificacionApiController.loginUser(), form("nif"), form("password")))),format.raw/*7.107*/("""
""")))}),format.raw/*8.2*/("""
"""))
      }
    }
  }

  def render(title:String,form:Form[ms_gestion_autentificacion.LoginForm],isLoggedIn:Boolean,userInfo:Usuario): play.twirl.api.HtmlFormat.Appendable = apply(title,form,isLoggedIn,userInfo)

  def f:((String,Form[ms_gestion_autentificacion.LoginForm],Boolean,Usuario) => play.twirl.api.HtmlFormat.Appendable) = (title,form,isLoggedIn,userInfo) => apply(title,form,isLoggedIn,userInfo)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Wed Jan 10 20:52:17 CET 2018
                  SOURCE: /mnt/HDD-I Datos/Documentos/Mis Estudios/UAH/GII/3º de Carrera/1º Cuatrimestre/Ingeneria de Software Avazada/Laboratorio/WorkSpace/My_WorkSpace/WorkSpace/ms-getway-uvportal/ms-getway-uvportal/app/views/login.scala.html
                  HASH: 790e29a57191bc5d29e6ea3311e7d18d82632ac0
                  MATRIX: 804->1|1071->106|1099->177|1126->179|1167->212|1206->214|1237->220|1359->321|1390->323
                  LINES: 27->1|33->1|35->5|36->6|36->6|36->6|37->7|37->7|38->8
                  -- GENERATED --
              */
          