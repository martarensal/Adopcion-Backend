package AdopcionAnimales.users;

import AdopcionAnimales.api.users.UserRegistrationRequest;
import AdopcionAnimales.api.users.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponse userToUserResponse(User user);

    User userRegistrationRequestToUser(UserRegistrationRequest userRegistrationRequest);
}
