package AdopcionAnimales.api.publications;

import AdopcionAnimales.api.animals.AnimalPaginatedResponse;
import AdopcionAnimales.publications.PublicationService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
@Controller
public class PublicationsApiController implements PublicationsApi {

    private static final Logger log = LoggerFactory.getLogger(PublicationsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private PublicationService publicationService;

    @Autowired
    public PublicationsApiController(ObjectMapper objectMapper, HttpServletRequest request, PublicationService publicationService) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.publicationService = publicationService;
    }

    public ResponseEntity<Void> addPublication(@ApiParam(value = "Publication to add") @Valid @RequestBody PublicationCreationRequest body) {
        publicationService.addPublication(body);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<PublicationPaginatedResponse> getPublicationsFromUser(String username, @Valid Integer page,
                                                                      @Valid Integer size) {
        return new ResponseEntity<PublicationPaginatedResponse>(publicationService.getPublicationsFromUser(username, page, size), HttpStatus.OK);
    }

    public ResponseEntity<PublicationPaginatedResponse> getPublications(@Valid Integer page,
                                                              @Valid Integer size) {
        return new ResponseEntity<PublicationPaginatedResponse>(publicationService.getPublications(page, size), HttpStatus.OK);
    }

    public ResponseEntity<Void> deletePublication(@ApiParam(value = "By passing in the appropriate publication ID, you can delete the request.",required=true) @PathVariable("idPublication") Long idPublication) {
        publicationService.deletePublication(idPublication);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> modifyPublicationDate(@ApiParam(value = "",required=true) @PathVariable("idPublication") Long idPublication,@ApiParam(value = "The new publication date and time"  )  @Valid @RequestBody PublicationDateChangeRequest body) {
        publicationService.modifyPublicationDate(body, idPublication);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }



}
