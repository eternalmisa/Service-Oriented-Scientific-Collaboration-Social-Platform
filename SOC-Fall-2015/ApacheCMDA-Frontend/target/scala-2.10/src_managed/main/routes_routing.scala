// @SOURCE:/Users/X/Desktop/SOC-Fall-2015/ApacheCMDA-Frontend/conf/routes
// @HASH:ce66c5cda59b4d1e6578dacf57031521fda32b3c
// @DATE:Thu Dec 10 15:59:35 EST 2015


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_ClimateServiceController_home0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home"))))
        

// @LINE:7
private[this] lazy val controllers_ClimateServiceController_home1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:8
private[this] lazy val controllers_Application_login2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:9
private[this] lazy val controllers_Application_logout3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:10
private[this] lazy val controllers_Application_authenticate4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate"))))
        

// @LINE:11
private[this] lazy val controllers_Application_signup5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:12
private[this] lazy val controllers_Application_createNewUser6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createNewUser"))))
        

// @LINE:13
private[this] lazy val controllers_Application_createSuccess7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createSuccess"))))
        

// @LINE:14
private[this] lazy val controllers_Application_isEmailExisted8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("isEmailExisted"))))
        

// @LINE:17
private[this] lazy val controllers_BugReportController_reports9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bugs"))))
        

// @LINE:18
private[this] lazy val controllers_BugReportController_newReport10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("newReport"))))
        

// @LINE:19
private[this] lazy val controllers_BugReportController_list11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bug/list"))))
        

// @LINE:20
private[this] lazy val controllers_BugReportController_deleteReport12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delete/report"))))
        

// @LINE:21
private[this] lazy val controllers_BugReportController_solveReport13 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("solve/report"))))
        

// @LINE:24
private[this] lazy val controllers_AboutusController_aboutUs14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aboutus"))))
        

// @LINE:25
private[this] lazy val controllers_AboutusController_aboutProject15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aboutProject"))))
        

// @LINE:28
private[this] lazy val controllers_ClimateServiceController_home16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate"))))
        

// @LINE:29
private[this] lazy val controllers_ClimateServiceController_tutorial17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/tutorial"))))
        

// @LINE:30
private[this] lazy val controllers_ClimateServiceController_climateServices18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/climateServices"))))
        

// @LINE:31
private[this] lazy val controllers_ClimateServiceController_mostRecentlyAddedClimateServices19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/mostRecentlyAddedClimateServices"))))
        

// @LINE:32
private[this] lazy val controllers_ClimateServiceController_mostRecentlyUsedClimateServices20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/mostRecentlyUsedClimateServices"))))
        

// @LINE:33
private[this] lazy val controllers_ClimateServiceController_mostPopularClimateServices21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/mostPopularClimateServices"))))
        

// @LINE:34
private[this] lazy val controllers_ClimateServiceController_newClimateService22 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/new/climateServices"))))
        

// @LINE:35
private[this] lazy val controllers_ClimateServiceController_deleteClimateService23 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/delete/climateServices"))))
        

// @LINE:36
private[this] lazy val controllers_ClimateServiceController_downloadClimateService24 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/download/climateServices"))))
        

// @LINE:37
private[this] lazy val controllers_ClimateServiceController_editClimateService25 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/edit/climateServices"))))
        

// @LINE:38
private[this] lazy val controllers_ClimateServiceController_addClimateServices26 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/new/climateServices"))))
        

// @LINE:39
private[this] lazy val controllers_ClimateServiceController_oneService27 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/oneService"))))
        

// @LINE:41
private[this] lazy val controllers_DatasetController_datasetList28 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/datasets"))))
        

// @LINE:42
private[this] lazy val controllers_DatasetController_searchDataset29 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/searchDataSet"))))
        

// @LINE:43
private[this] lazy val controllers_DatasetController_getSearchResult30 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/getSearchResult"))))
        

// @LINE:46
private[this] lazy val controllers_Assets_at31 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:50
private[this] lazy val controllers_UserController_mainpage32 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mainpage"))))
        

// @LINE:51
private[this] lazy val controllers_UserController_homepage33 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("homepage"))))
        

// @LINE:52
private[this] lazy val controllers_UserController_addPost34 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addPost"))))
        

// @LINE:53
private[this] lazy val controllers_UserController_deletePost35 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deletePost"))))
        

// @LINE:54
private[this] lazy val controllers_UserController_sharePost36 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sharePost"))))
        

// @LINE:55
private[this] lazy val controllers_UserController_likePost37 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("likePost"))))
        

