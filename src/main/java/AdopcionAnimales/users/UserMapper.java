package AdopcionAnimales.users;

import AdopcionAnimales.api.users.UserRegistrationRequest;
import AdopcionAnimales.api.users.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponse userToUserResponse(User user);

    @Mapping(target = "authorities", ignore = true)
    @Mapping(target = "animals", ignore = true)
    @Mapping(target = "publications", ignore = true)
    @Mapping(target = "requests", ignore = true)
    User userRegistrationRequestToUser(UserRegistrationRequest userRegistrationRequest);

}
