package AdopcionAnimales.requests;

import AdopcionAnimales.api.cities.CityCreationRequest;
import AdopcionAnimales.api.cities.CityResponse;
import AdopcionAnimales.api.requests.RequestCreationRequest;
import AdopcionAnimales.api.requests.RequestResponse;
import AdopcionAnimales.cities.City;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(componentModel = "spring")
public interface RequestMapper {
    Set<RequestResponse> requestToRequestResponse(Set<Request> request);
    Request requestCreationRequestToRequest(RequestCreationRequest requestCreationRequest);
}
