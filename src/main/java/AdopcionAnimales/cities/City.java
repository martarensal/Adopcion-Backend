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
    private String province;
    private String autonomous_community;

    @OneToMany(mappedBy = "city")
    private Set<Animal> animals;

    public City(String name,String province, String autonomousCommunity){
        this.name = name;
        this.province = province;
        this.autonomous_community = autonomousCommunity;
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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getAutonomousCommunity() {
        return autonomous_community;
    }

    public void setAutonomousCommunity(String autonomousCommunity) {
        this.autonomous_community = autonomousCommunity;
    }

    public Set<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(Set<Animal> animals) {
        this.animals = animals;
    }
}
