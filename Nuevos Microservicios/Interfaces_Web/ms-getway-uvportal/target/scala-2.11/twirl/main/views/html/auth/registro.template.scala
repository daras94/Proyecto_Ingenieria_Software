
package views.html.auth

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object registro_Scope0 {
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

class registro extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Boolean,Usuario,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(page: String, isLoggedIn: Boolean, userInfo: Usuario):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.56*/("""

"""),_display_(/*3.2*/main(page, isLoggedIn, userInfo)/*3.34*/ {_display_(Seq[Any](format.raw/*3.36*/("""
"""),format.raw/*4.1*/("""<section id="main" class="wrapper">
    <div class="inner" style="margin-top: -100px;">
        <div class="4u 12u" style="width: 100%; margin-top:-70px; margin-bottom: -143px;">
            <p><iframe src="/api" width='1300px' height='797px' ></iframe></p>
        </div>
    </div>
</section>
""")))}),format.raw/*11.2*/("""
"""))
      }
    }
  }

  def render(page:String,isLoggedIn:Boolean,userInfo:Usuario): play.twirl.api.HtmlFormat.Appendable = apply(page,isLoggedIn,userInfo)

  def f:((String,Boolean,Usuario) => play.twirl.api.HtmlFormat.Appendable) = (page,isLoggedIn,userInfo) => apply(page,isLoggedIn,userInfo)

  def ref: this.type = this

}


}

/**/
object registro extends registro_Scope0.registro
              /*
                  -- GENERATED --
                  DATE: Wed Jan 10 20:52:17 CET 2018
                  SOURCE: /mnt/HDD-I Datos/Documentos/Mis Estudios/UAH/GII/3º de Carrera/1º Cuatrimestre/Ingeneria de Software Avazada/Laboratorio/WorkSpace/My_WorkSpace/WorkSpace/ms-getway-uvportal/ms-getway-uvportal/app/views/auth/registro.scala.html
                  HASH: 1bf9679bf7ac41e3be40ba8525fce28dda8207df
                  MATRIX: 772->1|921->55|949->58|989->90|1028->92|1055->93|1381->389
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|42->11
                  -- GENERATED --
              */
          