package AdopcionAnimales.test.java.io.swagger.api;
/*
import com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.animals.AnimalResponse;
import com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.publications.PublicationCreationRequest;
import com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.publications.PublicationResponse;
import com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.requests.RequestPaginatedResponse;
import com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.types.TypeResponse;
import com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.users.*;
import com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.animals.AnimalAgeChangeRequest;
import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.Valid;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersApiControllerIntegrationTest {

    @Autowired
    private UsersApi api;

    @Test
    public void addAnimalTest() throws Exception {
        String username = "username_example";
        com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.users.@Valid AnimalCreationRequest body = new com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.users.AnimalCreationRequest();
        ResponseEntity<Void> responseEntity = api.addAnimal(username, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void addPublicationTest() throws Exception {
        String username = "username_example";
        PublicationCreationRequest body = new PublicationCreationRequest();
        ResponseEntity<Void> responseEntity = api.addPublication(username, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void addUserTest() throws Exception {
        UserRegistrationRequest body = new UserRegistrationRequest();
        ResponseEntity<Void> responseEntity = api.addUser(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void deleteAnimalTest() throws Exception {
        String username = "username_example";
        String idAnimal = "idAnimal_example";
        ResponseEntity<Void> responseEntity = api.deleteAnimal(username, idAnimal);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void deleteUserTest() throws Exception {
        String username = "username_example";
        ResponseEntity<Void> responseEntity = api.deleteUser(username);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getUserTest() throws Exception {
        String username = "username_example";
        ResponseEntity<UserResponse> responseEntity = api.getUser(username);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void modifyAnimalAgeTest() throws Exception {
        String username = "username_example";
        String idAnimal = "idAnimal_example";
        com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.users.@Valid AnimalAgeChangeRequest body = new com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.users.AnimalAgeChangeRequest();
        ResponseEntity<Void> responseEntity = api.modifyAnimalAge(username, idAnimal, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void modifyAnimalColourTest() throws Exception {
        String username = "username_example";
        String idAnimal = "idAnimal_example";
        com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.users.@Valid AnimalColourChangeRequest body = new com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.users.AnimalColourChangeRequest();
        ResponseEntity<Void> responseEntity = api.modifyAnimalColour(username, idAnimal, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void modifyAnimalImageTest() throws Exception {
        String username = "username_example";
        String idAnimal = "idAnimal_example";
        com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.users.@Valid AnimalImageChangeRequest body = new com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.users.AnimalImageChangeRequest();
        ResponseEntity<Void> responseEntity = api.modifyAnimalImage(username, idAnimal, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void modifyAnimalNameTest() throws Exception {
        String username = "username_example";
        String idAnimal = "idAnimal_example";
        com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.users.@Valid AnimalNameChangeRequest body = new com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.users.AnimalNameChangeRequest();
        ResponseEntity<Void> responseEntity = api.modifyAnimalName(username, idAnimal, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void modifyAnimalSexTest() throws Exception {
        String username = "username_example";
        String idAnimal = "idAnimal_example";
        com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.users.@Valid AnimalSexChangeRequest body = new com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.users.AnimalSexChangeRequest();
        ResponseEntity<Void> responseEntity = api.modifyAnimalSex(username, idAnimal, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void modifyAnimalSizeTest() throws Exception {
        String username = "username_example";
        String idAnimal = "idAnimal_example";
        com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.users.@Valid AnimalSizeChangeRequest body = new com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.users.AnimalSizeChangeRequest();
        ResponseEntity<Void> responseEntity = api.modifyAnimalSize(username, idAnimal, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void modifyAnimalStatusTest() throws Exception {
        String username = "username_example";
        String idAnimal = "idAnimal_example";
        com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.users.@Valid AnimalStatusChangeRequest body = new com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.users.AnimalStatusChangeRequest();
        ResponseEntity<Void> responseEntity = api.modifyAnimalStatus(username, idAnimal, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void modifyUserEmailTest() throws Exception {
        String username = "username_example";
        UserEmailChangeRequest body = new UserEmailChangeRequest();
        ResponseEntity<Void> responseEntity = api.modifyUserEmail(username, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void modifyUserLastnameTest() throws Exception {
        String username = "username_example";
        UserLastnameChangeRequest body = new UserLastnameChangeRequest();
        ResponseEntity<Void> responseEntity = api.modifyUserLastname(username, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void modifyUserNameTest() throws Exception {
        String username = "username_example";
        UserNameChangeRequest body = new UserNameChangeRequest();
        ResponseEntity<Void> responseEntity = api.modifyUserName(username, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void modifyUserPasswordTest() throws Exception {
        String username = "username_example";
        UserPasswordChangeRequest body = new UserPasswordChangeRequest();
        ResponseEntity<Void> responseEntity = api.modifyUserPassword(username, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void modifyUserPhoneTest() throws Exception {
        String username = "username_example";
        UserPhoneChangeRequest body = new UserPhoneChangeRequest();
        ResponseEntity<Void> responseEntity = api.modifyUserPhone(username, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void modifyUserRoleTest() throws Exception {
        String username = "username_example";
        UserRoleChangeRequest body = new UserRoleChangeRequest();
        ResponseEntity<Void> responseEntity = api.modifyUserRole(username, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void modifyUserUsernameTest() throws Exception {
        String username = "username_example";
        UserUsernameChangeRequest body = new UserUsernameChangeRequest();
        ResponseEntity<Void> responseEntity = api.modifyUserUsername(username, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void obtainRequestTest() throws Exception {
        String username = "username_example";
        Integer page = 56;
        Integer size = 56;
        ResponseEntity<RequestPaginatedResponse> responseEntity = api.obtainRequest(username, page, size);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void searchAnimalsTest() throws Exception {
        String username = "username_example";
        ResponseEntity<List<AnimalResponse>> responseEntity = api.searchAnimals(username);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void searchCityTest() throws Exception {
        String username = "username_example";
        String idAnimal = "idAnimal_example";
        String idCity = "idCity_example";
        ResponseEntity<List<TypeResponse>> responseEntity = api.searchCity(username, idAnimal, idCity);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void searchPublicationTest() throws Exception {
        String username = "username_example";
        ResponseEntity<List<PublicationResponse>> responseEntity = api.searchPublication(username);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void searchTypeTest() throws Exception {
        String username = "username_example";
        String idAnimal = "idAnimal_example";
        String idType = "idType_example";
        ResponseEntity<List<TypeResponse>> responseEntity = api.searchType(username, idAnimal, idType);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void searchUserTest() throws Exception {
        String username = "username_example";
        Integer page = 56;
        Integer size = 56;
        ResponseEntity<List<UserPaginatedResponse>> responseEntity = api.searchUser(username, page, size);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
*/