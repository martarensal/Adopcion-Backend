package AdopcionAnimales.api.animals;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-24T16:55:56.237+01:00[Europe/Paris]")
@Controller
public class AnimalsApiController implements AnimalsApi {

    private static final Logger log = LoggerFactory.getLogger(AnimalsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    public AnimalsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<AnimalPaginatedResponse>> searchAnimal(@ApiParam(value = "the username to be searched") @Valid @RequestParam(value = "username", required = false) String username, @ApiParam(value = "the number of the page") @Valid @RequestParam(value = "page", required = false) Integer page, @ApiParam(value = "the number of element per page") @Valid @RequestParam(value = "size", required = false) Integer size) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<List<AnimalPaginatedResponse>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
