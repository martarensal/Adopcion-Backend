package AdopcionAnimales.animals;

import AdopcionAnimales.api.animals.AnimalCreationRequest;
import AdopcionAnimales.api.animals.AnimalResponse;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface AnimalMapper {
    List<AnimalResponse> animalsToAnimalsResponse(List<Animal> animals);
    Animal animalCreationRequestToAnimal(AnimalCreationRequest animalCreationRequest);
}
