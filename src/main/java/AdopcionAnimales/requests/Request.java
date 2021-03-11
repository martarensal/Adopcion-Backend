package AdopcionAnimales.requests;

import AdopcionAnimales.animals.Animal;
import AdopcionAnimales.users.User;
import io.swagger.models.auth.In;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Request {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    private Integer typeRequest;
    private Integer status;
    private Date startDate;
    private Date endDate;

    @ManyToOne
    private User user;
    @ManyToOne
    private Animal animal;

    public Request(Integer typeRequest, Integer status, Date startDate, Date endDate){
        this.typeRequest = typeRequest;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Request(){}
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Integer getTypeRequest() {
        return typeRequest;
    }

    public void setTypeRequest(Integer typeRequest) {
        this.typeRequest = typeRequest;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public User getUser(){
        return user;
    }

    public void setUser(User user){
        this.user = user;
    }

    public Animal getAnimal(){
        return animal;
    }

    public void setAnimal(Animal animal){
        this.animal = animal;
    }
}
