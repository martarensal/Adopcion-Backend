package AdopcionAnimales.cities;

import AdopcionAnimales.api.cities.CityCreationRequest;
import AdopcionAnimales.api.cities.CityResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CityMapper {
    List<CityResponse> cityToCityResponse(List<City> city);
    City cityCreationRequestToCity(CityCreationRequest cityCreationRequest);
}
