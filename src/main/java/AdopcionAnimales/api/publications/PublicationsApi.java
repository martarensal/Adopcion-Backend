/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.5).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package AdopcionAnimales.api.publications;

import AdopcionAnimales.api.animals.AnimalImageChangeRequest;
import AdopcionAnimales.api.animals.AnimalNameChangeRequest;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
@Api(value = "publications", description = "the publications API")
public interface PublicationsApi {

    @ApiOperation(value = "Adds a publication", nickname = "addPublication", notes = "Adds a new animal to the user", authorizations = {
            @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Publication created"),
            @ApiResponse(code = 400, message = "invalid input, object invalid"),
            @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/publications",
            consumes = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<Void> addPublication(@ApiParam(value = "Publication to add"  )  @Valid @RequestBody PublicationCreationRequest body) throws IOException;

    @ApiOperation(value = "Searches for a publication made by an user", nickname = "getPublicationFromUser", notes = "Searches for a publication made by an user.", response = PublicationPaginatedResponse.class, responseContainer = "List", authorizations = {
            @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "The search was successfull", response = PublicationPaginatedResponse.class, responseContainer = "List"),
            @ApiResponse(code = 403, message = "Access denied"),
            @ApiResponse(code = 500, message = "Internal server error") })
    @RequestMapping(value = "user/{username}/publications",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<PublicationPaginatedResponse> getPublicationsFromUser( @ApiParam(value = "", required = true) @PathVariable("username") String username,
                                                                          @ApiParam(value = "the number of the page") @Valid @RequestParam(value = "page", required = false, defaultValue = "0") Integer page,
                                                                          @ApiParam(value = "the number of element per page") @Valid @RequestParam(value = "size", required = false, defaultValue = "25") Integer size) throws IOException;

    @ApiOperation(value = "List all publications", nickname = "searchPublication", notes = "Searches for a publication.", response = PublicationResponse.class, responseContainer = "List", authorizations = {
            @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "The search was successfull", response = PublicationResponse.class, responseContainer = "List"),
            @ApiResponse(code = 403, message = "Access denied"),
            @ApiResponse(code = 500, message = "Internal server error") })
    @RequestMapping(value = "/publications",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<PublicationPaginatedResponse> getPublications( @ApiParam(value = "the number of the page") @Valid @RequestParam(value = "page", required = false, defaultValue = "0") Integer page,
                                                                  @ApiParam(value = "the number of element per page") @Valid @RequestParam(value = "size", required = false, defaultValue = "25") Integer size) throws IOException;

    @ApiOperation(value = "Deletes a publication", nickname = "deletePublication", notes = "", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "reservation deleted succesfully"),
        @ApiResponse(code = 400, message = "bad input parameter"),
        @ApiResponse(code = 404, message = "reservation not found"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/publications/{idPublication}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deletePublication(@ApiParam(value = "By passing in the appropriate publication ID, you can delete the request.",required=true) @PathVariable("idRequest") Long idRequest);


    @ApiOperation(value = "Modifies the publication's date and time", nickname = "modifyPublicationDate", notes = "The trip ID for the trip you want to modify", authorizations = {
        @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "bad input parameter"),
        @ApiResponse(code = 200, message = "operation completed successfully"),
        @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/publications/{idPublication}/publicationDate",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> modifyPublicationDate(@ApiParam(value = "",required=true) @PathVariable("idPublication") Long idPublication,@ApiParam(value = "The trip's new departure date and time"  )  @Valid @RequestBody PublicationDateChangeRequest body);

    @ApiOperation(value = "Modifies the publication's description", nickname = "modifyDescription", notes = "", authorizations = {
            @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "bad input parameter"),
            @ApiResponse(code = 200, message = "operation completed successfully"),
            @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/publications/{idPublication}/description",
            consumes = { "application/json" },
            method = RequestMethod.PUT)
    ResponseEntity<Void> modifyPublicationDescription(@ApiParam(value = "By passing in the appropriate publication code, you can modify the publication.",required=true) @PathVariable("idPublication") Long idPublication,@ApiParam(value = "The publication's new description"  )  @Valid @RequestBody PublicationDescriptionChangeRequest body);

    @ApiOperation(value = "Modifies the publication's image", nickname = "modifyPublicationImage", notes = "", authorizations = {
            @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "bad input parameter"),
            @ApiResponse(code = 200, message = "operation completed successfully"),
            @ApiResponse(code = 401, message = "The requested page needs a username and a password") })
    @RequestMapping(value = "/publications/{idPublication}/image",
            consumes = { "application/json" },
            method = RequestMethod.PUT)
    ResponseEntity<Void> modifyPublicationImage(@ApiParam(value = "By passing in the appropriate publication code, you can modify the publication.",required=true) @PathVariable("idPublication") Long idPublcation,@ApiParam(value = "The publication's new image"  )  @Valid @RequestBody PublicationImageChangeRequest body);

}
