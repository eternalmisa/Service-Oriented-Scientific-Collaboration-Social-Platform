package models;

import java.util.List;

import javax.inject.Named;
import javax.inject.Singleton;

import org.springframework.data.repository.CrudRepository;

@Named
@Singleton
public interface CommentRepository extends CrudRepository<Comment, Long> {
	List<Comment> findByPostId(long postId);
}
