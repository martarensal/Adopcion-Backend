package AdopcionAnimales.types;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository extends CrudRepository<Type, Long> {
    @Query("select t from Type t where t.id = :idType")
    Type findByTypeId(Long idType);

    @Query("select t from Type t ")
    Page<Type> findAllTypes(Pageable page);
}
