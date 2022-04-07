package AdopcionAnimales.publications;

import AdopcionAnimales.users.User;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
public class Publication {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private OffsetDateTime publicationDate;

    @ManyToOne
    private User user;

    private String image;
    private String description;

    public Publication(OffsetDateTime publicationDate, String image, String description){
        this.publicationDate = publicationDate;
        this.image = image;
        this.description = description;
    }
    public Publication(){}

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public OffsetDateTime getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(OffsetDateTime publicationDate) {
        this.publicationDate = publicationDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
