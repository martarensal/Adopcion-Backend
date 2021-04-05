package AdopcionAnimales.cities;

import AdopcionAnimales.api.cities.CityCreationRequest;
import AdopcionAnimales.api.cities.CityNameChangeRequest;
import AdopcionAnimales.api.cities.CityPostalCodeChangeRequest;
import AdopcionAnimales.api.cities.CityResponse;
import AdopcionAnimales.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import javax.validation.ConstraintViolationException;

@Service
public class CityServiceImpl implements CityService{

    private CityRepository cityRepository;
    private CityMapper cityMapper;

    @Autowired
    public CityServiceImpl(CityRepository cityRepository, CityMapper cityMapper){
        this.cityMapper = cityMapper;
        this.cityRepository = cityRepository;
    }

    @Override
    @Transactional
    public void addCity(CityCreationRequest cityCreationRequest) throws ConstraintViolationException {
        City city = cityMapper.cityCreationRequestToCity(cityCreationRequest);
        try {
            cityRepository.save(city);
        } catch (ConstraintViolationException exception) {
            exception.getMessage();
        }
    }

    @Override
    @Transactional
    public void deleteCity(Long idCity) {
        City city = findCity(idCity);
        cityRepository.delete(city);
    }

    @Override
    public CityResponse getCity(Long idCity) {
        return null;
    }

    private City findCity(Long idCity) {
        City city = cityRepository.findByCityId(idCity);
        if(city == null)
            throw new EntityNotFoundException("No se ha encontrado la ciudad " + idCity);
        return city;
    }

    @Override
    public void modifyCityName(CityNameChangeRequest cityNameChangeRequest, Long idCity) {
        City city = findCity(idCity);

        city.setName(cityNameChangeRequest.getNewCityName());
        cityRepository.save(city);
    }

    @Override
    public void modifyCityPostalCode(CityPostalCodeChangeRequest cityPostalCodeChangeRequest, Long idCity) {
        City city = findCity(idCity);

        city.setPostalCode(cityPostalCodeChangeRequest.getNewCityPostalCode());
        cityRepository.save(city);
    }
}
