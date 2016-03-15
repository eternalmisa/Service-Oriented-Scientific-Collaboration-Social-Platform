/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.*;
import java.net.URLEncoder;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import models.Post;
import models.Comment;
import models.User;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import models.metadata.ClimateService;
import play.Logger;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.Json;
import play.mvc.*;
import util.Constants;
import util.APICall;
import util.APICall.ResponseType;
import views.html.climate.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.*;
import org.xml.sax.SAXException;



public class UserController extends Controller {
    final static Form<Post> postForm = Form.form(Post.class);
    final static Form<Comment> commentForm = Form.form(Comment.class);
    final static Form<User> userForm = Form.form(User.class);
    private static List<User> searchUserResult = new ArrayList<User>();
    static boolean searchFlag = false;
    static List<Post> searchPostResult;
    static List<Post> posts = new ArrayList<Post>();
    static String homepageUserId = null;
    static String location = "";

    public static Result homepage() {
        return ok(homepage.render(allSelfPost(),commentForm,userInfo()));
    }

    public static Result mainpage() {
        User user = new User();
        user.setUserName("Test User Here!!!");
        System.out.println("The userId for the mainpage is: "+session("userId"));

        return ok(mainpage.render(allPost(),postForm,commentForm,user,searchUserResult,allFollowee(),allFollower()));
    }

    public static Result addPost() {
        Form<Post> np = postForm.bindFromRequest();
        ObjectNode jsonData = Json.newObject();

        System.out.println(location);

        try{
            jsonData.put("text", np.field("text").value());
            jsonData.put("visibility", np.field("visibility").value());
            jsonData.put("likes", "0");
            if (np.field("shareLocation").value().equals("share")) {
              jsonData.put("location", location);
            }
            jsonData.put("share", "0");
            jsonData.put("time","0");
            jsonData.put("postUserId", np.field("postUserId").value());
            jsonData.put("postUserFirstName",np.field("postUserFirstName").value());
            jsonData.put("postUserLastName",np.field("postUserLastName").value());

            JsonNode response = APICall.postAPI(Constants.URL_HOST + Constants.CMU_BACKEND_PORT
                    + Constants.ADD_POST, jsonData);
            Application.flashMsg(response);
        }catch (IllegalStateException e) {
            e.printStackTrace();
            Application.flashMsg(APICall
                    .createResponse(ResponseType.CONVERSIONERROR));
        } catch (Exception e) {
            e.printStackTrace();
            Application.flashMsg(APICall
                    .createResponse(ResponseType.UNKNOWN));
        }
        return redirect(routes.UserController.mainpage());
    }

    public static List<Post> allSelfPost() {

      System.out.println(session("userId"));
      System.out.println(homepageUserId);

        List<Post> postServices = new ArrayList<Post>();
        if (homepageUserId == null) {
          homepageUserId = session("userId");
        }
        //JsonNode postServicesNode = APICall.callAPI(Constants.GET_HOMEPAGE_POST_CALL+session("userId")+"/json");

        JsonNode postServicesNode = APICall.callAPI(Constants.GET_HOMEPAGE_POST_CALL+homepageUserId+"/json");
        if (postServicesNode == null || postServicesNode.has("error")
                || !postServicesNode.isArray()) {
            return postServices;
        }
        for (int i = 0; i < postServicesNode.size(); i++) {
            JsonNode json = postServicesNode.path(i);
            if (json.path("visibility").asText().equals("private")
                &&(
                    (homepageUserId != null)
                    &&(!session("userId").equals(homepageUserId)
                    )
                  )
                )
                continue;
            Post newPost = new Post();
            newPost.setId(json.path("id").asInt());
            newPost.setText(json.get("text").asText());
            newPost.setLikes(json.path("likes").asInt());

            newPost.setLocation(json.path("location").asText());
            newPost.setPostUserId(json.path("postUserId").asLong());
            newPost.setShare(json.path("share").asText());
            newPost.setVisibility(json.path("visibility").asText());
            newPost.setTime(json.path("time").asText());
            newPost.setPostUserFirstName(json.path("postUserFirstName").asText());
            newPost.setPostUserLastName(json.path("postUserLastName").asText());
            postServices.add(newPost);
        }
        return postServices;
    }

