package AdopcionAnimales.api.animals;

import AdopcionAnimales.animals.AnimalService;
import AdopcionAnimales.api.requests.RequestPaginatedResponse;
import AdopcionAnimales.api.requests.RequestResponse;
import AdopcionAnimales.requests.RequestService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
@Controller
public class AnimalsApiController implements AnimalsApi {

    private static final Logger log = LoggerFactory.getLogger(AnimalsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    private AnimalService animalService;
    private RequestService requestService;

    @Autowired
    public AnimalsApiController(ObjectMapper objectMapper, HttpServletRequest request, AnimalService animalService, RequestService requestService) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.animalService = animalService;
        this.requestService = requestService;
    }

    public ResponseEntity<Void> addAnimal(@ApiParam(value = "", required = true) @PathVariable("username") String username, @ApiParam(value = "Animal to add"  )  @Valid @RequestBody AnimalCreationRequest body) throws IOException {
        animalService.addAnimal(body, username);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteAnimal(@ApiParam(value = "By passing in the appropriate animal code, you can delete the animal.",required=true) @PathVariable("idAnimal") Long idAnimal) {
        animalService.deleteAnimal(idAnimal);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    public ResponseEntity<Void> modifyAnimalAge(@ApiParam(value = "By passing in the appropriate animal code, you can modify the animal.",required=true) @PathVariable("idAnimal") Long idAnimal,@ApiParam(value = "The animal's new age"  )  @Valid @RequestBody AnimalAgeChangeRequest body) {
        animalService.modifyAnimalAge(body, idAnimal);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> modifyAnimalColour(@ApiParam(value = "By passing in the appropriate animal code, you can modify the animal.",required=true) @PathVariable("idAnimal") Long idAnimal,@ApiParam(value = "The animal's new colour"  )  @Valid @RequestBody AnimalColourChangeRequest body) {
        animalService.modifyAnimalColour(body, idAnimal);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> modifyAnimalImage(@ApiParam(value = "By passing in the appropriate animal code, you can modify the animal.",required=true) @PathVariable("idAnimal") Long idAnimal,@ApiParam(value = "The animal's new image"  )  @Valid @RequestBody AnimalImageChangeRequest body) {
        animalService.modifyAnimalImage(body, idAnimal);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> modifyAnimalName(@ApiParam(value = "By passing in the appropriate animal code, you can modify the animal.",required=true) @PathVariable("idAnimal") Long idAnimal,@ApiParam(value = "The animal's new name" )  @Valid @RequestBody AnimalNameChangeRequest body) {
        animalService.modifyAnimalName(body, idAnimal);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> modifyAnimalSex(@ApiParam(value = "By passing in the appropriate animal code, you can modify the animal.",required=true) @PathVariable("idAnimal") Long idAnimal,@ApiParam(value = "The animal's new sex" )  @Valid @RequestBody AnimalSexChangeRequest body) {
        animalService.modifyAnimalSex(body, idAnimal);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> modifyAnimalSize(@ApiParam(value = "By passing in the appropriate animal code, you can modify the animal.",required=true) @PathVariable("idAnimal") Long idAnimal,@ApiParam(value = "The animal's new size"  )  @Valid @RequestBody AnimalSizeChangeRequest body) {
        animalService.modifyAnimalSize(body, idAnimal);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> modifyAnimalStatus(@ApiParam(value = "By passing in the appropriate animal code, you can modify the animal.",required=true) @PathVariable("idAnimal") Long idAnimal,@ApiParam(value = "The animal's new status"  )  @Valid @RequestBody AnimalStatusChangeRequest body) {
        animalService.modifyAnimalStatus(body, idAnimal);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> modifyAnimalCity(@ApiParam(value = "By passing in the appropriate animal code, you can modify the animal.",required=true) @PathVariable("idAnimal") Long idAnimal,@ApiParam(value = "The animal's new city"  )  @Valid @RequestBody AnimalCityChangeRequest body) {
        animalService.modifyAnimalCity(body, idAnimal);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    public ResponseEntity<Void> modifyAnimalType(@ApiParam(value = "By passing in the appropriate animal code, you can modify the animal.",required=true) @PathVariable("idAnimal") Long idAnimal,@ApiParam(value = "The animal's new status"  )  @Valid @RequestBody AnimalTypeChangeRequest body) {
        animalService.modifyAnimalType(body, idAnimal);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<AnimalPaginatedResponse> getAnimalsFromUser(String username, @Valid Integer page,
                                                                            @Valid Integer size) throws IOException {
        return new ResponseEntity<AnimalPaginatedResponse>(animalService.getAnimalsFromUser(username, page, size), HttpStatus.OK);
    }

    public ResponseEntity<AnimalPaginatedResponse> getAnimalsFromAnyFilter(Long idCity, Integer minAge, Integer maxAge, String colour, String animalSize, String sex,Long idType, @Valid Integer page,
                                                                      @Valid Integer size) throws IOException {
        return new ResponseEntity<AnimalPaginatedResponse>(animalService.getAnimalsFromAnyFilter(idCity, minAge, maxAge, colour, animalSize, sex, idType, page, size), HttpStatus.OK);
    }

    public ResponseEntity<AnimalPaginatedResponse> getAnimals(@Valid Integer page,
                                                                      @Valid Integer size) throws IOException {
        return new ResponseEntity<AnimalPaginatedResponse>(animalService.getAnimals(page, size), HttpStatus.OK);
    }
    public ResponseEntity<AnimalResponse> getAnimal(
            @ApiParam(value = "By passing in the appropriate animal id, you can get the animal.", required = true) @PathVariable("idAnimal") Long idAnimal)
            throws EntityNotFoundException, IOException {
        return new ResponseEntity<AnimalResponse>(animalService.getAnimalById(idAnimal), HttpStatus.OK);
    }

    public ResponseEntity<RequestPaginatedResponse> getAnimalRequests(
            @ApiParam(value = "By passing in the appropriate animal id, you can get the animal request.", required = true) @PathVariable("idAnimal") Long idAnimal, @Valid Integer page,
            @Valid Integer size)
            throws EntityNotFoundException, IOException {
        return new ResponseEntity<RequestPaginatedResponse>(requestService.getAnimalRequests(idAnimal, page, size), HttpStatus.OK);

    }

}
