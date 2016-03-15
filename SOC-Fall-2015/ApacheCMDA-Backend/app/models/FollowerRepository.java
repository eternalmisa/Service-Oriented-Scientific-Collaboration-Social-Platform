package models;

import java.util.List;

import javax.inject.Named;
import javax.inject.Singleton;

import org.springframework.data.repository.CrudRepository;

@Named
@Singleton
public interface FollowerRepository extends CrudRepository<Follower, Long> {
	List<Follower> findByUserId(long userId);
	List<Follower> findByFollowerId(long followerId);
}
