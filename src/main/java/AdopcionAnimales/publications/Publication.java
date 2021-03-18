package AdopcionAnimales.publications;

import AdopcionAnimales.users.User;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
public class Publication {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private OffsetDateTime publicationDate;

    @ManyToOne
    private User user;

    public Publication(OffsetDateTime publicationDate){
        this.publicationDate = publicationDate;
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
}
