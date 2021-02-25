package com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.users;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.publications.PublicationCreationRequest;
import com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.publications.PublicationResponse;
import com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.requests.RequestPaginatedResponse;
import com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.types.TypeResponse;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
@Controller
public class UsersApiController implements UsersApi {

    private static final Logger log = LoggerFactory.getLogger(UsersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UsersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addAnimal(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "Animal to add"  )  @Valid @RequestBody AnimalCreationRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> addPublication(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "Publication to add"  )  @Valid @RequestBody PublicationCreationRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> addUser(@ApiParam(value = "User to add"  )  @Valid @RequestBody UserRegistrationRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteAnimal(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "By passing in the appropriate animal code, you can delete the animal.",required=true) @PathVariable("idAnimal") String idAnimal) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteUser(@ApiParam(value = "By passing in the appropriate username, you can delete the user.",required=true) @PathVariable("username") String username) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UserResponse> getUser(@ApiParam(value = "By passing in the appropriate username, you can get the user.",required=true) @PathVariable("username") String username) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<UserResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> modifyAnimalAge(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "By passing in the appropriate animal code, you can modify the animal.",required=true) @PathVariable("idAnimal") String idAnimal,@ApiParam(value = "The animal's new age"  )  @Valid @RequestBody AnimalAgeChangeRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> modifyAnimalColour(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "By passing in the appropriate animal code, you can modify the animal.",required=true) @PathVariable("idAnimal") String idAnimal,@ApiParam(value = "The animal's new colour"  )  @Valid @RequestBody AnimalColourChangeRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> modifyAnimalImage(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "By passing in the appropriate animal code, you can modify the animal.",required=true) @PathVariable("idAnimal") String idAnimal,@ApiParam(value = "The animal's new image"  )  @Valid @RequestBody AnimalImageChangeRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> modifyAnimalName(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "By passing in the appropriate animal code, you can modify the animal.",required=true) @PathVariable("idAnimal") String idAnimal,@ApiParam(value = "The animal's new name"  )  @Valid @RequestBody AnimalNameChangeRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> modifyAnimalSex(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "By passing in the appropriate animal code, you can modify the animal.",required=true) @PathVariable("idAnimal") String idAnimal,@ApiParam(value = "The animal's new sex"  )  @Valid @RequestBody AnimalSexChangeRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> modifyAnimalSize(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "By passing in the appropriate animal code, you can modify the animal.",required=true) @PathVariable("idAnimal") String idAnimal,@ApiParam(value = "The animal's new size"  )  @Valid @RequestBody AnimalSizeChangeRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> modifyAnimalStatus(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "By passing in the appropriate animal code, you can modify the animal.",required=true) @PathVariable("idAnimal") String idAnimal,@ApiParam(value = "The animal's new status"  )  @Valid @RequestBody AnimalStatusChangeRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> modifyUserEmail(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "The new user's email"  )  @Valid @RequestBody UserEmailChangeRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> modifyUserLastname(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "The new user's lastname"  )  @Valid @RequestBody UserLastnameChangeRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> modifyUserName(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "The new user's name"  )  @Valid @RequestBody UserNameChangeRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> modifyUserPassword(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "The new user's password"  )  @Valid @RequestBody UserPasswordChangeRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> modifyUserPhone(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "The new user's phone"  )  @Valid @RequestBody UserPhoneChangeRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> modifyUserRole(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "The new user's role"  )  @Valid @RequestBody UserRoleChangeRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> modifyUserUsername(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "The new user's username"  )  @Valid @RequestBody UserUsernameChangeRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RequestPaginatedResponse> obtainRequest(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "the number of the page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "the number of element per page") @Valid @RequestParam(value = "size", required = false) Integer size) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<RequestPaginatedResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<AnimalResponse>> searchAnimals(@ApiParam(value = "",required=true) @PathVariable("username") String username) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<List<AnimalResponse>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<TypeResponse>> searchCity(@ApiParam(value = "",required=true) @PathVariable("username") String username, @ApiParam(value = "",required=true) @PathVariable("idAnimal") String idAnimal, @ApiParam(value = "",required=true) @PathVariable("idCity") String idCity) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<List<TypeResponse>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<PublicationResponse>> searchPublication(@ApiParam(value = "",required=true) @PathVariable("username") String username) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<List<PublicationResponse>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<TypeResponse>> searchType(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "",required=true) @PathVariable("idAnimal") String idAnimal,@ApiParam(value = "",required=true) @PathVariable("idType") String idType) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<List<TypeResponse>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<UserPaginatedResponse>> searchUser(@ApiParam(value = "the username to be searched") @Valid @RequestParam(value = "username", required = false) String username,@ApiParam(value = "the number of the page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "the number of element per page") @Valid @RequestParam(value = "size", required = false) Integer size) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<List<UserPaginatedResponse>>(HttpStatus.NOT_IMPLEMENTED);
    }

}