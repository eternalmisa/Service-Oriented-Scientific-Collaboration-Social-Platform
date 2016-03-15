
package views.html.climate

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object self extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Html,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String, moreScripts: Html = Html(""))(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.62*/("""

<!DOCTYPE html>

<html>
<head>

	<title>"""),_display_(Seq[Any](/*8.10*/title)),format.raw/*8.15*/("""</title>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">

	<link rel="stylesheet"
		  href='"""),_display_(Seq[Any](/*14.12*/routes/*14.18*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*14.57*/("""'>
	<link rel="stylesheet" href='"""),_display_(Seq[Any](/*15.32*/routes/*15.38*/.Assets.at("css/login.css"))),format.raw/*15.65*/("""'>
	<link rel="stylesheet" href='"""),_display_(Seq[Any](/*16.32*/routes/*16.38*/.Assets.at("css/homepage.css"))),format.raw/*16.68*/("""'>
	<link rel="stylesheet" href='"""),_display_(Seq[Any](/*17.32*/routes/*17.38*/.Assets.at("css/mainpage.css"))),format.raw/*17.68*/("""'>

	<script src='"""),_display_(Seq[Any](/*19.16*/routes/*19.22*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*19.67*/("""'
			type="text/javascript"></script>
	<script src='"""),_display_(Seq[Any](/*21.16*/routes/*21.22*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*21.64*/("""'
			type="text/javascript"></script>

	"""),_display_(Seq[Any](/*24.3*/moreScripts)),format.raw/*24.14*/("""
</head>

<body>
"""),_display_(Seq[Any](/*28.2*/content)),format.raw/*28.9*/("""
</body>
</html>"""))}
    }
    
    def render(title:String,moreScripts:Html,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title,moreScripts)(content)
    
    def f:((String,Html) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title,moreScripts) => (content) => apply(title,moreScripts)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Dec 04 00:59:08 EST 2015
                    SOURCE: /Users/X/Desktop/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/climate/self.scala.html
                    HASH: 2ec5152fd795153cc4c0efd090f9c5625d48e126
                    MATRIX: 791->1|945->61|1023->104|1049->109|1281->305|1296->311|1357->350|1427->384|1442->390|1491->417|1561->451|1576->457|1628->487|1698->521|1713->527|1765->557|1820->576|1835->582|1902->627|1991->680|2006->686|2070->728|2146->769|2179->780|2232->798|2260->805
                    LINES: 26->1|29->1|36->8|36->8|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|47->19|47->19|47->19|49->21|49->21|49->21|52->24|52->24|56->28|56->28
                    -- GENERATED --
                */
            