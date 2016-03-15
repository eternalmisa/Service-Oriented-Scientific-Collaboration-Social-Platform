// @SOURCE:/Users/X/Desktop/SOC-Fall-2015/ApacheCMDA-Frontend/conf/routes
// @HASH:ce66c5cda59b4d1e6578dacf57031521fda32b3c
// @DATE:Thu Dec 10 15:59:35 EST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:46
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:46
class ReverseAssets {
    

// @LINE:46
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:25
// @LINE:24
class ReverseAboutusController {
    

// @LINE:25
def aboutProject(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "aboutProject")
}
                                                

// @LINE:24
def aboutUs(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "aboutus")
}
                                                
    
}
                          

// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
class ReverseBugReportController {
    

// @LINE:17
def reports(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "bugs")
}
                                                

// @LINE:21
def solveReport(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "solve/report")
}
                                                

// @LINE:20
def deleteReport(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "delete/report")
}
                                                

// @LINE:19
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "bug/list")
}
                                                

// @LINE:18
def newReport(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "newReport")
}
                                                
    
}
                          

// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
class ReverseUserController {
    

// @LINE:64
def goBack(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "goBack")
}
                                                

// @LINE:52
def addPost(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "addPost")
}
                                                

// @LINE:62
// @LINE:56
def searchUser(): Call = {
   () match {
// @LINE:56
case () if true => Call("POST", _prefix + { _defaultPrefix } + "searchUser")
                                                        
// @LINE:62
case () if true => Call("POST", _prefix + { _defaultPrefix } + "searchUser")
                                                        
   }
}
                                                

// @LINE:51
def homepage(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "homepage")
}
                                                

// @LINE:63
def searchPost(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "searchPost")
}
                                                

// @LINE:66
def follow(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "follow")
}
                                                

// @LINE:61
def editPost(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "editPost")
}
                                                

// @LINE:57
def addComment(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "addComment")
}
                                                

// @LINE:54
def sharePost(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "sharePost")
}
                                                

// @LINE:67
def unFollow(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "unFollow")
}
                                                

// @LINE:50
def mainpage(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "mainpage")
}
                                                

// @LINE:58
def allComment(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "allComment/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:60
def editUser(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "editUser")
}
                                                

// @LINE:59
def editProfile(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "editProfile")
}
                                                

// @LINE:55
def likePost(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "likePost")
}
                                                

// @LINE:53
def deletePost(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "deletePost")
}
                                                

// @LINE:65
def visitFollowee(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "visitFollowee")
}
                                                

// @LINE:68
def sendLocation(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "sendLocation")
}
                                                
    
}
                          

// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
class ReverseApplication {
    

// @LINE:12
def createNewUser(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "createNewUser")
}
                                                

// @LINE:13
def createSuccess(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "createSuccess")
}
                                                

// @LINE:14
def isEmailExisted(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "isEmailExisted")
}
                                                

// @LINE:11
def signup(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:9
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:10
def authenticate(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "authenticate")
}
                                                

// @LINE:8
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          

// @LINE:43
// @LINE:42
// @LINE:41
class ReverseDatasetController {
    

// @LINE:43
def getSearchResult(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/getSearchResult")
}
                                                

// @LINE:42
def searchDataset(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/searchDataSet")
}
                                                

// @LINE:41
def datasetList(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/datasets")
}
                                                
    
}
                          

// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:7
// @LINE:6
class ReverseClimateServiceController {
    

// @LINE:38
def addClimateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/new/climateServices")
}
                                                

// @LINE:31
def mostRecentlyAddedClimateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/mostRecentlyAddedClimateServices")
}
                                                

// @LINE:37
def editClimateService(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "climate/edit/climateServices")
}
                                                

// @LINE:33
def mostPopularClimateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/mostPopularClimateServices")
}
                                                

// @LINE:29
def tutorial(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/tutorial")
}
                                                

// @LINE:39
def oneService(url:String = null): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/oneService" + queryString(List(if(url == null) None else Some(implicitly[QueryStringBindable[String]].unbind("url", url)))))
}
                                                

// @LINE:36
def downloadClimateService(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "climate/download/climateServices")
}
                                                

