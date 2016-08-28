package ro.andreimihaescu.dto;


import ro.andreimihaescu.model.Comment;

public class CommentDTO {

    private Long id;
    private String userName;
    private Long movieId;
    private String text;

    public CommentDTO() {
    }

    CommentDTO(Long id, String userName, Long movieId, String text) {
        this.id = id;
        this.userName = userName;
        this.movieId = movieId;
        this.text = text;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Comment toCommentEntity() {
        return new Comment(userName, movieId, text);
    }

    public static CommentDTO toCommentDTO(Comment comment) {
        return new CommentDTO(comment.getId(), comment.getUserName(), comment.getMovieId(), comment.getText());
    }
}
