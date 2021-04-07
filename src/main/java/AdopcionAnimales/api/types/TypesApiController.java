package AdopcionAnimales.api.types;

import AdopcionAnimales.api.cities.CityCountryChangeRequest;
import AdopcionAnimales.types.TypeService;
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
public class TypesApiController implements TypesApi {

    private static final Logger log = LoggerFactory.getLogger(TypesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private TypeService typeService;

    @Autowired
    public TypesApiController(ObjectMapper objectMapper, HttpServletRequest request, TypeService typeService) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.typeService = typeService;
    }

    @Override
    public ResponseEntity<Void> deleteType(@ApiParam(value = "By passing in the appropriate username, you can delete the user.",required=true) @PathVariable("idType") Long idType) {
        typeService.deleteType(idType);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> addType(@ApiParam(value = "Type to add"  )  @Valid @RequestBody TypeCreationRequest body) {
        typeService.addType(body);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<TypeResponse>> searchTypes() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<List<TypeResponse>>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<Void> modifyTypeName(Long idType, @Valid TypeNameChangeRequest body) {
        typeService.modifyTypeName(body, idType);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
