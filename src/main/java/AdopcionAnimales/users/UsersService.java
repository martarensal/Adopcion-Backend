package AdopcionAnimales.users;

import AdopcionAnimales.api.users.*;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public interface UsersService extends UserDetailsService {
    User findUserById(Long id);
    UserResponse getUserById(Long idUser) throws EntityNotFoundException;
    void registerUser(UserRegistrationRequest registrationRequest) throws UniqueUsernameException;
    UserResponse getUserByUsername(String username) throws EntityNotFoundException;
    void deleteUser(String username) throws IllegalArgumentException;
    void modifyUserLastname(UserLastnameChangeRequest userLastnameChangeRequest, String username);
    void modifyUserName(UserNameChangeRequest userNameChangeRequest, String username);
    void modifyUserPassword(UserPasswordChangeRequest userPasswordChangeRequest, String username);
    void modifyUserUsername(UserUsernameChangeRequest usernameChangeRequest, String username) throws UniqueUsernameException;
    void modifyUserPhone(UserPhoneChangeRequest userPhoneChangeRequest, String username);
    void modifyUserRole(UserRoleChangeRequest userRoleChangeRequest, String username);
    void modifyUserEmail(UserEmailChangeRequest userEmailChangeRequest, String username) throws UniqueEmailException;
    UserPaginatedResponse searchUsersByUsername(String username, Integer page, Integer size);
}
