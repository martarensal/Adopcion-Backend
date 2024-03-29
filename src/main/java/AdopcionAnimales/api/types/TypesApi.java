/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.5).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package AdopcionAnimales.api.types;

import AdopcionAnimales.api.animals.AnimalPaginatedResponse;
import AdopcionAnimales.api.cities.CityNameChangeRequest;
import AdopcionAnimales.api.users.UserPaginatedResponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
@Api(value = "types", description = "the types API")
public interface TypesApi {
    @ApiOperation(value = "Registers a type of animal", nickname = "addType", notes = "Adds a type to the system", authorizations = {
            @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "type created"),
            @ApiResponse(code = 400, message = "invalid input, object invalid"),
            @ApiResponse(code = 409, message = "an existing type already exists") })
    @RequestMapping(value = "/type",
            consumes = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<Void> addType(@ApiParam(value = "Type to add"  )  @Valid @RequestBody TypeCreationRequest body);

    @ApiOperation(value = "Modifies the type's name", nickname = "modifyTypeName", notes = "The id of the type you want to modify", authorizations = {
            @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "bad input parameter"),
            @ApiResponse(code = 200, message = "operation completed successfully"),
            @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/types/{idType}/name",
            consumes = { "application/json" },
            method = RequestMethod.PUT)
    ResponseEntity<Void> modifyTypeName(@ApiParam(value = "",required=true) @PathVariable("idType") Long idType,@ApiParam(value = "The new type's name"  )  @Valid @RequestBody TypeNameChangeRequest body);


    @ApiOperation(value = "Deletes a type", nickname = "deleteType", notes = "", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "type deleted succesfully"),
        @ApiResponse(code = 400, message = "bad input parameter"),
        @ApiResponse(code = 404, message = "type not found"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/types/{idType}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteType(@ApiParam(value = "By passing in the appropriate username, you can delete the user.",required=true) @PathVariable("idType") Long idType);

    @ApiOperation(value = "List all types", nickname = "getAllTypes", notes = "This operation is permited for both user and admin", response = TypeResponse.class, responseContainer = "List", authorizations = {
            @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "The search was successfull", response = TypeResponse.class, responseContainer = "List"),
            @ApiResponse(code = 401, message = "The requested page needs a username and a password"),
            @ApiResponse(code = 500, message = "Internal server error") })
    @RequestMapping(value = "/type",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<TypePaginatedResponse> getTypes(
            @ApiParam(value = "the number of the page") @Valid @RequestParam(value = "page", required = false, defaultValue = "0") Integer page,
            @ApiParam(value = "the number of element per page") @Valid @RequestParam(value = "size", required = false, defaultValue = "25") Integer size);

}
