package AdopcionAnimales.test.java.io.swagger.api;

import AdopcionAnimales.api.cities.CitiesApi;
import AdopcionAnimales.api.cities.CityCreationRequest;
import AdopcionAnimales.api.cities.CityPaginatedResponse;
import AdopcionAnimales.api.cities.CityResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CitiesApiControllerIntegrationTest {

    @Autowired
    private CitiesApi api;

    @Test
    public void addCityTest() throws Exception {
        CityCreationRequest body = new CityCreationRequest();
        ResponseEntity<Void> responseEntity = api.addCity(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void deleteCityTest() throws Exception {
        Long idCity = 3876l;

        ResponseEntity<Void> responseEntity = api.deleteCity(idCity);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void searchCitiesTest() throws Exception {
        Integer page = 56;
        Integer size = 56;
        ResponseEntity<CityPaginatedResponse> responseEntity = api.getCities(page, size);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
