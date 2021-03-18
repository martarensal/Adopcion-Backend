package AdopcionAnimales.types;

import AdopcionAnimales.api.types.TypeCreationRequest;
import AdopcionAnimales.api.types.TypeResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TypeMapper {
    TypeResponse animalToAnimalResponse (Type type);
    Type typeCreationRequestToType(TypeCreationRequest typeCreationRequest);

}
