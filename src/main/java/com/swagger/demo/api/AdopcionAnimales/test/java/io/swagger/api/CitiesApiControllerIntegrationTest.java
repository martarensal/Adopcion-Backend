package com.swagger.demo.api.AdopcionAnimales.test.java.io.swagger.api;

import com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.cities.CitiesApi;
import com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.cities.*;

import java.util.*;

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
        String idCity = "idCity_example";
        ResponseEntity<Void> responseEntity = api.deleteCity(idCity);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void searchCitiesTest() throws Exception {
        ResponseEntity<List<CityResponse>> responseEntity = api.searchCities();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
