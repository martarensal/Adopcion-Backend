package AdopcionAnimales.animals;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalsRepository extends CrudRepository<Animal, Long>{

    @Query("select a from Animal a where a.user.username = :username")
    Page<Animal> getAnimalsFromUsers(@Param("username") String name, Pageable page);

    @Query("select a from Animal a ")
    Page<Animal> getAnimals(Pageable page);

    @Query("SELECT a FROM Animal a WHERE (:city_id is null or a.city = :city_id)" +
            "and (:minAge is null or a.age >= :minAge) and (:maxAge is null or a.age <= :maxAge) and (:colour is null or a.colour IN :colour) " +
            "and (:size is null or a.size IN :size) and (:sex is null or a.sex = :sex)")
    Page<Animal> findAnimalByAnyFilter(@Param("city_id") Long idCity, @Param("minAge") Integer minAge, @Param("maxAge") Integer maxAge, @Param("colour") List<String> colour,
                                       @Param("size") List<String> size, @Param("sex") String sex, Pageable page);
}
