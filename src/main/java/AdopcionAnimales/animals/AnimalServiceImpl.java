package AdopcionAnimales.animals;

import AdopcionAnimales.api.PaginationInfo;
import AdopcionAnimales.api.animals.*;
import AdopcionAnimales.cities.City;
import AdopcionAnimales.cities.CityRepository;
import AdopcionAnimales.users.User;
import AdopcionAnimales.users.UsersRepository;
import AdopcionAnimales.utils.SecurityUtils;
import com.google.common.base.Enums;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.awt.*;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class AnimalServiceImpl implements AnimalService{

    private AnimalsRepository animalsRepository;
    private UsersRepository usersRepository;
    private AnimalMapper animalMapper;

    @Autowired
    public AnimalServiceImpl(AnimalsRepository animalsRepository, UsersRepository usersRepository, AnimalMapper animalMapper) {
        super();
        this.animalsRepository = animalsRepository;
        this.usersRepository = usersRepository;
        this.animalMapper = animalMapper;
    }

    @Override
    @Transactional
    public void addAnimal(AnimalCreationRequest animalCreationRequest){
        Animal newAnimal = animalMapper.animalCreationRequestToAnimal(animalCreationRequest);
        User user = getUser();
        newAnimal.setStatus("HOMELESS");

        newAnimal.setUser(user);
        user.getAnimals().add(animalsRepository.save(newAnimal));

        animalsRepository.save(newAnimal);
        usersRepository.save(user);
    }

    @Override
    public AnimalPaginatedResponse getAnimals(Integer page, Integer size) {

      return null;
    }

    @Override
    public AnimalPaginatedResponse getAnimalsFromUser(String username, Integer page, Integer size) {

        Page<Animal> matchedAnimals = animalsRepository.getAnimalsFromUsers(username, PageRequest.of(page, size));
        Set<Animal> animals = matchedAnimals.stream().collect(Collectors.toSet());

        Set<AnimalResponse> animalResponses = animalMapper.animalsToAnimalsResponse(animals);

        PaginationInfo paginationInfo = new PaginationInfo();
        paginationInfo.setTotalElements(matchedAnimals.getNumberOfElements());
        paginationInfo.setTotalPages(matchedAnimals.getTotalPages());

        AnimalPaginatedResponse paginatedResponse = new AnimalPaginatedResponse();
        paginatedResponse.setPages(animalResponses);
        paginatedResponse.setPaginationInfo(paginationInfo);

        return paginatedResponse;
    }

    /*@Override
    @Transactional
    public Set<AnimalResponse> geAnimalsFromUser(String username) {
        User user = findUser(username);
        Set<Animal> animals = user.getAnimals();

        return animalMapper.animalsToAnimalsResponse(animals);

    }*/


    @Override
    @Transactional
    public void deleteAnimal(Long idAnimal) {
        Animal animal = findAnimalById(idAnimal);

        User user = getUser();
        user.getAnimals().remove(animal);

        animalsRepository.delete(animal);
        usersRepository.save(user);
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
        String animalUpperCase = animalColourChangeRequest.getNewAnimalColour().toUpperCase();

        if(animal != null) {
            for(AnimalColourChangeRequest.NewAnimalColourEnum newAnimalColourEnum : AnimalColourChangeRequest.NewAnimalColourEnum.values())
            {
                if(newAnimalColourEnum.name().toUpperCase().equals(animalUpperCase)){
                    animal.setColour(animalUpperCase);
                    animalsRepository.save(animal);
                }
            }
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

        String animalUpperCase = animalSexChangeRequest.getNewAnimalSex().toUpperCase();

        if(animal != null) {
            for(AnimalSexChangeRequest.NewAnimalSexEnum newAnimalSexEnum : AnimalSexChangeRequest.NewAnimalSexEnum.values())
            {
                if(newAnimalSexEnum.name().toUpperCase().equals(animalUpperCase)){
                    animal.setSex(animalUpperCase);
                    animalsRepository.save(animal);
                }
            }
        }
    }
    @Override
    @Transactional
    public void modifyAnimalSize(AnimalSizeChangeRequest animalSizeChangeRequest, Long idAnimal){
        Animal animal = findAnimalById(idAnimal);

        String animalUpperCase = animalSizeChangeRequest.getNewAnimalSize().toUpperCase();

        if(animal != null) {
            for(AnimalSizeChangeRequest.NewAnimalSizeEnum newAnimalSizeEnum : AnimalSizeChangeRequest.NewAnimalSizeEnum.values())
            {
                if(newAnimalSizeEnum.name().toUpperCase().equals(animalUpperCase)){
                    animal.setSize(animalUpperCase);
                    animalsRepository.save(animal);
                }
            }
        }
    }

    @Override
    @Transactional
    public void modifyAnimalStatus(AnimalStatusChangeRequest animalStatusChangeRequest, Long idAnimal) {
        Animal animal = findAnimalById(idAnimal);
        String animalUpperCase = animalStatusChangeRequest.getNewAnimalStatus().toUpperCase();

        if(animal != null) {
            for(AnimalStatusChangeRequest.NewAnimalStatusEnum newAnimalStatusEnum : AnimalStatusChangeRequest.NewAnimalStatusEnum.values())
            {
                if(newAnimalStatusEnum.name().toUpperCase().equals(animalUpperCase)){
                    animal.setStatus(animalUpperCase);
                    animalsRepository.save(animal);
                }
            }
        }

    }

    @Override
    @Transactional
    public Animal findAnimalById(Long id) {
        return animalsRepository.findById(id).orElse(null);
    }

    private User getUser() {
        User user = usersRepository.findUserByUsername(SecurityUtils.currentUserUsername());
        if (user == null)
            throw new EntityNotFoundException("Usuario no encontrado");
        return user;
    }

    private User findUser(String username) {
        User user = usersRepository.findUserByUsernameWithAnimals(username);
        if(user == null)
            throw new EntityNotFoundException("Usuario no encontrado");
        return user;
    }

}