// @LINE:32
def mostRecentlyUsedClimateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/mostRecentlyUsedClimateServices")
}
                                                

// @LINE:30
def climateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/climateServices")
}
                                                

// @LINE:34
def newClimateService(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "climate/new/climateServices")
}
                                                

// @LINE:28
// @LINE:7
// @LINE:6
def home(email:String = null, vfile:String = null, dataset:String = null): Call = {
   (email: @unchecked, vfile: @unchecked, dataset: @unchecked) match {
// @LINE:6
case (email, vfile, dataset) if true => Call("GET", _prefix + { _defaultPrefix } + "home" + queryString(List(if(email == null) None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)), if(vfile == null) None else Some(implicitly[QueryStringBindable[String]].unbind("vfile", vfile)), if(dataset == null) None else Some(implicitly[QueryStringBindable[String]].unbind("dataset", dataset)))))
                                                        
// @LINE:7
case (email, vfile, dataset) if true => Call("GET", _prefix + queryString(List(if(email == null) None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)), if(vfile == null) None else Some(implicitly[QueryStringBindable[String]].unbind("vfile", vfile)), if(dataset == null) None else Some(implicitly[QueryStringBindable[String]].unbind("dataset", dataset)))))
                                                        
// @LINE:28
case (email, vfile, dataset) if true => Call("GET", _prefix + { _defaultPrefix } + "climate" + queryString(List(if(email == null) None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)), if(vfile == null) None else Some(implicitly[QueryStringBindable[String]].unbind("vfile", vfile)), if(dataset == null) None else Some(implicitly[QueryStringBindable[String]].unbind("dataset", dataset)))))
                                                        
   }
}
                                                

// @LINE:35
def deleteClimateService(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "climate/delete/climateServices")
}
                                                
    
}
                          
}
                  


// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:46
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:46
class ReverseAssets {
    

// @LINE:46
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:25
// @LINE:24
class ReverseAboutusController {
    

// @LINE:25
def aboutProject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AboutusController.aboutProject",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutProject"})
      }
   """
)
                        

// @LINE:24
def aboutUs : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AboutusController.aboutUs",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutus"})
      }
   """
)
                        
    
}
              

// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
class ReverseBugReportController {
    

// @LINE:17
def reports : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.reports",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bugs"})
      }
   """
)
                        

// @LINE:21
def solveReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.solveReport",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "solve/report"})
      }
   """
)
                        

// @LINE:20
def deleteReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.deleteReport",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "delete/report"})
      }
   """
)
                        

// @LINE:19
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bug/list"})
      }
   """
)
                        

// @LINE:18
def newReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.newReport",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newReport"})
      }
   """
)
                        
    
}
              

// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
class ReverseUserController {
    

// @LINE:64
def goBack : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.goBack",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "goBack"})
      }
   """
)
                        

// @LINE:52
def addPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.addPost",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addPost"})
      }
   """
)
                        

// @LINE:62
// @LINE:56
def searchUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.searchUser",
   """
      function() {
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "searchUser"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "searchUser"})
      }
      }
   """
)
                        

// @LINE:51
def homepage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.homepage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "homepage"})
      }
   """
)
                        

// @LINE:63
def searchPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.searchPost",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "searchPost"})
      }
   """
)
                        

// @LINE:66
def follow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.follow",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "follow"})
      }
   """
)
                        

// @LINE:61
def editPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.editPost",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "editPost"})
      }
   """
)
                        

// @LINE:57
def addComment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.addComment",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addComment"})
      }
   """
)
                        

// @LINE:54
def sharePost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.sharePost",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sharePost"})
      }
   """
)
                        

// @LINE:67
def unFollow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.unFollow",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "unFollow"})
      }
   """
)
                        

// @LINE:50
def mainpage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.mainpage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mainpage"})
      }
   """
)
                        

// @LINE:58
def allComment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.allComment",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "allComment/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:60
def editUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.editUser",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editUser"})
      }
   """
)
                        

// @LINE:59
def editProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.editProfile",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editProfile"})
      }
   """
)
                        

// @LINE:55
def likePost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.likePost",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "likePost"})
      }
   """
)
                        

