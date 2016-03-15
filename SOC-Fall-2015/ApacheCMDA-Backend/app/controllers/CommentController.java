package controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.PersistenceException;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;

import models.Comment;
import models.CommentRepository;
import models.UserRepository;
import models.User;
import play.mvc.Controller;
import play.mvc.Result;

import static util.Common.DATE_PATTERN;

@Named
@Singleton
public class CommentController extends Controller{
	private final CommentRepository commentRepository;
	private final UserRepository userRepository;

	@Inject
	public CommentController(final CommentRepository commentRepository, final UserRepository userRepository) {
		this.commentRepository = commentRepository;
		this.userRepository = userRepository;
	}

	public Result addComment() {
		JsonNode json = request().body().asJson();
		if (json == null) {
			System.out.println("Comment not created, expecting Json data");
			return badRequest("Comment not created, expecting Json data");
		}

		// Parse JSON file
		String text = json.path("text").asText();
		String postId = json.path("postId").asText();
		String commentUserId = json.path("commentUserId").asText();
		Long id = Long.parseLong(commentUserId);
		User user = userRepository.findOne(id);
		String commentUserFirstName = user.getFirstName();
		String commentUserLastName = user.getLastName();
		SimpleDateFormat df = new SimpleDateFormat(DATE_PATTERN);
		String time = df.format(new Date());

		try {
			Comment comment = new Comment(text, Long.valueOf(postId), Long.valueOf(commentUserId),
					commentUserFirstName, commentUserLastName, time);
			commentRepository.save(comment);
			return created(new Gson().toJson(comment.getId()));
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			System.out.println("Comment not saved: " + commentUserId + ", " + postId + ": " + text);
			return badRequest("Comment not saved: " + commentUserId + ", " + postId + ": " + text);
		}
	}

	public Result getAllCommentsByPostId(Long postId, String format) {
		if (postId == null) {
			System.out.println("Post id is null or empty!");
			return badRequest("Post id is null or empty!");
		}

		List<Comment> allComments = commentRepository.findByPostId(postId);

		if (allComments.size() == 0) {
			System.out.println("Comment not found with id: " + postId);
			return notFound("Comment not found with id: " + postId);
		}
		String result = new String();
		if (format.equals("json")) {
			result = new Gson().toJson(allComments);
		}
		return ok(result);
	}

	public Result deleteAllCommentsByPostId(Long postId) {
		if (postId == null) {
			System.out.println("Post id is null or empty!");
			return badRequest("Post id is null or empty!");
		}

		List<Comment> allComments = commentRepository.findByPostId(postId);

		if (allComments.size() == 0) {
			System.out.println("Comment not found with id: " + postId);
			return notFound("Comment not found with id: " + postId);
		}

		commentRepository.delete(allComments);
		System.out.println("All comments of post " + postId + "are deleted!");
		return ok("All comments of post " + postId + "are deleted!");
	}
}