// @LINE:56
private[this] lazy val controllers_UserController_searchUser38 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchUser"))))
        

// @LINE:57
private[this] lazy val controllers_UserController_addComment39 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addComment"))))
        

// @LINE:58
private[this] lazy val controllers_UserController_allComment40 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("allComment/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:59
private[this] lazy val controllers_UserController_editProfile41 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("editProfile"))))
        

// @LINE:60
private[this] lazy val controllers_UserController_editUser42 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("editUser"))))
        

// @LINE:61
private[this] lazy val controllers_UserController_editPost43 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("editPost"))))
        

// @LINE:62
private[this] lazy val controllers_UserController_searchUser44 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchUser"))))
        

// @LINE:63
private[this] lazy val controllers_UserController_searchPost45 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("searchPost"))))
        

// @LINE:64
private[this] lazy val controllers_UserController_goBack46 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("goBack"))))
        

// @LINE:65
private[this] lazy val controllers_UserController_visitFollowee47 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("visitFollowee"))))
        

// @LINE:66
private[this] lazy val controllers_UserController_follow48 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("follow"))))
        

// @LINE:67
private[this] lazy val controllers_UserController_unFollow49 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("unFollow"))))
        

// @LINE:68
private[this] lazy val controllers_UserController_sendLocation50 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sendLocation"))))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home""","""controllers.ClimateServiceController.home(email:String ?= null, vfile:String ?= null, dataset:String ?= null)"""),("""GET""", prefix,"""controllers.ClimateServiceController.home(email:String ?= null, vfile:String ?= null, dataset:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate""","""controllers.Application.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Application.signup()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createNewUser""","""controllers.Application.createNewUser()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createSuccess""","""controllers.Application.createSuccess()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """isEmailExisted""","""controllers.Application.isEmailExisted()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bugs""","""controllers.BugReportController.reports()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newReport""","""controllers.BugReportController.newReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bug/list""","""controllers.BugReportController.list()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delete/report""","""controllers.BugReportController.deleteReport()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """solve/report""","""controllers.BugReportController.solveReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aboutus""","""controllers.AboutusController.aboutUs()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aboutProject""","""controllers.AboutusController.aboutProject()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate""","""controllers.ClimateServiceController.home(email:String ?= null, vfile:String ?= null, dataset:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/tutorial""","""controllers.ClimateServiceController.tutorial()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/climateServices""","""controllers.ClimateServiceController.climateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/mostRecentlyAddedClimateServices""","""controllers.ClimateServiceController.mostRecentlyAddedClimateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/mostRecentlyUsedClimateServices""","""controllers.ClimateServiceController.mostRecentlyUsedClimateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/mostPopularClimateServices""","""controllers.ClimateServiceController.mostPopularClimateServices()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/new/climateServices""","""controllers.ClimateServiceController.newClimateService()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/delete/climateServices""","""controllers.ClimateServiceController.deleteClimateService()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/download/climateServices""","""controllers.ClimateServiceController.downloadClimateService()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/edit/climateServices""","""controllers.ClimateServiceController.editClimateService()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/new/climateServices""","""controllers.ClimateServiceController.addClimateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/oneService""","""controllers.ClimateServiceController.oneService(url:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/datasets""","""controllers.DatasetController.datasetList()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/searchDataSet""","""controllers.DatasetController.searchDataset()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/getSearchResult""","""controllers.DatasetController.getSearchResult()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mainpage""","""controllers.UserController.mainpage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """homepage""","""controllers.UserController.homepage()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addPost""","""controllers.UserController.addPost()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deletePost""","""controllers.UserController.deletePost()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sharePost""","""controllers.UserController.sharePost()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """likePost""","""controllers.UserController.likePost()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchUser""","""controllers.UserController.searchUser()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addComment""","""controllers.UserController.addComment()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """allComment/$id<[^/]+>""","""controllers.UserController.allComment(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """editProfile""","""controllers.UserController.editProfile()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """editUser""","""controllers.UserController.editUser()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """editPost""","""controllers.UserController.editPost()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchUser""","""controllers.UserController.searchUser()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """searchPost""","""controllers.UserController.searchPost()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """goBack""","""controllers.UserController.goBack()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """visitFollowee""","""controllers.UserController.visitFollowee()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """follow""","""controllers.UserController.follow()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """unFollow""","""controllers.UserController.unFollow()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sendLocation""","""controllers.UserController.sendLocation()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_ClimateServiceController_home0(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("vfile", Some(null)), params.fromQuery[String]("dataset", Some(null))) { (email, vfile, dataset) =>
        invokeHandler(controllers.ClimateServiceController.home(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "home", Seq(classOf[String], classOf[String], classOf[String]),"GET", """ Home page""", Routes.prefix + """home"""))
   }
}
        

// @LINE:7
case controllers_ClimateServiceController_home1(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("vfile", Some(null)), params.fromQuery[String]("dataset", Some(null))) { (email, vfile, dataset) =>
        invokeHandler(controllers.ClimateServiceController.home(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "home", Seq(classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:8
case controllers_Application_login2(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:9
case controllers_Application_logout3(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:10
case controllers_Application_authenticate4(params) => {
   call { 
        invokeHandler(controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Nil,"GET", """""", Routes.prefix + """authenticate"""))
   }
}
        

// @LINE:11
case controllers_Application_signup5(params) => {
   call { 
        invokeHandler(controllers.Application.signup(), HandlerDef(this, "controllers.Application", "signup", Nil,"GET", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:12
case controllers_Application_createNewUser6(params) => {
   call { 
        invokeHandler(controllers.Application.createNewUser(), HandlerDef(this, "controllers.Application", "createNewUser", Nil,"GET", """""", Routes.prefix + """createNewUser"""))
   }
}
        

// @LINE:13
case controllers_Application_createSuccess7(params) => {
   call { 
        invokeHandler(controllers.Application.createSuccess(), HandlerDef(this, "controllers.Application", "createSuccess", Nil,"GET", """""", Routes.prefix + """createSuccess"""))
   }
}
        

// @LINE:14
case controllers_Application_isEmailExisted8(params) => {
   call { 
        invokeHandler(controllers.Application.isEmailExisted(), HandlerDef(this, "controllers.Application", "isEmailExisted", Nil,"POST", """""", Routes.prefix + """isEmailExisted"""))
   }
}
        

// @LINE:17
case controllers_BugReportController_reports9(params) => {
   call { 
        invokeHandler(controllers.BugReportController.reports(), HandlerDef(this, "controllers.BugReportController", "reports", Nil,"GET", """ BugReporting""", Routes.prefix + """bugs"""))
   }
}
        

// @LINE:18
case controllers_BugReportController_newReport10(params) => {
   call { 
        invokeHandler(controllers.BugReportController.newReport(), HandlerDef(this, "controllers.BugReportController", "newReport", Nil,"GET", """""", Routes.prefix + """newReport"""))
   }
}
        

// @LINE:19
case controllers_BugReportController_list11(params) => {
   call { 
        invokeHandler(controllers.BugReportController.list(), HandlerDef(this, "controllers.BugReportController", "list", Nil,"GET", """""", Routes.prefix + """bug/list"""))
   }
}
        

// @LINE:20
case controllers_BugReportController_deleteReport12(params) => {
   call { 
        invokeHandler(controllers.BugReportController.deleteReport(), HandlerDef(this, "controllers.BugReportController", "deleteReport", Nil,"POST", """""", Routes.prefix + """delete/report"""))
   }
}
        

// @LINE:21
case controllers_BugReportController_solveReport13(params) => {
   call { 
        invokeHandler(controllers.BugReportController.solveReport(), HandlerDef(this, "controllers.BugReportController", "solveReport", Nil,"POST", """""", Routes.prefix + """solve/report"""))
   }
}
        

// @LINE:24
case controllers_AboutusController_aboutUs14(params) => {
   call { 
        invokeHandler(controllers.AboutusController.aboutUs(), HandlerDef(this, "controllers.AboutusController", "aboutUs", Nil,"GET", """ About Us""", Routes.prefix + """aboutus"""))
   }
}
        

// @LINE:25
case controllers_AboutusController_aboutProject15(params) => {
   call { 
        invokeHandler(controllers.AboutusController.aboutProject(), HandlerDef(this, "controllers.AboutusController", "aboutProject", Nil,"GET", """""", Routes.prefix + """aboutProject"""))
   }
}
        

// @LINE:28
case controllers_ClimateServiceController_home16(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("vfile", Some(null)), params.fromQuery[String]("dataset", Some(null))) { (email, vfile, dataset) =>
        invokeHandler(controllers.ClimateServiceController.home(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "home", Seq(classOf[String], classOf[String], classOf[String]),"GET", """ Climate Model""", Routes.prefix + """climate"""))
   }
}
        

// @LINE:29
case controllers_ClimateServiceController_tutorial17(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.tutorial(), HandlerDef(this, "controllers.ClimateServiceController", "tutorial", Nil,"GET", """""", Routes.prefix + """climate/tutorial"""))
   }
}
        

// @LINE:30
case controllers_ClimateServiceController_climateServices18(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.climateServices(), HandlerDef(this, "controllers.ClimateServiceController", "climateServices", Nil,"GET", """""", Routes.prefix + """climate/climateServices"""))
   }
}
        

// @LINE:31
case controllers_ClimateServiceController_mostRecentlyAddedClimateServices19(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.mostRecentlyAddedClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostRecentlyAddedClimateServices", Nil,"GET", """""", Routes.prefix + """climate/mostRecentlyAddedClimateServices"""))
   }
}
        

// @LINE:32
case controllers_ClimateServiceController_mostRecentlyUsedClimateServices20(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.mostRecentlyUsedClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostRecentlyUsedClimateServices", Nil,"GET", """""", Routes.prefix + """climate/mostRecentlyUsedClimateServices"""))
   }
}
        

// @LINE:33
case controllers_ClimateServiceController_mostPopularClimateServices21(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.mostPopularClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostPopularClimateServices", Nil,"GET", """""", Routes.prefix + """climate/mostPopularClimateServices"""))
   }
}
        

// @LINE:34
case controllers_ClimateServiceController_newClimateService22(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.newClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "newClimateService", Nil,"POST", """""", Routes.prefix + """climate/new/climateServices"""))
   }
}
        

// @LINE:35
case controllers_ClimateServiceController_deleteClimateService23(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.deleteClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "deleteClimateService", Nil,"POST", """""", Routes.prefix + """climate/delete/climateServices"""))
   }
}
        

// @LINE:36
case controllers_ClimateServiceController_downloadClimateService24(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.downloadClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "downloadClimateService", Nil,"POST", """""", Routes.prefix + """climate/download/climateServices"""))
   }
}
        

// @LINE:37
case controllers_ClimateServiceController_editClimateService25(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.editClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "editClimateService", Nil,"POST", """""", Routes.prefix + """climate/edit/climateServices"""))
   }
}
        

// @LINE:38
case controllers_ClimateServiceController_addClimateServices26(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.addClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "addClimateServices", Nil,"GET", """""", Routes.prefix + """climate/new/climateServices"""))
   }
}
        

// @LINE:39
case controllers_ClimateServiceController_oneService27(params) => {
   call(params.fromQuery[String]("url", Some(null))) { (url) =>
        invokeHandler(controllers.ClimateServiceController.oneService(url), HandlerDef(this, "controllers.ClimateServiceController", "oneService", Seq(classOf[String]),"GET", """""", Routes.prefix + """climate/oneService"""))
   }
}
        

// @LINE:41
case controllers_DatasetController_datasetList28(params) => {
   call { 
        invokeHandler(controllers.DatasetController.datasetList(), HandlerDef(this, "controllers.DatasetController", "datasetList", Nil,"GET", """Keyword search""", Routes.prefix + """climate/datasets"""))
   }
}
        

// @LINE:42
case controllers_DatasetController_searchDataset29(params) => {
   call { 
        invokeHandler(controllers.DatasetController.searchDataset(), HandlerDef(this, "controllers.DatasetController", "searchDataset", Nil,"GET", """""", Routes.prefix + """climate/searchDataSet"""))
   }
}
        

// @LINE:43
case controllers_DatasetController_getSearchResult30(params) => {
   call { 
        invokeHandler(controllers.DatasetController.getSearchResult(), HandlerDef(this, "controllers.DatasetController", "getSearchResult", Nil,"GET", """""", Routes.prefix + """climate/getSearchResult"""))
   }
}
        

// @LINE:46
case controllers_Assets_at31(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:50
case controllers_UserController_mainpage32(params) => {
   call { 
        invokeHandler(controllers.UserController.mainpage(), HandlerDef(this, "controllers.UserController", "mainpage", Nil,"GET", """# Self""", Routes.prefix + """mainpage"""))
   }
}
        

// @LINE:51
case controllers_UserController_homepage33(params) => {
   call { 
        invokeHandler(controllers.UserController.homepage(), HandlerDef(this, "controllers.UserController", "homepage", Nil,"GET", """""", Routes.prefix + """homepage"""))
   }
}
        

// @LINE:52
case controllers_UserController_addPost34(params) => {
   call { 
        invokeHandler(controllers.UserController.addPost(), HandlerDef(this, "controllers.UserController", "addPost", Nil,"POST", """""", Routes.prefix + """addPost"""))
   }
}
        

// @LINE:53
case controllers_UserController_deletePost35(params) => {
   call { 
        invokeHandler(controllers.UserController.deletePost(), HandlerDef(this, "controllers.UserController", "deletePost", Nil,"POST", """""", Routes.prefix + """deletePost"""))
   }
}
        

// @LINE:54
case controllers_UserController_sharePost36(params) => {
   call { 
        invokeHandler(controllers.UserController.sharePost(), HandlerDef(this, "controllers.UserController", "sharePost", Nil,"POST", """""", Routes.prefix + """sharePost"""))
   }
}
        

// @LINE:55
case controllers_UserController_likePost37(params) => {
   call { 
        invokeHandler(controllers.UserController.likePost(), HandlerDef(this, "controllers.UserController", "likePost", Nil,"POST", """""", Routes.prefix + """likePost"""))
   }
}
        

// @LINE:56
case controllers_UserController_searchUser38(params) => {
   call { 
        invokeHandler(controllers.UserController.searchUser(), HandlerDef(this, "controllers.UserController", "searchUser", Nil,"POST", """""", Routes.prefix + """searchUser"""))
   }
}
        

// @LINE:57
case controllers_UserController_addComment39(params) => {
   call { 
        invokeHandler(controllers.UserController.addComment(), HandlerDef(this, "controllers.UserController", "addComment", Nil,"POST", """""", Routes.prefix + """addComment"""))
   }
}
        

// @LINE:58
case controllers_UserController_allComment40(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.UserController.allComment(id), HandlerDef(this, "controllers.UserController", "allComment", Seq(classOf[Long]),"GET", """""", Routes.prefix + """allComment/$id<[^/]+>"""))
   }
}
        

// @LINE:59
case controllers_UserController_editProfile41(params) => {
   call { 
        invokeHandler(controllers.UserController.editProfile(), HandlerDef(this, "controllers.UserController", "editProfile", Nil,"GET", """""", Routes.prefix + """editProfile"""))
   }
}
        

// @LINE:60
case controllers_UserController_editUser42(params) => {
   call { 
        invokeHandler(controllers.UserController.editUser(), HandlerDef(this, "controllers.UserController", "editUser", Nil,"GET", """""", Routes.prefix + """editUser"""))
   }
}
        

// @LINE:61
case controllers_UserController_editPost43(params) => {
   call { 
        invokeHandler(controllers.UserController.editPost(), HandlerDef(this, "controllers.UserController", "editPost", Nil,"POST", """""", Routes.prefix + """editPost"""))
   }
}
        

// @LINE:62
case controllers_UserController_searchUser44(params) => {
   call { 
        invokeHandler(controllers.UserController.searchUser(), HandlerDef(this, "controllers.UserController", "searchUser", Nil,"POST", """""", Routes.prefix + """searchUser"""))
   }
}
        

// @LINE:63
case controllers_UserController_searchPost45(params) => {
   call { 
        invokeHandler(controllers.UserController.searchPost(), HandlerDef(this, "controllers.UserController", "searchPost", Nil,"POST", """""", Routes.prefix + """searchPost"""))
   }
}
        

// @LINE:64
case controllers_UserController_goBack46(params) => {
   call { 
        invokeHandler(controllers.UserController.goBack(), HandlerDef(this, "controllers.UserController", "goBack", Nil,"POST", """""", Routes.prefix + """goBack"""))
   }
}
        

// @LINE:65
case controllers_UserController_visitFollowee47(params) => {
   call { 
        invokeHandler(controllers.UserController.visitFollowee(), HandlerDef(this, "controllers.UserController", "visitFollowee", Nil,"POST", """""", Routes.prefix + """visitFollowee"""))
   }
}
        

// @LINE:66
case controllers_UserController_follow48(params) => {
   call { 
        invokeHandler(controllers.UserController.follow(), HandlerDef(this, "controllers.UserController", "follow", Nil,"POST", """""", Routes.prefix + """follow"""))
   }
}
        

// @LINE:67
case controllers_UserController_unFollow49(params) => {
   call { 
        invokeHandler(controllers.UserController.unFollow(), HandlerDef(this, "controllers.UserController", "unFollow", Nil,"POST", """""", Routes.prefix + """unFollow"""))
   }
}
        

// @LINE:68
case controllers_UserController_sendLocation50(params) => {
   call { 
        invokeHandler(controllers.UserController.sendLocation(), HandlerDef(this, "controllers.UserController", "sendLocation", Nil,"POST", """""", Routes.prefix + """sendLocation"""))
   }
}
        
}

}
     