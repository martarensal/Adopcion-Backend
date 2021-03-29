package AdopcionAnimales.animals;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalsRepository extends CrudRepository<Animal, Long> {
    /*@Query("select a from Animal a where a.id = :id")
    Animal findById(@Param("id") Long id);*/
}
