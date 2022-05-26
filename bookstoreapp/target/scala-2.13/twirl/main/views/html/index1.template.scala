
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object index1 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(books : List[Book]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Books</title>
</head>
<body>

    <h1>All Books </h1>
    
    """),_display_(/*13.6*/for(book <- books) yield /*13.24*/{_display_(Seq[Any](format.raw/*13.25*/("""
    """),format.raw/*14.5*/("""<a 	href="#">Title : """),_display_(/*14.27*/book/*14.31*/.title),format.raw/*14.37*/("""</a>
    <p>Price : """),_display_(/*15.17*/book/*15.21*/.price),format.raw/*15.27*/("""</p>
    <p>Author : """),_display_(/*16.18*/book/*16.22*/.author),format.raw/*16.29*/("""</p>
    """)))}),format.raw/*17.6*/("""

"""),format.raw/*19.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(books:List[Book]): play.twirl.api.HtmlFormat.Appendable = apply(books)

  def f:((List[Book]) => play.twirl.api.HtmlFormat.Appendable) = (books) => apply(books)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index1.scala.html
                  HASH: ed083e5814cb2806353f980d4cafb3a59c301082
                  MATRIX: 912->1|1027->21|1057->25|1226->168|1260->186|1299->187|1332->193|1381->215|1394->219|1421->225|1470->247|1483->251|1510->257|1560->280|1573->284|1601->291|1642->302|1673->306
                  LINES: 27->1|32->1|34->3|44->13|44->13|44->13|45->14|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|50->19
                  -- GENERATED --
              */
          