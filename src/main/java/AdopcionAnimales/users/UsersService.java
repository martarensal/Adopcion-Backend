package AdopcionAnimales.users;

import AdopcionAnimales.api.users.*;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public interface UsersService extends UserDetailsService {
    public User findUserById(Long id);
    public UserResponse getUserById(Long idUser) throws EntityNotFoundException;
    public void registerUser(UserRegistrationRequest registrationRequest) throws UniqueUsernameException;
    public UserResponse getUserByUsername(String username) throws EntityNotFoundException;
    public void deleteUser(String username) throws IllegalArgumentException;
    public void modifyUserLastname(UserLastnameChangeRequest userLastnameChangeRequest, String username);
    public void modifyUserName(UserNameChangeRequest userNameChangeRequest, String username);
    public void modifyUserPassword(UserPasswordChangeRequest userPasswordChangeRequest, String username);
    public void modifyUserUsername(UserUsernameChangeRequest usernameChangeRequest, String username) throws UniqueUsernameException;
    public void modifyUserPhone(UserPhoneChangeRequest userPhoneChangeRequest, String username);
    public void modifyUserRole(UserRoleChangeRequest userRoleChangeRequest, String username);
    public void modifyUserEmail(UserEmailChangeRequest userEmailChangeRequest, String username) throws UniqueEmailException;
    public UserPaginatedResponse searchUsersByUsername(String username, Integer page, Integer size);
}
