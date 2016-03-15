package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String text;
	private long postId;
	private long commentUserId;
	private String commentUserFirstName;
	private String commentUserLastName;
	private String time;
	
	public Comment() {
	}

	public Comment(String text, long postId, long commentUserId,
			String commentUserFirstName, String commentUserLastName, String time) {
		super();
		this.text = text;
		this.postId = postId;
		this.commentUserId = commentUserId;
		this.commentUserFirstName = commentUserFirstName;
		this.commentUserLastName = commentUserLastName;
		this.time = time;
	}



	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public long getPostId() {
		return postId;
	}

	public void setPostId(long postId) {
		this.postId = postId;
	}

	public long getCommentUserId() {
		return commentUserId;
	}

	public void setCommentUserId(long commentUserId) {
		this.commentUserId = commentUserId;
	}

	public String getCommentUserFirstName() {
		return commentUserFirstName;
	}

	public void setCommentUserFirstName(String commentUserFirstName) {
		this.commentUserFirstName = commentUserFirstName;
	}

	public String getCommentUserLastName() {
		return commentUserLastName;
	}

	public void setCommentUserLastName(String commentUserLastName) {
		this.commentUserLastName = commentUserLastName;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", text=" + text + ", postId=" + postId
				+ ", commentUserId=" + commentUserId
				+ ", commentUserFirstName=" + commentUserFirstName
				+ ", commentUserLastName=" + commentUserLastName + ", time="
				+ time + "]";
	}
}
