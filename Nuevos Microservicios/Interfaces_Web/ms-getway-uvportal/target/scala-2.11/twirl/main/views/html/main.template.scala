
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,Boolean,Usuario,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
  def apply/*7.2*/(title: String, isLoggedIn: Boolean, userInfo: Usuario)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.72*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link rel="stylesheet" href='"""),_display_(/*14.39*/routes/*14.45*/.Assets.versioned("css/main.css")),format.raw/*14.78*/("""' type="text/css"/>
        <link rel="stylesheet" href='"""),_display_(/*15.39*/routes/*15.45*/.Assets.versioned("css/style.css")),format.raw/*15.79*/("""' type="text/css"/>
        <script src='"""),_display_(/*16.23*/routes/*16.29*/.Assets.versioned("js/jquery.min.js")),format.raw/*16.66*/("""' type="text/javascript"></script>
        <script src='"""),_display_(/*17.23*/routes/*17.29*/.Assets.versioned("js/skel.min.js")),format.raw/*17.64*/("""' type="text/javascript"></script>
        <script src='"""),_display_(/*18.23*/routes/*18.29*/.Assets.versioned("js/util.js")),format.raw/*18.60*/("""' type="text/javascript"></script>
        <script src='"""),_display_(/*19.23*/routes/*19.29*/.Assets.versioned("js/main.js")),format.raw/*19.60*/("""' type="text/javascript"></script>
        <script src='"""),_display_(/*20.23*/routes/*20.29*/.Assets.versioned("js/auth.js")),format.raw/*20.60*/("""' type="text/javascript"></script>
        <script type="text/javascript" language="javascript">
            //Ajusta el tamaño de un iframe al de su contenido interior para evitar scroll
            function autofitIframe(id) """),format.raw/*23.40*/("""{"""),format.raw/*23.41*/("""
                """),format.raw/*24.17*/("""if (!window.opera && document.all && document.getElementById) """),format.raw/*24.79*/("""{"""),format.raw/*24.80*/("""
                    """),format.raw/*25.21*/("""id.style.height = id.contentWindow.document.body.scrollHeight;
                """),format.raw/*26.17*/("""}"""),format.raw/*26.18*/(""" """),format.raw/*26.19*/("""else if (document.getElementById) """),format.raw/*26.53*/("""{"""),format.raw/*26.54*/("""
                    """),format.raw/*27.21*/("""id.style.height = id.contentDocument.body.scrollHeight + "px";
                    document.getElementById(id).window.frames.scrollTo(300, 300);
                """),format.raw/*29.17*/("""}"""),format.raw/*29.18*/("""
            """),format.raw/*30.13*/("""}"""),format.raw/*30.14*/("""
        """),format.raw/*31.9*/("""</script>
    </head>
    <body class="subpage" onload=''>
        <!-- Header -->
        <header id="header">
            <div class="inner">
                <a class="logo" href="/">Universidad de Villamayor</a>
                <nav id="nav">
                    """),_display_(/*39.22*/if(!isLoggedIn)/*39.37*/ {_display_(Seq[Any](format.raw/*39.39*/("""
                        """),format.raw/*40.25*/("""<a href='"""),_display_(/*40.35*/(routes.HomeController.registro())),format.raw/*40.69*/("""'><b style="color: white;">Registro de Alumnos</b></a>
                    """)))}/*41.22*/else/*41.26*/{_display_(Seq[Any](format.raw/*41.27*/("""
                        """),format.raw/*42.25*/("""<a href=""><b style="color: white;">"""),_display_(/*42.62*/userInfo/*42.70*/.getName()),format.raw/*42.80*/("""</b></a>
                        <a href='"""),_display_(/*43.35*/(controllers.ms_gestion_autentificacion.routes.GestionDeAuthentificacionApiController.logoutUser())),format.raw/*43.134*/("""'><b style="color: white;">Cerrar Sesion</b></a>
                    """)))}),format.raw/*44.22*/("""
                """),format.raw/*45.17*/("""</nav>
                <a href="#navPanel" class="navPanelToggle"><span class="fa fa-bars"></span></a>
            </div>
        </header>
        """),_display_(/*49.10*/content),format.raw/*49.17*/("""
        """),format.raw/*50.9*/("""<!-- Footer -->
        <footer id="footer">
            <div class="inner">
                <div class="flex">
                    <div class="copyright">
                        &copy; 2017 Proyecto Ingenereia de Software Avanzado, 3º de Ingeneria Informatica, UAH.
                    </div>
                    <ul class="icons">
                        <li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
                        <li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
                        <li><a href="#" class="icon fa-linkedin"><span class="label">linkedIn</span></a></li>
                        <li><a href="#" class="icon fa-pinterest-p"><span class="label">Pinterest</span></a></li>
                        <li><a href="#" class="icon fa-vimeo"><span class="label">Vimeo</span></a></li>
                    </ul>
                </div>
            </div>
        </footer>
    </body>
</html>"""))
      }
    }
  }

  def render(title:String,isLoggedIn:Boolean,userInfo:Usuario,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,isLoggedIn,userInfo)(content)

  def f:((String,Boolean,Usuario) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,isLoggedIn,userInfo) => (content) => apply(title,isLoggedIn,userInfo)(content)

  def ref: this.type = this

}


}

/*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Wed Jan 10 20:52:17 CET 2018
                  SOURCE: /mnt/HDD-I Datos/Documentos/Mis Estudios/UAH/GII/3º de Carrera/1º Cuatrimestre/Ingeneria de Software Avazada/Laboratorio/WorkSpace/My_WorkSpace/WorkSpace/ms-getway-uvportal/ms-getway-uvportal/app/views/main.scala.html
                  HASH: 87db6a0ef273cb3391cbb6f6e4cdf9505cfb6321
                  MATRIX: 1013->255|1178->325|1206->327|1286->432|1322->441|1357->449|1383->454|1457->501|1472->507|1526->540|1611->598|1626->604|1681->638|1750->680|1765->686|1823->723|1907->780|1922->786|1978->821|2062->878|2077->884|2129->915|2213->972|2228->978|2280->1009|2364->1066|2379->1072|2431->1103|2686->1330|2715->1331|2760->1348|2850->1410|2879->1411|2928->1432|3035->1511|3064->1512|3093->1513|3155->1547|3184->1548|3233->1569|3422->1730|3451->1731|3492->1744|3521->1745|3557->1754|3851->2021|3875->2036|3915->2038|3968->2063|4005->2073|4060->2107|4155->2183|4168->2187|4207->2188|4260->2213|4324->2250|4341->2258|4372->2268|4442->2311|4563->2410|4664->2480|4709->2497|4885->2646|4913->2653|4949->2662
                  LINES: 32->7|37->7|39->9|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|53->23|53->23|54->24|54->24|54->24|55->25|56->26|56->26|56->26|56->26|56->26|57->27|59->29|59->29|60->30|60->30|61->31|69->39|69->39|69->39|70->40|70->40|70->40|71->41|71->41|71->41|72->42|72->42|72->42|72->42|73->43|73->43|74->44|75->45|79->49|79->49|80->50
                  -- GENERATED --
              */
          