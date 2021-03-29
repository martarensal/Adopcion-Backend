package AdopcionAnimales.cities;

import AdopcionAnimales.api.cities.CityCreationRequest;
import AdopcionAnimales.api.cities.CityNameChangeRequest;
import AdopcionAnimales.api.cities.CityPostalCodeChangeRequest;
import AdopcionAnimales.api.cities.CityResponse;
import AdopcionAnimales.api.users.UserNameChangeRequest;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolationException;

@Service
public interface CityService {
    void addCity(CityCreationRequest cityCreationRequest) throws ConstraintViolationException;;
    void deleteCity(Long idCity);
    CityResponse getCity(Long idCity);
    void modifyCityName(CityNameChangeRequest cityNameChangeRequest, Long idCity);
    void modifyCityPostalCode(CityPostalCodeChangeRequest cityPostalCodeChangeRequest, Long idCity);
}
