package models;

import java.util.List;

import javax.inject.Named;
import javax.inject.Singleton;

import org.springframework.data.repository.CrudRepository;

@Named
@Singleton
public interface PostRepository extends CrudRepository<Post, Long> {
	List<Post> findByPostUserId(long postUserId);
}
