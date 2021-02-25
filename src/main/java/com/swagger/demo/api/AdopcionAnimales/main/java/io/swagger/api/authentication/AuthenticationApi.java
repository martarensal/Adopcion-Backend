/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.5).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.swagger.demo.api.AdopcionAnimales.main.java.io.swagger.api.authentication;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
@Api(value = "authentication", description = "the authentication API")
public interface AuthenticationApi {

    @ApiOperation(value = "Authenticates a user into the system", nickname = "userLogin", notes = "Logs in a user into the system", response = LoginResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Logged in successfully", response = LoginResponse.class),
        @ApiResponse(code = 400, message = "Invalid input, object invalid"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 409, message = "The request could not be completed because of a conflict") })
    @RequestMapping(value = "/authentication/login",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<LoginResponse> userLogin(@ApiParam(value = "The user's username and password"  )  @Valid @RequestBody LoginRequest body);

}