// @LINE:53
def deletePost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.deletePost",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deletePost"})
      }
   """
)
                        

// @LINE:65
def visitFollowee : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.visitFollowee",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "visitFollowee"})
      }
   """
)
                        

// @LINE:68
def sendLocation : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.sendLocation",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sendLocation"})
      }
   """
)
                        
    
}
              

// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
class ReverseApplication {
    

// @LINE:12
def createNewUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createNewUser",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createNewUser"})
      }
   """
)
                        

// @LINE:13
def createSuccess : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createSuccess",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createSuccess"})
      }
   """
)
                        

// @LINE:14
def isEmailExisted : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.isEmailExisted",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "isEmailExisted"})
      }
   """
)
                        

// @LINE:11
def signup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.signup",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:9
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:10
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate"})
      }
   """
)
                        

// @LINE:8
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              

// @LINE:43
// @LINE:42
// @LINE:41
class ReverseDatasetController {
    

// @LINE:43
def getSearchResult : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.getSearchResult",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/getSearchResult"})
      }
   """
)
                        

// @LINE:42
def searchDataset : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.searchDataset",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/searchDataSet"})
      }
   """
)
                        

// @LINE:41
def datasetList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.datasetList",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/datasets"})
      }
   """
)
                        
    
}
              

// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:7
// @LINE:6
class ReverseClimateServiceController {
    

// @LINE:38
def addClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.addClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/new/climateServices"})
      }
   """
)
                        

// @LINE:31
def mostRecentlyAddedClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.mostRecentlyAddedClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/mostRecentlyAddedClimateServices"})
      }
   """
)
                        

// @LINE:37
def editClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.editClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/edit/climateServices"})
      }
   """
)
                        

// @LINE:33
def mostPopularClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.mostPopularClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/mostPopularClimateServices"})
      }
   """
)
                        

// @LINE:29
def tutorial : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.tutorial",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/tutorial"})
      }
   """
)
                        

// @LINE:39
def oneService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.oneService",
   """
      function(url) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/oneService" + _qS([(url == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("url", url))])})
      }
   """
)
                        

// @LINE:36
def downloadClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.downloadClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/download/climateServices"})
      }
   """
)
                        

// @LINE:32
def mostRecentlyUsedClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.mostRecentlyUsedClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/mostRecentlyUsedClimateServices"})
      }
   """
)
                        

// @LINE:30
def climateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.climateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/climateServices"})
      }
   """
)
                        

// @LINE:34
def newClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.newClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/new/climateServices"})
      }
   """
)
                        

// @LINE:28
// @LINE:7
// @LINE:6
def home : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.home",
   """
      function(email, vfile, dataset) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)), (vfile == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("vfile", vfile)), (dataset == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("dataset", dataset))])})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + """" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)), (vfile == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("vfile", vfile)), (dataset == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("dataset", dataset))])})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)), (vfile == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("vfile", vfile)), (dataset == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("dataset", dataset))])})
      }
      }
   """
)
                        

// @LINE:35
def deleteClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.deleteClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/delete/climateServices"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:46
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:46
class ReverseAssets {
    

// @LINE:46
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:25
// @LINE:24
class ReverseAboutusController {
    

// @LINE:25
def aboutProject(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AboutusController.aboutProject(), HandlerDef(this, "controllers.AboutusController", "aboutProject", Seq(), "GET", """""", _prefix + """aboutProject""")
)
                      

// @LINE:24
def aboutUs(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AboutusController.aboutUs(), HandlerDef(this, "controllers.AboutusController", "aboutUs", Seq(), "GET", """ About Us""", _prefix + """aboutus""")
)
                      
    
}
                          

// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
class ReverseBugReportController {
    

// @LINE:17
def reports(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.reports(), HandlerDef(this, "controllers.BugReportController", "reports", Seq(), "GET", """ BugReporting""", _prefix + """bugs""")
)
                      

// @LINE:21
def solveReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.solveReport(), HandlerDef(this, "controllers.BugReportController", "solveReport", Seq(), "POST", """""", _prefix + """solve/report""")
)
                      

// @LINE:20
def deleteReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.deleteReport(), HandlerDef(this, "controllers.BugReportController", "deleteReport", Seq(), "POST", """""", _prefix + """delete/report""")
)
                      

