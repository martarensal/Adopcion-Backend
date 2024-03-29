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
import AdopcionAnimales.users.UniqueEmailException;
import AdopcionAnimales.users.UniqueUsernameException;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
@Api(value = "users", description = "the users API")
public interface UsersApi {

    @ApiOperation(value = "Registers a user", nickname = "addUser", notes = "Adds a user to the system", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "user created"),
        @ApiResponse(code = 400, message = "invalid input, object invalid"),
        @ApiResponse(code = 409, message = "an existing user already exists") })
    @RequestMapping(value = "/users",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addUser(@ApiParam(value = "User to add"  )  @Valid @RequestBody UserRegistrationRequest body) throws UniqueUsernameException;

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

    @ApiOperation(value = "Modifies the user's email", nickname = "modifyUserEmail", notes = "The user username you want to modify", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "bad input parameter"),
        @ApiResponse(code = 200, message = "operation completed successfully"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/users/{idUser}/email",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> modifyUserEmail(@ApiParam(value = "",required=true) @PathVariable("idUser") Long idUser,@ApiParam(value = "The new user's email"  )  @Valid @RequestBody UserEmailChangeRequest body) throws UniqueEmailException;

    @ApiOperation(value = "Modifies the user's lastnames", nickname = "modifyUserLastnames", notes = "The user username you want to modify", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "bad input parameter"),
        @ApiResponse(code = 200, message = "operation completed successfully"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/users/{idUser}/lastnames",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> modifyUserLastnames(@ApiParam(value = "",required=true) @PathVariable("idUser") Long idUser,@ApiParam(value = "The new user's lastnames"  )  @Valid @RequestBody UserLastnameChangeRequest body);


    @ApiOperation(value = "Modifies the user's name", nickname = "modifyUserName", notes = "The user username you want to modify", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "bad input parameter"),
        @ApiResponse(code = 200, message = "operation completed successfully"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/users/{idUser}/name",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> modifyUserName(@ApiParam(value = "",required=true) @PathVariable("idUser") Long idUser,@ApiParam(value = "The new user's name"  )  @Valid @RequestBody UserNameChangeRequest body);


    @ApiOperation(value = "Modifies the user's password", nickname = "modifyUserPassword", notes = "The user username you want to modify", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "bad input parameter"),
        @ApiResponse(code = 200, message = "operation completed successfully"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/users/{idUser}/password",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> modifyUserPassword(@ApiParam(value = "",required=true) @PathVariable("idUser") Long idUser,@ApiParam(value = "The new user's password"  )  @Valid @RequestBody UserPasswordChangeRequest body);


    @ApiOperation(value = "Modifies the user's phone", nickname = "modifyUserPhone", notes = "The user username you want to modify", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "bad input parameter"),
        @ApiResponse(code = 200, message = "operation completed successfully"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/users/{idUser}/phone",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> modifyUserPhone(@ApiParam(value = "",required=true) @PathVariable("idUser") Long idUser,@ApiParam(value = "The new user's phone"  )  @Valid @RequestBody UserPhoneChangeRequest body);


    @ApiOperation(value = "Modifies the user's role", nickname = "modifyUserRole", notes = "The user username you want to modify", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "bad input parameter"),
        @ApiResponse(code = 200, message = "operation completed successfully"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/users/{idUser}/role",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> modifyUserRole(@ApiParam(value = "",required=true) @PathVariable("idUser") Long idUser,@ApiParam(value = "The new user's role"  )  @Valid @RequestBody UserRoleChangeRequest body);


    @ApiOperation(value = "Modifies the user's username", nickname = "modifyUserUsername", notes = "The user username you want to modify", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "bad input parameter"),
        @ApiResponse(code = 200, message = "operation completed successfully"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/users/{idUser}/username",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> modifyUserUsername(@ApiParam(value = "",required=true) @PathVariable("idUser") Long idUser,@ApiParam(value = "The new user's username"  )  @Valid @RequestBody UserUsernameChangeRequest body) throws UniqueUsernameException;

    @ApiOperation(value = "List all users", nickname = "getAllUsers", notes = "This operation is permited for both user and admin", response = UserPaginatedResponse.class, responseContainer = "List", authorizations = {
            @Authorization(value = "ApiKeyAuth")    }, tags={ })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "The search was successfull", response = UserPaginatedResponse.class),
            @ApiResponse(code = 401, message = "The requested page needs a username and a password"),
            @ApiResponse(code = 500, message = "Internal server error") })
    @RequestMapping(value = "/users",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<UserPaginatedResponse> getAllUsers(@ApiParam(value = "the number of the page") @Valid @RequestParam(value = "page", required = false) Integer page
            ,@ApiParam(value = "the number of element per page") @Valid @RequestParam(value = "size", required = false) Integer size
    );

    @ApiOperation(value = "Finds a user", nickname = "getUser", notes = "", response = UserResponse.class, authorizations = {
            @Authorization(value = "ApiKeyAuth")    }, tags={})
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
}
