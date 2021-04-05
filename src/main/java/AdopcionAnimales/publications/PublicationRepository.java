package AdopcionAnimales.publications;

import AdopcionAnimales.users.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicationRepository extends CrudRepository<Publication, Long> {
}
