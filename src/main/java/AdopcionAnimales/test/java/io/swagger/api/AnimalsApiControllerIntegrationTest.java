package AdopcionAnimales.test.java.io.swagger.api;

import java.util.*;

import AdopcionAnimales.api.animals.AnimalPaginatedResponse;
import AdopcionAnimales.api.animals.AnimalsApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AnimalsApiControllerIntegrationTest {

    @Autowired
    private AnimalsApi api;

    @Test
    public void searchAnimalTest() throws Exception {
        String username = "username_example";
        Integer page = 56;
        Integer size = 56;
        ResponseEntity<List<AnimalPaginatedResponse>> responseEntity = api.searchAnimal(username, page, size);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
