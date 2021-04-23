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

    @Query("select c from City c")
    Page<City> getCities(Pageable page);

    @Query("select c.name from City c where c.province = :province")
    Page<City> getCitiesFromProvinces(@Param("province") String province, Pageable page);

}
