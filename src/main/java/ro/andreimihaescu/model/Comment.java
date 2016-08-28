package ro.andreimihaescu.model;

import javax.persistence.*;

@Entity
@Table(name = "comments")
@NamedQueries(
        @NamedQuery(name = "findCommentByMovieId" , query = "from Comment c where c.movieId = :movieId")
)
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;
    private Long movieId;
    private String text;

    public Comment() {
    }

    public Comment(String userName, Long movieId, String text) {
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
}
