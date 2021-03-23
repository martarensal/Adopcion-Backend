/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.5).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package AdopcionAnimales.api.users;

import AdopcionAnimales.api.animals.*;
import AdopcionAnimales.api.publications.PublicationCreationRequest;
import AdopcionAnimales.api.publications.PublicationResponse;
import AdopcionAnimales.api.requests.RequestPaginatedResponse;
import AdopcionAnimales.api.types.TypeResponse;
import AdopcionAnimales.users.UniqueUsernameException;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
@Api(value = "users", description = "the users API")
public interface UsersApi {

    @ApiOperation(value = "Adds an animal", nickname = "addAnimal", notes = "Adds a new animal to the user", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Animal created"),
        @ApiResponse(code = 400, message = "invalid input, object invalid"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/users/{username}/animals",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addAnimal(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "Animal to add"  )  @Valid @RequestBody AnimalCreationRequest body);


    @ApiOperation(value = "Adds a publication", nickname = "addPublication", notes = "Adds a new animal to the user", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Publication created"),
        @ApiResponse(code = 400, message = "invalid input, object invalid"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/users/{username}/publications",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addPublication(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "Publication to add"  )  @Valid @RequestBody PublicationCreationRequest body);


    @ApiOperation(value = "Registers a user", nickname = "addUser", notes = "Adds a user to the system", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "user created"),
        @ApiResponse(code = 400, message = "invalid input, object invalid"),
        @ApiResponse(code = 409, message = "an existing user already exists") })
    @RequestMapping(value = "/users",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addUser(@ApiParam(value = "User to add"  )  @Valid @RequestBody UserRegistrationRequest body) throws UniqueUsernameException;


    @ApiOperation(value = "Deletes an animal", nickname = "deleteAnimal", notes = "Deletes the animal linked to a user", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "animal deleted succesfully"),
        @ApiResponse(code = 400, message = "bad input parameter"),
        @ApiResponse(code = 404, message = "animal not found"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/users/{username}/animals/{idAnimal}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteAnimal(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "By passing in the appropriate animal code, you can delete the animal.",required=true) @PathVariable("idAnimal") String idAnimal);


    @ApiOperation(value = "Deletes a user", nickname = "deleteUser", notes = "", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "user deleted succesfully"),
        @ApiResponse(code = 400, message = "bad input parameter"),
        @ApiResponse(code = 404, message = "user not found"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/users/{username}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteUser(@ApiParam(value = "By passing in the appropriate username, you can delete the user.",required=true) @PathVariable("username") String username);

    @ApiOperation(value = "Finds a user", nickname = "getUser", notes = "", response = UserResponse.class, authorizations = {
            @Authorization(value = "ApiKeyAuth")    }, tags={ })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "search results matching criteria", response = UserResponse.class),
            @ApiResponse(code = 400, message = "bad input parameter"),
            @ApiResponse(code = 404, message = "user not found"),
            @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/users/{idUser}",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<UserResponse> getUser(@ApiParam(value = "By passing in the appropriate user id, you can get the user.",required=true) @PathVariable("idUser") Long userId
    );

    @ApiOperation(value = "Modifies the animal's age", nickname = "modifyAnimalAge", notes = "", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "bad input parameter"),
        @ApiResponse(code = 200, message = "operation completed successfully"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/users/{username}/animals/{idAnimal}/age",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> modifyAnimalAge(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "By passing in the appropriate animal code, you can modify the animal.",required=true) @PathVariable("idAnimal") String idAnimal,@ApiParam(value = "The animal's new age"  )  @Valid @RequestBody AnimalAgeChangeRequest body);


    @ApiOperation(value = "Modifies the animal's colour", nickname = "modifyAnimalColour", notes = "", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "bad input parameter"),
        @ApiResponse(code = 200, message = "operation completed successfully"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/users/{username}/animals/{idAnimal}/colour",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> modifyAnimalColour(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "By passing in the appropriate animal code, you can modify the animal.",required=true) @PathVariable("idAnimal") String idAnimal,@ApiParam(value = "The animal's new colour"  )  @Valid @RequestBody AnimalColourChangeRequest body);


    @ApiOperation(value = "Modifies the animal's image", nickname = "modifyAnimalImage", notes = "", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "bad input parameter"),
        @ApiResponse(code = 200, message = "operation completed successfully"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/users/{username}/animals/{idAnimal}/image",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> modifyAnimalImage(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "By passing in the appropriate animal code, you can modify the animal.",required=true) @PathVariable("idAnimal") String idAnimal,@ApiParam(value = "The animal's new image"  )  @Valid @RequestBody AnimalImageChangeRequest body);


    @ApiOperation(value = "Modifies the animal's name", nickname = "modifyAnimalName", notes = "", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "bad input parameter"),
        @ApiResponse(code = 200, message = "operation completed successfully"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/users/{username}/animals/{idAnimal}/name",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> modifyAnimalName(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "By passing in the appropriate animal code, you can modify the animal.",required=true) @PathVariable("idAnimal") String idAnimal,@ApiParam(value = "The animal's new name"  )  @Valid @RequestBody AnimalNameChangeRequest body);


    @ApiOperation(value = "Modifies the animal's sex", nickname = "modifyAnimalSex", notes = "", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "bad input parameter"),
        @ApiResponse(code = 200, message = "operation completed successfully"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/users/{username}/animals/{idAnimal}/sex",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> modifyAnimalSex(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "By passing in the appropriate animal code, you can modify the animal.",required=true) @PathVariable("idAnimal") String idAnimal,@ApiParam(value = "The animal's new sex"  )  @Valid @RequestBody AnimalSexChangeRequest body);


    @ApiOperation(value = "Modifies the animal's size", nickname = "modifyAnimalSize", notes = "", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "bad input parameter"),
        @ApiResponse(code = 200, message = "operation completed successfully"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/users/{username}/animals/{idAnimal}/size",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> modifyAnimalSize(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "By passing in the appropriate animal code, you can modify the animal.",required=true) @PathVariable("idAnimal") String idAnimal,@ApiParam(value = "The animal's new size"  )  @Valid @RequestBody AnimalSizeChangeRequest body);


    @ApiOperation(value = "Modifies the animal's status", nickname = "modifyAnimalStatus", notes = "", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "bad input parameter"),
        @ApiResponse(code = 200, message = "operation completed successfully"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/users/{username}/animals/{idAnimal}/status",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> modifyAnimalStatus(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "By passing in the appropriate animal code, you can modify the animal.",required=true) @PathVariable("idAnimal") String idAnimal,@ApiParam(value = "The animal's new status"  )  @Valid @RequestBody AnimalStatusChangeRequest body);


    @ApiOperation(value = "Modifies the user's email", nickname = "modifyUserEmail", notes = "The user username you want to modify", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "bad input parameter"),
        @ApiResponse(code = 200, message = "operation completed successfully"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/users/{username}/email",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> modifyUserEmail(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "The new user's email"  )  @Valid @RequestBody UserEmailChangeRequest body);


    @ApiOperation(value = "Modifies the user's lastnames", nickname = "modifyUserLastnames", notes = "The user username you want to modify", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "bad input parameter"),
        @ApiResponse(code = 200, message = "operation completed successfully"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/users/{username}/lastnames",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> modifyUserLastnames(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "The new user's lastnames"  )  @Valid @RequestBody UserLastnameChangeRequest body);


    @ApiOperation(value = "Modifies the user's name", nickname = "modifyUserName", notes = "The user username you want to modify", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "bad input parameter"),
        @ApiResponse(code = 200, message = "operation completed successfully"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/users/{username}/name",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> modifyUserName(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "The new user's name"  )  @Valid @RequestBody UserNameChangeRequest body);


    @ApiOperation(value = "Modifies the user's email", nickname = "modifyUserPassword", notes = "The user username you want to modify", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "bad input parameter"),
        @ApiResponse(code = 200, message = "operation completed successfully"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/users/{username}/password",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> modifyUserPassword(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "The new user's password"  )  @Valid @RequestBody UserPasswordChangeRequest body);


    @ApiOperation(value = "Modifies the user's phone", nickname = "modifyUserPhone", notes = "The user username you want to modify", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "bad input parameter"),
        @ApiResponse(code = 200, message = "operation completed successfully"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/users/{username}/phone",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> modifyUserPhone(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "The new user's phone"  )  @Valid @RequestBody UserPhoneChangeRequest body);


    @ApiOperation(value = "Modifies the user's role", nickname = "modifyUserRole", notes = "The user username you want to modify", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "bad input parameter"),
        @ApiResponse(code = 200, message = "operation completed successfully"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/users/{username}/role",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> modifyUserRole(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "The new user's role"  )  @Valid @RequestBody UserRoleChangeRequest body);


    @ApiOperation(value = "Modifies the user's username", nickname = "modifyUserUsername", notes = "The user username you want to modify", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "bad input parameter"),
        @ApiResponse(code = 200, message = "operation completed successfully"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/users/{username}/username",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> modifyUserUsername(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "The new user's username"  )  @Valid @RequestBody UserUsernameChangeRequest body);


    @ApiOperation(value = "Obtains the request made by the user", nickname = "obtainRequest", notes = "", response = RequestPaginatedResponse.class, authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The search was successfull", response = RequestPaginatedResponse.class),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password"),
        @ApiResponse(code = 500, message = "Internal server error") })
    @RequestMapping(value = "/users/{username}/requests",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<RequestPaginatedResponse> obtainRequest(@ApiParam(value = "",required=true) @PathVariable("username") String username, @ApiParam(value = "the number of the page") @Valid @RequestParam(value = "page", required = false) Integer page, @ApiParam(value = "the number of element per page") @Valid @RequestParam(value = "size", required = false) Integer size);


    @ApiOperation(value = "Searches for an animal", nickname = "searchAnimals", notes = "Searches for an animal.", response = AnimalResponse.class, responseContainer = "List", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The search was successfull", response = AnimalResponse.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Access denied"),
        @ApiResponse(code = 500, message = "Internal server error") })
    @RequestMapping(value = "/users/{username}/animals",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<AnimalResponse>> searchAnimals(@ApiParam(value = "",required=true) @PathVariable("username") String username);


    @ApiOperation(value = "Searches for a city", nickname = "searchCity", notes = "Searches for a city. This operation is permited for both user and admin", response = TypeResponse.class, responseContainer = "List", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The search was successfull", response = TypeResponse.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password"),
        @ApiResponse(code = 500, message = "Internal server error") })
    @RequestMapping(value = "/users/{username}/animals/{idAnimal}/cities/{idCity}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<TypeResponse>> searchCity(@ApiParam(value = "",required=true) @PathVariable("username") String username, @ApiParam(value = "",required=true) @PathVariable("idAnimal") String idAnimal, @ApiParam(value = "",required=true) @PathVariable("idCity") String idCity);


    @ApiOperation(value = "Searches for a publication", nickname = "searchPublication", notes = "Searches for a publication.", response = PublicationResponse.class, responseContainer = "List", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The search was successfull", response = PublicationResponse.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Access denied"),
        @ApiResponse(code = 500, message = "Internal server error") })
    @RequestMapping(value = "/users/{username}/publications",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<PublicationResponse>> searchPublication(@ApiParam(value = "",required=true) @PathVariable("username") String username);


    @ApiOperation(value = "Searches for a type", nickname = "searchType", notes = "Searches for a type. This operation is permited for both user and admin", response = TypeResponse.class, responseContainer = "List", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The search was successfull", response = TypeResponse.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password"),
        @ApiResponse(code = 500, message = "Internal server error") })
    @RequestMapping(value = "/users/{username}/animals/{idAnimal}/types/{idType}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<TypeResponse>> searchType(@ApiParam(value = "",required=true) @PathVariable("username") String username, @ApiParam(value = "",required=true) @PathVariable("idAnimal") String idAnimal, @ApiParam(value = "",required=true) @PathVariable("idType") String idType);

    @ApiOperation(value = "Searches for a user", nickname = "searchUser", notes = "Searches for a user. This operation is permited for both user and admin", response = UserPaginatedResponse.class, responseContainer = "List", authorizations = {
            @Authorization(value = "ApiKeyAuth")    }, tags={ })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "The search was successfull", response = UserPaginatedResponse.class),
            @ApiResponse(code = 401, message = "The requested page needs a username and a password"),
            @ApiResponse(code = 500, message = "Internal server error") })
    @RequestMapping(value = "/users",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<UserPaginatedResponse> searchUser(@ApiParam(value = "the username to be searched") @Valid @RequestParam(value = "username", required = true) String username
            ,@ApiParam(value = "the number of the page") @Valid @RequestParam(value = "page", required = false) Integer page
            ,@ApiParam(value = "the number of element per page") @Valid @RequestParam(value = "size", required = false) Integer size
    );
}
