package AdopcionAnimales.types;

import AdopcionAnimales.animals.Animal;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Type {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @OneToMany
    private Set<Animal> animals;

    public Type(){}
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Set<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(Set<Animal> animals) {
        this.animals = animals;
    }
}
