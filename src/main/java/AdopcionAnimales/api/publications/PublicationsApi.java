/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.5).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package AdopcionAnimales.api.publications;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
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
    ResponseEntity<Void> addPublication(@ApiParam(value = "Publication to add"  )  @Valid @RequestBody PublicationCreationRequest body);

    @ApiOperation(value = "Searches for a publication", nickname = "searchPublication", notes = "Searches for a publication.", response = PublicationResponse.class, responseContainer = "List", authorizations = {
            @Authorization(value = "ApiKeyAuth")    }, tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "The search was successfull", response = PublicationResponse.class, responseContainer = "List"),
            @ApiResponse(code = 403, message = "Access denied"),
            @ApiResponse(code = 500, message = "Internal server error") })
    @RequestMapping(value = "/publications",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<List<PublicationResponse>> searchPublication();

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

}
