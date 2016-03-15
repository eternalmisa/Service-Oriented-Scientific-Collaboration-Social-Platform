package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String visibility;
	private String text;
	private int likes;
	private String location;
	private long postUserId;
	private String share;
	private String time;
	private String postUserFirstName;
	private String postUserLastName;

	public Post() {
	}

	public Post(String visibility, String text, int likes,
			String location, long postUserId, String share, String time, 
			String postUserFirstName, String postUserLastName) {
		super();
		this.visibility = visibility;
		this.text = text;
		this.likes = likes;
		this.location = location;
		this.postUserId = postUserId;
		this.share = share;
		this.time = time;
		this.postUserFirstName = postUserFirstName;
		this.postUserLastName = postUserLastName;
	}

	public String getPostUserFirstName() {
		return postUserFirstName;
	}

	public void setPostUserFirstName(String postUserFirstName) {
		this.postUserFirstName = postUserFirstName;
	}

	public String getPostUserLastName() {
		return postUserLastName;
	}

	public void setPostUserLastName(String postUserLastName) {
		this.postUserLastName = postUserLastName;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	public String getShare() {
		return share;
	}

	public void setShare(String share) {
		this.share = share;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getPostUserId() {
		return postUserId;
	}

	public void setPostUserId(long postUserId) {
		this.postUserId = postUserId;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", visibility=" + visibility + ", text="
				+ text + ", likes=" + likes + ", location=" + location
				+ ", postUserId=" + postUserId + ", share=" + share + ", time="
				+ time + ", postUserFirstName=" + postUserFirstName
				+ ", postUserLastName=" + postUserLastName + "]";
	}

	
}
