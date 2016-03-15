package controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.PersistenceException;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;

import models.Follower;
import models.FollowerRepository;
import models.Post;
import models.PostRepository;
import models.UserRepository;
import play.mvc.Controller;
import play.mvc.Result;

@Named
@Singleton
public class PostController extends Controller {
	private final PostRepository postRepository;
	private final FollowerRepository followerRepository;
	private final UserRepository userRepository;

	@Inject
	public PostController(final PostRepository postRepository,
			final FollowerRepository followerRepository,
			final UserRepository userRepository) {
		this.postRepository = postRepository;
		this.followerRepository = followerRepository;
		this.userRepository = userRepository;
	}

	public Result addPost() {
		JsonNode json = request().body().asJson();
		if (json == null) {
			System.out.println("Post not created, expecting Json data");
			return badRequest("Post not created, expecting Json data");
		}

		// Parse JSON file
		String visibility = json.path("visibility").asText();
		String text = json.path("text").asText();
		String likes = json.path("likes").asText();
		String location = json.path("location").asText();
		String postUserId = json.path("postUserId").asText();
		String postUserFirstName = json.path("postUserFirstName").asText();
		String postUserLastName = json.path("postUserLastName").asText();
		String share = json.path("share").asText();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = df.format(new Date());

		try {
					Post post = new Post(visibility, text, Integer.valueOf(likes),
					location, Long.valueOf(postUserId), share, time,
					postUserFirstName, postUserLastName);
					postRepository.save(post);
					return created(new Gson().toJson(post.getId()));
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			System.out.println("Post not saved: " + postUserId + ": " + text);
			return badRequest("Post not saved: " + postUserId + ": " + text);
		}
	}

	public Result sharePost() {
		JsonNode json = request().body().asJson();
		if (json == null) {
			System.out.println("Post not created, expecting Json data");
			return badRequest("Post not created, expecting Json data");
		}

		Long origPostId = Long.parseLong(json.path("origPostId").asText());
		Post origPost = postRepository.findOne(origPostId);
		String origName = origPost.getPostUserFirstName() + " " + origPost.getPostUserLastName();
		String origText = origPost.getText();
		String text = "Share from " + origName + ": " + origText;
		// Parse JSON file
		String visibility = json.path("visibility").asText();
		String likes = json.path("likes").asText();
		String location = json.path("location").asText();
		String postUserId = json.path("postUserId").asText();
		String postUserFirstName = json.path("postUserFirstName").asText();
		String postUserLastName = json.path("postUserLastName").asText();
		String share = json.path("share").asText();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = df.format(new Date());

		try {
			Post post = new Post(visibility, text, Integer.valueOf(likes),
					location, Long.valueOf(postUserId), share, time,
					postUserFirstName, postUserLastName);

					postRepository.save(post);

					return created(new Gson().toJson(post.getId()));
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			System.out.println("Post not saved: " + postUserId + ": " + text);
			return badRequest("Post not saved: " + postUserId + ": " + text);
		}
	}

	public Result deletePost(Long id) {
		Post deletePost = postRepository.findOne(id);
		if (deletePost == null) {
			System.out.println("Post not found with id: " + id);
			return notFound("Post not found with id: " + id);
		}

		postRepository.delete(deletePost);
		System.out.println("Post is deleted: " + id);
		return ok("Post is deleted: " + id);
	}

	public Result getAllPostsByPostUserId(Long postUserId, String format) {
		if (postUserId == null) {
			System.out.println("User id is null or empty!");
			return badRequest("User id is null or empty!");
		}

		List<Post> allPosts = postRepository.findByPostUserId(postUserId);

		try {
			allPosts = sortByTime(allPosts);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		if (allPosts.size() == 0) {
			System.out.println("Post not found with id: " + postUserId);
			return notFound("Post not found with id: " + postUserId);
		}
		String result = new String();
		if (format.equals("json")) {
			result = new Gson().toJson(allPosts);
		}

		return ok(result);
	}

	public Result getAllPostsByUserId(Long userId, String format) {
		if (userId == null) {
			System.out.println("User id is null or empty!");
			return badRequest("User id is null or empty!");
		}

		FollowerController followerController = new FollowerController(followerRepository, userRepository);
		List<Follower> allFollowees = followerController.getAllFolloweesByFollowerId(userId);

		// Find all posts of the user
		List<Post> allPosts = postRepository.findByPostUserId(userId);

		if (allFollowees != null) {
			// Find all posts of the user's followees
			for (int i = 0; i < allFollowees.size(); i++) {
				long followeeId = allFollowees.get(i).getUserId();
				List<Post> posts = postRepository.findByPostUserId(followeeId);
				allPosts.addAll(posts);
			}
		}

		if (allPosts != null) {
			// Filter out private posts
			for (int i = 0; i < allPosts.size(); i++) {
				if (allPosts.get(i).getVisibility().equals("private")) {
					allPosts.remove(i);
				}
			}

			// Sort all posts
			try {
				allPosts = sortByTime(allPosts);
			} catch (ParseException e) {
				e.printStackTrace();
			}

			if (allPosts.size() == 0) {
				System.out.println("Post not found with id: " + userId);
				return notFound("Post not found with id: " + userId);
			}
		}

		String result = new String();
		if (format.equals("json")) {
			result = new Gson().toJson(allPosts);
		}

		return ok(result);
	}

	public Result updatePostTextById(long id) {
		JsonNode json = request().body().asJson();
		if (json == null) {
			System.out.println("Post not saved, expecting Json data");
			return badRequest("Post Configuration not saved, expecting Json data");
		}

		String text = json.findPath("text").asText();

		try {
			Post post = postRepository.findOne(id);
			post.setText(text);
			Post savedPost = postRepository.save(post);

			System.out.println("Post updated: " + savedPost.getId());
			return created("Post updated: " + savedPost.getId());
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			System.out.println("Post not saved: " + id);
			return badRequest("Post not saved: " + id);
		}
	}

	public Result updatePostLikesById(long id) {
		JsonNode json = request().body().asJson();
		if (json == null) {
			System.out.println("Post not saved, expecting Json data");
			return badRequest("Post Configuration not saved, expecting Json data");
		}

		try {
			Post post = postRepository.findOne(id);
			int likes = post.getLikes();
			likes = likes + 1;
			post.setLikes(likes);
			Post savedPost = postRepository.save(post);

			System.out.println("Post updated: " + savedPost.getId());
			return created("Post updated: " + savedPost.getId());
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			System.out.println("Post not saved: " + id);
			return badRequest("Post not saved: " + id);
		}
	}

	private List<Post> sortByTime(List<Post> allPosts) throws ParseException {
		System.setProperty("java.util.Arrays.useLegacyMergeSort", "true");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Collections.sort(allPosts, new Comparator<Post>() {
			public int compare(Post post1, Post post2) {
				try {
					Date date1 = df.parse(post1.getTime());
					Date date2 = df.parse(post2.getTime());
					if (date1.compareTo(date2) < 0)
						return 1;
					else
						return -1;
				} catch (ParseException e) {
					e.printStackTrace();
					return 0;
				}
			}
		});
		return allPosts;
	}
}
