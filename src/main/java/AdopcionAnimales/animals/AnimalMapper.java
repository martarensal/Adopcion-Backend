package AdopcionAnimales.animals;

import AdopcionAnimales.api.animals.AnimalCreationRequest;
import AdopcionAnimales.api.animals.AnimalResponse;
import AdopcionAnimales.cities.City;
import AdopcionAnimales.types.Type;
import AdopcionAnimales.users.User;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface AnimalMapper {
    default String typeToString(Type t) { return t.getName();}
    default String cityToString(City c) { return c.getName();}
    public default Long userToLong(User u) { return u.getIdUser();}
    AnimalResponse animalToAnimalResponse(Animal animal);
    List<AnimalResponse> animalsToAnimalsResponse(List<Animal> animals);
    Animal animalCreationRequestToAnimal(AnimalCreationRequest animalCreationRequest);
}
