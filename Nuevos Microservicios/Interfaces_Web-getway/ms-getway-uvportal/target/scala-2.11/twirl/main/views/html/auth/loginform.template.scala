
package views.html.auth

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object loginform_Scope0 {
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

class loginform extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[play.api.mvc.Call,Field,Field,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(reverseRoute: play.api.mvc.Call, nifField: Field, passwordField: Field):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.74*/("""
"""),format.raw/*2.1*/("""<!-- Three -->
<section id="three" class="wrapper">
    <div class="inner">
        <header class="align-center">
            <div class="wrapper fadeInDown">
                <div id="formContent">
                    <div class="fadeIn first">
                        <img src='"""),_display_(/*9.36*/routes/*9.42*/.Assets.versioned("images/icon.svg")),format.raw/*9.78*/("""' id="icon" alt="User Icon" />
                    </div>
                    """),_display_(/*11.22*/if(flash.containsKey("error"))/*11.52*/ {_display_(Seq[Any](format.raw/*11.54*/("""
                        """),format.raw/*12.25*/("""<p><b style="color: brown;">"""),_display_(/*12.54*/(flash.get("error"))),format.raw/*12.74*/("""</b></p>
                    """)))}),format.raw/*13.22*/("""
                    """),_display_(/*14.22*/helper/*14.28*/.form(reverseRoute, 'role -> "form")/*14.64*/ {_display_(Seq[Any](format.raw/*14.66*/("""
                        """),format.raw/*15.25*/("""<input type="text" id=""""),_display_(/*15.49*/(nifField.id)),format.raw/*15.62*/("""" class="fadeIn second" name="nif" placeholder="Introduca el NIF" value='"""),_display_(/*15.136*/(nifField.value.getOrElse(""))),format.raw/*15.166*/("""' required>
                        <input type="password" id=""""),_display_(/*16.53*/(passwordField.id)),format.raw/*16.71*/("""" class="fadeIn third" name="password" placeholder="Introduca la contraseña" value='"""),_display_(/*16.156*/(passwordField.value.getOrElse(""))),format.raw/*16.191*/("""' required>
                        <input type="submit" class="btn btn-success" value="Iniciar Sesion" requiered>
                    """)))}),format.raw/*18.22*/("""
                """),format.raw/*19.17*/("""</div>
            </div>
            <p>Aliquam erat volutpat nam dui </p>
        </header>
    </div>
</section>
"""))
      }
    }
  }

  def render(reverseRoute:play.api.mvc.Call,nifField:Field,passwordField:Field): play.twirl.api.HtmlFormat.Appendable = apply(reverseRoute,nifField,passwordField)

  def f:((play.api.mvc.Call,Field,Field) => play.twirl.api.HtmlFormat.Appendable) = (reverseRoute,nifField,passwordField) => apply(reverseRoute,nifField,passwordField)

  def ref: this.type = this

}


}

/**/
object loginform extends loginform_Scope0.loginform
              /*
                  -- GENERATED --
                  DATE: Wed Jan 10 20:52:17 CET 2018
                  SOURCE: /mnt/HDD-I Datos/Documentos/Mis Estudios/UAH/GII/3º de Carrera/1º Cuatrimestre/Ingeneria de Software Avazada/Laboratorio/WorkSpace/My_WorkSpace/WorkSpace/ms-getway-uvportal/ms-getway-uvportal/app/views/auth/loginform.scala.html
                  HASH: 5c0b4d11fcda26ef3abffc87dc519e6258346602
                  MATRIX: 781->1|948->73|975->74|1281->354|1295->360|1351->396|1457->475|1496->505|1536->507|1589->532|1645->561|1686->581|1747->611|1796->633|1811->639|1856->675|1896->677|1949->702|2000->726|2034->739|2136->813|2188->843|2279->907|2318->925|2431->1010|2488->1045|2655->1181|2700->1198
                  LINES: 27->1|32->1|33->2|40->9|40->9|40->9|42->11|42->11|42->11|43->12|43->12|43->12|44->13|45->14|45->14|45->14|45->14|46->15|46->15|46->15|46->15|46->15|47->16|47->16|47->16|47->16|49->18|50->19
                  -- GENERATED --
              */
          