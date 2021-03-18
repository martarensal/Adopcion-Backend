package AdopcionAnimales.cities;

import AdopcionAnimales.api.cities.CityCreationRequest;
import AdopcionAnimales.api.cities.CityResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CityMapper {
    CityResponse cityToCityResponse(City city);
    City cityCreationRequestToCity(CityCreationRequest cityCreationRequest);
}
