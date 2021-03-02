/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.5).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package AdopcionAnimales.api.cities;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
@Api(value = "cities", description = "the cities API")
public interface CitiesApi {

    @ApiOperation(value = "Registers a city", nickname = "addCity", notes = "Adds a city to the system", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "city created"),
        @ApiResponse(code = 400, message = "invalid input, object invalid"),
        @ApiResponse(code = 409, message = "an existing city already exists") })
    @RequestMapping(value = "/cities",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addCity(@ApiParam(value = "City to add"  )  @Valid @RequestBody CityCreationRequest body);


    @ApiOperation(value = "Deletes a city", nickname = "deleteCity", notes = "", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "city deleted succesfully"),
        @ApiResponse(code = 400, message = "bad input parameter"),
        @ApiResponse(code = 404, message = "city not found"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/cities/{idCity}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteCity(@ApiParam(value = "By passing in the appropriate username, you can delete the user.",required=true) @PathVariable("idCity") String idCity);


    @ApiOperation(value = "Searches for a city", nickname = "searchCities", notes = "Searches for a city. This operation is permited for both user and admin", response = CityResponse.class, responseContainer = "List", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The search was successfull", response = CityResponse.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password"),
        @ApiResponse(code = 500, message = "Internal server error") })
    @RequestMapping(value = "/cities",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<CityResponse>> searchCities();

}
