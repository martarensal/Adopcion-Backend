package AdopcionAnimales.cities;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {
    @Query("select c from City c where c.id = :idCity")
    City findByCityId(Long idCity);

}
