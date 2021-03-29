package AdopcionAnimales.animals;

import AdopcionAnimales.api.animals.*;
import AdopcionAnimales.users.User;
import AdopcionAnimales.users.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.Set;

@Service
public class AnimalServiceImpl implements AnimalService{

    private AnimalsRepository animalsRepository;
    private UsersRepository userRepository;
    private AnimalMapper animalMapper;

    @Autowired
    public AnimalServiceImpl(AnimalsRepository animalsRepository, UsersRepository userRepository, AnimalMapper animalMapper) {
        super();
        this.animalsRepository = animalsRepository;
        this.userRepository = userRepository;
        this.animalMapper = animalMapper;
    }

    @Override
    @Transactional
    public void addAnimal(AnimalCreationRequest animalCreationRequest, String username){
        Animal newAnimal = animalMapper.animalCreationRequestToAnimal(animalCreationRequest);
        User user = userRepository.findUserByUsername(username);

        user.getAnimals().add(animalsRepository.save(newAnimal));
        userRepository.save(user);
    }
/*
    @Override
    @Transactional
    public AnimalPaginatedResponse getAnimalsFromUser(String username){
        User user = findUser(username);
        Set<Animal> animals = user.getAnimals();

        return animalMapper.animalToAnimalResponse(animals);
    }
    @Override
    @Transactional
    public AnimalPaginatedResponse getAnimals(){

    }

    @Override
    @Transactional
    public void deleteAnimal(Long idAnimal, String username) {
        User user = findUser(username);
        user.getAnimals().remove(findCarByPlate(plate));
        userRepository.save(user);
        carsRepository.delete(findCarByPlate(plate));
    }
    @Override
    @Transactional
    public void modifyAnimalAge(AnimalAgeChangeRequest animalAgeChangeRequest, Long idAnimal){

    }
    @Override
    @Transactional
    public void modifyAnimalColour(AnimalColourChangeRequest animalColourChangeRequest, Long idAnimal){

    }
    @Override
    @Transactional
    public void modifyAnimalImage(AnimalImageChangeRequest animalImageChangeRequest, Long idAnimal){

    }
    @Override
    @Transactional
    public void modifyAnimalName(AnimalNameChangeRequest animalNameChangeRequest, Long idAnimal){

    }
    @Override
    @Transactional
    public void modifyAnimalSex(AnimalSexChangeRequest animalSexChangeRequest, Long idAnimal){

    }
    @Override
    @Transactional
    public void modifyAnimalSize(AnimalSizeChangeRequest animalSizeChangeRequest, Long idAnimal){

    }

    @Override
    @Transactional
    public void modifyAnimalStatus(AnimalStatusChangeRequest animalStatusChangeRequest, Long idAnimal) {

    }

    private User findUser(String username) {
        User user = userRepository.findUserByUsernameWithAnimals(username);
        if(user == null)
            throw new EntityNotFoundException("Usuario no encontrado");
        return user;
    }


    private Animal findAnimalById(Long id) {
        Animal animal = animalsRepository.findById(id);
        if(car == null)
            throw new EntityNotFoundException("Coche con matrícula " + plate + " no encontrado");
        return car;
    }
*/
}
