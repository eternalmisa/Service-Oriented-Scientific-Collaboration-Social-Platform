package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Follower {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long userId;
	private long followerId;
	
	public Follower() {
	}

	public Follower(long userId, long followerId) {
		super();
		this.userId = userId;
		this.followerId = followerId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getFollowerId() {
		return followerId;
	}

	public void setFollowerId(long followerId) {
		this.followerId = followerId;
	}

	@Override
	public String toString() {
		return "Follower [id=" + id + ", userId=" + userId + ", followerId="
				+ followerId + "]";
	}
}
