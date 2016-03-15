
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
object homepage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[models.Post],play.data.Form[models.Comment],models.User,play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*17.2*/(postServices: List[models.Post],
 commentForm: play.data.Form[models.Comment],
 editUser: models.User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*19.24*/("""
"""),format.raw/*21.1*/("""<script type="text/javascript">
    function deletePostById(postId)"""),format.raw/*22.36*/("""{"""),format.raw/*22.37*/("""
            var obj = """),format.raw/*23.23*/("""{"""),format.raw/*23.24*/("""
                postId : postId
            """),format.raw/*25.13*/("""}"""),format.raw/*25.14*/("""
            $.ajax("""),format.raw/*26.20*/("""{"""),format.raw/*26.21*/("""
                url: "/deletePost",
                data: JSON.stringify(obj),
                headers: """),format.raw/*29.26*/("""{"""),format.raw/*29.27*/("""
                    'Content-Type': 'application/json'
                """),format.raw/*31.17*/("""}"""),format.raw/*31.18*/(""",
                type: "POST"
            """),format.raw/*33.13*/("""}"""),format.raw/*33.14*/(""").done(function(data) """),format.raw/*33.36*/("""{"""),format.raw/*33.37*/("""
                var response = data;
                if("error" in response)"""),format.raw/*35.40*/("""{"""),format.raw/*35.41*/("""
                    alert("delete error!")
                """),format.raw/*37.17*/("""}"""),format.raw/*37.18*/("""else"""),format.raw/*37.22*/("""{"""),format.raw/*37.23*/("""
                    window.location.reload();
                """),format.raw/*39.17*/("""}"""),format.raw/*39.18*/("""
            """),format.raw/*40.13*/("""}"""),format.raw/*40.14*/(""");
    """),format.raw/*41.5*/("""}"""),format.raw/*41.6*/("""

    function likePost(postId)"""),format.raw/*43.30*/("""{"""),format.raw/*43.31*/("""
        var obj = """),format.raw/*44.19*/("""{"""),format.raw/*44.20*/("""
            postId : postId
        """),format.raw/*46.9*/("""}"""),format.raw/*46.10*/("""
        $.ajax("""),format.raw/*47.16*/("""{"""),format.raw/*47.17*/("""
            url: "/likePost",
            data: JSON.stringify(obj),
            headers: """),format.raw/*50.22*/("""{"""),format.raw/*50.23*/("""
                'Content-Type': 'application/json'
            """),format.raw/*52.13*/("""}"""),format.raw/*52.14*/(""",
            type: "POST"
        """),format.raw/*54.9*/("""}"""),format.raw/*54.10*/(""").done(function(data) """),format.raw/*54.32*/("""{"""),format.raw/*54.33*/("""
            var response = data;
            if("error" in response)"""),format.raw/*56.36*/("""{"""),format.raw/*56.37*/("""
                alert("like error!")
            """),format.raw/*58.13*/("""}"""),format.raw/*58.14*/("""else"""),format.raw/*58.18*/("""{"""),format.raw/*58.19*/("""
                window.location.reload();
            """),format.raw/*60.13*/("""}"""),format.raw/*60.14*/("""
        """),format.raw/*61.9*/("""}"""),format.raw/*61.10*/(""");
    """),format.raw/*62.5*/("""}"""),format.raw/*62.6*/("""

    function sharePost(postId)"""),format.raw/*64.31*/("""{"""),format.raw/*64.32*/("""
           var obj = """),format.raw/*65.22*/("""{"""),format.raw/*65.23*/("""
               postId : postId,
               postUserId : document.getElementById("inputUserId").value,
               postUserFirstName : document.getElementById("inputUserFirstName").value,
               postUserLastName : document.getElementById("inputUserLastName").value,
           """),format.raw/*70.12*/("""}"""),format.raw/*70.13*/("""
           $.ajax("""),format.raw/*71.19*/("""{"""),format.raw/*71.20*/("""
               url: "/sharePost",
               data: JSON.stringify(obj),
               headers: """),format.raw/*74.25*/("""{"""),format.raw/*74.26*/("""
                   'Content-Type': 'application/json'
               """),format.raw/*76.16*/("""}"""),format.raw/*76.17*/(""",
               type: "POST"
           """),format.raw/*78.12*/("""}"""),format.raw/*78.13*/(""").done(function(data) """),format.raw/*78.35*/("""{"""),format.raw/*78.36*/("""
              window.location.reload();
           """),format.raw/*80.12*/("""}"""),format.raw/*80.13*/(""");
       """),format.raw/*81.8*/("""}"""),format.raw/*81.9*/("""

       function editPost(postId, text)"""),format.raw/*83.39*/("""{"""),format.raw/*83.40*/("""
              var ntext = prompt("Edit here:",text);
              var obj = """),format.raw/*85.25*/("""{"""),format.raw/*85.26*/("""
                  postId : postId,
                  text : ntext,
              """),format.raw/*88.15*/("""}"""),format.raw/*88.16*/("""
              $.ajax("""),format.raw/*89.22*/("""{"""),format.raw/*89.23*/("""
                  url: "/editPost",
                  data: JSON.stringify(obj),
                  headers: """),format.raw/*92.28*/("""{"""),format.raw/*92.29*/("""
                      'Content-Type': 'application/json'
                  """),format.raw/*94.19*/("""}"""),format.raw/*94.20*/(""",
                  type: "POST"
              """),format.raw/*96.15*/("""}"""),format.raw/*96.16*/(""").done(function(data) """),format.raw/*96.38*/("""{"""),format.raw/*96.39*/("""
                  window.location.reload();
              """),format.raw/*98.15*/("""}"""),format.raw/*98.16*/(""");
          """),format.raw/*99.11*/("""}"""),format.raw/*99.12*/("""

    function commentPost(postId)"""),format.raw/*101.33*/("""{"""),format.raw/*101.34*/("""
          var commentBox = $('#commentBox'+postId);
          if (commentBox.css("display") == "none") """),format.raw/*103.52*/("""{"""),format.raw/*103.53*/("""
              commentBox.show();
              $.get("/allComment/"+postId, function(data)"""),format.raw/*105.58*/("""{"""),format.raw/*105.59*/("""
                  $("#comment"+postId).empty();
                  var commentServices = data;
                  if("error" in commentServices) return;
                  for (cid in commentServices) """),format.raw/*109.48*/("""{"""),format.raw/*109.49*/("""
                      var json = commentServices[cid];
                      var html = "<li><h6>"+json["time"]+"</h6>&nbsp;&nbsp;" +
                       json["commentUserFirstName"] + "&nbsp;"+ json["commentUserLastName"]
                       +"</a>&nbsp;replied:&nbsp;"+json["text"]+"</li>";
                       $("#comment"+postId).append(html);
                     """),format.raw/*115.22*/("""}"""),format.raw/*115.23*/("""
              """),format.raw/*116.15*/("""}"""),format.raw/*116.16*/(""");
            """),format.raw/*117.13*/("""}"""),format.raw/*117.14*/(""" else """),format.raw/*117.20*/("""{"""),format.raw/*117.21*/("""
              commentBox.hide();
            """),format.raw/*119.13*/("""}"""),format.raw/*119.14*/("""
    """),format.raw/*120.5*/("""}"""),format.raw/*120.6*/("""
</script>
"""),_display_(Seq[Any](/*122.2*/self("Home Page")/*122.19*/ {_display_(Seq[Any](format.raw/*122.21*/("""

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
                """),_display_(Seq[Any](/*141.18*/if(!session.get("email"))/*141.43*/ {_display_(Seq[Any](format.raw/*141.45*/("""
                <form class="navbar-form navbar-right" action=""""),_display_(Seq[Any](/*142.65*/routes/*142.71*/.Application.login())),format.raw/*142.91*/("""">
                    <button type="submit" class="btn btn-success">Log in</button>
                </form>
                """)))}/*145.19*/else/*145.24*/{_display_(Seq[Any](format.raw/*145.25*/("""
                <li id="drop" class="dropdown nav-btn"><a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    <span class="glyphicon glyphicon-user"></span> My Account<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href=""""),_display_(Seq[Any](/*149.39*/routes/*149.45*/.UserController.editProfile())),format.raw/*149.74*/("""">Edit Profile</a></li>
                        <li><a href=""""),_display_(Seq[Any](/*150.39*/routes/*150.45*/.Application.logout())),format.raw/*150.66*/("""">Log out</a></li>
                    </ul>
                </li>
                """)))})),format.raw/*153.18*/("""
            </ul>
        </div><!--/navbar-collapse-->
    </div><!--/container-fluid-->
</nav>

<div class="row">
    <div id="wrapper1" class="col-md-10 col-md-offset-1">
        <div id="profile1">
            <img id="photo" src="/assets/image/default.jpg" class="img-circle center-block" alt="photo">
            <p class="text-center"><strong>"""),_display_(Seq[Any](/*163.45*/editUser/*163.53*/.getEmail())),format.raw/*163.64*/("""</strong></p>
            <p class="text-center">"""),_display_(Seq[Any](/*164.37*/editUser/*164.45*/.getFirstName())),format.raw/*164.60*/(""" """),_display_(Seq[Any](/*164.62*/editUser/*164.70*/.getLastName())),format.raw/*164.84*/("""</p>

            <div style="margin-left:48%; margin-top:-8px;">

                  <form id="Follow" action = "/follow" method="POST">
                      <button type="submit" class="btn btn-success btn-xs" name="follow"><span style="color:white;">Follow</span></button>
                  </form>
            </div>
            <div style="margin-left:47.5%; margin-top:-8px;">
                  <form id="unFollow" action = "/unFollow" method="POST">
                      <button type="submit" class="btn btn-warning btn-xs" name="unFollow"><span style="color:white;">Unfollow</span></button>
                  </form>
            </div>
            <input id="inputUserId" type="hidden" value=""""),_display_(Seq[Any](/*177.59*/session/*177.66*/.get("userId"))),format.raw/*177.80*/(""""></input>
            <input id="inputUserFirstName" type="hidden" value=""""),_display_(Seq[Any](/*178.66*/session/*178.73*/.get("firstName"))),format.raw/*178.90*/(""""></input>
            <input id="inputUserLastName" type="hidden" value=""""),_display_(Seq[Any](/*179.65*/session/*179.72*/.get("lastName"))),format.raw/*179.88*/(""""></input>
        </div>
    </div>
</div>

<div id="content" class="row">
    <div id="leftcontent1" class="col-md-3 col-md-offset-1">
        <div id="sidebar1">
         <br>
         <div id="personal-info1">
             <table class="table table-striped">
                 <caption class="text-center"><strong>Personal Information</strong></caption>
                 <tr>
                     <td><span class="glyphicon glyphicon-th-large"><small> Name</small></span></td>
                     <td><small><strong>"""),_display_(Seq[Any](/*193.42*/editUser/*193.50*/.getFirstName())),format.raw/*193.65*/(""" """),_display_(Seq[Any](/*193.67*/editUser/*193.75*/.getLastName())),format.raw/*193.89*/("""</strong></small></td>
                 </tr>
                 <tr>
                     <td><span class="glyphicon glyphicon-heart"><small> Research</small></span></td>
                     <td><small><strong>"""),_display_(Seq[Any](/*197.42*/editUser/*197.50*/.getResearchFields())),format.raw/*197.70*/("""</strong></small></td>
                 </tr>
                 <tr>
                     <td><span class="glyphicon glyphicon-education"><small> Highest Degree</small></span></td>
                     <td><small><strong>"""),_display_(Seq[Any](/*201.42*/editUser/*201.50*/.getHighestDegree())),format.raw/*201.69*/("""</strong></small></td>
                 </tr>
                 <tr>
                     <td><span class="glyphicon glyphicon-phone-alt"><small> Phone</small></span></td>
                     <td><small><strong>"""),_display_(Seq[Any](/*205.42*/editUser/*205.50*/.getPhoneNumber())),format.raw/*205.67*/("""</strong></small></td>
                 </tr>
                 <tr>
                     <td><span class="glyphicon glyphicon-search"><small> Affiliation</small></span></td>
                     <td><small><strong>"""),_display_(Seq[Any](/*209.42*/editUser/*209.50*/.getAffiliation())),format.raw/*209.67*/("""</strong></small></td>
                 </tr>
             </table>
         </div>
       </div>
    </div>
 <div id="rightcontent1" class="col-md-7">
     <div id="stream-list1">
         """),_display_(Seq[Any](/*217.11*/for(postService <- postServices) yield /*217.43*/{_display_(Seq[Any](format.raw/*217.44*/("""
         <div class="soc-box1">
             <div class="soc">
                 <img src="/assets/image/default.jpg" class="img-circle user-picture" alt="photo">
                 <a href="homepage">"""),_display_(Seq[Any](/*221.38*/postService/*221.49*/.getPostUserFirstName())),format.raw/*221.72*/(""" """),_display_(Seq[Any](/*221.74*/postService/*221.85*/.getPostUserLastName())),format.raw/*221.107*/("""</a>
             </div>
             <div class="post-time text-right">
                 <h6><span class="glyphicon glyphicon-time"></span> """),_display_(Seq[Any](/*224.70*/postService/*224.81*/.getTime())),format.raw/*224.91*/("""</h6>
             </div>
             <p class="post-text">"""),_display_(Seq[Any](/*226.36*/postService/*226.47*/.getText())),format.raw/*226.57*/("""</p>
             <div class="btn-group btn-group-justified" role="group" aria-label="...">
               <div class="btn-group" role="group">
                   <button type="button" onclick="sharePost("""),_display_(Seq[Any](/*229.62*/postService/*229.73*/.getId())),format.raw/*229.81*/(""")" class="btn btn-default"><small><span class="glyphicon glyphicon-list-alt"></span> Share </small></button>
               </div>
                 <div class="btn-group" role="group">
                     <button type="button" type="button" onclick="commentPost("""),_display_(Seq[Any](/*232.80*/postService/*232.91*/.getId())),format.raw/*232.99*/(""")" class="btn btn-default"><span class="glyphicon glyphicon-list-alt"></span><small> Reply </small></button>
                 </div>
                 <div class="btn-group" role="group">
                     <button type="button" onclick="likePost("""),_display_(Seq[Any](/*235.63*/postService/*235.74*/.getId())),format.raw/*235.82*/(""","""),_display_(Seq[Any](/*235.84*/postService/*235.95*/.getLikes())),format.raw/*235.106*/(""")" class="btn btn-default"><span class="glyphicon glyphicon-heart"></span><small> Like : <span id=""""),_display_(Seq[Any](/*235.206*/postService/*235.217*/.getId())),format.raw/*235.225*/("""">"""),_display_(Seq[Any](/*235.228*/postService/*235.239*/.getLikes())),format.raw/*235.250*/("""</span></small></button>
                 </div>
                 <div class="btn-group" role="group">
                     <button type="button" onclick="editPost('"""),_display_(Seq[Any](/*238.64*/postService/*238.75*/.getId())),format.raw/*238.83*/("""','"""),_display_(Seq[Any](/*238.87*/postService/*238.98*/.getText())),format.raw/*238.108*/("""')" class="btn btn-default"><small><span class="glyphicon glyphicon-list-alt"></span> EditHere! </small></button>
                 </div>
                 <div class="btn-group" role="group">
                     <button type="button" onclick="deletePostById("""),_display_(Seq[Any](/*241.69*/postService/*241.80*/.getId())),format.raw/*241.88*/(""")" class="btn btn-default"><span class="glyphicon glyphicon-trash"></span><small> Delete</small></button>
                 </div>
             </div>

             <div class="comment-box" style="display:none;" id="commentBox"""),_display_(Seq[Any](/*245.76*/postService/*245.87*/.getId())),format.raw/*245.95*/("""">
                 <div class="comment">
                     <ol class="list-unstyled" id="comment"""),_display_(Seq[Any](/*247.60*/postService/*247.71*/.getId())),format.raw/*247.79*/("""">
                     </ol>
                 </div>

                 """),_display_(Seq[Any](/*251.19*/helper/*251.25*/.form(action = routes.UserController.addComment)/*251.73*/ {_display_(Seq[Any](format.raw/*251.75*/("""
                     <form id="form"""),_display_(Seq[Any](/*252.37*/postService/*252.48*/.getId())),format.raw/*252.56*/("""" method="post">
                         <input type="hidden" name="postId" id="postId" value=""""),_display_(Seq[Any](/*253.81*/postService/*253.92*/.getId())),format.raw/*253.100*/("""">
                         <input type="hidden" name="homepageflag" id="homepageflag" value="homepageflag">
                         <input class="form-control" type="hidden" name="commentUserId" id="commentUserId" value=""""),_display_(Seq[Any](/*255.116*/session/*255.123*/.get("userId"))),format.raw/*255.137*/("""">
                         <input type="text" class="form-control" placeholder="Type Your comment" name="text">
                         <button type="submit" class="btn btn-info pull-right submitBtn btn-xs">Submit</button>
                     </form>
                 """)))})),format.raw/*259.19*/("""
             </div>
         </div><br>
         """)))})),format.raw/*262.11*/("""
        </div>
    </div>
</div>
""")))})),format.raw/*266.2*/("""
"""))}
    }
    
    def render(postServices:List[models.Post],commentForm:play.data.Form[models.Comment],editUser:models.User): play.api.templates.HtmlFormat.Appendable = apply(postServices,commentForm,editUser)
    
    def f:((List[models.Post],play.data.Form[models.Comment],models.User) => play.api.templates.HtmlFormat.Appendable) = (postServices,commentForm,editUser) => apply(postServices,commentForm,editUser)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 05 17:39:06 EST 2015
                    SOURCE: /Users/X/Desktop/SOC-Fall-2015/ApacheCMDA-Frontend/app/views/climate/homepage.scala.html
                    HASH: b8e84f2aadfc233d0a90f8d7942eaa13653f44fc
                    MATRIX: 3204->1188|3418->1291|3446->1309|3541->1376|3570->1377|3621->1400|3650->1401|3723->1446|3752->1447|3800->1467|3829->1468|3962->1573|3991->1574|4091->1646|4120->1647|4191->1690|4220->1691|4270->1713|4299->1714|4404->1791|4433->1792|4521->1852|4550->1853|4582->1857|4611->1858|4702->1921|4731->1922|4772->1935|4801->1936|4835->1943|4863->1944|4922->1975|4951->1976|4998->1995|5027->1996|5091->2033|5120->2034|5164->2050|5193->2051|5312->2142|5341->2143|5433->2207|5462->2208|5524->2243|5553->2244|5603->2266|5632->2267|5729->2336|5758->2337|5836->2387|5865->2388|5897->2392|5926->2393|6009->2448|6038->2449|6074->2458|6103->2459|6137->2466|6165->2467|6225->2499|6254->2500|6304->2522|6333->2523|6653->2815|6682->2816|6729->2835|6758->2836|6887->2937|6916->2938|7014->3008|7043->3009|7112->3050|7141->3051|7191->3073|7220->3074|7300->3126|7329->3127|7366->3137|7394->3138|7462->3178|7491->3179|7597->3257|7626->3258|7736->3340|7765->3341|7815->3363|7844->3364|7981->3473|8010->3474|8114->3550|8143->3551|8218->3598|8247->3599|8297->3621|8326->3622|8413->3681|8442->3682|8483->3695|8512->3696|8575->3730|8605->3731|8738->3835|8768->3836|8888->3927|8918->3928|9146->4127|9176->4128|9584->4507|9614->4508|9658->4523|9688->4524|9732->4539|9762->4540|9797->4546|9827->4547|9902->4593|9932->4594|9965->4599|9994->4600|10042->4612|10069->4629|10110->4631|11196->5680|11231->5705|11272->5707|11374->5772|11390->5778|11433->5798|11579->5925|11593->5930|11633->5931|11980->6241|11996->6247|12048->6276|12147->6338|12163->6344|12207->6365|12324->6449|12713->6801|12731->6809|12765->6820|12852->6870|12870->6878|12908->6893|12947->6895|12965->6903|13002->6917|13742->7620|13759->7627|13796->7641|13909->7717|13926->7724|13966->7741|14078->7816|14095->7823|14134->7839|14692->8360|14710->8368|14748->8383|14787->8385|14805->8393|14842->8407|15090->8618|15108->8626|15151->8646|15409->8867|15427->8875|15469->8894|15718->9106|15736->9114|15776->9131|16028->9346|16046->9354|16086->9371|16314->9562|16363->9594|16403->9595|16640->9795|16661->9806|16707->9829|16746->9831|16767->9842|16813->9864|16992->10006|17013->10017|17046->10027|17144->10088|17165->10099|17198->10109|17440->10314|17461->10325|17492->10333|17793->10597|17814->10608|17845->10616|18131->10865|18152->10876|18183->10884|18222->10886|18243->10897|18278->10908|18416->11008|18438->11019|18470->11027|18511->11030|18533->11041|18568->11052|18771->11218|18792->11229|18823->11237|18864->11241|18885->11252|18919->11262|19216->11522|19237->11533|19268->11541|19531->11767|19552->11778|19583->11786|19721->11887|19742->11898|19773->11906|19883->11979|19899->11985|19957->12033|19998->12035|20072->12072|20093->12083|20124->12091|20258->12188|20279->12199|20311->12207|20573->12431|20591->12438|20629->12452|20934->12724|21018->12775|21085->12810
                    LINES: 56->17|62->19|63->21|64->22|64->22|65->23|65->23|67->25|67->25|68->26|68->26|71->29|71->29|73->31|73->31|75->33|75->33|75->33|75->33|77->35|77->35|79->37|79->37|79->37|79->37|81->39|81->39|82->40|82->40|83->41|83->41|85->43|85->43|86->44|86->44|88->46|88->46|89->47|89->47|92->50|92->50|94->52|94->52|96->54|96->54|96->54|96->54|98->56|98->56|100->58|100->58|100->58|100->58|102->60|102->60|103->61|103->61|104->62|104->62|106->64|106->64|107->65|107->65|112->70|112->70|113->71|113->71|116->74|116->74|118->76|118->76|120->78|120->78|120->78|120->78|122->80|122->80|123->81|123->81|125->83|125->83|127->85|127->85|130->88|130->88|131->89|131->89|134->92|134->92|136->94|136->94|138->96|138->96|138->96|138->96|140->98|140->98|141->99|141->99|143->101|143->101|145->103|145->103|147->105|147->105|151->109|151->109|157->115|157->115|158->116|158->116|159->117|159->117|159->117|159->117|161->119|161->119|162->120|162->120|164->122|164->122|164->122|183->141|183->141|183->141|184->142|184->142|184->142|187->145|187->145|187->145|191->149|191->149|191->149|192->150|192->150|192->150|195->153|205->163|205->163|205->163|206->164|206->164|206->164|206->164|206->164|206->164|219->177|219->177|219->177|220->178|220->178|220->178|221->179|221->179|221->179|235->193|235->193|235->193|235->193|235->193|235->193|239->197|239->197|239->197|243->201|243->201|243->201|247->205|247->205|247->205|251->209|251->209|251->209|259->217|259->217|259->217|263->221|263->221|263->221|263->221|263->221|263->221|266->224|266->224|266->224|268->226|268->226|268->226|271->229|271->229|271->229|274->232|274->232|274->232|277->235|277->235|277->235|277->235|277->235|277->235|277->235|277->235|277->235|277->235|277->235|277->235|280->238|280->238|280->238|280->238|280->238|280->238|283->241|283->241|283->241|287->245|287->245|287->245|289->247|289->247|289->247|293->251|293->251|293->251|293->251|294->252|294->252|294->252|295->253|295->253|295->253|297->255|297->255|297->255|301->259|304->262|308->266
                    -- GENERATED --
                */
            