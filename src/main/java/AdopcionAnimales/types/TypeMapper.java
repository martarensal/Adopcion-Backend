package AdopcionAnimales.types;

import AdopcionAnimales.api.types.TypeCreationRequest;
import AdopcionAnimales.api.types.TypeResponse;
import AdopcionAnimales.api.users.UserResponse;
import AdopcionAnimales.users.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TypeMapper {
    TypeResponse animalToAnimalResponse (Type type);
    Type typeCreationRequestToType(TypeCreationRequest typeCreationRequest);
    List<TypeResponse> typeToTypeResponse(List<Type> type);

}
