package AdopcionAnimales.cities;

import AdopcionAnimales.api.cities.*;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolationException;

@Service
public interface CityService {
    void addCity(CityCreationRequest cityCreationRequest) throws ConstraintViolationException;;
    void deleteCity(Long idCity);
    CityPaginatedResponse getCities( Integer page, Integer size);
    CityPaginatedResponse getCitiesFromProvinces(String province, Integer page, Integer size);
    void modifyCityName(CityNameChangeRequest cityNameChangeRequest, Long idCity);
    void modifyCityProvince(CityProvinceChangeRequest cityProvinceChangeRequest, Long idCity);
    void modifyCityAutonomousCommunity(CityAutonomousCommunityChangeRequest cityAutonomousCommunityChangeRequest, Long idCity);

}
