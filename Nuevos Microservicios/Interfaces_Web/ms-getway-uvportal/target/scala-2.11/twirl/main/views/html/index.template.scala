
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,Boolean,Usuario,String,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(page: String, isLoggedIn: Boolean, userInfo: Usuario, tipo_user: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.75*/("""

"""),_display_(/*7.2*/main(page, isLoggedIn, userInfo)/*7.34*/ {_display_(Seq[Any](format.raw/*7.36*/("""
"""),format.raw/*8.1*/("""<section id="main" class="wrapper">
    <div class="inner" style="margin-top: -100px;">
        <div class="row">
            <!-- Break -->
            <div class="4u 12u" style="width: 15%; margin-top:20px;">
                <div class="row">
                    <ul>
                        <!-- Interfaces de Aois para usuarios. -->
                        """),_display_(/*16.26*/if(tipo_user == "ROLE_USUARIO")/*16.57*/{_display_(Seq[Any](format.raw/*16.58*/("""
                            """),format.raw/*17.29*/("""<li><a href="/api" target="myiframe">Registro</a></li>
                            <li><a href='' onclick="" target="myiframe">Registro</a></li>
                            <li><a href='' target="myiframe">Registro</a></li>
                            <li><a href='' target="myiframe">Registro</a></li>
                            <li><a href='' target="myiframe">Registro</a></li>
                            <li><a href='' target="myiframe">Registro</a></li>
                            <li><a href='' target="myiframe">Registro</a></li>
                            <li><a href='' target="myiframe">Registro</a></li>
                            <li><a href='' target="myiframe">Registro</a></li>
                            <li><a href='' target="myiframe">Registro</a></li>
                        """)))}),format.raw/*27.26*/(""" 
                        
                        """),format.raw/*29.25*/("""<!-- Interfaces de Aois para profasores. -->
                        """),_display_(/*30.26*/if(tipo_user == "ROLE_PROFESOR")/*30.58*/{_display_(Seq[Any](format.raw/*30.59*/("""
                            """),format.raw/*31.29*/("""<li><a href='' target="myiframe">Registro</a></li>
                            <li><a href='' target="myiframe">Registro</a></li>
                            <li><a href='' target="myiframe">Registro</a></li>
                            <li><a href='' target="myiframe">Registro</a></li>
                            <li><a href='' target="myiframe">Registro</a></li>
                            <li><a href='' target="myiframe">Registro</a></li>
                            <li><a href='' target="myiframe">Registro</a></li>
                            <li><a href='' target="myiframe">Registro</a></li>
                            <li><a href='' target="myiframe">Registro</a></li>
                        """)))}),format.raw/*40.26*/(""" 
                        
                        """),format.raw/*42.25*/("""<!-- Interfaces de Aois para admin. -->
                        """),_display_(/*43.26*/if(tipo_user == "ROLE_ADMIN")/*43.55*/{_display_(Seq[Any](format.raw/*43.56*/("""
                            """),format.raw/*44.29*/("""<li><a href='/api' target="myiframe">Registro</a></li>
                            <li><a href='' target="myiframe">Registro</a></li>
                            <li><a href='' target="myiframe">Registro</a></li>
                            <li><a href='' target="myiframe">Registro</a></li>
                            <li><a href='' target="myiframe">Registro</a></li>
                            <li><a href='' target="myiframe">Registro</a></li>
                            <li><a href='' target="myiframe">Registro</a></li>
                            <li><a href='' target="myiframe">Registro</a></li>
                            <li><a href='' target="myiframe">Registro</a></li>
                        """)))}),format.raw/*53.26*/("""
                        
                    """),format.raw/*55.21*/("""</ul>
                </div>
            </div>
            <div class="4u 12u" id="my-div" style="margin-top:-70px; margin-bottom: -143px;">
                <!--div class="box"-->
                    <!--p><iframe name="myiframe" width='1050px' height='797px'></iframe></p-->
                        <p><iframe id="myiframe" name="myiframe"  width='1050px' height='797px'  frameborder="1" transparency="transparency"  ></iframe></p>
                <!--/div-->
            </div>
        </div>
    </div>
</section>
""")))}),format.raw/*67.2*/("""
"""))
      }
    }
  }

  def render(page:String,isLoggedIn:Boolean,userInfo:Usuario,tipo_user:String): play.twirl.api.HtmlFormat.Appendable = apply(page,isLoggedIn,userInfo,tipo_user)

  def f:((String,Boolean,Usuario,String) => play.twirl.api.HtmlFormat.Appendable) = (page,isLoggedIn,userInfo,tipo_user) => apply(page,isLoggedIn,userInfo,tipo_user)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Wed Jan 10 20:52:17 CET 2018
                  SOURCE: /mnt/HDD-I Datos/Documentos/Mis Estudios/UAH/GII/3º de Carrera/1º Cuatrimestre/Ingeneria de Software Avazada/Laboratorio/WorkSpace/My_WorkSpace/WorkSpace/ms-getway-uvportal/ms-getway-uvportal/app/views/index.scala.html
                  HASH: caa4a0974be20bd49e48608bc6b14f30c966390e
                  MATRIX: 857->95|1025->168|1053->171|1093->203|1132->205|1159->206|1548->568|1588->599|1627->600|1684->629|2517->1431|2596->1482|2693->1552|2734->1584|2773->1585|2830->1614|3569->2322|3648->2373|3740->2438|3778->2467|3817->2468|3874->2497|4617->3209|4691->3255|5240->3774
                  LINES: 30->5|35->5|37->7|37->7|37->7|38->8|46->16|46->16|46->16|47->17|57->27|59->29|60->30|60->30|60->30|61->31|70->40|72->42|73->43|73->43|73->43|74->44|83->53|85->55|97->67
                  -- GENERATED --
              */
          