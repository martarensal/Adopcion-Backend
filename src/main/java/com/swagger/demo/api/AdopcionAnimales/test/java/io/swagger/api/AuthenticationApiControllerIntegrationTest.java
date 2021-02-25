package com.swagger.demo.api.AdopcionAnimales.test.java.io.swagger.api;

import com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.authentication.AuthenticationApi;
import com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.authentication.LoginRequest;
import com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.authentication.LoginResponse;


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
public class AuthenticationApiControllerIntegrationTest {

    @Autowired
    private AuthenticationApi api;

    @Test
    public void userLoginTest() throws Exception {
        @Valid LoginRequest body = new LoginRequest();
        ResponseEntity<LoginResponse> responseEntity = api.userLogin(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