// @LINE:19
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.list(), HandlerDef(this, "controllers.BugReportController", "list", Seq(), "GET", """""", _prefix + """bug/list""")
)
                      

// @LINE:18
def newReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.newReport(), HandlerDef(this, "controllers.BugReportController", "newReport", Seq(), "GET", """""", _prefix + """newReport""")
)
                      
    
}
                          

// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
class ReverseUserController {
    

// @LINE:64
def goBack(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.goBack(), HandlerDef(this, "controllers.UserController", "goBack", Seq(), "POST", """""", _prefix + """goBack""")
)
                      

// @LINE:52
def addPost(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.addPost(), HandlerDef(this, "controllers.UserController", "addPost", Seq(), "POST", """""", _prefix + """addPost""")
)
                      

// @LINE:56
def searchUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.searchUser(), HandlerDef(this, "controllers.UserController", "searchUser", Seq(), "POST", """""", _prefix + """searchUser""")
)
                      

// @LINE:51
def homepage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.homepage(), HandlerDef(this, "controllers.UserController", "homepage", Seq(), "GET", """""", _prefix + """homepage""")
)
                      

// @LINE:63
def searchPost(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.searchPost(), HandlerDef(this, "controllers.UserController", "searchPost", Seq(), "POST", """""", _prefix + """searchPost""")
)
                      

// @LINE:66
def follow(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.follow(), HandlerDef(this, "controllers.UserController", "follow", Seq(), "POST", """""", _prefix + """follow""")
)
                      

// @LINE:61
def editPost(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.editPost(), HandlerDef(this, "controllers.UserController", "editPost", Seq(), "POST", """""", _prefix + """editPost""")
)
                      

// @LINE:57
def addComment(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.addComment(), HandlerDef(this, "controllers.UserController", "addComment", Seq(), "POST", """""", _prefix + """addComment""")
)
                      

// @LINE:54
def sharePost(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.sharePost(), HandlerDef(this, "controllers.UserController", "sharePost", Seq(), "POST", """""", _prefix + """sharePost""")
)
                      

// @LINE:67
def unFollow(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.unFollow(), HandlerDef(this, "controllers.UserController", "unFollow", Seq(), "POST", """""", _prefix + """unFollow""")
)
                      

// @LINE:50
def mainpage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.mainpage(), HandlerDef(this, "controllers.UserController", "mainpage", Seq(), "GET", """# Self""", _prefix + """mainpage""")
)
                      

// @LINE:58
def allComment(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.allComment(id), HandlerDef(this, "controllers.UserController", "allComment", Seq(classOf[Long]), "GET", """""", _prefix + """allComment/$id<[^/]+>""")
)
                      

// @LINE:60
def editUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.editUser(), HandlerDef(this, "controllers.UserController", "editUser", Seq(), "GET", """""", _prefix + """editUser""")
)
                      

// @LINE:59
def editProfile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.editProfile(), HandlerDef(this, "controllers.UserController", "editProfile", Seq(), "GET", """""", _prefix + """editProfile""")
)
                      

// @LINE:55
def likePost(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.likePost(), HandlerDef(this, "controllers.UserController", "likePost", Seq(), "POST", """""", _prefix + """likePost""")
)
                      

// @LINE:53
def deletePost(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.deletePost(), HandlerDef(this, "controllers.UserController", "deletePost", Seq(), "POST", """""", _prefix + """deletePost""")
)
                      

// @LINE:65
def visitFollowee(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.visitFollowee(), HandlerDef(this, "controllers.UserController", "visitFollowee", Seq(), "POST", """""", _prefix + """visitFollowee""")
)
                      

// @LINE:68
def sendLocation(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.sendLocation(), HandlerDef(this, "controllers.UserController", "sendLocation", Seq(), "POST", """""", _prefix + """sendLocation""")
)
                      
    
}
                          

// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
class ReverseApplication {
    

// @LINE:12
def createNewUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createNewUser(), HandlerDef(this, "controllers.Application", "createNewUser", Seq(), "GET", """""", _prefix + """createNewUser""")
)
                      

// @LINE:13
def createSuccess(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createSuccess(), HandlerDef(this, "controllers.Application", "createSuccess", Seq(), "GET", """""", _prefix + """createSuccess""")
)
                      

// @LINE:14
def isEmailExisted(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.isEmailExisted(), HandlerDef(this, "controllers.Application", "isEmailExisted", Seq(), "POST", """""", _prefix + """isEmailExisted""")
)
                      

// @LINE:11
def signup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signup(), HandlerDef(this, "controllers.Application", "signup", Seq(), "GET", """""", _prefix + """signup""")
)
                      

// @LINE:9
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:10
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq(), "GET", """""", _prefix + """authenticate""")
)
                      

// @LINE:8
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      
    
}
                          

// @LINE:43
// @LINE:42
// @LINE:41
class ReverseDatasetController {
    

// @LINE:43
def getSearchResult(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DatasetController.getSearchResult(), HandlerDef(this, "controllers.DatasetController", "getSearchResult", Seq(), "GET", """""", _prefix + """climate/getSearchResult""")
)
                      

// @LINE:42
def searchDataset(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DatasetController.searchDataset(), HandlerDef(this, "controllers.DatasetController", "searchDataset", Seq(), "GET", """""", _prefix + """climate/searchDataSet""")
)
                      

// @LINE:41
def datasetList(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DatasetController.datasetList(), HandlerDef(this, "controllers.DatasetController", "datasetList", Seq(), "GET", """Keyword search""", _prefix + """climate/datasets""")
)
                      
    
}
                          

// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:7
// @LINE:6
class ReverseClimateServiceController {
    

// @LINE:38
def addClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.addClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "addClimateServices", Seq(), "GET", """""", _prefix + """climate/new/climateServices""")
)
                      

// @LINE:31
def mostRecentlyAddedClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.mostRecentlyAddedClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostRecentlyAddedClimateServices", Seq(), "GET", """""", _prefix + """climate/mostRecentlyAddedClimateServices""")
)
                      

// @LINE:37
def editClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.editClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "editClimateService", Seq(), "POST", """""", _prefix + """climate/edit/climateServices""")
)
                      

// @LINE:33
def mostPopularClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.mostPopularClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostPopularClimateServices", Seq(), "GET", """""", _prefix + """climate/mostPopularClimateServices""")
)
                      

// @LINE:29
def tutorial(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.tutorial(), HandlerDef(this, "controllers.ClimateServiceController", "tutorial", Seq(), "GET", """""", _prefix + """climate/tutorial""")
)
                      

// @LINE:39
def oneService(url:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.oneService(url), HandlerDef(this, "controllers.ClimateServiceController", "oneService", Seq(classOf[String]), "GET", """""", _prefix + """climate/oneService""")
)
                      

// @LINE:36
def downloadClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.downloadClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "downloadClimateService", Seq(), "POST", """""", _prefix + """climate/download/climateServices""")
)
                      

// @LINE:32
def mostRecentlyUsedClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.mostRecentlyUsedClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostRecentlyUsedClimateServices", Seq(), "GET", """""", _prefix + """climate/mostRecentlyUsedClimateServices""")
)
                      

// @LINE:30
def climateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.climateServices(), HandlerDef(this, "controllers.ClimateServiceController", "climateServices", Seq(), "GET", """""", _prefix + """climate/climateServices""")
)
                      

// @LINE:34
def newClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.newClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "newClimateService", Seq(), "POST", """""", _prefix + """climate/new/climateServices""")
)
                      

// @LINE:6
def home(email:String, vfile:String, dataset:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.home(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "home", Seq(classOf[String], classOf[String], classOf[String]), "GET", """ Home page""", _prefix + """home""")
)
                      

// @LINE:35
def deleteClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.deleteClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "deleteClimateService", Seq(), "POST", """""", _prefix + """climate/delete/climateServices""")
)
                      
    
}
                          
}
        
    