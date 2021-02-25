package com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.authentication;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
@Controller
public class AuthenticationApiController implements AuthenticationApi {

    private static final Logger log = LoggerFactory.getLogger(AuthenticationApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AuthenticationApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<LoginResponse> userLogin(@ApiParam(value = "The user's username and password"  )  @Valid @RequestBody LoginRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<LoginResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
