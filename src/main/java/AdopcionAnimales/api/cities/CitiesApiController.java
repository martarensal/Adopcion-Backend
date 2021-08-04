package AdopcionAnimales.api.cities;

import AdopcionAnimales.api.animals.AnimalPaginatedResponse;
import AdopcionAnimales.api.types.TypeResponse;
import AdopcionAnimales.cities.CityService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class CitiesApiController implements CitiesApi {

    private static final Logger log = LoggerFactory.getLogger(CitiesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private CityService cityService;

    @org.springframework.beans.factory.annotation.Autowired
    public CitiesApiController(ObjectMapper objectMapper, HttpServletRequest request, CityService cityService) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.cityService = cityService;
    }

    public ResponseEntity<Void> addCity(@ApiParam(value = "City to add"  )  @Valid @RequestBody CityCreationRequest body) {
        cityService.addCity(body);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteCity(@ApiParam(value = "By passing in the appropriate username, you can delete the user.",required=true) @PathVariable("idCity") Long idCity) {
        cityService.deleteCity(idCity);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<CityResponse>> searchCities() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<List<CityResponse>>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<Void> modifyCityName(Long idCity, @Valid CityNameChangeRequest body) {
        cityService.modifyCityName(body, idCity);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> modifyCityAutonomousCommunity(Long idCity, @Valid CityAutonomousCommunityChangeRequest body) {
        cityService.modifyCityAutonomousCommunity(body, idCity);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> modifyCityProvince(Long idCity, @Valid CityProvinceChangeRequest body) {
        cityService.modifyCityProvince(body, idCity);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<CityPaginatedResponse> getCities(@Valid Integer page,
                                                           @Valid Integer size) {
        return new ResponseEntity<CityPaginatedResponse>(cityService.getCities(page, size), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<CityPaginatedResponse> getCitiesFromProvinces(String province, @Valid Integer page,
                                                                      @Valid Integer size) {
        return new ResponseEntity<CityPaginatedResponse>(cityService.getCitiesFromProvinces(province, page, size), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<CityPaginatedResponse> getProvincesFromCommunity(String autonomous_community, @Valid Integer page,
                                                                        @Valid Integer size) {
        return new ResponseEntity<CityPaginatedResponse>(cityService.getProvincesFromCommunity(autonomous_community, page, size), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<CityPaginatedResponse> getAutonomousCommunity(@Valid Integer page,
                                                           @Valid Integer size) {
        return new ResponseEntity<CityPaginatedResponse>(cityService.getAutonomousCommunity(page, size), HttpStatus.OK);
    }
}
