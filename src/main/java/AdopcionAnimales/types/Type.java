package AdopcionAnimales.types;

import AdopcionAnimales.animals.Animal;
import AdopcionAnimales.requests.Request;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Type {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String name;

    @OneToMany(mappedBy = "type")
    private Set<Animal> animals;

    public Type(Long id, String name, Set<Animal> animals){
        this.id = id;
        this.name= name;
        this.animals = animals;
    }
    public Type(){}

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(Set<Animal> animals) {
        this.animals = animals;
    }
}
