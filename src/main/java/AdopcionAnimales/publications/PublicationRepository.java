package AdopcionAnimales.publications;

import AdopcionAnimales.users.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicationRepository extends CrudRepository<Publication, Long> {
    @Query("select p from Publication p WHERE p.user.username = :username")
    Page<Publication> getPublicationsFromUser(@Param("username") String username, Pageable page);

    @Query("select p from Publication p")
    Page<Publication> getPublications(Pageable page);
}
