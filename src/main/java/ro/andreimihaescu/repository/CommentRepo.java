package ro.andreimihaescu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.andreimihaescu.model.Comment;

public interface CommentRepo extends JpaRepository<Comment, Long> , CommentRepoCustom{
}
