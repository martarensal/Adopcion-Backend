package AdopcionAnimales.requests;

import AdopcionAnimales.animals.Animal;
import AdopcionAnimales.users.User;
import io.swagger.models.auth.In;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
public class Request {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String type;
    private String status;
    private OffsetDateTime startDate;
    private OffsetDateTime endDate;

    @ManyToOne
    private User user;
    @ManyToOne
    private Animal animal;

    public Request(Long id, String type, String status, OffsetDateTime startDate, OffsetDateTime endDate, User user, Animal animal) {
        this.id = id;
        this.type = type;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
        this.user = user;
        this.animal = animal;
    }

    public Request(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public OffsetDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
    }

    public OffsetDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(OffsetDateTime endDate) {
        this.endDate = endDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
