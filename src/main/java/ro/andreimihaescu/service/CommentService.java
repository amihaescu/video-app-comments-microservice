package ro.andreimihaescu.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.andreimihaescu.dto.CommentDTO;
import ro.andreimihaescu.model.Comment;
import ro.andreimihaescu.repository.CommentRepo;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentService {

    @Autowired
    private CommentRepo commentRepo;


    public void addComment(CommentDTO commentDTO) {
        commentRepo.save(commentDTO.toCommentEntity());
    }

    public List<Comment> getCommentsForMovieId(Long movieId){
        return commentRepo.findCommentByMovieId(movieId).stream().sorted(Comparator.comparingLong(Comment::getId).reversed()).collect(Collectors.toList());
    }
}
