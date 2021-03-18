package AdopcionAnimales.requests;

import AdopcionAnimales.api.cities.CityCreationRequest;
import AdopcionAnimales.api.cities.CityResponse;
import AdopcionAnimales.api.requests.RequestCreationRequest;
import AdopcionAnimales.api.requests.RequestResponse;
import AdopcionAnimales.cities.City;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RequestMapper {
    RequestResponse requestToRequestResponse(Request request);
    Request requestCreationRequestToRequest(RequestCreationRequest requestCreationRequest);

}
