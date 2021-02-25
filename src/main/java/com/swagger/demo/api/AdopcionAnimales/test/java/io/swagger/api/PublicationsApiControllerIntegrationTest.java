package com.swagger.demo.api.AdopcionAnimales.test.java.io.swagger.api;

import java.util.*;

import com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.publications.PublicationsApi;
import com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.publications.*;

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
public class PublicationsApiControllerIntegrationTest {

    @Autowired
    private PublicationsApi api;

    @Test
    public void deletePublicationTest() throws Exception {
        String idRequest = "idRequest_example";
        ResponseEntity<Void> responseEntity = api.deletePublication(idRequest);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void modifyPublicationDateTest() throws Exception {
        String idPublication = "idPublication_example";
        PublicationDateChangeRequest body = new PublicationDateChangeRequest();
        ResponseEntity<Void> responseEntity = api.modifyPublicationDate(idPublication, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
