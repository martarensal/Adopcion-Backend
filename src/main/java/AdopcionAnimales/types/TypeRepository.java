package AdopcionAnimales.types;

import AdopcionAnimales.cities.City;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository extends CrudRepository<Type, Long> {
    @Query("select t from Type t where t.id = :idType")
    Type findByTypeId(Long idType);
}
