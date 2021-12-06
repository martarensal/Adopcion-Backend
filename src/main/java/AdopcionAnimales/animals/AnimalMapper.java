package AdopcionAnimales.animals;

import AdopcionAnimales.api.animals.AnimalCreationRequest;
import AdopcionAnimales.api.animals.AnimalResponse;
import AdopcionAnimales.cities.City;
import AdopcionAnimales.types.Type;
import AdopcionAnimales.users.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public abstract class AnimalMapper {
    public String typeToString(Type t)
    {
        return t.getName();
    }
    public String cityToString(City c) { return c.getName();}
    public Long userToLong(User u) { return u.getIdUser();}
    public abstract List<AnimalResponse> animalsToAnimalsResponse(List<Animal> animals);
    public abstract Animal animalCreationRequestToAnimal(AnimalCreationRequest animalCreationRequest);
}
