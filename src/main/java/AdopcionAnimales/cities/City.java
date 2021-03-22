package AdopcionAnimales.cities;

import AdopcionAnimales.animals.Animal;

import javax.persistence.*;
import java.util.Set;

@Entity
public class City {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String name;
    private String postalCode;
    private String country;

    @OneToMany(mappedBy = "city")
    private Set<Animal> animals;

    public City(String name,String postalCode, String country){
        this.name = name;
        this.postalCode = postalCode;
        this.country = country;
    }
    public City(){}

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Set<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(Set<Animal> animals) {
        this.animals = animals;
    }
}
