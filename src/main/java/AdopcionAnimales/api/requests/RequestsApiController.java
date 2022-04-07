package AdopcionAnimales.api.requests;

import AdopcionAnimales.api.animals.AnimalPaginatedResponse;
import AdopcionAnimales.api.publications.PublicationDateChangeRequest;
import AdopcionAnimales.requests.RequestService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
@Controller
public class RequestsApiController implements RequestsApi {

    private static final Logger log = LoggerFactory.getLogger(RequestsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private RequestService requestService;

    @org.springframework.beans.factory.annotation.Autowired
    public RequestsApiController(ObjectMapper objectMapper, HttpServletRequest request, RequestService requestService) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.requestService = requestService;
    }

    public ResponseEntity<Void> addRequest(@ApiParam(value = "Reservation to add"  )  @Valid @RequestBody RequestCreationRequest body) {
        requestService.addRequest(body);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteRequest(@ApiParam(value = "By passing in the appropriate request ID, you can delete the request.",required=true) @PathVariable("idRequest") Long idRequest) {
        requestService.deleteRequest(idRequest);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<RequestPaginatedResponse> getRequestsFromUser(String username,@Valid Integer page,
                                                                        @Valid Integer size) {
        return new ResponseEntity<RequestPaginatedResponse>(requestService.getRequestsFromUser(username, page, size), HttpStatus.OK);
    }

    public ResponseEntity<RequestPaginatedResponse> getRequests(@Valid Integer page,
                                                              @Valid Integer size) {
        return new ResponseEntity<RequestPaginatedResponse>(requestService.getRequests(page, size), HttpStatus.OK);
    }


    public ResponseEntity<Void> modifyRequestStartDate(@ApiParam(value = "",required=true) @PathVariable("idRequest") Long idRequest,@ApiParam(value = "The new request date and time"  )  @Valid @RequestBody RequestStartDateChangeRequest body) {
        requestService.modifyRequestStartDate(body, idRequest);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> modifyRequestEndDate(@ApiParam(value = "",required=true) @PathVariable("idRequest") Long idRequest,@ApiParam(value = "The new request date and time"  )  @Valid @RequestBody RequestEndDateChangeRequest body) {
        requestService.modifyRequestEndDate(body, idRequest);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> modifyRequestStatus(@ApiParam(value = "",required=true) @PathVariable("idRequest") Long idRequest,@ApiParam(value = "The new request status"  )  @Valid @RequestBody RequestStatusChangeRequest body) {
        requestService.modifyRequestStatus(body, idRequest);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> modifyRequestType(@ApiParam(value = "",required=true) @PathVariable("idRequest") Long idRequest,@ApiParam(value = "The new request type"  )  @Valid @RequestBody RequestTypeChangeRequest body) {
        requestService.modifyRequestType(body, idRequest);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
