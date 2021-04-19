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

}
