package AdopcionAnimales.publications;

import AdopcionAnimales.users.User;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Publication {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    private Date publicationDate;

    @ManyToOne
    private User user;

    public Publication(Date publicationDate){
        this.publicationDate = publicationDate;
    }
    public Publication(){}

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
