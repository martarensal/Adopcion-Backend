package AdopcionAnimales.animals;

import AdopcionAnimales.api.cities.CityNameChangeRequest;
import AdopcionAnimales.api.utils.PaginationInfo;
import AdopcionAnimales.api.animals.*;
import AdopcionAnimales.cities.City;
import AdopcionAnimales.cities.CityRepository;
import AdopcionAnimales.types.Type;
import AdopcionAnimales.types.TypeRepository;
import AdopcionAnimales.users.User;
import AdopcionAnimales.users.UsersRepository;
import AdopcionAnimales.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnimalServiceImpl implements AnimalService{

    private AnimalsRepository animalsRepository;
    private UsersRepository usersRepository;
    private CityRepository citiesRepository;
    private TypeRepository typeRepository;
    private AnimalMapper animalMapper;

    @Autowired
    public AnimalServiceImpl(AnimalsRepository animalsRepository, UsersRepository usersRepository, TypeRepository typeRepository, CityRepository citiesRepository, AnimalMapper animalMapper) {
        super();
        this.animalsRepository = animalsRepository;
        this.usersRepository = usersRepository;
        this.citiesRepository = citiesRepository;
        this.typeRepository = typeRepository;
        this.animalMapper = animalMapper;
    }

    @Override
    @Transactional
    public void addAnimal(AnimalCreationRequest animalCreationRequest, String username) throws IOException {
        String base64 = animalCreationRequest.getImage();
        animalCreationRequest.setImage("");

        Animal newAnimal = animalMapper.animalCreationRequestToAnimal(animalCreationRequest);
        newAnimal.setStatus("HOMELESS");
        User user = getUser();

        newAnimal.setUser(user);
        City city = citiesRepository.findByCityId(animalCreationRequest.getCity_id());
        newAnimal.setCity(city);
        Type type = typeRepository.findByTypeId(animalCreationRequest.getType_id());
        newAnimal.setType(type);
        user.getAnimals().add(animalsRepository.save(newAnimal));

        String idAnimal = newAnimal.getId().toString();
        String fileName = "";
        if(base64.length() <= 0){
            fileName = "img\\nophoto.png";

        }else
        {
            fileName = "img\\" + idAnimal + ".png";
            try(FileOutputStream stream = new FileOutputStream(fileName)) {
                stream.write(decode(base64));
            }
        }

        newAnimal.setImage(fileName);

        animalsRepository.save(newAnimal);
        usersRepository.save(user);
    }

    private static byte[] decode(String base64String){
        return Base64.getDecoder().decode(base64String);
    }

    private static String encode(String imagePath) throws IOException{
        byte[] data = Files.readAllBytes(Paths.get(imagePath));
        return Base64.getEncoder().encodeToString(data);
    }


    @Override
    @Transactional
    public AnimalPaginatedResponse getAnimals(Integer page, Integer size) throws IOException {
        Page<Animal> matchedAnimals = animalsRepository.getAnimals(PageRequest.of(page, size));
        return getAnimalPaginatedResponse(matchedAnimals);
    }

    @Override
    @Transactional
    public AnimalPaginatedResponse getAnimalsFromUser(String username, Integer page, Integer size) throws IOException {

        Page<Animal> matchedAnimals = animalsRepository.getAnimalsFromUsers(username, PageRequest.of(page, size));
        return getAnimalPaginatedResponse(matchedAnimals);
    }

    @Override
    @Transactional
    public AnimalPaginatedResponse getAnimalsFromAnyFilter(Long idCity, Integer minAge, Integer maxAge, String colour, String animalSize,
                                                           String sex, Integer page, Integer size) throws IOException {
        List<String> partsColour = null;
        List<String> partsAnimalSize = null;
        if(colour != null ){
            if(colour.contains("|"))
                partsColour = Arrays.asList(colour.split("\\|"));
            else
                partsColour = Arrays.asList(colour);
        }
        if(animalSize != null){
            if(animalSize.contains("|"))
                partsAnimalSize = Arrays.asList(animalSize.split("\\|"));
            else
                partsAnimalSize = Arrays.asList(animalSize);
        }

        Page<Animal> matchedAnimals = animalsRepository.findAnimalByAnyFilter(idCity, minAge, maxAge, partsColour, partsAnimalSize, sex, PageRequest.of(page, size));
        return getAnimalPaginatedResponse(matchedAnimals);
    }

    private AnimalPaginatedResponse getAnimalPaginatedResponse(Page<Animal> matchedAnimals) throws IOException {
        List<Animal> animals = matchedAnimals.stream().collect(Collectors.toList());

        List<AnimalResponse> animalResponses = animalMapper.animalsToAnimalsResponse(animals);
        for(int i = 0; i < animalResponses.size(); i++)
        {
            String image = animalResponses.get(i).getImage();
            String base64 = encode(image);
            animalResponses.get(i).setImage(base64);
        }
        //System.out.println(animalResponses);

        PaginationInfo paginationInfo = new PaginationInfo();
        paginationInfo.setTotalElements(matchedAnimals.getNumberOfElements());
        paginationInfo.setTotalPages(matchedAnimals.getTotalPages());

        AnimalPaginatedResponse paginatedResponse = new AnimalPaginatedResponse();
        paginatedResponse.setPages(animalResponses);
        paginatedResponse.setPaginationInfo(paginationInfo);

        return paginatedResponse;
    }

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
            String base64 = animalImageChangeRequest.getNewAnimalImage();
            animalImageChangeRequest.setNewAnimalImage("");

            String fileName = "";
            if(base64.length() <= 0){
                fileName = "img\\nophoto.png";

            }else
            {
                fileName = "img\\" + idAnimal + ".png";
                try(FileOutputStream stream = new FileOutputStream(fileName)) {
                    stream.write(decode(base64));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            animal.setImage(fileName);
            //animal.setImage(animalImageChangeRequest.getNewAnimalImage());
            animalsRepository.save(animal);
        }
    }
    @Override
    @Transactional
    public void modifyAnimalName(AnimalNameChangeRequest animalNameChangeRequest, Long idAnimal){
        System.out.println(animalNameChangeRequest + " animal name change request");
        System.out.println(idAnimal + " id animal");
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

    private User findUserById(Long id) {
        return usersRepository.findById(id).orElse(null);
    }

}