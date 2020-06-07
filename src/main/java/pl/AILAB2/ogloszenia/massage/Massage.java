package pl.AILAB2.ogloszenia.massage;

import pl.AILAB2.ogloszenia.advertisement.Advertisement;
import pl.AILAB2.ogloszenia.user.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "massage")
public class Massage {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private Date date;

    @NotNull
    private String contents;

    @ManyToOne
    private User sender;

    @ManyToOne
    private User recipient;

    @ManyToOne
    private Advertisement advertisement;

    public Massage() {
    }

    public Massage(Long id, @NotNull Date date, @NotNull String contents) {
        this.id = id;
        this.date = date;
        this.contents = contents;
    }

    public Massage(Long id, @NotNull Date date, @NotNull String contents, User sender, User recipient, Advertisement advertisement) {
        this.id = id;
        this.date = date;
        this.contents = contents;
        this.sender = sender;
        this.recipient = recipient;
        this.advertisement = advertisement;
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

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getRecipient() {
        return recipient;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    public Advertisement getAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(Advertisement advertisement) {
        this.advertisement = advertisement;
    }
}
