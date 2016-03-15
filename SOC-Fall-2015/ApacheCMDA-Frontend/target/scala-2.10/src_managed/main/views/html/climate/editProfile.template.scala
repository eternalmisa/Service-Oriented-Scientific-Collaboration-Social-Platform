
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
/*******************************************************************************
* Licensed to the Apache Software Foundation (ASF) under one or more		   *
* contributor license agreements.  See the NOTICE file distributed with	   *
* this work for additional information regarding copyright ownership.         *
* The ASF licenses this file to You under the Apache License, Version 2.0     *
* (the "License"); you may not use this file except in compliance with        *
* the License.  You may obtain a copy of the License at                       *
*                                                                             *
*    http://www.apache.org/licenses/LICENSE-2.0                               *
*																			   *
* Unless required by applicable law or agreed to in writing, software         *
* distributed under the License is distributed on an "AS IS" BASIS,           *
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
* See the License for the specific language governing permissions and         *
* limitations under the License.											   *
*******************************************************************************/
object editProfile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[play.data.Form[models.User],models.User,play.api.templates.HtmlFormat.Appendable] {

    /*******************************************************************************
* Licensed to the Apache Software Foundation (ASF) under one or more		   *
* contributor license agreements.  See the NOTICE file distributed with	   *
* this work for additional information regarding copyright ownership.         *
* The ASF licenses this file to You under the Apache License, Version 2.0     *
* (the "License"); you may not use this file except in compliance with        *
* the License.  You may obtain a copy of the License at                       *
*                                                                             *
*    http://www.apache.org/licenses/LICENSE-2.0                               *
*																			   *
* Unless required by applicable law or agreed to in writing, software         *
* distributed under the License is distributed on an "AS IS" BASIS,           *
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
* See the License for the specific language governing permissions and         *
* limitations under the License.											   *
*******************************************************************************/
    def apply/*17.2*/(userForm: play.data.Form[models.User], editUser: models.User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*17.64*/("""
"""),_display_(Seq[Any](/*19.2*/self("Edit Profile Page")/*19.27*/ {_display_(Seq[Any](format.raw/*19.29*/("""

<!--Navigation bar (Cite Bootstrap template)-->
<nav id="bar" class="navbar navbar-default navbar-fixed-top">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped once screen zoom out -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <img alt="Logo" class="navbar-brand" src="/assets/image/logo.png">
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav nav-pills navbar-right">
                <li  class="nav-btn"><a href="mainpage"><span class="glyphicon glyphicon-home"></span> Home</a></li>
                """),_display_(Seq[Any](/*38.18*/if(!session.get("email"))/*38.43*/ {_display_(Seq[Any](format.raw/*38.45*/("""
                <form class="navbar-form navbar-right" action=""""),_display_(Seq[Any](/*39.65*/routes/*39.71*/.Application.login())),format.raw/*39.91*/("""">
                    <button type="submit" class="btn btn-success">Log in</button>
                </form>
                """)))}/*42.19*/else/*42.24*/{_display_(Seq[Any](format.raw/*42.25*/("""
                <li id="drop" class="dropdown nav-btn"><a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    <span class="glyphicon glyphicon-user"></span> My Account<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href=""""),_display_(Seq[Any](/*46.39*/routes/*46.45*/.UserController.homepage())),format.raw/*46.71*/("""">View Profile</a></li>
                        <li><a href=""""),_display_(Seq[Any](/*47.39*/routes/*47.45*/.UserController.editProfile())),format.raw/*47.74*/("""">Edit Profile</a></li>
                        <li><a href=""""),_display_(Seq[Any](/*48.39*/routes/*48.45*/.Application.logout())),format.raw/*48.66*/("""">Log out</a></li>
                    </ul>
                </li>
                """)))})),format.raw/*51.18*/("""
            </ul>
        </div><!--/navbar-collapse-->
    </div><!--/container-fluid-->
</nav>

<div class="row">
    <div id="wrapper1" class="col-md-10 col-md-offset-1">
        <div id="profile1">
            <img id="photo" src="/assets/image/default.jpg" class="img-circle center-block" alt="photo">
            <p class="text-center"><strong><a href="homepage">"""),_display_(Seq[Any](/*61.64*/session/*61.71*/.get("email"))),format.raw/*61.84*/("""</a></strong></p>
            <p class="text-center">"""),_display_(Seq[Any](/*62.37*/session/*62.44*/.get("firstName"))),format.raw/*62.61*/(""" """),_display_(Seq[Any](/*62.63*/session/*62.70*/.get("lastName"))),format.raw/*62.86*/("""</p>
        </div>
    </div>
</div>

<div class="container">
<div class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
    """),_display_(Seq[Any](/*69.6*/helper/*69.12*/.form(action = routes.UserController.editUser)/*69.58*/ {_display_(Seq[Any](format.raw/*69.60*/("""
    <form>
        <div class="form-group">
            <label>Affiliation: </label>
            <input type="text" name="affiliation" id="affiliation"
                   class="form-control" placeholder=""""),_display_(Seq[Any](/*74.55*/editUser/*74.63*/.getAffiliation())),format.raw/*74.80*/(""""
                   value='"""),_display_(Seq[Any](/*75.28*/userForm("affiliation")/*75.51*/.value)),format.raw/*75.57*/("""'>
        </div>
        <div class="form-group">
            <label>Title: </label>
            <input type="text" name="title" id="title" class="form-control"
                   placeholder=""""),_display_(Seq[Any](/*80.34*/editUser/*80.42*/.getTitle())),format.raw/*80.53*/("""" value='"""),_display_(Seq[Any](/*80.63*/userForm("title")/*80.80*/.value)),format.raw/*80.86*/("""'>
        </div>
        <div class="form-group">
            <label>Mailing Address: </label>
            <input type="text" name="mailingAddress" id="mailingAddress"
                   class="form-control" placeholder=""""),_display_(Seq[Any](/*85.55*/editUser/*85.63*/.getMailingAddress())),format.raw/*85.83*/(""""
                   value='"""),_display_(Seq[Any](/*86.28*/userForm("mailingAddress")/*86.54*/.value)),format.raw/*86.60*/("""'>
        </div>
        <div class="form-group">
            <label>Phone Number: </label>
            <input type="text" name="phoneNumber" id="phoneNumber"
                   class="form-control" placeholder=""""),_display_(Seq[Any](/*91.55*/editUser/*91.63*/.getPhoneNumber())),format.raw/*91.80*/(""""
                   value='"""),_display_(Seq[Any](/*92.28*/userForm("phoneNumber")/*92.51*/.value)),format.raw/*92.57*/("""'>
        </div>
        <div class="form-group">
            <label>Fax Number: </label>
            <input type="text" name="faxNumber" id="faxNumber"
                   class="form-control" placeholder=""""),_display_(Seq[Any](/*97.55*/editUser/*97.63*/.getFaxNumber())),format.raw/*97.78*/(""""
                   value='"""),_display_(Seq[Any](/*98.28*/userForm("faxNumber")/*98.49*/.value)),format.raw/*98.55*/("""'>
        </div>
        <div class="form-group">
            <label>Research Fields: </label>
            <input type="text" name="researchFields" id="researchFields"
                   class="form-control" placeholder=""""),_display_(Seq[Any](/*103.55*/editUser/*103.63*/.getResearchFields())),format.raw/*103.83*/(""""
                   value='"""),_display_(Seq[Any](/*104.28*/userForm("researchFields")/*104.54*/.value)),format.raw/*104.60*/("""'>
        </div>
        <div class="form-group">
            <label>Highest Degree: </label>
            <input type="text" name="highestDegree" id="highestDegree"
                   class="form-control" placeholder=""""),_display_(Seq[Any](/*109.55*/editUser/*109.63*/.getHighestDegree())),format.raw/*109.82*/(""""
                   value='"""),_display_(Seq[Any](/*110.28*/userForm("highestDegree")/*110.53*/.value)),format.raw/*110.59*/("""'>
        </div>

        <div class="actions row">
            <div class="col-xs-12 col-sm-6 col-md-6">
                <input type="submit" class="btn btn-primary btn-block" value="Submit">
            </div>
            <div class="col-xs-12 col-sm-6 col-md-6">
                <a href=""""),_display_(Seq[Any](/*118.27*/routes/*118.33*/.UserController.homepage())),format.raw/*118.59*/("""" class="btn btn-success btn-block">Cancel</a>
            </div>
        </div>
    </form>
    """)))})),format.raw/*122.6*/("""
</div>
</div>

""")))})))}
    }
    
    def render(userForm:play.data.Form[models.User],editUser:models.User): play.api.templates.HtmlFormat.Appendable = apply(userForm,editUser)
    
    def f:((play.data.Form[models.User],models.User) => play.api.templates.HtmlFormat.Appendable) = (userForm,editUser) => apply(userForm,editUser)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Dec 04 00:59:08 EST 2015
                    SOURCE: /Users/X/Desktop/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/climate/editProfile.scala.html
                    HASH: 5085f42954df1d7c61f27307c1d8cab8e5e97a32
                    MATRIX: 3186->1188|3359->1250|3396->1269|3430->1294|3470->1296|4555->2345|4589->2370|4629->2372|4730->2437|4745->2443|4787->2463|4932->2590|4945->2595|4984->2596|5330->2906|5345->2912|5393->2938|5491->3000|5506->3006|5557->3035|5655->3097|5670->3103|5713->3124|5829->3208|6236->3579|6252->3586|6287->3599|6377->3653|6393->3660|6432->3677|6470->3679|6486->3686|6524->3702|6701->3844|6716->3850|6771->3896|6811->3898|7054->4105|7071->4113|7110->4130|7175->4159|7207->4182|7235->4188|7466->4383|7483->4391|7516->4402|7562->4412|7588->4429|7616->4435|7875->4658|7892->4666|7934->4686|7999->4715|8034->4741|8062->4747|8312->4961|8329->4969|8368->4986|8433->5015|8465->5038|8493->5044|8737->5252|8754->5260|8791->5275|8856->5304|8886->5325|8914->5331|9174->5554|9192->5562|9235->5582|9301->5611|9337->5637|9366->5643|9623->5863|9641->5871|9683->5890|9749->5919|9784->5944|9813->5950|10143->6243|10159->6249|10208->6275|10338->6373
                    LINES: 56->17|60->17|61->19|61->19|61->19|80->38|80->38|80->38|81->39|81->39|81->39|84->42|84->42|84->42|88->46|88->46|88->46|89->47|89->47|89->47|90->48|90->48|90->48|93->51|103->61|103->61|103->61|104->62|104->62|104->62|104->62|104->62|104->62|111->69|111->69|111->69|111->69|116->74|116->74|116->74|117->75|117->75|117->75|122->80|122->80|122->80|122->80|122->80|122->80|127->85|127->85|127->85|128->86|128->86|128->86|133->91|133->91|133->91|134->92|134->92|134->92|139->97|139->97|139->97|140->98|140->98|140->98|145->103|145->103|145->103|146->104|146->104|146->104|151->109|151->109|151->109|152->110|152->110|152->110|160->118|160->118|160->118|164->122
                    -- GENERATED --
                */
            