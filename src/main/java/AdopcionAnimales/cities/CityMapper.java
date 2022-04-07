package AdopcionAnimales.cities;

import AdopcionAnimales.api.cities.CityCreationRequest;
import AdopcionAnimales.api.cities.CityResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CityMapper {
    List<CityResponse> citiesToCitiesResponse(List<City> cities);
    City cityCreationRequestToCity(CityCreationRequest cityCreationRequest);
}
