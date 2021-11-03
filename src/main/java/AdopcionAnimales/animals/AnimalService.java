package AdopcionAnimales.animals;

import AdopcionAnimales.api.animals.*;
import AdopcionAnimales.users.User;
import io.swagger.models.auth.In;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Set;

@Service
public interface AnimalService {
    void addAnimal(AnimalCreationRequest animalCreationRequest, String username) throws IOException;
    AnimalPaginatedResponse getAnimals(Integer page, Integer size) throws IOException;
    AnimalPaginatedResponse getAnimalsFromUser(String username, Integer page, Integer size) throws IOException;
    AnimalPaginatedResponse getAnimalsFromAnyFilter(Long idCity, Integer minAge, Integer maxAge, String colour, String animalSize, String sex, Long idType, Integer page, Integer size) throws IOException;
    void deleteAnimal(Long idAnimal);
    void modifyAnimalAge(AnimalAgeChangeRequest animalAgeChangeRequest, Long idAnimal);
    void modifyAnimalColour(AnimalColourChangeRequest animalColourChangeRequest, Long idAnimal);
    void modifyAnimalImage(AnimalImageChangeRequest animalImageChangeRequest, Long idAnimal);
    void modifyAnimalName(AnimalNameChangeRequest animalNameChangeRequest, Long idAnimal);
    void modifyAnimalSex(AnimalSexChangeRequest animalSexChangeRequest, Long idAnimal);
    void modifyAnimalSize(AnimalSizeChangeRequest animalSizeChangeRequest, Long idAnimal);
    void modifyAnimalStatus(AnimalStatusChangeRequest animalStatusChangeRequest, Long idAnimal);
    void modifyAnimalCity(AnimalCityChangeRequest animalCityChangeRequest, Long idAnimal);
    void modifyAnimalType(AnimalTypeChangeRequest animalTypeChangeRequest, Long idAnimal);

    Animal findAnimalById(Long id);
}