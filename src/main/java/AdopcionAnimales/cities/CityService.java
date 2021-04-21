package AdopcionAnimales.cities;

import AdopcionAnimales.api.cities.*;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolationException;

@Service
public interface CityService {
    void addCity(CityCreationRequest cityCreationRequest) throws ConstraintViolationException;;
    void deleteCity(Long idCity);
    CityResponse getCity(Long idCity);
    void modifyCityName(CityNameChangeRequest cityNameChangeRequest, Long idCity);
    void modifyCityProvince(CityProvinceChangeRequest cityProvinceChangeRequest, Long idCity);
    void modifyCityAutonomousCommunity(CityAutonomousCommunityChangeRequest cityAutonomousCommunityChangeRequest, Long idCity);

}
