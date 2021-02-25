package com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.requests;

import com.fasterxml.jackson.databind.ObjectMapper;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
@Controller
public class RequestsApiController implements RequestsApi {

    private static final Logger log = LoggerFactory.getLogger(RequestsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public RequestsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addRequest(@ApiParam(value = "Reservation to add"  )  @Valid @RequestBody RequestCreationRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteRequest(@ApiParam(value = "By passing in the appropriate request ID, you can delete the request.",required=true) @PathVariable("idRequest") String idRequest) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RequestPaginatedResponse> obtainRequests(@ApiParam(value = "the number of the page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "the number of element per page") @Valid @RequestParam(value = "size", required = false) Integer size) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<RequestPaginatedResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
