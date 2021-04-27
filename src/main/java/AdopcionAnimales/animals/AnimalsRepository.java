package AdopcionAnimales.animals;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalsRepository extends CrudRepository<Animal, Long>{

    @Query("select a from Animal a where a.user.username = :username")
    Page<Animal> getAnimalsFromUsers(@Param("username") String name, Pageable page);

    @Query("select a from Animal a ")
    Page<Animal> getAnimals(Pageable page);

    @Query("SELECT a FROM Animal a WHERE (:city_id is null or a.city = :city_id)" +
            "and (:age is null or a.age = :age) and (:colour is null or a.colour = :colour) " +
            "and (:size is null or a.size = :size) and (:sex is null or a.sex = :sex)")
    Page<Animal> findAnimalByAnyFilter(@Param("city_id") Long idCity,@Param("age") int age, @Param("colour") String colour,
                                       @Param("size") String size, @Param("sex") String sex, Pageable page);
}
