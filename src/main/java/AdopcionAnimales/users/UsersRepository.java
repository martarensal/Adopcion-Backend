package AdopcionAnimales.users;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends CrudRepository<User, Long> {
    @Query("select u from User u where u.username = :username")
    User findUserByUsername(@Param("username") String username);

    @Query("select u from User u LEFT JOIN FETCH u.animals c where u.username = :username")
    User findUserByUsernameWithAnimals(@Param("username") String username);

    @Query("select u from User u LEFT JOIN FETCH u.publications c where u.username = :username")
    User findUserByUsernameWithPublications(@Param("username") String username);

    @Query("select u from User u LEFT JOIN FETCH u.requests c where u.username = :username")
    User findUserByUsernameWithRequests(@Param("username") String username);

    @Query("select u from User u where u.username LIKE :username")
    Page<User> searchUserWithUsername(@Param("username") String username, Pageable page);
}
