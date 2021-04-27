package AdopcionAnimales.animals;

import AdopcionAnimales.cities.City;
import AdopcionAnimales.requests.Request;
import AdopcionAnimales.types.Type;
import AdopcionAnimales.users.User;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Animal {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String name;
    private int age;
    private String size;
    private String colour;
    private String sex;
    private String status;
    private String image;
    private Long idCity;

    public Long getIdCity() {
        return idCity;
    }

    public void setIdCity(Long idCity) {
        this.idCity = idCity;
    }


    @ManyToOne
    private User user;
    @OneToMany(mappedBy = "animal")
    private Set<Request> request;
    @ManyToOne
    private City city;
    @ManyToOne
    private Type type;

    public Animal(Long id, String name, int age, String size, String colour, String sex, String status, String image, User user, Set<Request> request, City city, Type type) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.size = size;
        this.colour = colour;
        this.sex = sex;
        this.status = status;
        this.image = image;
        this.user = user;
        this.request = request;
        this.city = city;
        this.type = type;
    }
    public Animal(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Request> getRequest() {
        return request;
    }

    public void setRequest(Set<Request> request) {
        this.request = request;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
