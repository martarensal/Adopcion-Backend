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
    void deleteUser(String username) throws IllegalArgumentException;
    void modifyUserLastnames(UserLastnameChangeRequest userLastnameChangeRequest, Long idUser);
    void modifyUserName(UserNameChangeRequest userNameChangeRequest, Long idUSer);
    void modifyUserPassword(UserPasswordChangeRequest userPasswordChangeRequest, Long idUSer);
    void modifyUserUsername(UserUsernameChangeRequest usernameChangeRequest, Long idUSer) throws UniqueUsernameException;
    void modifyUserPhone(UserPhoneChangeRequest userPhoneChangeRequest, Long idUSer);
    void modifyUserRole(UserRoleChangeRequest userRoleChangeRequest, Long idUSer);
    void modifyUserEmail(UserEmailChangeRequest userEmailChangeRequest, Long idUSer) throws UniqueEmailException;
    UserPaginatedResponse searchUsersByUsername(String username, Integer page, Integer size)  throws EntityNotFoundException;
    UserPaginatedResponse getAllUsers(Integer page, Integer size);

}
