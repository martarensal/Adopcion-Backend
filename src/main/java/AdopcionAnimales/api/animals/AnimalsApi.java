/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.5).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package AdopcionAnimales.api.animals;

import AdopcionAnimales.api.cities.CityPaginatedResponse;
import AdopcionAnimales.api.cities.CityResponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
@Api(value = "animals", description = "the animals API")
public interface AnimalsApi {
    @ApiOperation(value = "Adds an animal", nickname = "addAnimal", notes = "Adds a new animal to the user", authorizations = {
            @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Animal created"),
            @ApiResponse(code = 400, message = "invalid input, object invalid"),
            @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/animals",
            consumes = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<Void> addAnimal(@ApiParam(value = "Animal to add"  )  @Valid @RequestBody AnimalCreationRequest body);

    @ApiOperation(value = "Deletes an animal", nickname = "deleteAnimal", notes = "Deletes the animal linked to a user", authorizations = {
            @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "animal deleted succesfully"),
            @ApiResponse(code = 400, message = "bad input parameter"),
            @ApiResponse(code = 404, message = "animal not found"),
            @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/animals/{idAnimal}",
            method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteAnimal(@ApiParam(value = "By passing in the appropriate animal code, you can delete the animal.",required=true) @PathVariable("idAnimal") Long idAnimal);

    @ApiOperation(value = "Modifies the animal's age", nickname = "modifyAnimalAge", notes = "", authorizations = {
            @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "bad input parameter"),
            @ApiResponse(code = 200, message = "operation completed successfully"),
            @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/animals/{idAnimal}/age",
            consumes = { "application/json" },
            method = RequestMethod.PUT)
    ResponseEntity<Void> modifyAnimalAge(@ApiParam(value = "By passing in the appropriate animal code, you can modify the animal.",required=true) @PathVariable("idAnimal") Long idAnimal,@ApiParam(value = "The animal's new age"  )  @Valid @RequestBody AnimalAgeChangeRequest body);


    @ApiOperation(value = "Modifies the animal's colour", nickname = "modifyAnimalColour", notes = "", authorizations = {
            @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "bad input parameter"),
            @ApiResponse(code = 200, message = "operation completed successfully"),
            @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/animals/{idAnimal}/colour",
            consumes = { "application/json" },
            method = RequestMethod.PUT)
    ResponseEntity<Void> modifyAnimalColour(@ApiParam(value = "By passing in the appropriate animal code, you can modify the animal.",required=true) @PathVariable("idAnimal") Long idAnimal,@ApiParam(value = "The animal's new colour"  )  @Valid @RequestBody AnimalColourChangeRequest body);


    @ApiOperation(value = "Modifies the animal's image", nickname = "modifyAnimalImage", notes = "", authorizations = {
            @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "bad input parameter"),
            @ApiResponse(code = 200, message = "operation completed successfully"),
            @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/animals/{idAnimal}/image",
            consumes = { "application/json" },
            method = RequestMethod.PUT)
    ResponseEntity<Void> modifyAnimalImage(@ApiParam(value = "By passing in the appropriate animal code, you can modify the animal.",required=true) @PathVariable("idAnimal") Long idAnimal,@ApiParam(value = "The animal's new image"  )  @Valid @RequestBody AnimalImageChangeRequest body);

    @ApiOperation(value = "Modifies the animal's name", nickname = "modifyAnimalName", notes = "", authorizations = {
            @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "bad input parameter"),
            @ApiResponse(code = 200, message = "operation completed successfully"),
            @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/animals/{idAnimal}/name",
            consumes = { "application/json" },
            method = RequestMethod.PUT)
    ResponseEntity<Void> modifyAnimalName(@ApiParam(value = "By passing in the appropriate animal code, you can modify the animal.",required=true) @PathVariable("idAnimal") Long idAnimal,@ApiParam(value = "The animal's new name"  )  @Valid @RequestBody AnimalNameChangeRequest body);


    @ApiOperation(value = "Modifies the animal's sex", nickname = "modifyAnimalSex", notes = "", authorizations = {
            @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "bad input parameter"),
            @ApiResponse(code = 200, message = "operation completed successfully"),
            @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/animals/{idAnimal}/sex",
            consumes = { "application/json" },
            method = RequestMethod.PUT)
    ResponseEntity<Void> modifyAnimalSex(@ApiParam(value = "By passing in the appropriate animal code, you can modify the animal.",required=true) @PathVariable("idAnimal") Long idAnimal,@ApiParam(value = "The animal's new sex"  )  @Valid @RequestBody AnimalSexChangeRequest body);


    @ApiOperation(value = "Modifies the animal's size", nickname = "modifyAnimalSize", notes = "", authorizations = {
            @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "bad input parameter"),
            @ApiResponse(code = 200, message = "operation completed successfully"),
            @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/animals/{idAnimal}/size",
            consumes = { "application/json" },
            method = RequestMethod.PUT)
    ResponseEntity<Void> modifyAnimalSize(@ApiParam(value = "By passing in the appropriate animal code, you can modify the animal.",required=true) @PathVariable("idAnimal") Long idAnimal,@ApiParam(value = "The animal's new size"  )  @Valid @RequestBody AnimalSizeChangeRequest body);


    @ApiOperation(value = "Modifies the animal's status", nickname = "modifyAnimalStatus", notes = "", authorizations = {
            @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "bad input parameter"),
            @ApiResponse(code = 200, message = "operation completed successfully"),
            @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/animals/{idAnimal}/status",
            consumes = { "application/json" },
            method = RequestMethod.PUT)
    ResponseEntity<Void> modifyAnimalStatus(@ApiParam(value = "By passing in the appropriate animal code, you can modify the animal.",required=true) @PathVariable("idAnimal") Long idAnimal,@ApiParam(value = "The animal's new status"  )  @Valid @RequestBody AnimalStatusChangeRequest body);

    @ApiOperation(value = "Searches the animals for a user", nickname = "getAnimalsFromUser", notes = "Searches for an animal added by a user.", response = AnimalPaginatedResponse.class, responseContainer = "List", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The search was successfull", response = AnimalPaginatedResponse.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password"),
        @ApiResponse(code = 500, message = "Internal server error") })
    @RequestMapping(value = "/users/{username}/animals",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<AnimalPaginatedResponse> getAnimalsFromUser(
            @ApiParam(value = "", required = true) @PathVariable("username") String username,
            @ApiParam(value = "the number of the page") @Valid @RequestParam(value = "page", required = false, defaultValue = "0") Integer page,
            @ApiParam(value = "the number of element per page") @Valid @RequestParam(value = "size", required = false, defaultValue = "25") Integer size);

    @ApiOperation(value = "List all animals", nickname = "getAnimals", notes = "List all animals", response = AnimalPaginatedResponse.class, responseContainer = "List", authorizations = {
            @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "The search was successfull", response = AnimalPaginatedResponse.class, responseContainer = "List"),
            @ApiResponse(code = 401, message = "The requested page needs a username and a password"),
            @ApiResponse(code = 500, message = "Internal server error") })
    @RequestMapping(value = "/animals",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<AnimalPaginatedResponse> getAnimals(
            @ApiParam(value = "the number of the page") @Valid @RequestParam(value = "page", required = false, defaultValue = "0") Integer page,
            @ApiParam(value = "the number of element per page") @Valid @RequestParam(value = "size", required = false, defaultValue = "25") Integer size);

    @ApiOperation(value = "Searches the animals with a filter", nickname = "getAnimalsFromAnyFilter", notes = "", response = AnimalPaginatedResponse.class, responseContainer = "List", authorizations = {
            @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "The search was successfull", response = AnimalPaginatedResponse.class, responseContainer = "List"),
            @ApiResponse(code = 401, message = "The requested page needs a username and a password"),
            @ApiResponse(code = 500, message = "Internal server error") })
    @RequestMapping(value = "/animals/filters",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<AnimalPaginatedResponse> getAnimalsFromAnyFilter(
            @ApiParam(value = "", required = false) @RequestParam(required = false) Long idCity,
            @ApiParam(value = "", required = false) @RequestParam(required = false) Integer minAge,
            @ApiParam(value = "", required = false) @RequestParam(required = false) Integer maxAge,
            @ApiParam(value = "", required = false) @RequestParam(required = false) String colour,
            @ApiParam(value = "", required = false) @RequestParam(required = false) String animalSize,
            @ApiParam(value = "", required = false) @RequestParam(required = false) String sex,
            @ApiParam(value = "the number of the page") @Valid @RequestParam(value = "page", required = false, defaultValue = "0") Integer page,
            @ApiParam(value = "the number of element per page") @Valid @RequestParam(value = "size", required = false, defaultValue = "25") Integer size);

}
