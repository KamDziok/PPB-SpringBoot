package pl.AILAB2.ogloszenia.comment;

import pl.AILAB2.ogloszenia.advertisement.Advertisement;
import pl.AILAB2.ogloszenia.user.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Comment {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private Date date;

    @NotNull
    private String contents;

    @ManyToOne
    private Advertisement advertisement;

    @ManyToOne
    private User user;

    public Comment() {
    }

    public Comment(Long id, @NotNull Date date, @NotNull String contents) {
        this.id = id;
        this.date = date;
        this.contents = contents;
    }

    public Comment(Long id, @NotNull Date date, @NotNull String contents, Advertisement advertisement, User user) {
        this.id = id;
        this.date = date;
        this.contents = contents;
        this.advertisement = advertisement;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Advertisement getAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(Advertisement advertisement) {
        this.advertisement = advertisement;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
