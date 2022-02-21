package AdopcionAnimales.requests;

import AdopcionAnimales.animals.Animal;
import AdopcionAnimales.api.cities.CityCreationRequest;
import AdopcionAnimales.api.cities.CityResponse;
import AdopcionAnimales.api.requests.RequestCreationRequest;
import AdopcionAnimales.api.requests.RequestResponse;
import AdopcionAnimales.cities.City;
import AdopcionAnimales.users.User;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface RequestMapper {
    public default Long animalToLong(Animal a) { return a.getId();}
    public default Long userToLong(User u) { return u.getIdUser();}

    List<RequestResponse> requestToRequestResponse(List<Request> request);
    Request requestCreationRequestToRequest(RequestCreationRequest requestCreationRequest);
}