    public static List<Post> allPost() {
        List<Post> postServices = new ArrayList<Post>();
        if (searchFlag == true) {
          return postServices;
        }

        if (!(searchPostResult == null)) {
          return searchPostResult;
        }

        JsonNode postServicesNode = APICall.callAPI(Constants.GET_MAINPAGE_POST_CALL+session("userId")+"/json");
        if (postServicesNode == null || postServicesNode.has("error")
                || !postServicesNode.isArray()) {
            return postServices;
        }
        for (int i = 0; i < postServicesNode.size(); i++) {
            JsonNode json = postServicesNode.path(i);
            Post newPost = new Post();
            newPost.setId(json.path("id").asInt());
            newPost.setText(json.get("text").asText());
            newPost.setLikes(json.path("likes").asInt());
            newPost.setLocation(json.path("location").asText());
            newPost.setPostUserId(json.path("postUserId").asLong());
            newPost.setShare(json.path("share").asText());
            newPost.setVisibility(json.path("visibility").asText());
            newPost.setTime(json.path("time").asText());
            newPost.setPostUserFirstName(json.path("postUserFirstName").asText());
            newPost.setPostUserLastName(json.path("postUserLastName").asText());
            postServices.add(newPost);
        }

        return postServices;
    }

    public static List<User> allFollowee() {

        List<User>  allfollowees= new ArrayList<User>();
        JsonNode followeesNode = APICall.callAPI(Constants.GET_ALL_FOLLOWEE_CALL+session("userId")+"/json");
        if (followeesNode == null || followeesNode.has("error")
                || !followeesNode.isArray()) {

            return allfollowees;
        }
        for (int i = 0; i < followeesNode.size(); i++) {
            JsonNode json = followeesNode.path(i);
            User newUser = new User();
            newUser.setId(json.path("id").asInt());
            newUser.setFirstName(json.path("firstName").asText());
            newUser.setLastName(json.path("lastName").asText());
            allfollowees.add(newUser);
        }


        return allfollowees;
    }

    public static List<User> allFollower() {

        List<User>  allfollowers= new ArrayList<User>();
        JsonNode followersNode = APICall.callAPI(Constants.GET_ALL_FOLLOWER_CALL+session("userId")+"/json");
        if (followersNode == null || followersNode.has("error")
                || !followersNode.isArray()) {
            return allfollowers;
        }
        for (int i = 0; i < followersNode.size(); i++) {
            JsonNode json = followersNode.path(i);
            User newUser = new User();
            newUser.setId(json.path("id").asInt());
            newUser.setFirstName(json.path("firstName").asText());
            newUser.setLastName(json.path("lastName").asText());
            allfollowers.add(newUser);
        }


        return allfollowers;
    }




    public static Result searchUser() throws UnsupportedEncodingException {
        searchFlag = true;
        ObjectNode jsonData = Json.newObject();
        JsonNode json = request().body().asJson();

        jsonData.put("userKeyword", json.path("userKeyword"));

        JsonNode response = APICall.postAPI(Constants.URL_HOST + Constants.CMU_BACKEND_PORT
                + "/users/search", jsonData);

        Application.flashMsg(response);

        searchUserResult.clear();
        for (int i = 0; i < response.size(); i++) {
            JsonNode jsonRes = response.path(i);
            User u = new User();
            u.setUserName(jsonRes.path("userName").asText());
            u.setId(Long.parseLong(jsonRes.path("id").asText()));
            searchUserResult.add(u);
        }
        return redirect(routes.UserController.mainpage());
    }

    public static Result searchPost() throws UnsupportedEncodingException {

        ObjectNode jsonData = Json.newObject();
        JsonNode json = request().body().asJson();

        String keyWords = json.path("postKeyword").asText();
        String[] keywordList = keyWords.split(" ");

        List<Post> candidates = allPost();
        searchPostResult = new ArrayList<Post>();
        for (int i=0; i<candidates.size(); i++) {
            Post p = candidates.get(i);
            for (int j=0; j<keywordList.length; j++) {
                String k = keywordList[j];

                if (p.getText().toLowerCase().contains(k.toLowerCase())) {
                  searchPostResult.add(p);
                  break;
                }
            }
        }

        return redirect(routes.UserController.mainpage());
    }

