
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

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(bookForm :Form[Book]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.24*/("""

"""),format.raw/*3.1*/("""<html>
<head>

<title>Create Book</title>
</head>
<body>
	<h1>create Book</h1>
	
	<d1>
	<dt>
		<label for="id">ID:</label>
	</dt>
	<dd>
		<input type="text" name="id" id="id" value="">
	</dd>
	<dt>
		<label for="title">Title:</label>
	</dt>
	<dd>
		<input type="text" name="title" id="title" value="">
	</dd>
	<dt>
		<label for="author">Author:</label>
	</dt>
	<dd>
		<input type="text" name="author" id="author" value="">
	</dd>
	<dt>
		<label for="price">Price:</label>
	</dt>
	<dd>
		<input type="text" name="price" id="price" value="">
	</dd>
	</d1>
	
	<br><input type="submit" value= "Create Book">



</body>
</html>"""))
      }
    }
  }

  def render(bookForm:Form[Book]): play.twirl.api.HtmlFormat.Appendable = apply(bookForm)

  def f:((Form[Book]) => play.twirl.api.HtmlFormat.Appendable) = (bookForm) => apply(bookForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/create.scala.html
                  HASH: fc0381a11ded3607887e32494b6047b7d09606f8
                  MATRIX: 912->1|1029->23|1059->27
                  LINES: 27->1|32->1|34->3
                  -- GENERATED --
              */
          