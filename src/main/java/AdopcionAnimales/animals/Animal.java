package AdopcionAnimales.animals;

import AdopcionAnimales.cities.City;
import AdopcionAnimales.requests.Request;
import AdopcionAnimales.types.Type;
import AdopcionAnimales.users.User;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Animal {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    private String name;
    private int age;
    /* 0 pequeño, 1 mediano, 2 grande */
    private Integer size;
    /* 0 marrón, 1 blanco, 2 negro, 3 beige, 4 naranja, 5 rojo, 6 verde, 7 azul, 8 amarillo*/
    private Integer colour;
    /* 0 hembra, 1 macho*/
    private Integer sex;
    /* 0 sin hogar, 1 adoptado, 2 acogido*/
    private Integer status;
    private String image;

    @ManyToOne
    private User user;
    @OneToMany(mappedBy = "animal")
    private Set<Request> request;
    @ManyToOne
    private City city;
    @ManyToOne
    private Type type;

    public Animal(String name, int age, Integer size, Integer colour, Integer sex, String image){
        this.name = name;
        this.age = age;
        this.size = size;
        this.colour = colour;
        this.sex = sex;
        this.image = image;
    }
    public Animal(){}
    public void setIdAnimal(Long id) {
        this.id = id;
    }

    public Long getIdAnimal() {
        return id;
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

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getColour() {
        return colour;
    }

    public void setColour(Integer colour) {
        this.colour = colour;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
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
