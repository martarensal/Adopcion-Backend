package AdopcionAnimales.requests;

import AdopcionAnimales.animals.Animal;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends CrudRepository<Request, Long> {

    @Query("select r from Request r where r.user.username = :username")
    Page<Request> getRequestsFromUsers(@Param("username") String name, Pageable page);

}
