package AdopcionAnimales.animals;

import AdopcionAnimales.api.animals.AnimalCreationRequest;
import AdopcionAnimales.api.animals.AnimalResponse;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface AnimalMapper {
    Set<AnimalResponse> animalsToAnimalsResponse(Set<Animal> animals);
    Animal animalCreationRequestToAnimal(AnimalCreationRequest animalCreationRequest);
}
