package ro.andreimihaescu.repository;

import ro.andreimihaescu.model.Comment;

import java.util.List;

public interface CommentRepoCustom {

    List<Comment> findCommentByMovieId(Long movieId);
}
