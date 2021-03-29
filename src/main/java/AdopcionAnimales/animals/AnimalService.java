package AdopcionAnimales.animals;

import AdopcionAnimales.api.animals.*;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface AnimalService {
    void addAnimal(AnimalCreationRequest animalCreationRequest, String username);
    /*AnimalPaginatedResponse getAnimalsFromUser(String username, Integer page, Integer size);
    void deleteAnimal(Long idAnimal, String username);
    void modifyAnimalAge(AnimalAgeChangeRequest animalAgeChangeRequest, Long idAnimal);
    void modifyAnimalColour(AnimalColourChangeRequest animalColourChangeRequest, Long idAnimal);
    void modifyAnimalImage(AnimalImageChangeRequest animalImageChangeRequest, Long idAnimal);
    void modifyAnimalName(AnimalNameChangeRequest animalNameChangeRequest, Long idAnimal);
    void modifyAnimalSex(AnimalSexChangeRequest animalSexChangeRequest, Long idAnimal);
    void modifyAnimalSize(AnimalSizeChangeRequest animalSizeChangeRequest, Long idAnimal);
    void modifyAnimalStatus(AnimalStatusChangeRequest animalStatusChangeRequest, Long idAnimal);
    AnimalPaginatedResponse getAnimals(Long idAnimal, Integer page, Integer size);*/
}
