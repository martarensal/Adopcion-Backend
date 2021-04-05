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
    public void addAnimal(AnimalCreationRequest animalCreationRequest){
        Animal newAnimal = animalMapper.animalCreationRequestToAnimal(animalCreationRequest);
        newAnimal.setStatus("HOMELESS");
        animalsRepository.save(newAnimal);
    }

    @Override
    public AnimalPaginatedResponse getAnimals(Integer page, Integer size) {
        return null;
    }

    @Override
    public AnimalPaginatedResponse getAnimalsFromUser(String username, Integer page, Integer size) {
        return null;
    }


    @Override
    @Transactional
    public void deleteAnimal(Long idAnimal) {
        Animal animal = findAnimalById(idAnimal);
        animalsRepository.delete(animal);
    }

    @Override
    @Transactional
    public void modifyAnimalAge(AnimalAgeChangeRequest animalAgeChangeRequest, Long idAnimal){
        Animal animal = findAnimalById(idAnimal);
        if(animal != null) {
            animal.setAge(animalAgeChangeRequest.getNewAnimalAge());
            animalsRepository.save(animal);
        }
    }
    @Override
    @Transactional
    public void modifyAnimalColour(AnimalColourChangeRequest animalColourChangeRequest, Long idAnimal){
        Animal animal = findAnimalById(idAnimal);
        if(animal != null) {
            animal.setColour(animalColourChangeRequest.getNewAnimalColour());
            animalsRepository.save(animal);
        }
    }
    @Override
    @Transactional
    public void modifyAnimalImage(AnimalImageChangeRequest animalImageChangeRequest, Long idAnimal){
        Animal animal = findAnimalById(idAnimal);
        if(animal != null) {
            animal.setImage(animalImageChangeRequest.getNewAnimalImage());
            animalsRepository.save(animal);
        }
    }
    @Override
    @Transactional
    public void modifyAnimalName(AnimalNameChangeRequest animalNameChangeRequest, Long idAnimal){
        Animal animal = findAnimalById(idAnimal);
        if(animal != null) {
            animal.setName(animalNameChangeRequest.getNewAnimalName());
            animalsRepository.save(animal);
        }
    }
    @Override
    @Transactional
    public void modifyAnimalSex(AnimalSexChangeRequest animalSexChangeRequest, Long idAnimal){
        Animal animal = findAnimalById(idAnimal);
        if(animal != null) {
            animal.setSex(animalSexChangeRequest.getNewAnimalSex());
            animalsRepository.save(animal);
        }
    }
    @Override
    @Transactional
    public void modifyAnimalSize(AnimalSizeChangeRequest animalSizeChangeRequest, Long idAnimal){
        Animal animal = findAnimalById(idAnimal);
        if(animal != null) {
            animal.setSize(animalSizeChangeRequest.getNewAnimalSize());
            animalsRepository.save(animal);
        }
    }

    @Override
    @Transactional
    public void modifyAnimalStatus(AnimalStatusChangeRequest animalStatusChangeRequest, Long idAnimal) {
        Animal animal = findAnimalById(idAnimal);
        if(animal != null) {
            animal.setStatus(animalStatusChangeRequest.getNewAnimalStatus());
            animalsRepository.save(animal);
        }
    }

    private User findUser(String username) {
        User user = userRepository.findUserByUsernameWithAnimals(username);
        if(user == null)
            throw new EntityNotFoundException("Usuario no encontrado");
        return user;
    }

    @Override
    @Transactional
    public Animal findAnimalById(Long id) {
        return animalsRepository.findById(id).orElse(null);

    }

    /*private User getUser() {
        User user = userRepository.findUserByUsername(SecurityUtils.currentUserUsername());
        if (user == null)
            throw new EntityNotFoundException("Usuario no encontrado");
        return user;
    }*/
}