    public static Result sendLocation() throws Exception {

        ObjectNode jsonData = Json.newObject();
        JsonNode json = request().body().asJson();

        String latitude = json.path("latitude").asText();
        String longitude = json.path("longtitude").asText();

        String url = "http://maps.googleapis.com/maps/api/geocode/xml"
            + "?latlng=" + latitude + "," + longitude + "&sensor=false";
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(new URL(url).openStream());

        NodeList nodeList = doc.getDocumentElement().getChildNodes();
        Node node = nodeList.item(3);
        NodeList addComponents = node.getChildNodes();
        Node addComponent = addComponents.item(11);
        NodeList cityInfo = addComponent.getChildNodes();
        Node city = cityInfo.item(1);
        location = city.getTextContent();

        return redirect(routes.UserController.mainpage());
    }

    public static Result goBack() throws UnsupportedEncodingException {
        searchFlag = false;
        searchUserResult.clear();
        searchPostResult = null;
        return redirect(routes.UserController.mainpage());
    }

    public static Result sharePost() throws UnsupportedEncodingException {
        ObjectNode jsonData = Json.newObject();
        JsonNode json = request().body().asJson();
        jsonData.put("text", "");
        jsonData.put("visibility", "public");
        jsonData.put("likes", "0");
        jsonData.put("location", "pittsburgh");
        jsonData.put("share", "0");
        jsonData.put("time","0");
        jsonData.put("postUserId", json.path("postUserId"));
        jsonData.put("postUserFirstName",json.path("postUserFirstName"));
        jsonData.put("postUserLastName",json.path("postUserLastName"));
        jsonData.put("origPostId", json.path("postId").asText());
        JsonNode response = APICall.postAPI(Constants.URL_HOST + Constants.CMU_BACKEND_PORT
                    + "/posts/share", jsonData);
        Application.flashMsg(response);
        return ok(response);
    }

    public static Result deletePost() throws UnsupportedEncodingException {

        if (homepageUserId!=null && !(session("userId").equals(homepageUserId))) {
            return redirect(routes.UserController.homepage());
        }
        JsonNode json = request().body().asJson();
        String postId = json.path("postId").asText();
        JsonNode response = APICall.deleteAPI(Constants.DELETE_POST_CALL + URLEncoder.encode(postId, "UTF-8"));
        Application.flashMsg(response);
        return ok(response);
    }

    public static Result likePost() throws UnsupportedEncodingException {
        JsonNode json = request().body().asJson();
        ObjectNode jsonData = Json.newObject();
        String postId = json.path("postId").asText();
        jsonData.put("id", postId);
        JsonNode response = APICall.putAPI(Constants.UPDATE_POST_LIKE_CALL + URLEncoder.encode(postId, "UTF-8"), jsonData);
        Application.flashMsg(response);
        return ok(response);
    }

    public static Result addComment() {
        Form<Comment> np = commentForm.bindFromRequest();
        ObjectNode jsonData = Json.newObject();
        String homepageFlag = null;
        try{
            homepageFlag = np.field("homepageflag").value();
            jsonData.put("text", np.field("text").value());
            jsonData.put("time","0");
            jsonData.put("postId", np.field("postId").value());
            jsonData.put("commentUserId", np.field("commentUserId").value());

            JsonNode response = APICall.postAPI(Constants.URL_HOST + Constants.CMU_BACKEND_PORT
                    + Constants.ADD_COMMENT, jsonData);

            Application.flashMsg(response);
        }catch (IllegalStateException e) {
            e.printStackTrace();
            Application.flashMsg(APICall
                    .createResponse(ResponseType.CONVERSIONERROR));
        } catch (Exception e) {
            e.printStackTrace();
            Application.flashMsg(APICall
                    .createResponse(ResponseType.UNKNOWN));
        }

        if (homepageFlag != null && homepageFlag.equals("homepageflag")){
          return redirect(routes.UserController.homepage());
        }
        return redirect(routes.UserController.mainpage());
    }

    public static Result allComment(Long postId) {
        String id = String.valueOf(postId);
        JsonNode commentServicesNode = APICall.callAPI(Constants.GET_COMMENT_CALL+id+"/json");
        Application.flashMsg(commentServicesNode);
        return ok(commentServicesNode);
    }

    public static Result editProfile() {
        homepageUserId = session("userId");
        return ok(editProfile.render(userForm,userInfo()));
    }

