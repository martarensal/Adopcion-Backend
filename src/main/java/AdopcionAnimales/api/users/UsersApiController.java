package AdopcionAnimales.api.users;

import AdopcionAnimales.api.animals.*;
import AdopcionAnimales.api.publications.PublicationCreationRequest;
import AdopcionAnimales.api.publications.PublicationResponse;
import AdopcionAnimales.api.requests.RequestPaginatedResponse;
import AdopcionAnimales.api.types.TypeResponse;
import AdopcionAnimales.publications.PublicationService;
import AdopcionAnimales.users.UniqueEmailException;
import AdopcionAnimales.users.UniqueUsernameException;
import AdopcionAnimales.users.UserMapper;
import AdopcionAnimales.users.UsersService;
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
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
@Controller
public class UsersApiController implements UsersApi {

    private static final Logger log = LoggerFactory.getLogger(UsersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private UserMapper userMapper;

    private UsersService userService;

    private PublicationService publicationService;

    @Autowired
    public UsersApiController(ObjectMapper objectMapper, HttpServletRequest request, UsersService userService, UserMapper userMapper, PublicationService publicationService) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.userService = userService;
        this.userMapper = userMapper;
    }

    public ResponseEntity<Void> addUser(@ApiParam(value = "User to add") @Valid @RequestBody UserRegistrationRequest body)
            throws UniqueUsernameException {
        userService.registerUser(body);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteUser(@ApiParam(value = "By passing in the appropriate username, you can delete the user.",required=true) @PathVariable("username") String username)throws IllegalArgumentException{
        userService.deleteUser(username);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<UserResponse> getUser(
            @ApiParam(value = "By passing in the appropriate user id, you can get the user.", required = true) @PathVariable("idUser") Long idUser)
            throws EntityNotFoundException {
        return new ResponseEntity<UserResponse>(userService.getUserById(idUser), HttpStatus.OK);
    }

    public ResponseEntity<Void> modifyUserEmail(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "The new user's email"  )  @Valid @RequestBody UserEmailChangeRequest body) throws UniqueEmailException {
            userService.modifyUserEmail(body, username);
            return new ResponseEntity<Void>(HttpStatus.OK);
    }
    public ResponseEntity<Void> modifyUserLastnames(
            @ApiParam(value = "", required = true) @PathVariable("username") String username,
            @ApiParam(value = "The new user's lastnames") @Valid @RequestBody UserLastnameChangeRequest body) {
        userService.modifyUserLastnames(body, username);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> modifyUserName(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "The new user's name"  )  @Valid @RequestBody UserNameChangeRequest body) {
        userService.modifyUserName(body, username);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> modifyUserPassword(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "The new user's password"  )  @Valid @RequestBody UserPasswordChangeRequest body) {
        userService.modifyUserPassword(body, username);
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> modifyUserPhone(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "The new user's phone"  )  @Valid @RequestBody UserPhoneChangeRequest body) {
        userService.modifyUserPhone(body, username);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> modifyUserRole(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "The new user's role"  )  @Valid @RequestBody UserRoleChangeRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> modifyUserUsername(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "The new user's username"  )  @Valid @RequestBody UserUsernameChangeRequest body) throws UniqueUsernameException {
        userService.modifyUserUsername(body, username);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<UserPaginatedResponse> getAllUsers(@ApiParam(value = "the number of the page")
                                                            @Valid @RequestParam(value = "page", required = false, defaultValue = "0") Integer page,
                                                            @ApiParam(value = "the number of element per page")
                                                            @Valid @RequestParam(value = "size", required = false, defaultValue = "25") Integer size) {
        return new ResponseEntity <UserPaginatedResponse>(userService.getAllUsers(page, size), HttpStatus.OK);
    }

}
