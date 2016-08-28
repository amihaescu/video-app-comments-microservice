package ro.andreimihaescu.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.andreimihaescu.dto.CommentDTO;
import ro.andreimihaescu.service.CommentService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addCommentForMovie(@RequestBody CommentDTO commentDTO){
        commentService.addComment(commentDTO);
    }

    @RequestMapping(value = "/{videoId}")
    public List<CommentDTO> getCommentsForMovie(@PathVariable("videoId")Long videoId){
        return commentService.getCommentsForMovieId(videoId).stream().map(CommentDTO::toCommentDTO).collect(Collectors.toList());
    }
}
