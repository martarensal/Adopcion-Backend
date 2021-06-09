package AdopcionAnimales.users;

import AdopcionAnimales.api.utils.PaginationInfo;
import AdopcionAnimales.api.users.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsersServiceImpl implements UsersService {

    private UsersRepository userRepository;
    private PasswordEncoder passwordEncoder;
    private UserMapper userMapper;

    @Autowired
    public UsersServiceImpl(UsersRepository userRepository, PasswordEncoder passwordEncoder, UserMapper userMapper) {
        super();
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.userMapper = userMapper;
    }

    @Override
    @Transactional
    public void registerUser(UserRegistrationRequest registrationRequest) throws UniqueUsernameException {

        User newUser = userMapper.userRegistrationRequestToUser(registrationRequest);
        newUser.setPassword(passwordEncoder.encode(registrationRequest.getPassword()));
        newUser.setRol("ROLE_USER");

        try {
            userRepository.save(newUser);
        } catch (DataIntegrityViolationException exception) {
            throw new UniqueUsernameException("Username or email already exists");
        }
    }

    @Override
    @Transactional
    public void deleteUser(String username) {
        User user = userRepository.findUserByUsername(username);
        if (user == null)
            throw new IllegalArgumentException("El usuario " + username + " no ha sido encontrado");
        userRepository.delete(user);
    }

    @Override
    @Transactional
    public void modifyUserPhone(UserPhoneChangeRequest userPhoneChangeRequest, Long idUser) {
        User user = findUserById(idUser);

        user.setPhone(userPhoneChangeRequest.getNewPhone());
        userRepository.save(user);
    }

    @Override
    @Transactional
    public void modifyUserRole(UserRoleChangeRequest userRoleChangeRequest, Long idUser) {
        User user = findUserById(idUser);

        user.setRol(userRoleChangeRequest.getNewRole());
        userRepository.save(user);
    }

    @Override
    @Transactional
    public void modifyUserLastnames(UserLastnameChangeRequest userLastnameChangeRequest, Long idUser) {
        User user = findUserById(idUser);

        user.setLastnames(userLastnameChangeRequest.getNewLastname());
        userRepository.save(user);
    }

    @Override
    @Transactional
    public void modifyUserName(UserNameChangeRequest userNameChangeRequest, Long idUser) {
        User user = findUserById(idUser);

        user.setName(userNameChangeRequest.getNewName());
        userRepository.save(user);
    }

    @Override
    @Transactional
    public void modifyUserPassword(UserPasswordChangeRequest userPasswordChangeRequest, Long idUser) {
        User user = findUserById(idUser);

        user.setPassword(passwordEncoder.encode(userPasswordChangeRequest.getNewPassword()));
        userRepository.save(user);
    }

    @Override
    @Transactional
    public void modifyUserUsername(UserUsernameChangeRequest usernameChangeRequest, Long idUser)
            throws UniqueUsernameException {
        User user = findUserById(idUser);

        user.setUsername(usernameChangeRequest.getNewUsername());
        try {
            userRepository.save(user);
        } catch (DataIntegrityViolationException exception) {
            throw new UniqueUsernameException("Username already exists");
        }
    }

    private User findUserByUsername(String username) {
        User user = userRepository.findUserByUsername(username);
        if (user == null)
            throw new EntityNotFoundException("Usuario no encontrado");
        return user;
    }

    @Override
    @Transactional
    public UserPaginatedResponse searchUsersByUsername(String username, Integer page, Integer size)  throws EntityNotFoundException {
        Page<User> matchedUsers = userRepository.searchUserWithUsername(username, PageRequest.of(page, size));

        List<UserResponse> userResponses = matchedUsers.map(user -> userMapper.userToUserResponse(user)).stream()
                .collect(Collectors.toList());
        return getUserPaginatedResponse(matchedUsers, userResponses);
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetails userDetails = userRepository.findUserByUsername(username);
        if (userDetails == null)
            throw new UsernameNotFoundException("El usuario " + username + " no se ha encontrado.");

        return userDetails;
    }

    @Override
    @Transactional
    public void modifyUserEmail(UserEmailChangeRequest userEmailChangeRequest, Long idUser) throws UniqueEmailException {
        User user = findUserById(idUser);
        user.setEmail(userEmailChangeRequest.getNewEmail());

        try {
            userRepository.save(user);
        } catch (DataIntegrityViolationException exception) {
            throw new UniqueEmailException("El email introducido ya existe");
        }

    }

    @Override
    @Transactional
    public User findUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public UserResponse getUserById(Long idUser) throws EntityNotFoundException {
        User user = userRepository.findById(idUser).orElse(null);
        if(user == null)
            throw new EntityNotFoundException("Usuario no encontrado");

        return userMapper.userToUserResponse(user);
    }

    @Override
    @Transactional
    public UserPaginatedResponse getAllUsers(Integer page, Integer size) {
        Page<User> matchedUsers = userRepository.findAllUsers(PageRequest.of(page, size));
        return getUserPaginatedResponse(matchedUsers);
    }

    private UserPaginatedResponse getUserPaginatedResponse(Page<User> matchedUsers) {
        List<User> users = matchedUsers.stream().collect(Collectors.toList());

        List<UserResponse> userResponses = userMapper.userToUserResponse(users);

        return getUserPaginatedResponse(matchedUsers, userResponses);
    }

    private UserPaginatedResponse getUserPaginatedResponse(Page<User> matchedUsers, List<UserResponse> userResponses) {
        PaginationInfo paginationInfo = new PaginationInfo();
        paginationInfo.setTotalElements(matchedUsers.getNumberOfElements());
        paginationInfo.setTotalPages(matchedUsers.getTotalPages());

        UserPaginatedResponse paginatedResponse = new UserPaginatedResponse();
        paginatedResponse.setPages(userResponses);
        paginatedResponse.setPaginationInfo(paginationInfo);

        return paginatedResponse;
    }
}
