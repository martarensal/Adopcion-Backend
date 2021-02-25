package com.swagger.demo.api.AdopcionAnimales.test.java.io.swagger.api;

import com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.types.TypeApi;

import java.util.*;

import com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.types.TypeCreationRequest;
import com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.types.TypeResponse;
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
public class TypeApiControllerIntegrationTest {

    @Autowired
    private TypeApi api;

    @Test
    public void addTypeTest() throws Exception {
        TypeCreationRequest body = new TypeCreationRequest();
        ResponseEntity<Void> responseEntity = api.addType(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void searchTypesTest() throws Exception {
        ResponseEntity<List<TypeResponse>> responseEntity = api.searchTypes();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