    public static Result editUser(){
        Form<User> np = userForm.bindFromRequest();
        ObjectNode jsonData = Json.newObject();
        try{
            System.out.println(np.field("affiliation").value().length()!=0);

            jsonData.put("affiliation", np.field("affiliation").value());
            jsonData.put("title", np.field("title").value());
            jsonData.put("mailingAddress", np.field("mailingAddress").value());
            jsonData.put("phoneNumber", np.field("phoneNumber").value());
            jsonData.put("faxNumber", np.field("faxNumber").value());
            jsonData.put("researchFields", np.field("researchFields").value());
            jsonData.put("highestDegree", np.field("highestDegree").value());
            JsonNode response = APICall.putAPI(Constants.URL_HOST + Constants.CMU_BACKEND_PORT
                    + Constants.Edit_USER+session("userId"), jsonData);
            Application.flashMsg(response);
            return redirect(routes.UserController.homepage());
        }catch (IllegalStateException e) {
            e.printStackTrace();
            Application.flashMsg(APICall
                    .createResponse(ResponseType.CONVERSIONERROR));
        } catch (Exception e) {
            e.printStackTrace();
            Application.flashMsg(APICall
                    .createResponse(ResponseType.UNKNOWN));
        }
        return redirect(routes.UserController.homepage());
    }

    public static Result editPost() throws UnsupportedEncodingException {

        if (homepageUserId!=null && !(session("userId").equals(homepageUserId))) {
            return redirect(routes.UserController.homepage());
        }
        ObjectNode jsonData = Json.newObject();
        JsonNode json = request().body().asJson();
        String postId = json.path("postId").asText();
        jsonData.put("id", json.path("postId"));
        jsonData.put("text", json.path("text"));
        String text = json.path("text").asText();

        JsonNode response = APICall.putAPI(Constants.NEW_BACKEND+"posts/updatePostTextById/id/"
        + URLEncoder.encode(postId, "UTF-8"), jsonData);
        Application.flashMsg(response);

        return ok(response);
    }

    public static User userInfo() {
        JsonNode userInformation =APICall.callAPI(Constants.GET_USER_INFO+homepageUserId);
        if (userInformation == null || userInformation.has("error")) {
            return null;
        }
        User editUser = new User();
        System.out.println(userInformation);
        editUser.setEmail(userInformation.path("email").asText());
        editUser.setFirstName(userInformation.path("firstName").asText());
        editUser.setLastName(userInformation.path("lastName").asText());
        editUser.setAffiliation(userInformation.path("affiliation").asText());
        editUser.setFaxNumber(userInformation.path("faxNumber").asText());
        editUser.setHighestDegree(userInformation.path("highestDegree").asText());
        editUser.setMailingAddress(userInformation.path("mailingAddress").asText());
        editUser.setPhoneNumber(userInformation.path("phoneNumber").asText());
        editUser.setTitle(userInformation.path("title").asText());
        editUser.setResearchFields(userInformation.path("researchFields").asText());
        return editUser;
    }

    public static Result visitFollowee(){
      searchFlag = false;
      searchUserResult.clear();
      searchPostResult = null;
      System.out.println("Visit Called!---------------------------------");
        Form<User> userForm = Form.form(User.class);
        Form<User> np = userForm.bindFromRequest();
        System.out.println("The user id of the user whose homepage to visit is: "+np.field("followeeId").value());
        homepageUserId = np.field("followeeId").value();
        return redirect(routes.UserController.homepage());
    }

    public static Result follow(){

        if (homepageUserId==null || session("userId").equals(homepageUserId)) {
            return redirect(routes.UserController.mainpage());
        }

        ObjectNode jsonData = Json.newObject();
        jsonData.put("userId", homepageUserId);
        jsonData.put("followerId",session("userId"));

        JsonNode response = APICall.postAPI(Constants.URL_HOST + Constants.CMU_BACKEND_PORT
                + "/followers/add", jsonData);

        Application.flashMsg(response);
        return redirect(routes.UserController.homepage());
    }

    public static Result unFollow(){

        if (homepageUserId==null || session("userId").equals(homepageUserId)) {
            return redirect(routes.UserController.mainpage());
        }

        ObjectNode jsonData = Json.newObject();
        jsonData.put("userId", homepageUserId);
        jsonData.put("followerId",session("userId"));

        JsonNode response = APICall.postAPI(Constants.URL_HOST + Constants.CMU_BACKEND_PORT
                + "/followers/delete", jsonData);

        Application.flashMsg(response);
        return redirect(routes.UserController.homepage());
    }



}
