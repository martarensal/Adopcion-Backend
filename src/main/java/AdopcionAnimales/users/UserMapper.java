package AdopcionAnimales.users;

import AdopcionAnimales.api.users.UserRegistrationRequest;
import AdopcionAnimales.api.users.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    List<UserResponse> userToUserResponse(List<User> user);
    UserResponse userToUserResponse(User user);

    User userRegistrationRequestToUser(UserRegistrationRequest userRegistrationRequest);
}
