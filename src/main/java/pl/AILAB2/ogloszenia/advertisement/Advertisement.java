package pl.AILAB2.ogloszenia.advertisement;

import pl.AILAB2.ogloszenia.categories.Categories;
import pl.AILAB2.ogloszenia.user.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "advertisement")
public class Advertisement {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String title;

    @NotNull
    private String description;

    @NotNull
    private Date date;

    @ManyToOne
    private User user;

    @ManyToOne
    private Categories category;

    public Advertisement() {
    }

    public Advertisement(Long id, @NotNull String title, @NotNull String description, @NotNull Date date) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }
}
